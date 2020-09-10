import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lookingOutForNumberOne {


    public static int countDigits(int num){

        int count = 0;
        for (; num != 0; num = num/10, ++count) {
        }

        return count;
    }//Part 1 - Goal: Count the number of digits in an integer
    public static char nthDigitBack(int n, int num){

        String z = num + "";
        char z1[] = z.toCharArray();
        int length = z1.length - 1;
        char result = z1[length - n];
        return result;

    }
    //Part 2 - Goal: Find the nth Digit from right to left

    public static char nthDigit(int n, int num){
        String digit = num + "";
        return digit.charAt(n);

    }
    //Part 3 - Goal: Find the nth Digit from left to right



    public static void updateTally(int n, int num, int[] tally){
        int index = nthDigit(n,num);
        int updateInt = 0;
        for(int i = 0; i <= n; i++){
            updateInt += tally[i];
        }
        tally[index] = updateInt;

    } //Part 4 - Goal: Write a method that calls nthDigit, and takes in 3 arguments:
    //an int (n), an int (num), and an int[] tally. We assume that tall is an int[] of 10 integers.
    //The tally contains the tally for the number of nth digits seen so far.
    //It updates the tall to reflect the nth digit of num.

    public static int[] nthDigitTally(int n, int[] nums){
        int[] tally = new int[10];
        for(int i = 0; i < nums.length; i++){
            updateTally(n, i, tally);
        }

      return tally;
    } //Part 5 - Goal: Write a method that calls updateTally, and takes in 2 arguments:
    //and returns a tally of frequencies of 0-9 as the nth digit of all the numbers in nums


    public static int[] readMysteriousNumbers(File filename){
        File file = new File("livejournal.txt");
        Scanner scanner = new Scanner(filename);
        String[] fileInput = filename.list();
        int[] nums = new int[fileInput.length];
        for(int i = 0; i < fileInput.length;i++){
            nums[i] = Integer.parseInt(fileInput[i]);
        }

        return nums;
    }//Part 6 - Goal: Write a method that reads whitespace separated integers from a file
    //and returns a list of numbers suitable as input to nthDigitTally



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int b = Integer.parseInt(a);
        String file = input.nextLine();
        File readFile = new File(file);

        try {

            int[] nums = readMysteriousNumbers(file);
            int[] tally = nthDigitTally(b, nums);
            for(int i = 0; i < 10; i++){
                System.out.println(i + "s:\t" + tally[i]);
            }

        //int count = countDigits(12345678);
        //System.out.println(count);
        //System.out.println(nthDigitBack(0, 123));
        //System.out.println(nthDigit(0, 123));

    }
        catch (Exception e){
            System.out.println("Oops. Something went wrong.");
        }

    }


}
