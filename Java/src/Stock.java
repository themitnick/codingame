import java.util.Map;
import java.util.HashMap;

public class Stock {

    public String[] findHighestAverageStocks(String[] stocks, double[][] prices) {
        // Création d'une map pour stocker les moyennes par action
        Map<String, Double> averages = new HashMap<>();

        // Calcul de la moyenne pour chaque action
        for (int i = 0; i < stocks.length; i++) {
            double sum = 0;
            for (double price : prices[i]) {
                sum += price;
            }
            double average = sum / prices[i].length;
            averages.put(stocks[i], average);
        }

        // Tri des actions par moyenne décroissante
        return averages.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}
