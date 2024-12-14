package homework2;

    public class ReplaceClass implements ReplaceSymbolA, ReplaceSymbolB {
        @Override
        public String replaceSymbolA(String text) {
            if (text == null || text.isEmpty()) {
                return "ტექსტი არ შეგიყვანიათ";
            }
            // სიმბოლო 'A' იცვლება სიმბოლო 'z'-ით
            return text.replace('A', 'Z').replace('a', 'z');
        }

        // ReplaceSymbolB ინტერფეისის მეთოდის იმპლემენტაცია
        @Override
        public String replaceSymbolB(String text) {
            if (text == null || text.isEmpty()) {
                return "";
            }
            // სიმბოლო 'B' იცვლება სიმბოლო 'w' -ით
            return text.replace('B', 'W').replace('b', 'w');
        }
}
