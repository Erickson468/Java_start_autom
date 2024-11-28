package homework1;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //შევქმენი scanner
        System.out.print("შეივანეთ სტრიქონი: ");
        String userInput = scanner.nextLine();  // აქედან შემოდის ტექსტი
        oddEven(userInput);
    }
    static void oddEven(String Input){
        if(Input.length() %2 ==0){ //თუ სიგრძე იყოფა 2-ზე ანუ ლუწია, ყველა სხვა შემთხვევაში კენტი
            System.out.println("თქვენ მიერ შეყვანილ სტრიქონის სიგრძეა ლუწი");
        }
        else {
            System.out.println("თქვენ მიერ შეყვანილ სტრიქონის სიგრძეა კენტი");
        }
    }
}
