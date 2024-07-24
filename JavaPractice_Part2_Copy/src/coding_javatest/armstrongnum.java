package coding_javatest;

public class armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arm strong num 371 -> 3*3*3+7*7*7+1*1*1 = 371... i.e 3^n+7^n+1^n = 371 (where n is the length of num)
		//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself.
		
		int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

	}


