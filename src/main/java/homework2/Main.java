package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //ამოცანა 1-ის მეინი
        Test vowelCounter = new CountVowel();
        //სკანერით ნებისმიერი ტექსტის შეყვანა
        Scanner scanner = new Scanner(System.in); //შევქმენი scanner
        System.out.print("შეიყვანეთ ნებისმიერი ტექსტი: ");
        String userInput = scanner.nextLine();
        int countVowel = vowelCounter.countVowel(userInput);
        System.out.println("ამ სტრიქონში არის " + countVowel+" ხმოვანი");

        //ამოცანა 2-ის მეინი
        ReplaceClass replaceSymbols = new ReplaceClass();

        System.out.print("შეიყვანეთ ნებისმიერი ტექსტი: ");
        String userInput2 = scanner.nextLine();

        // ReplaceSymbolA-ის მეთოდის გამოყენება
        String resultA = replaceSymbols.replaceSymbolA(userInput2);

        // ReplaceSymbolB-ის მეთოდის გამოყენება
        String resultB = replaceSymbols.replaceSymbolB(resultA);
        System.out.println(resultB);

        //ამოცანა 3
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        // მასივის დალაგება სორტირების გამოყენებით
        for (int i = 0; i < arr.length - 1; i++) { //გავდივარ მასივის ყველა ელემენტზე ბოლოს გარდა (ბოლო რაც დარჩება ავტომატურად გამოდის დალაგებული)
            for (int j = 0; j < arr.length - i - 1; j++) { //შიდა ციკლით ვადარებ და ვცვლი ელემენტებს
                if (arr[j] > arr[j + 1]) {
                    // გაცვლა
                    int temp = arr[j]; //დროებით ვანიჭებ ელემენტს temp ცვლადს
                    // ვუცვლი ადგილებს:
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // დალაგებული მასივის დაბეჭდვა
        System.out.print("დალაგებული მასივი: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

