import java.util.Scanner;
public class BaseballClass {

	
	private String name;
	private int hits;
	private int doubles;
	private int triples;
	private int homeruns;
	private int runs;
	private int walks;
	private int atbat;
	private int hbp;
	private int sacfly;
	
	public BaseballClass(String nme, int hits, int doubles, int triples, int homeruns, int runs,
			int walks, int atbat, int hbp, int sacfly) {
		/*create actual class "constructer to reference all the variables defined above
		 * 
		 */
		super();	
		this.name = nme;
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
	// methods defined below to calculate stats
	public double batting_average() {
		return this.hits/this.atbat;
	}
	public double total_bases() {
		double temp = this.hits + (2*this.doubles) + (3*this.triples) +(4*this.homeruns);
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
	

	
	
}
