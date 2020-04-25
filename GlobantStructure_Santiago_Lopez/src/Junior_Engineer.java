import responsabilities.Site;

public class Junior_Engineer extends Glober implements Site{
	
	private double percent = 0.10;

	@Override
	public void meetings() {
		System.out.println("	The Junior Engineer must asist, analyse and understand the meetings and her content that can be necessary"
				+ "for the project according to the methodology Scrum");
		
	}

	@Override
	public void documentation() {
		System.out.println("	The Junior Engineer must help and do the correct use of repositories in an organized way "
				+ "and the format for the documentation according to the good practices and the policies defined for the project");		
	}

	@Override
	public void clean() {
		System.out.println("	The Junior Engineer must maintain clean and organized, "
				+ "your space of job in the site corresponding");
		
	}

	@Override
	public void respect() {
		System.out.println("	The Junior Engineer must be respectful with your partners on the site and in the project");
		
	}

	@Override
	public double calculateSalary() {
		return (salary * this.percent) + salary ;
	}

}
