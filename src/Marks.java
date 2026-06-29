import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects:");
		int n = sc.nextInt();
		int marks[] = new int[n];
		int sum = 0;
		System.out.println("Enter marks:");
		for(int i =0;i<n;i++) {
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		int high = marks[0];
		int low = marks[0];
		for(int i =0;i<n;i++) {
			if(marks[i]>high) {
				high = marks[i];
			}
			if(marks[i]<low) {
				low = marks[i];
			}
		}
		double average = (double)sum/n;
		System.out.println("\nHighest Marks = " + high);
	    System.out.println("Lowest Marks = " + low);
	    System.out.println("Average = " + average);

	    System.out.println("\nGrades:");

	    for (int i = 0; i < n; i++) {

            System.out.print("Student " + (i + 1) + " : ");

            if (marks[i] >= 90)
                System.out.println("A");
            else if (marks[i] >= 80)
                System.out.println("B");
            else if (marks[i] >= 70)
                System.out.println("C");
            else if (marks[i] >= 60)
                System.out.println("D");
            else
                System.out.println("F");
        }

	}

}
