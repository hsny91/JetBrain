import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi=scanner.nextInt();
        if(0<sayi && sayi<10){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}