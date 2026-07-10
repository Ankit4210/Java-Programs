public class CountDigits{
    public static int Counts(int n){
        if(n == 0){
            return 1;
        }
        n = Math.abs(n);    
        int count = 0;
        while (n>0) {
            n = n/10;
            count++;
        }
        return count;

    }
public static void main(String[] args) {
int n =5043;
System.out.println("Number of digits " + Counts(n));
}
}

