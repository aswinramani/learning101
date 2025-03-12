import algos.FrequencyOfDigits;
import algos.QuickSort;

class FatherPanda {
    public static final boolean isPredator = false;
    protected static final int weight = 5;
    private static final int age = 0;
    public void eat() {
        System.out.println("Is father panda predator. " + isPredator);
        System.out.println("After each meal, Father Panda gains weight: " + weight);
        System.out.println("His age is: " + age);
    }
}

class RLVariables {
    private int mySecretNumber = 10;

    public void displaySecret() {
        System.out.println("Reference variable accessing instance variable: " + mySecretNumber);
        mySecretNumber = 45;
        System.out.println("Local Variable: " + mySecretNumber);
        System.out.println("Reference variable accessing instance variable that points to the local variable: " + mySecretNumber);
    }
}

class TypeConversion {
    public String decimalToBinary(Integer num) {
        boolean isPositive = num > 0;
//        String binary = Integer.toBinaryString(num); in built java function
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, num % 2);
            num /= 2;
        }
        return isPositive ? sb.toString() : num.toString();
    }
}

public class Main {
    public static void printSum() {
        // fix the code
        byte numOne = 104;
        byte numTwo = 110;
        short sumOfTwoNumbers = numOne;
        sumOfTwoNumbers += numTwo;
        System.out.println("Sum: " + sumOfTwoNumbers);
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

    public static void initFatherPanda() {
        FatherPanda father = new FatherPanda();
        father.eat();
    }

    public static void initRLVariables() {
        RLVariables secret = new RLVariables();
        secret.displaySecret();
    }

    public static void initTypeCasting() {
        TypeConversion tc = new TypeConversion();
        String binaryString1 = tc.decimalToBinary(2);
        System.out.println(Integer.valueOf(binaryString1));
        String binaryString2 = tc.decimalToBinary(5);
        System.out.println(Integer.valueOf(binaryString2));
        String binaryString3 = tc.decimalToBinary(10);
        System.out.println(Integer.valueOf(binaryString3));
    }

    public static void initFrequencyDigits() {
        FrequencyOfDigits ba = new FrequencyOfDigits();
        System.out.println("frequency : " + ba.init(1122322, 2));
    }

    public static void initQuickSort() {
        QuickSort qs = new QuickSort();
        int[][] testInput = {
                {8, 3, 6, 5, 4, 2}
        };
        for (int[] input: testInput) {
            qs.init(input, 0, input.length-1);
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Main.validate("hello");
        Main.variableDeclarationChallenge();
        Main.printSum();
        Main.initFatherPanda();
        Main.initRLVariables();
        Main.initTypeCasting();
        Main.initFrequencyDigits();
        Main.initQuickSort();
    }
}