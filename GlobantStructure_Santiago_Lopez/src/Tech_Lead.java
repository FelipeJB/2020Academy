import responsabilities.Site;
import responsabilities.Work;

public class Tech_Lead extends Glober implements Site{
	
	private double percent = 0.3;

	@Override
	public void meetings() {
		System.out.println("	The tech lead must organize, define and create the meetings that can be necessary"
				+ "for the project according to the methodology Scrum");
		
	}

	@Override
	public void documentation() {
		System.out.println("	The tech lead must check, guarantee and define the policies for the correct use of repositories in an organized way "
				+ "and the format for the documentation according to the good practices ");		
	}

	@Override
	public void clean() {
		System.out.println("	The tech lead must maintain clean and organized, "
				+ "your space of job in the site corresponding");
		
	}

	@Override
	public void respect() {
		System.out.println("	The tech lead must be respectful with your partners on the site and in the project");
		
	}

	@Override
	public double calculateSalary() {
		return (salary * this.percent) + salary ;
	}
	
}
