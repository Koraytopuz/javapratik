import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            int number,x,sum=0; //x basamak değerlerini tutar
            Scanner read = new Scanner(System.in);
            System.out.println("Bir sayı giriniz: ");
            number = read.nextInt();
            while(number!=0){
                x=number%10;
                sum=sum+x;
                number/=10;
            }
            System.out.println(sum);
        }
    }

