package week1.day1;

public class ClassRoomDivisibility {

	public static void main(String[] args) {

		int num = 11;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Number is divisible by 3 & 5");
		} else if (num % 5 == 0) {
			System.out.println("Number is divisible by 5");
		} else if (num % 3 == 0) {
			System.out.println("Number is divisible by 3");
		} else {
			System.out.println("The number is not divisible by 3 & 5");
		}
	}

}
