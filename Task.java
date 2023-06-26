import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task{
    public static void main (String[] args) {
        
        ArrayList<Integer>array = fillArray();
        System.out.println("Первоначальный массив: " + array);
        System.out.println("Минимальное значение в массиве: " + Collections.min(array));  
        System.out.println("Максимальное значение в массиве: " + Collections.max(array));
        System.out.println("Среднее арифметическое значений в массиве: " + arythMeanFromArr(array));
        System.out.println("Массив без чётных чисел: " + remEvenNumbers(array));       
    }

    public static ArrayList<Integer> fillArray () {
    ArrayList<Integer>array = new ArrayList<>();
        Random rand = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(1, 21));
        }
        return array;
    } 
    
    public static List<Integer> remEvenNumbers (List<Integer> args) {
        for (int i = args.size()-1; i >= 0; i--) {
            if (args.get(i) % 2 == 0){
                args.remove(i);
            }
        }
        return args;
    }
    
    public static double arythMeanFromArr (List<Integer> args) {
        double sum = 0;
        for (int item: args) {
            sum += item;
        }
        return sum / args.size();
    }
}
