package pareto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pareto {
    //Map<String, Double> map = new HashMap<>();
    public static void main(String[] args) {
        //System.out.println(countPareto());
        Map<String, Double> map = new HashMap<>();
        // map.put("delo6", 12.0);
        //map.put("delo10", 10.0);
        //map.put("delo11", 13.0);
        //

        Scanner scanner = new Scanner(System.in);
        while(true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1){
                 while (true) {

                     System.out.println("Введите команду 1 или 0");
                     int command2 = scanner.nextInt();
                     if (command2 == 1) {
                         map.put(inputActivity(), countPareto());
                         continue;
                     }
                     else if (command2 == 0)
                         break;
                 }
            }
            else if (command == 2){
                Map<String, Double> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                for (Map.Entry entry : sorted.entrySet()){
                    System.out.println(entry.getValue() + " " + entry.getKey());
                }
            }
            else if (command == 0){
                System.out.println("Выход");
                break;
            }
        }

    }

    public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести дело");
        System.out.println("2 - Вывести отсортированный список дел");
        System.out.println("0 - Выход");
    }

    public static String inputActivity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дело");
        String s1 = scanner.next();
        return s1;
    }


    public static double countPareto (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время, затраченное на дело");
        double t = scan.nextInt();
        System.out.println("Введите энергию, затраченную на дело");
        double e = scan.nextInt();
        System.out.println("Введите результат 1");
        double r1 = scan.nextInt();
        System.out.println("Введите результат 2");
        double r2 = scan.nextInt();
        double te = (t+e)/2;
        double r = (r1+r2)/2;
        double result = r/te;
        return result;

    }
}
