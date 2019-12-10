package InterfaceSportsScoringExample;

public class Basketball implements SportsScoring {
	private int basket1;
	private int basket2;
	private int basket3;
	
	public Basketball(int basket1, int basket2, int basket3) {
		super();
		this.basket1 =basket1;
		this.basket2 = basket2;
		this.basket3 =basket3;
	}
	public void getScoringRubric() {
		System.out.println("Basketball scores 1 point for each free throw");
		System.out.println("Basketball scores 2 point for standard field goal");
		System.out.println("Basketball scores 3 point for a long field goal");
		
		System.out.println(toString());
		System.out.printf("%s%d%s%n%n", "This example shows a possible score ", calcPoints(), " points");
	}
	public int calcPoints() {
		//score calculation go here, then return that score
		return basket1 + basket2 * 2 + basket3 * 3;
	}
	public String toString() {
		return ("Free Throws: " + basket1
				+ "\nStandard Baskets: " + basket2
				+"\nLong Field Goals: " + basket3);
				
				
		
	}
}
