import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ciftSayi =scanner.nextInt();
        if(ciftSayi%2==0){
            System.out.println(ciftSayi+2);
        }

        else{
            System.out.println(ciftSayi+1);
        }

    }
}