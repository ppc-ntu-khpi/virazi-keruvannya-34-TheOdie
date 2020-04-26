package domain;



public class Exercise {
    public static float Calculate(int[] a){
         
    
        int m = 1;                           // Описываем нужную переменную и массив, для дальнейших операций
        int a1[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {        // Создаём массив с пыдрахункамы повторений одинаковых цифр в главном меню
            for (int j = 0; j < a.length; j++){
                if ((a[j] == a[i] ) && (j != i)){ ++m;                                    }
            }
            a1[i] = m;
            m = 1;
        }

        int max = a1[0];
                                               // Ищем самое большое значения в массиве
        for (int i = 0; i < a.length - 1; i++){
            if (max <= a1[i+1]){
                max = a1[i+1];}
        }      
                                                  // Ищем которому значению главный массив принадлежит max
        int res = 0;
        for (int i = 0; i < a1.length; i++){
            if (max == a1[i]){ 
                res = a[i];
                break;   // Выводим на экран число какое найбольше повторяется 
            }
        }
       
        return res;

    }
    
 }
    
