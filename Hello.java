import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a :");
        System.out.println("Enter the number b :");
        System.out.println("Enter the number c :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>= b && a>=c){
            System.out.println("a is largest");
        }
        else if(b>=c && b >=a){
            System.out.println("b is largest");
        }
        else{
        System.out.println("c is largest");
        }
    }
}