package cinema;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats=scanner.nextInt();
        if(rows<10 && seats<10){
            if(rows*seats<60){
                System.out.println("Total income: "+"$"+rows*seats*10);
            }
            else if(rows%2!=0){
                int totalIncome=rows/2;
                System.out.println("Total income: "+"$"+(rows/2*seats*10+(rows/2+1)*seats*8));
            }
            else{
                System.out.println("Total income: "+"$"+(rows/2*seats*10+rows/2*seats*8));
            }

        }
        else{
            System.out.println("yanlis");
        }

    }
}
