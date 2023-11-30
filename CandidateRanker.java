import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for ranking and identifying good job candidates
 * @author Catie Baker
 * @version 4/1/19
 */
public class CandidateRanker {
	private ArrayList<Candidate> candidates;

	/**
	 * Reads in the file of candidates and stores them in a list
	 * @param filename the file with the candidate data
	 */
	public CandidateRanker(String filename) {
		this.candidates = new ArrayList<Candidate>();

		try {
			Scanner infile = new Scanner(new File(filename));

			while (infile.hasNextLine()) {
				int id = infile.nextInt();
				double overallGPA = infile.nextDouble();
				double csGPA = infile.nextDouble();
				double cs1 = infile.nextDouble();
				double cs2 = infile.nextDouble();
				double ds = infile.nextDouble();
				double algs = infile.nextDouble();
				double softEng = infile.nextDouble();
				double capstone = infile.nextDouble();
				Candidate cand = new Candidate(id,overallGPA, csGPA, cs1, cs2, ds, algs, softEng, capstone);
				this.candidates.add(cand);
			}
			infile.close();
		}
		catch (java.io.FileNotFoundException e) {
			System.out.println("No such file: " + filename);
		}
	}
}
