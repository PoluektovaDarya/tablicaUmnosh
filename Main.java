public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //объявляем и инициализируем массив
        int m = 1,result,element = 0,s = array[element], nunberUmnozh = 1;

        System.out.println("Умножение на " + nunberUmnozh);
        for (int i = 1; i < 100; i++) {
            result = s * m;
            System.out.println( s + " * " + m + " = " + result);
            m++;
            if (m > 10) {
                nunberUmnozh++;
                System.out.println("Умножение на " + nunberUmnozh);
                m = 1;
                element++;
                s = array[element];
            }
        }
    }
}
