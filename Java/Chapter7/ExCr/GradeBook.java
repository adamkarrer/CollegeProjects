import java.util.ArrayList;

public class GradeBook
{
	Student joanne = new Student();
	Student will = new Student();
	Student sam = new Student();
	Student kerry = new Student();
	Student jill = new Student();

	Student[] students = { will, joanne, kerry, sam, jill};

	public GradeBook()
	{
	}


		public void getInfo()
		{
			String output = "ERROR!";
			for (int i = 0; i < students.length; i++)
			{
				System.out.println("Name: " + students[i].name
				+ "     Average Score: " + students[i].getScore()
				+ "     Grade: " + students[i].getGrade());
			}
		}

}