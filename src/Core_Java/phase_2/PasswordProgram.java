package Core_Java.phase_2;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class PasswordProgram
{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;
        int duration = 5000;
        outer:
        for (; ; ) {
            int attempt = 3;
            do {
                System.out.println();
                System.out.println("Enter a Number:");
                int userpin = sc.nextInt();
                if (userpin == storedPin) {
                    System.out.println("Phone is  Unlock ");
                    break outer;
                }
                else {
                    System.out.println("Wrong pin ");
                    System.out.println("attemp :"+ (attempt-1));
                }
                attempt--;


            }while (attempt>=1);
            System.out.println();
            System.out.println("Phone is Been Locked :"+(duration/1000)+"seconds");
            sleep(duration);
            duration *= 2;

        }
    }}