package InterfaceSportsScoringExample;

public class AmericanFootball extends AbstractFootball{
	private int extra1;
	private int extra2;
	private int fieldGoal;
	private int touchDown;
	private int safety;
	
	public AmericanFootball(int extra1, int extra2, int fieldGoal, int touchDown, int safety) {
		super();
		this.extra1 =extra1;
		this.extra2 =extra2;
		this.fieldGoal =fieldGoal;
		this.touchDown =touchDown;
		this.safety =safety;
	}
	public void getScoringRubric() {
		footballMsg();
		System.out.println("American Football scores 1 point for each kicked extra point");
		System.out.println("American Football scores 2 point for each other extra point");
		System.out.println("American Football scores 3 point for each kicked field goal");
		System.out.println("American Football scores 6 point for each touchdown");
		System.out.println("American Football scores 2 point for each safety");
		
		System.out.println(toString());
		System.out.printf("%s%d%s%n%n", "This example show a possible score ", calcPoints(), " points");
	}
	
	public int calcPoints() {
		//score calculations go here, then return that score
		return extra1 + extra2 * 2 + fieldGoal * 3 + touchDown * 6 + safety * 2; 
	}
	public String toString() {
		return "Extra Points Kicked: " + extra1
				+ "\nOther Extra Points: " + extra2
				+ "\nField Goals: " + fieldGoal
				+ "\nTouchdown: " + touchDown
				+ "\nSafety: " + safety;
	}
}
