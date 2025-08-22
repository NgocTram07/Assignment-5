package assignment_5;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner height = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua tam giac: ");
        int h = height.nextInt();
        for(int i=0; i<h; i++){
            for(int j=0; j<h-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k< 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


