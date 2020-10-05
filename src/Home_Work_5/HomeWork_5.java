package Home_Work_5;

public class HomeWork_5 {
    public static void main(String[] args) {
        // Subject - Homework-5

        /**
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */


        String msg = "have happy and prosperous life";

        String [] words = msg.split(" ");


        for (int i = 0; i<= words.length-1; i++) {

            System.out.print( words[i].substring(0,1).toUpperCase());
        }


        /**
         * Change the string to title case
         */


        String line = "once upOn a tiMe in the UNIVERSE";

        System.out.println("\nLine before modification: "+ line);

        String [] wordsOfLine = line.split(" ");

        for (int letterCount = 0; letterCount <= wordsOfLine.length-1; letterCount++){

            System.out.print(wordsOfLine[letterCount].substring(0,1).toUpperCase()+ wordsOfLine[letterCount].substring(1).toLowerCase()+" ");
        }






        /**
         * reverse a string
         */


        String message = "Happy Holidays";

        String [] letters = message.split("");
        int lengthOfLetters = letters.length;

        System.out.println("\nOriginal message: "+ message);

        for ( int b = lengthOfLetters-1; b >= 0; --b ){
            System.out.print(letters[b]);
        }

    }
}
