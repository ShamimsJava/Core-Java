package pkgclass.pkg44_2_fibonaciseries;

import javax.swing.JOptionPane;

public class Class44_2_FibonaciSeries {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter n: ");
        int n = Integer.parseInt(input);
        
        for(int i = 1; i <= n; i++){
            int f = fib(i);
            System.out.println("fib("+ i + " ) = " +f);
        }
    }
    
    public static int fib(int n){
        if(n <= 2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    
}
