package homework2;

class CountVowel extends Test {
        @Override
        public int countVowel(String text){
            //ცარიელი ტექსტის შეყვანა დავაზღვიე
            if (text == null || text.isEmpty()){
                return 0;
            }

            int count = 0; //შემოვიღე ქაუნთერი
            String vowels = "aeiouAEIOU";//განვსაზღვრე ხმოვნები
            for (int i = 0; i < text.length(); i++){
                if (vowels.indexOf(text.charAt(i)) != -1) {
                    count++;
                }
            }
            return count;
        }
}
