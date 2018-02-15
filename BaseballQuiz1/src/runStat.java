import java.util.Scanner;

public class runStat {

	// actual main method to allow input
		public static void main(String[] args){
			// scanner tool for input
			java.util.Scanner input = new Scanner(System.in);
			// variables defined to give variables inputs and for calculations
			String name;
			int hits;
			int doubles;
			int triples;
			int homeruns;
			int runs;
			int walks; 
			int atbat;
			int hbp;
			int sacfly;
			
	// asking for inputs will print out string to ask user to place certain value
			System.out.println("Name the player"); //the player's name
			name = input.next();
	// input.next for Strings		
			System.out.println("how many hits?"); //amount of hits
			hits = input.nextInt();
	// input.nextDouble for doubles!		
			System.out.println("how many doubles?"); //amount of doubles
			doubles = input.nextInt();
			
			System.out.println("how many triples?"); // amount of triples
			triples = input.nextInt();
			
			System.out.println("homeruns??"); // amount of homeruns?
			homeruns = input.nextInt();
			
			System.out.println("runs??"); // amounts  of runs
			runs = input.nextInt();
			
			System.out.println("walks"); // amount of walks
			walks = input.nextInt();
			
			System.out.println("atbat"); //amount of at bat
			atbat = input.nextInt();

			System.out.println("hit by pitch?"); //amount of hit by pitch
		    hbp = input.nextInt();
			
			System.out.println("sacfly"); //amount of sac flys
			sacfly = input.nextInt();
	// creating new class of baseball class for the inputs being  put in so that all variables can be defined AND used	
			BaseballClass bclass = new BaseballClass(name, hits, doubles, triples, homeruns, runs, walks, atbat, hbp, sacfly);
			double BA = bclass.batting_average(); 
			System.out.printf("batting average:" + "%f\n", BA);
	// using bclass.batting_Aaverage to basically call function on that class and use all varibales function
			// requires in that give class so for batting average it would call bclass.hits and bclass.atbats
			double tb = bclass.total_bases();
			System.out.printf("total bases:" + "%f\n", tb);
	//system.out.printf to print a function		
			double sp = bclass.slugging_perc();
			System.out.printf("slugging percentage:" + "%f\n", sp);
			
			double obp = bclass.onbasepercentage();
			System.out.printf("on base percentage" + "%f\n", obp);
			
			double obps = bclass.onbaseslug();
			System.out.printf("onbaseslugging" + "%f\n", obps);
		input.close();
	//closing the input	or else input will always keep on asking for stats
		}
}
