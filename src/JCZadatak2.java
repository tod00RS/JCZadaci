import java.util.Scanner;

public class JCZadatak2 {

    private static int randomNumber;

    public static void main(String[] args) {
        String answer;
        int inputNumber;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Unesite jedan ceo broj u intervalu o 1 do 50: ");


            try {
                inputNumber = Integer.parseInt(input.next());


                if (inputNumber >= 0 && inputNumber <= 50) {

                    randomNumber = (int) (Math.random() * 50 + 1);

                    System.out.println(inputNumber + " " + randomNumber);

                    switch (numberCheck(inputNumber)) {
                        case 0:
                            System.out.println("Pogodak!" + " " + numberCheck(inputNumber));
                            break;
                        case 1:
                            System.out.println("Jako blizu" + " " + numberCheck(inputNumber));
                            break;
                        case 2:
                            System.out.println("Pokusaj ponovo" + " " + numberCheck(inputNumber));
                            break;
                    }
                } else {
                    System.out.println("Morate uneti ceo broj u intervalu od 1 d 50");
                }
            } catch (NumberFormatException e) {
                System.out.println("Morate uneti ceo broj ");
            }

            System.out.println("Da li zelite da prekinete igru? (Q za prekid bilo sta za nastavak)");
            answer = input.next();

        } while (!answer.equalsIgnoreCase("Q"));

        System.out.println("Igra je zavrsena");


    }

    private static int numberCheck(int inputNumber) {
        int diffNumber = Math.abs(inputNumber - randomNumber);

        if (diffNumber >= 0 && diffNumber <= 5) {
            if (diffNumber == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        return 2;
    }
}
