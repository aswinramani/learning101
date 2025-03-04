//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class References {
    int num;
}

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

    public static void initReferencing() {
        System.out.println("init referencing");
        int i = 10;
        int j = 5;
        System.out.println(i + " " + j);
        i = j;
        System.out.println(i + " " + j);
        j++;
        System.out.println(i + " " + j);

        References ref1 = new References();
        References ref2 = new References();
        ref2 = ref1;
        ref1.num = 15;
        System.out.println(ref1.num + " " + ref2.num);
        ref2.num++;
        System.out.println(ref1.num + " " + ref2.num);
        System.out.println("end referencing");
    }

    public static void initFatherPanda() {
        FatherPanda father = new FatherPanda();
        father.eat();
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String inputString = "hello";
        Main.validate(inputString);
        Main.variableDeclarationChallenge();
        Main.printSum();
        Main.initReferencing();
        Main.initFatherPanda();
    }
}