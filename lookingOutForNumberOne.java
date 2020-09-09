public class lookingOutForNumberOne {


    public static int countDigits(int num){

        int count = 0;
        for (; num != 0; num = num/10, ++count) {
        } //Goal: Count the number of digits in an integer
        //if the number doesn't equal zero, an

        return count;


    }
    public static char nthDigitBack(int a, int b){

        String z = a + "";
        char z1[] = z.toCharArray();
        int length = z1.length - 1;
        char result = z1[length - b];
        return result;

    }
    //Goal: Find the nth Digit from right to left

    public static char nthDigit(int x, int y){
        String digit = x + "";
        return digit.charAt(y);

    }

    //Goal: Find the nth Digit from left to right



    public static void updateTally(int n, int num, int[] tally){


    } //Goal: Write a method that calls nthDigit, and takes in 3 arguments:
    //an int (n), an int (num), and an int[] tally. We assume that tall is an int[] of 10 integers.
    //The tally contains the tally for the number of nth digits seen so far.
    //It updates the tall to reflect the nth digit of num.


    public static void main(String[] args) {
        try {


        int count = countDigits(12345678);
        System.out.println(count);
        System.out.println(nthDigitBack(8675309, 4));
        System.out.println(nthDigit(123453232, 6));
    }
        catch (Exception e){
            System.out.println("Oops. Something went wrong.");
        }

    }


}
