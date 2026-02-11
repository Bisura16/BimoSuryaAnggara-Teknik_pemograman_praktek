import java.util.Scanner;
public class dataTypes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // input iterasi
        String[] input = new String [T];
        for (int j = 0 ; j < T; j++){ //looping untuk input data
            input [j] = sc.next();
        }
        for(int i = 0 ; i < T; i++){ //looping untuk pengecekan angka
            try{
                long n = Long.parseLong(input[i]); //ubah string jadi long
                System.out.println (n + " can be fitted in:");
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println  ("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception error){ //berfungsi untuk error, ketika angka salah pada pengecekan, maka akan di pindah ke catch

                System.out.println(input[i] + " can't be fitted anywhere.");

            }
        }
    }
}