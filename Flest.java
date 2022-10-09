import java.util.*;
import java.util.regex.*;

public class Flest {
   
    static Pattern getPattern(String drink) {
        Pattern pattern = Pattern.compile(drink, Pattern.CASE_INSENSITIVE);
        return pattern;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] drinks = sc.nextLine().toLowerCase().split(" ", 100);
        int numOfLines = sc.nextInt();
        Map<String, Integer> countOfDrinkWins = new HashMap<>();
        for (String drink : drinks) {
            countOfDrinkWins.put(drink, 0);
        }
        

        for (int i = 0; i <= numOfLines; i++) {
            Map<String, Integer> countOfDrink = new HashMap<>();
            for (String drink : drinks) {
                countOfDrink.put(drink, 0);
            }
            String[] line = sc.nextLine().toLowerCase().split("[,.! ]+");
            int currentHigh = Integer.MIN_VALUE;

            for (String drink : drinks) {
                Pattern pattern = getPattern("\\b" + drink + "\\b");
                for (int j = 0; j < line.length; j++) {
                    Matcher matcher = pattern.matcher(line[j]);
                    if (matcher.find()) {
                            countOfDrink.put(drink, countOfDrink.get(drink) + 1);
                    }  
                }
                
                if (countOfDrink.get(drink) > currentHigh) {
                    currentHigh = countOfDrink.get(drink);
                }
                
            }
            for (String drink : drinks) {
                if (countOfDrink.get(drink) == currentHigh) {
                    countOfDrinkWins.put(drink, countOfDrinkWins.get(drink) + 1);
                }   
            }
            

            
        }
        sc.close();

        int currentMostWins = Integer.MIN_VALUE;
        for (String drink : drinks) {
            if (countOfDrinkWins.get(drink) > currentMostWins) {
                currentMostWins = countOfDrinkWins.get(drink);
            }
        }
        Set<String> keys = countOfDrinkWins.keySet();
        List<String> printables = new ArrayList<>();
        for (String key : keys) {
            if (countOfDrinkWins.get(key) == currentMostWins) {
                printables.add(key);
            }
        }
        Collections.sort(printables);
        for (String drink : printables) {
            System.out.println(drink);
        }
    }
}
