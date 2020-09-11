import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/*
Our world is controlled by mathematics – just ask any physicist.
Sometimes math can be beautiful, such as when the golden ratio crops up in nature.
This assignment asks what does the number of social media posts each day,
the population of every town in the US, the address of every faculty member of Temple,
and the size of tallest 100 buildings have in common?
Please utilize the discussion board on Canvas for this assignment.
Some parts are tricky, and I encourage you to ask your classmates for help.
The final part of this project requires you to post your dataset on the message board.
Assignment

The end goal of this program is to write a program that determines the distribution
of initial digits in a set of data. In the end, we want a program that reads in a number n
and a list of numbers nums and outputs an nth of 10 values: the frequency with which
each digit 0-9 appears as the nth digit of one of the input numbers.
However, we’ll break that problem down into easier steps.

*/


public class lookingOutForNumberOne {

    public static int countDigits(int num) {

        //int count = 0;
        //for (; num != 0; num = num / 10, ++count) {
        //}

        return (int) Math.floor(Math.log10(num) + 1);
    }//Part 1 - Goal: Count the number of digits in an integer

    //Part 2 - Goal: Find the nth Digit from right to left
    /*public static char nthDigitBack(int n, int num) {

        String z = num + "";
        char[] z1 = z.toCharArray();
        int length = z1.length - 1;
        return z1[length - n];



    }*/
    //Part 3 - Goal: Find the nth Digit from left to right

    public static int nthDigit(int n, int num) {
        int count = countDigits(num);

        //12345678 - 3RD digit: 4 1234.5678 % 10

       /* int digit2 = 0;
        while (num != 0) {
            int digit = num % 10;
            digit2 = digit2 * 10 + digit;
            num /= 10;
        }*/

        //String digit = num + "";
        //return digit.charAt(n);
        //first idea ^^

        //return(int) (digit2 / Math.pow(10,n) % 10);
        return (int) (num / Math.pow(10,((count - n - 1) % 10)));

    }

    public static void updateTally(int n, int num, int[] tally) {
        int index = nthDigit(n, num);
        tally[index]++;
        /*int index = nthDigit(n, num);
        int updateInt = 0;
        for (int i = 0; i <= n; i++) {
            updateInt += tally[i];
        }
        tally[index] = updateInt;

         */

    } //Part 4 - Goal: Write a method that calls nthDigit, and takes in 3 arguments:
    //an int (n), an int (num), and an int[] tally. We assume that tall is an int[] of 10 integers.
    //The tally contains the tally for the number of nth digits seen so far.
    //It updates the tall to reflect the nth digit of num.

    public static int[] nthDigitTally(int n, int[] nums) {
        int[] tally = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            updateTally(n, number, tally);
        }

        return tally;
    } //Part 5 - Goal: Write a method that calls updateTally, and takes in 2 arguments:
    //and returns a tally of frequencies of 0-9 as the nth digit of all the numbers in nums


    public static int[] readMysteriousNumbers(String filename) throws Exception {
        File file = new File(filename);
        Scanner counter = new Scanner(file);
        int numLines = 0;
        while(counter.hasNextLine()){
            counter.nextLine();
            numLines++;
        }
        int[] arr = new int[numLines];



        Scanner reader = new Scanner(file);
        int index = 0;
        while(reader.hasNextLine()){
            arr[index] = Integer.parseInt(reader.nextLine());
            index++;
        }




        return arr;
        /*
        List<Integer> nums = new ArrayList<>();
        while (scanner.hasNextInt()) {
            nums.add(scanner.nextInt());
        }
        int[] ret = new int[nums.size()];
        for(int i = 0;i < ret.length;i++) {
            ret[i] = nums.get(i);
        }
        return ret*/
    }//Part 6 - Goal: Write a method that reads whitespace separated integers from a file
    //and returns a list of numbers suitable as input to nthDigitTally

    //}

     public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a single digit integer:");
        String a = input.nextLine();
        int b = Integer.parseInt(a);
        System.out.println("Please enter a file name:");
        String filename = input.nextLine();
        //File readFile = new File(file);

            try {

                int[] nums = readMysteriousNumbers(filename);
                int[] tally = nthDigitTally(b, nums);
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "s: \t" + tally[i]);
                } //Finish - Write your main method to read a number n, from input
                //You can let a user enter a file name of a dataset or you can automatically use one.
                //The program should tally the nth digits of the number in the data set
                //and print out a table

                //int count = countDigits(12345678);
                //System.out.println(count);
                //System.out.println(nthDigitBack(0, 123));
                //System.out.println(nthDigit(0, 123));

            } catch (Exception e) {
                System.out.println("Oops. Something went wrong.");
                e.printStackTrace();
            }

     }



}
