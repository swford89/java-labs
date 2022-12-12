package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {
        /**
         * 1. METHOD OVERLOADING
         */
        // add ints
        int intSum = add(100, 200);
        System.out.println("Int sum: " + intSum);
        // add doubles
        double dubSum = add(3.00000000000000000000000000000001, 3.00000000000000000000000000000001);
        System.out.println("Double sum: " + dubSum);
        // add int & double
        double intDubSum = add(5, 3.00000000000000000000000000000001);
        System.out.println("Int and Double sum: " + intDubSum);
        // add int and long
        long intLong = add(3, 2000000000);
        System.out.println("Int and long sum: " + intLong);
        /**
         * 2. PASS BY VALUE(PRIMITIVE DATATYPE) vs. PASS BY REFERENCE(OBJECT)
         */
        Person scott = new Person(){};
        scott.firstName = "Scott";
        scott.lastName = "Ford";
        scott.age = 33;
        scott.programmingLanguage.add("Python");
        scott.programmingLanguage.add("Java");
        System.out.println(scott.programmingLanguage);
        // pass by reference: static
        addProgram(scott, "Kotlin");
        System.out.println(scott.programmingLanguage);
        // non-static method
        scott.addProgram("Javascript");
        System.out.println(scott.programmingLanguage);
        /**
         * 3. METHOD THAT WILL RETURN THE LARGEST OF 4 NUMBERS
         */
        int num = largestNum(44, -10, 1000, 678);
        System.out.println(num);
        /**
         * 4. METHOD TO COUNT ALL THE CONSONANTS IN A STRING
         */
        int count = consonantCount("bubble");
        System.out.println(count);
        /**
         * 5. METHOD THAT DETERMINES WHETHER A NUMBER IS PRIME OR NOT
         */
        boolean isPrime = primeNumber(12);
        System.out.println(isPrime);
        /**
         * 6. METHOD THAT WILL RETURN SMALL ARRAY CONTAINING HIGHEST AND LOWEST NUMBER
         *    FROM A GIVEN NUMERIC ARRAY THAT IS PASSED IN AS AN ARGUMENT
         */
        int[] someNumArray = {2,88,44,-44,1000};
        int[] highLowArray = highestLowest(someNumArray);
        for (int i = 0; i < highLowArray.length; i++){
            System.out.println(highLowArray[i]);
        }
        /**
         * 7. METHOD THAT TAKES 3 ARGUMENTS (int maxNum, int divisorOne, int divisorTwo)
         *    CREATE AN INTEGER ARRAY LIST THAT IS POPULATED WITH THE NUMBERS BETWEEN 0 AND maxNum
         *    WHICH ARE DIVISIBLE BY BOTH divisorOne AND divisorTwo
         */
        ArrayList<Integer> someArrayList = divisible(30, 2, 3);
        System.out.println("Length of ArrayList with numbers divisible by two and 3: " + someArrayList.size());
        /**
         * 8. METHOD THAT REVERSES AN ARRAY IN PLACE
         */
        int[] randomArray = {1,2,3,4,5,6,7,8,9,10};
        int[] reversedArray = reverseArray(randomArray);
        for (int i = 0; i < reversedArray.length; i++){
            System.out.println(reversedArray[i]);
        }
    }

    // 1. method overloading
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static double add(double a, double b){
        double sum = a + b;
        return sum;
    }
    public static double add(int a, double b){
        double sum = (double) a + b;
        return sum;
    }
    public static long add(int a, long b){
        long sum = (long) a + b;
        return sum;
    }
    public static void addProgram(Person person, String additionalProgram){
        person.programmingLanguage.add(additionalProgram);
    }
    public static int largestNum(int a, int b, int c, int d){
        int[] numArr = new int[] {a, b, c, d};
        int largeNum = a;
        for (int i = 1; i < numArr.length; i++){
            int nextNum = numArr[i];
            if (nextNum > largeNum){
                largeNum = nextNum;
            }
        }
        return largeNum;
    }
    public static int consonantCount(String someString){
        String vowels = "aeiou";
        int conCount = 0;
        for (char c: someString.toCharArray()){
            if (vowels.indexOf(c) != -1){
                continue;
            }
            else {
                conCount++;
            }
        }
        return conCount;
    }
    public static boolean primeNumber(int someNum){
        int primeNumber;
        boolean isPrime = true;
        for (int i = 2; i <= someNum/2; i++){
            if (someNum % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static int[] highestLowest(int[] someNumArray){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < someNumArray.length; i++){
            if (someNumArray[i] > high){
                high = someNumArray[i];
            }
            else if (someNumArray[i] < low){
                low = someNumArray[i];
            }
        }
        int[] highLowArray = {high, low};
        return highLowArray;
    }
    public static ArrayList<Integer> divisible(int maxNum, int divisorOne, int divisorTwo){
        ArrayList<Integer> divisibleList = new ArrayList<Integer>();
        for (int num = 1; num < maxNum; num++){
            if (num % divisorOne == 0 && num % divisorTwo == 0){
                divisibleList.add(num);
            }
        }
        return divisibleList;
    }
    public static int[] reverseArray(int[] someArray){
        int tempHolder;
        for (int i = 0; i < someArray.length/2; i++){
            tempHolder = someArray[i];
            someArray[i] = someArray[someArray.length - 1 - i];
            someArray[someArray.length - 1 - i] = tempHolder;
        }
        return someArray;
    }
}

// 2. Pass by value vs. Pass by reference
class Person{
    // instance variables
    protected String firstName;
    protected String lastName;
    protected int age;
    protected ArrayList<String> programmingLanguage = new ArrayList();
    // constructor
    protected Person (){};

    protected void addProgram(String additionalProgram){
        this.programmingLanguage.add(additionalProgram);
    }
}
