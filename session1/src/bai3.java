import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Can Doc:");
        int num = scanner.nextInt();
        String ones = "";
        String tens = "";
        String hund = "";

        switch (num % 10) {
            case 0:
                ones = "zero";
                break;
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "five";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
        }
        switch ((num / 10) % 10) {
            case 1:
                switch (num % 10) {
                    case 0:
                        tens = "ten";
                        break;
                    case 1:
                        tens = "eleven";
                        break;
                    case 2:
                        tens = "twelve";
                        break;
                    case 3:
                        tens = "thirteen";
                        break;
                    case 4:
                        tens = "fourteen";
                        break;
                    case 5:
                        tens = "fifteen";
                        break;
                    case 6:
                        tens = "sixteen";
                        break;
                    case 7:
                        tens = "seventeen";
                        break;
                    case 8:
                        tens = "eighteen";
                        break;
                    case 9:
                        tens = "nineteen";
                        break;
                }
                break;
            case 2:
                tens = "twenty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 4:
                tens = "forty";
                break;
            case 5:
                tens = "fifty";
                break;
            case 6:
                tens = "sixty";
                break;
            case 7:
                tens = "seventy";
                break;
            case 8:
                tens = "eighty";
                break;
            case 9:
                tens = "ninety";
                break;
        }
        switch (num / 100) {
            case 1:
                hund = "one";
                break;
            case 2:
                hund = "two";
                break;
            case 3:
                hund = "three";
                break;
            case 4:
                hund = "four";
                break;
            case 5:
                hund = "five";
                break;
            case 6:
                hund = "six";
                break;
            case 7:
                hund = "seven";
                break;
            case 8:
                hund = "eight";
                break;
            case 9:
                hund = "nine";
                break;
        }

        if (num < 10 && num >= 0) {
            System.out.println(ones);
        }
        else if(num>=10&&num<=20){
            System.out.println(tens);
        } else if (num>20&&num<100) {
            System.out.print(tens + " " + ones);
        } else if (num>=100&&num<1000) {
            if (num%100==0){
                System.out.print(hund + " hundred ");
            }
            else {
                if (((num / 10) % 10)==1){
                    System.out.print(hund+" hundred "+tens);
                }
                else {
                    System.out.print(hund + " hundred " +tens+ " " +ones);
                }

            }
        }
    }
}
