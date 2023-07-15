import java.util.Scanner;
public class Init {
//    public static void start(){
//                    // Получаем результат вида:   String[] expressionSplit = {"5", "+", "6"};
//        String[] expressionSplit = Init.splitUserInput(Init.getInput());
//
//        char operator = expressionSplit[1].charAt(0);
//        boolean isRoman0 = InputCheck.romCheck0(expressionSplit);
//        boolean isRoman2 = InputCheck.romCheck2(expressionSplit);
//
//        InputCheck.isBothRoman(expressionSplit);
//        Calculator.printResult(expressionSplit,operator, isRoman0, isRoman2);
//    }
    public static String getInput(){
        System.out.println("Введите выражение. (Например, 5+5 или V-II)");
        Scanner scanner = new Scanner(System.in);

        //Приводим строку в порядок, делаем все буквы заглавными, убираем все пробелы
        String userInput = scanner.nextLine().toUpperCase().replaceAll("\\s", "");
        return userInput;


    }// end of method initialization
    public static String[] splitUserInput(String userInput) {
         String[] expression = new String[3];
        //Опредялем оператор действия, добавляем к нему пробелы для удобства разделения строки
        try {
            if (userInput.contains(Character.toString('+'))) {
                expression = userInput.replace("+", " + ").split("\\s");
            } else if (userInput.contains(Character.toString('-'))) {
                expression = userInput.replace("-", " - ").split("\\s");
            } else if (userInput.contains(Character.toString('*'))) {
                expression = userInput.replace("*", " * ").split("\\s");
            } else if (userInput.contains(Character.toString('/'))) {
                expression = userInput.replace("/", " / ").split("\\s");
            } else {
                throw new UnsupportedOperationException("Неверный знак оператора "+"\uD83D\uDEA8");
            }
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return expression;
    }// end of method splitUserInput
}// end of class Init
