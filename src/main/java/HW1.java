import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2020));

        System.out.println(Arrays.toString(createArray(10, 5)));

        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        int[] multArr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(reverseArr(arr)));

        System.out.println(Arrays.toString(multiplyArr(multArr)));

        int[][] array = new int[4][4];

        createMatrix(array);


    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return a + b <=20 && a + b >= 10;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 1; i <= repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

        private static boolean isLeapYear ( int year){
            // проверить, является ли год високосным. если да - return true
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ;
        }

        private static int[] createArray ( int len, int initalValue){
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            int[] arr = new int[len];
            for (int i = 0; i <= len - 1;i++) {

                arr[i] = initalValue;
            }
            return arr;
        }

        private static int[] reverseArr (int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            return arr;
        }

        private static int[] multiplyArr (int[] arr) {
            for (int i = 0;i< arr.length;i++) {
                if(arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
            }
            return arr;
        }

        private static void createMatrix (int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) {
                        arr[i][j] = 1;
                    }
                    else {
                        arr[i][j] = 0;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
