//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printSum() {
        // fix the code
        byte numOne = 104;
        byte numTwo = 110;
        short sumOfTwoNumbers = numOne;
        sumOfTwoNumbers += numTwo;
        System.out.print("Sum: " + sumOfTwoNumbers);
    }

    public static void variableDeclarationChallenge(boolean valid) {
        byte age = 10;
        System.out.println("Age is: " + age);
        short height =  30000;
        int distanceBetweenTwoSatellites = 1000000000;
        long distanceBetweenTwoGalaxy = 10000000000L;
        float rateOfInterest = 6/5f;
        double rateOfHike = 456/123d;
        char capitalA = 'A';
        boolean isPossible = true;
    }

    public static boolean validate(String inputString) {
        int stringLength = inputString.length();
        int i = stringLength - 1;
        StringBuilder reverseString = new StringBuilder(inputString).reverse();
        StringBuilder reverseString2 = new StringBuilder();
        while ( i > -1) {
            reverseString2.append(inputString.charAt(i));
            i--;
        }
        return reverseString.toString().equals(reverseString2.toString());
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String inputString = "hello";
        boolean valid = Main.validate(inputString);
        Main.variableDeclarationChallenge(valid);
        Main.printSum();
    }
}