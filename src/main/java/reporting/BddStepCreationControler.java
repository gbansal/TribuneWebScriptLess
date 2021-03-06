package reporting;

/**
 * Controls and handle the supportive BDD file type.like Excel is implemented for now.
 * @author
 *
 */
public class BddStepCreationControler {

	private String fileformat;
	
	public static IBddStepFormation objStepFormation = null;
	
	/**
	 * Save the file format.
	 * @param fileformat
	 */
	public BddStepCreationControler(String fileformat){
		this.fileformat = fileformat.toUpperCase();
	}
	
	/**
	 * Create an object based on file format for BDD logging.
	 */
	public void buildStepCreationObject(){
		
		if(this.fileformat.equals("EXCEL")){
			objStepFormation = new BDDStepTrackInExcel();
		}
		//Will support more formats if required.
		
	}
	
	
	
}
