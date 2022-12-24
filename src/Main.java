 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int avg = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            sum = sum + array[i];
            avg = sum / 10;
        }
        for (int y=0;y<array.length;y++){
            if(array[y]>avg){
                System.out.println(array[y]+ " is bigger than average");
            }
        }
    }
}