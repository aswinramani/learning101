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


    public static void variableDeclarationChallenge() {
        byte age = 10;
        System.out.println("age is: " + age);
        short height =  30000;
        System.out.println("height is: " + height);
        int distanceBetweenTwoSatellites = 1000000000;
        System.out.println("distanceBetweenTwoSatellites is: " + distanceBetweenTwoSatellites);
        long distanceBetweenTwoGalaxy = 10000000000L;
        System.out.println("distanceBetweenTwoGalaxy is: " + distanceBetweenTwoGalaxy);
        float rateOfInterest = 6/5f;
        System.out.println("rateOfInterest is: " + rateOfInterest);
        double rateOfHike = 456/123d;
        System.out.println("rateOfHike is: " + rateOfHike);
        char capitalA = 'A';
        System.out.println("capitalA is: " + capitalA);
        boolean isPossible = true;
        System.out.println("isPossible is: " + isPossible);
    }

    public static void validate(String inputString) {
        int stringLength = inputString.length();
        int i = stringLength - 1;
        StringBuilder reverseString = new StringBuilder(inputString).reverse();
        StringBuilder reverseString2 = new StringBuilder();
        while ( i > -1) {
            reverseString2.append(inputString.charAt(i));
            i--;
        }
        System.out.print(reverseString.toString().equals(new String(reverseString2)));
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String inputString = "hello";
        Main.validate(inputString);
        Main.variableDeclarationChallenge();
        Main.printSum();
    }
}