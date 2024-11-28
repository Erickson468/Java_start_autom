package homework1;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //შევქმენი scanner
        System.out.print("შეიყვანეთ ნებისმიერი ტექსტი, დაიბეჭდება ყოველი მე-n ასო: ");
        String userInput = scanner.nextLine();  // აქედან შემოდის ტექსტი
        System.out.print("შეიყვანეთ n: ");
        int userNumber = scanner.nextInt();
        String result = printThirdLetter(userInput, userNumber); // გამოვიძახე მეთოდი და მივანიჭე results დამუშავებული მონაცემები
        System.out.println(result);

        scanner.close();
    }

    //დავწერე მეთოდი სადაც გადაეცემა ტექსტი და ყოველი მერამდენე სიტყვა უნდა დაბეჭდოს
    static String printThirdLetter(String text, int number) {
        //numberValidation(text, number); //მინდოდა ცალკე მეთოდი დამეწერა ვალიდაციისთვის
        //ვალიდაცია
        if (number > text.length()) {
            return ("გადაცემული არგუმენტი მეტია შეყვანილი ტექსტის სიგრძეზე");
        } else if (number == 0) {
            return ("თქვენ გადაეცით 0, ცადეთ თავიდან");
        } else if (number < 0) {
            return ("თქვენ გადაეცით უარყოფითი რიცხვი, ცადეთ თავიდან");
        }
        String startInput = ""; //ცარიელი სტრინგი სადაც შევინახავ პოზიციებს
        int i = number - 1;// რადგან გვინდა მე-number პოზიცია მივანიჭე ერთით ნაკლები
        while (i < text.length()) {
            String character = "";// შემოვიღე რადგან ცარიელი სიმბოლოები არ დამებეჭდა
            character += text.charAt(i);
            if (!character.equals(" ")) {
                startInput += text.charAt(i);
            }
            i += number;
        }
        return startInput;
    }

//    static String numberValidation(String a, int b) {
//        String answer = "";
//        if (b > a.length()) {
//            answer = ("გადაცემული არგუმენტი მეტია შეყვანილი ტექსტის სიგრძეზე");
//        } else if (b == 0) {
//            answer = ("თქვენ გადაეცით 0, ცადეთ თავიდან");
//        } else if (b < 0) {
//            answer = ("თქვენ გადაეცით უარყოფითი რიცხვი, ცადეთ თავიდან");
//        }
//        return answer;
//    }

}


