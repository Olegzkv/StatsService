public class Main {
    
        public static void sumSales(){
            int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum = sum + myArray[i];
            }
            System.out.println(sum);
        }
    }
