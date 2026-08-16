public class Danse {

    private static final int[] POSITIONS = computeCycle();

    static int getPositionAt(int n) {
        return POSITIONS[n % 6];
    }

    private static int[] computeCycle() {
        int[] positions = new int[6];
        int prevPrevMove = 0;
        int prevMove = 0;
        int position = 0;
        for (int i = 1; i < 6; i++) {
            int move;
            if (i == 1) {
                move = 1;
            } else if (i == 2) {
                move = -2;
            } else {
                move = prevMove - prevPrevMove;
            }
            position += move;
            positions[i] = position;
            prevPrevMove = prevMove;
            prevMove = move;
        }
        return positions;
    }
}
