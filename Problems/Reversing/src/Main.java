import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int sayi=scanner.nextInt();
       int sayi1=sayi%10;
       int sayi2=sayi/10;
       int sayi3=sayi2%10;
       int sayi4=sayi2/10;
       int sayi5=sayi4%10;
       if(sayi1==0){
           System.out.print(sayi3);
           System.out.print(sayi5);
       }
       else{
           System.out.print(sayi1);
           System.out.print(sayi3);
           System.out.print(sayi5);
       }


    }
}