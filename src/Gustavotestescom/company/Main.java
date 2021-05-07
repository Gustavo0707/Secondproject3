package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your sex ex: M/m or F/f");

        String sex = scanner.next();

        if("f".equalsIgnoreCase(sex)){
            System.out.println("Female has selected");
        }
       else if("m".equalsIgnoreCase(sex)){
            System.out.println("Male has selected");
        }
       else{
            System.out.println("Sex not identified");
        }

    }
}
