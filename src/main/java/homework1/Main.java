package homework1;


public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        String result1 = isEven(array);
        System.out.println(result1);
        checkNumber(-2);
        hasTeen(10,20,14);
    }
    static String isEven(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        if (count != 0) {
            return ("მასივში არის " + count + " ლუწი რიცხვი");
        } else {
            return ("მასივში არ არის ლუწი რიცხვი");
        }
    }
//ამოცანა 4
    static void checkNumber(int number){
        if (number > 0){
            System.out.println("დადებითი");
        }
        else if (number <0 ){
            System.out.println("უარყოფითი");
        }
        else {
            System.out.println("ნოლი");
        }
    }
//ამოცანა 5
    static void hasTeen(int first, int second, int third){
        if (first >=13 && first <=19 || second >=13 && second <=19 || third >=13 && third <=19 ){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}


