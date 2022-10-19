import com.course.structure.Building;
import com.course.structure.House;
import com.course.structure.School;
import java.util.*;
public class BuildingTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\tHOUSE");
		System.out.println("Number of bedrooms and bathrooms : ");
		int bed = sc.nextInt();
		int bath = sc.nextInt();
		System.out.println("Area in square foots : ");
		float a1 = sc.nextFloat();
		System.out.println("Number of floors : ");
		int f1 = sc.nextInt();
		House h = new House(bed,bath,a1,f1);

		System.out.println("\n\tSCHOOL");
		System.out.println("Number of Classroom : ");
		int classes = sc.nextInt();
		System.out.println("Grade : ");
		sc.nextLine();
		String grade = sc.nextLine();
		System.out.println("Area in square foots : ");
		float a2 = sc.nextFloat();
		System.out.println("Number of floors : ");
		int f2 = sc.nextInt();
		School s = new School(classes,grade,a2,f2);

		h.display();
		s.display();
	}
}