//I Shobaki
//Artifact class for storing records as object


public class Artifact {
	private String Name;
	private int ArtifactID;
	private int ArtifactYear;
	private int AcquiredYear;
	private double Value;
	private String[] Errors = {"GOOD","GOOD","GOOD","GOOD","GOOD"};
	
	//default constructor
	public Artifact() {
		this("ARTIFACT", 0 , 0, 0, 0.0);
	}
	
	//constructor with parameters
	public Artifact(String Name, int ArtifactID, int ArtifactYear, int AcquiredYear, double Value) {
		setName(Name);
		setArtifactID(ArtifactID);
		setArtifactYear(ArtifactYear);
		setAcquiredYear(AcquiredYear);
		setValue(Value);
	
	}
	
	//set and get method for name
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		if(name == null) 
			Errors[0] = "Name -- Cannot be spaces or blank";
		
		Name = name;
	}
	
	//set and get method for ArtifactID
	
	public int getArtifactID() {
		return ArtifactID;
	}
	
	public void setArtifactID(int artifactID) {
		if(artifactID <= 0)
			Errors[1] = "Artifact ID -- Must be greater than 0";
		
		ArtifactID = artifactID;
	}
	
	//set and get method for ArtifactYear
	
	public int getArtifactYear() {
		return ArtifactYear;
	}
	
	public void setArtifactYear(int artifactYear) {
		if(artifactYear > 2019)
			Errors[2] = "Artifact Year -- Must be less than or equal to current year";
			
		ArtifactYear = artifactYear;
	}
	
	//set and get method for AcquiredYear
	
	public int getAcquiredYear() {
		return AcquiredYear;
	}
	
	public void setAcquiredYear(int acquiredYear) {
		if((acquiredYear < 1899) || (acquiredYear < getArtifactYear()) || (acquiredYear > 2019))
			Errors[3] = "Acquired Year -- Must be greater than 1899 and greater than or equal to artifactYear and less than or equal to current year";
		AcquiredYear = acquiredYear;
	}
	
	//set and get method for Value
	
	public double getValue() {
		return Value;
	}
	
	public void setValue(double value) {
		if(value < 0.0)
			Errors[4] = "Value -- Must be greater than  or equal to 0";
		Value = value;
	}
	
	//method to know if the record has error/s return true or false
	
	public boolean getErrors() {
		for (int i =0; i < 5; i++) {
			if(Errors[i] != "GOOD"){
				return true;
			}
		}
		
		return false;
	}
	
	//method to print error/s to the console
	
	public void printErrors() {
		int countErrors = 1;
		for(int i=0; i < 5; i++) {
			if(Errors[i] == "GOOD") {
				
			}else {
				System.out.println(countErrors + "-" + Errors[i] );
				countErrors++;
			}
		}
	}
	
	//method to print error/s to the new text file
	public String getErr() {
		String str = "";
		int countErrors = 1;
		
		for(int i=0; i < 5; i++) {
			if(Errors[i] == "GOOD") {
				
			}else {
				str += countErrors + "-" + Errors[i] + "\n" ;
				countErrors++;
			}
			
		}
		return str;
	}
	
	//toString method
	
	public String toString() {
		return ("Name: " + Name +
				"\nArtifact ID: "+ ArtifactID +
				"\nArtifact Year: " + ArtifactYear +
				"\nAcquired Year: " + AcquiredYear +
				"\nValue: " + Value);
		
		
	}
	
} //end class Artifact

