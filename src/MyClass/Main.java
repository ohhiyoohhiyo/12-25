package MyClass;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String Name ="OOP";
		int[][] score = {{ 100, 90, 92 },{ 80, 90, 91},{ 93, 86, 100}};
		Book grade = new Book(Name, score);
		
			System.out.println("Max: " + grade.getMax());
		    System.out.println("Min: " + grade.getMin());
			System.out.println("Avg: " + grade.getAvg());
		}
}


