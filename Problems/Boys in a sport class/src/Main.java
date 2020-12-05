import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sayi3=scanner.nextInt();
        boolean sonuc=(sayi1>=sayi2 && sayi1>=sayi3 && sayi2>=sayi3)||(sayi1<=sayi2 && sayi1<=sayi3 && sayi2<=sayi3);
        System.out.println(sonuc);
    }
}