//public class Split {
//    public static String[] splitUserInput(String userInput) {
//        String[] expression = new String[3];
//        //Опредялем оператор действия, добавляем к нему пробелы для удобства разделения строки
//        try {
//            if (userInput.contains(Character.toString('+'))) {
//                expression = userInput.replace("+", " + ").split("\\s");
//            } else if (userInput.contains(Character.toString('-'))) {
//                expression = userInput.replace("-", " - ").split("\\s");
//            } else if (userInput.contains(Character.toString('*'))) {
//                expression = userInput.replace("*", " * ").split("\\s");
//            } else if (userInput.contains(Character.toString('/'))) {
//                expression = userInput.replace("/", " / ").split("\\s");
//            } else {
//                throw new UnsupportedOperationException("Неверный знак оператора "+"\uD83D\uDEA8");
//            }
//        } catch (UnsupportedOperationException e) {
//            System.err.println(e.getMessage());
//            System.exit(0);
//        }
//        return expression;
//    }// end of method
//}//end of class
