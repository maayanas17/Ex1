package assignments.ex1;
import java.util.Scanner;
/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        int base,sum,mul;
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) {
                System.out.println("num1= "+num1+" is number: "+Ex1.isNumber(num1)+" , value: "+Ex1.number2Int(num1));
                if(!Ex1.isNumber(num1))
                {
                    System.out.println("ERR: num1 is in the wrong format! ("+num1+")");
                    continue;
                }
            }
            else
                break;
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (!num2.equals("quit")) {
                System.out.println("num2= "+num2+" is number: "+Ex1.isNumber(num2)+" , value: "+Ex1.number2Int(num2));
                if(!Ex1.isNumber(num2))
                    System.out.println("ERR: num2 is in the wrong format! ("+num2+")");
            }
            else
                break;
            System.out.println("Enter a base for output: (a number [2,16]");
            Scanner scanner = new Scanner(System.in);
            base= scanner.nextInt();
            if (base<2|| base>16)
                System.out.println("ERR: wrong base, should be [2,16], got ("+base+")");
            else
            {
                sum=Ex1.number2Int(num1)+Ex1.number2Int(num2);
                mul=Ex1.number2Int(num1)*Ex1.number2Int(num2);
                System.out.println(num1+" + "+num2+" = "+Ex1.int2Number(sum,base));
                System.out.println(num1+" * "+num2+" = "+Ex1.int2Number(mul,base));
                String [] arr={num1,num2,Ex1.int2Number(sum,base),Ex1.int2Number(mul,base)};
                System.out.println("Max number over ["+num1+","+num2+","+Ex1.int2Number(sum,base)+","+Ex1.int2Number(mul,base)+"] is: "+arr[Ex1.maxIndex(arr)]);
            }
        }
        System.out.println("quiting now...");
    }
}
