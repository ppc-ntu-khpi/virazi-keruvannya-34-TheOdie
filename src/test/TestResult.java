package test;

import domain.Exercise;
import java.util.Arrays;


public class TestResult {

    public static void main(String[] args) {
        int[]a = {1,2,3,2,2,6,7,8,9,1};
        

        System.out.println(Arrays.toString(a));  // Выводим на экран массив который получился 
        System.out.println("Число которое чаще всего повторяется " + Exercise.Calculate(a));
    }
}
