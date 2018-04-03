import java.util.Scanner;

public class GradeBook
{
	private String courseName;

	public GradeBook(String name)
	{
		courseName = name;
	}
	public void setCourseName( String name )
	{
		courseName = name;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void displayMessage()
	{
		System.out.printf("Bem vindo ao GradeBook\n%s!\n\n",getCourseName());
	}
	public void determineClassAverage()
	{
		
	}
}
