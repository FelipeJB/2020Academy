import responsabilities.Site;

public class Senior_Engineer extends Glober implements Site{
	
	private double percent = 0.20;

	@Override
	public void meetings() {
		System.out.println("	The Senior Engineer must asist and propose the meetings that can be necessary"
				+ "for the project according to the methodology Scrum");
		
	}

	@Override
	public void documentation() {
		System.out.println("	The Senior Engineer must help to guarantee the correct use of repositories in an organized way "
				+ "and the format for the documentation according to the good practices ");		
	}

	@Override
	public void clean() {
		System.out.println("	The Senior Engineer must maintain clean and organized, "
				+ "your space of job in the site corresponding");
		
	}

	@Override
	public void respect() {
		System.out.println("	The Senior Engineer must be respectful with your partners on the site and in the project");
		
	}

	@Override
	public double calculateSalary() {
		return (salary * this.percent) + salary ;
	}

}
