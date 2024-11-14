
package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Answer = new Scanner(System.in);
        int i = 2;
        System.out.println("უპასუხეთ კითხვას: რომელქუდა შეჭამა მგელმა?");
        String userAnswer = Answer.nextLine();
        while (i>0){
            if (userAnswer.equals("წითელქუდა")){
                System.out.println("თქვენ შეიყვანეთ სწორი პასუხი, გილოცავთ " + userAnswer);
                break;
            }
            else {
                System.out.println("თქვენ შეიყვანეთ \"" + userAnswer+ "\" ცადეთ თავიდან, დაგრჩათ "+i+" ცდა: ");
                userAnswer = Answer.nextLine();
                i--;
                if (i ==0){
                    System.out.println("თქვენ გამოგელიათ ცდების ოდენობა");
                }
            }
        }

        //პირველი ვარიანტი რაც დავწერე
//        while (!userAnswer.equals("წითელქუდა") && i>0){
//            i--;
//            System.out.println("თქვენ შეიყვანეთ \"" + userAnswer+ "\" ცადეთ თავიდან, დაგრჩათ "+i+" ცდა: ");
//            userAnswer = Answer.nextLine();
//        }
//        if(i==0) {
//            System.out.println("თქვენ გამოგელიათ ცდების ოდენობა");
//        }
//        else {
//            System.out.println("თქვენ შეიყვანეთ სწორი პასუხი, გილოცავთ " + userAnswer);
//        }
    }
}