
package assignment_5;

import java.util.Scanner;
public class Ex12 {
    public static boolean check(int n){
        for(int i=2; i< Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n>1: ");
        int n = Integer.parseInt(s.next());
        if(check(n)){
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
}
