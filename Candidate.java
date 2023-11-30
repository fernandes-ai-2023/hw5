/**
 * Stores the grade information about a CS job candidate with 
 * the candidate ID
 * @author Catie Baker
 * @version 4/1/19
 *
 */
public class Candidate {
	private int candidateID;
	private double overallGPA;
	private double csGPA;
	private double cs1;
	private double cs2;
	private double dataStructures;
	private double algs;
	private double softEng;
	private double capstone;
	
	/**
	 * This creates a a Candidate object that stores the 
	 * data about a single candidate
	 * @param candidateID the id used to link candidate personal information
	 * @param gpa the candidates overall GPA
	 * @param major the candidates CS major GPA
	 * @param cs1 the candidates grade in CS1 in GPA points (e.g. 4.0 or 3.5)
	 * @param cs2 the candidates grade in CS2 in GPA points (e.g. 4.0 or 3.5)
	 * @param ds the candidates grade in data structures in GPA points (e.g. 4.0 or 3.5)
	 * @param algs the candidates grade in algorithms in GPA points (e.g. 4.0 or 3.5)
	 * @param se the candidates grade in software engineering in GPA points (e.g. 4.0 or 3.5)
	 * @param cap the candidates grade in capstone in GPA points (e.g. 4.0 or 3.5)
	 */
	public Candidate(int candidateID, double gpa, double major, double cs1, double cs2, 
			double ds, double algs, double se, double cap) {
		this.candidateID = candidateID;
		this.overallGPA = gpa;
		this.csGPA = major;
		this.cs1 = cs1;
		this.cs2 = cs2;
		this.dataStructures = ds;
		this.algs = algs;
		this.softEng = se;
		this.capstone = cap;
	}
	
	/**
	 * Gets the id that links the candidate data to their personal data
	 * @return the candidates id that links to their personal data
	 */
	public int getCandidateID() {
		return this.candidateID;
	}

	/**
	 * Gets the candidates overall gpa
	 * @return the candidates overall gpa
	 */
	public double getOverallGPA() {
		return overallGPA;
	}

	/**
	 * Gets the candidates cs major gpa
	 * @return the candidates cs major gpa
	 */
	public double getCSGPA() {
		return csGPA;
	}

	/**
	 * Gets the candidates grade in CS1
	 * @return the candidates grade in CS1
	 */
	public double getCS1() {
		return cs1;
	}

	/**
	 * Gets the candidates grade in CS2
	 * @return the candidates grade in CS2
	 */
	public double getCS2() {
		return cs2;
	}

	/**
	 * Gets the candidates grade in data structures
	 * @return the candidates grade in data structures
	 */
	public double getDataStructures() {
		return dataStructures;
	}

	/**
	 * Gets the candidates grade in algorithms
	 * @return the candidates grade in algorithms
	 */
	public double getAlgs() {
		return algs;
	}

	/**
	 * Gets the candidates grade in software engineering
	 * @return the candidates grade in software engineering
	 */
	public double getSoftEng() {
		return softEng;
	}

	/**
	 * Gets the candidates grade in capstone
	 * @return the candidates grade in capstone
	 */
	public double getCapstone() {
		return capstone;
	}
	
	/**
	 * Gets the string representation of the candidate. Prints their ID followed by 
	 * relevant grades
	 * @return summary data about the candidate
	 */
	public String toString() {
		return "Candidate "+ this.candidateID + " - Overall GPA: "+this.overallGPA + " CS GPA: "+this.csGPA +
				" CS1: "+this.cs1 + " CS2: "+this.cs2 + " Data Structures: "+this.dataStructures +
				" Algos: "+this.algs + " Software Engineering: "+this.softEng + " Capstone: "+this.capstone;
	}
	
}
