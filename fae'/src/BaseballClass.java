import java.util.Scanner;
public class BaseballClass {

	
	private String name;
	private double hits;
	private double doubles;
	private double triples;
	private double homeruns;
	private double runs;
	private double walks;
	private double atbat;
	private double hbp;
	private double sacfly;
	
	public BaseballClass(String name, double hits, double doubles, double triples, double homeruns, double runs,
			double walks, double atbat,double hbp, double sacfly) {
		super();
		this.name = name;
		this.hits = hits;
		this.doubles = doubles;
		this.triples = triples;
		this.homeruns = homeruns;
		this.runs = runs;
		this.walks = walks;
		this.atbat = atbat;
		this.hbp = hbp;
		this.sacfly = sacfly;
	}
	
	public double batting_average() {
		return this.hits/this.atbat;
	}
	public double total_bases() {
		double temp = this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns);
		return temp;
	}
	public double slugging_perc() {
		double temp = (this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat;
		return temp;
	}
	public double onbasepercentage() {
		double temp = (this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly);
		return temp;
	}
	public double  onbaseslug() {
		double temp = ((this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly))+((this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat);
		return temp;
	}
	public static void main(String[] args){
		
		java.util.Scanner input = new Scanner(System.in);
		
		String name;
		double hits;
		double doubles;
		double triples;
		double homeruns;
		double runs;
		double walks; 
		double atbat;
		double hbp;
		double sacfly;
		

		System.out.println("Name the player"); //the player's name
		name = input.next();
		
		System.out.println("how many hits?"); //amount of hits
		hits = input.nextDouble();
		
		System.out.println("how many doubles?"); //amount of doubles
		doubles = input.nextDouble();
		
		System.out.println("how many triples?"); // amount of triples
		triples = input.nextDouble();
		
		System.out.println("homeruns??"); // amount of homeruns?
		homeruns = input.nextDouble();
		
		System.out.println("runs??"); // amounts  of runs
		runs = input.nextDouble();
		
		System.out.println("walks"); // amount of walks
		walks = input.nextDouble();
		
		System.out.println("atbat"); //amount of at bat
		atbat = input.nextDouble();

		System.out.println("hit by pitch?"); //amount of hit by pitch
	    hbp = input.nextDouble();
		
		System.out.println("sacfly"); //amount of sac flys
		sacfly = input.nextDouble();
	
		BaseballClass bclass = new BaseballClass(name, hits, doubles, triples, homeruns, runs, walks, atbat, hbp, sacfly);
		double BA = bclass.batting_average(); 
		System.out.printf("batting average:" + "%f\n", BA);
		
		double tb = bclass.total_bases();
		System.out.printf("total bases:" + "%f\n", tb);
		
		double sp = bclass.slugging_perc();
		System.out.printf("slugging percentage:" + "%f\n", sp);
		
		double obp = bclass.onbasepercentage();
		System.out.printf("on base percentage" + "%f\n", obp);
		
		double obps = bclass.onbaseslug();
		System.out.printf("onbaseslugging" + "%f\n", obps);
	input.close();
	}
	
	
}
