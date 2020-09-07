public class lookingOutForNumberOne {


    public static void countDigits(int num){

        int count = 0;
        for (; num != 0; num = num/10, ++count) {
        } //Goal: Count the number of digits in an integer
        //if the number doesn't equal zero, an
        
        return count;


    }

    public static int nthDigitBack(int n, int num){
        for ( int i =0; i < 10; i++){


        }




        return 0;
    } //Goal: Find the location of a digit from the right to left


    public static int nthDigit(int n, int num) {


        return 0;

    }  //Goal: Find the location of a digit from left to right


    public static void updateTally(int n, int num, int[] tally){


        


    } //Goal: Write a method that calls nthDigit, and takes in 3 arguments:
    //an int (n), an int (num), and an int[] tally. We assume that tall is an int[] of 10 integers.
    //The tally contains the tally for the number of nth digits seen so far.
    //It updates the tall to reflect the nth digit of num.


    public static void main(String[] args) {
        
        int count= countDigits(12345678);
        System.out.println(count);

    }


}
