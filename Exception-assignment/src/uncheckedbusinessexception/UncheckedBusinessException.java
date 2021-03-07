package uncheckedbusinessexception;

public class UncheckedBusinessException {
	/*
	 * //3)Create a BusinessException(unchecked) and use it for handling for invalid
	 * DL number. First 2 alphabets.
	 * 
	 */

	// requirement by state
	// mass
	static boolean isValidLicense(String state, String licenseNumber) throws BusinessException {
		if (state == "AL") {
			/*
			 * Alabama 1-8Numeric
			 */
			if (licenseNumber.matches("(.*[0-9]){8}"))

			{
				System.out.println("Alabama");
				return true;
			} else {
				throw new BusinessException("Invalid Alabama License: " + licenseNumber);
			}

		}
		return false;

	}

	private static void validState(String letter, String lic) {

		/*
		 * Alabama 1-8Numeric
		 */
		if (lic.matches("(.*[0-9]){8}"))
			;
		{
			System.out.println("Alabama");
		}
		/*
		 * Alaska 1-7Numeric
		 */
		if (lic.matches("([0-9]){8}")) {
			System.out.println("Alaska");
		}
		/*
		 * Arizona 1 Alpha + 8 Numeric OR 9 Numeric
		 * 
		 * 
		 */
		if (lic.matches("(([A-Z]{1}[0-9]{8})")) {
			System.out.println("Arizona");
		}
		if (lic.matches("(([A-Z]{1}[0-9]{9})")) {
			System.out.println("Arizona");
		}

//				Arkansas	4-9Numeric
		if (lic.matches("([0-9]{4})")) {
			System.out.println("Arkanzas");
		}

//				California	1Alpha+7Numeric
		if (lic.matches("(([A-Z]{1}[0-9]{7})")) {
			System.out.println("California");
		}

//				Colorado	9Numeric or 1Alpha+3-6Numeric or 2Alpha+2-5Numeric
		if (lic.matches("(([0-9]{7})")) {
			System.out.println("California");
		}
		if (lic.matches("(([A-Z]{1}[1]{2})")) {
			System.out.println("California");
		}
		
		
		/*
		 *     String wyomingDL = "[0-9]{9,10}";
    String wisconsinDL = "[A-Za-z][0-9]{13}";
    String westVirginiaDL = "[0-9]{7}|[A-Za-z]{1,2}[0-9]{5,6}";
    String washingtonDL = "[0-9]{1,7}[0-9A-za-z*]{12}";
    String virginiaDL = "[A-Za-z][0-9]{8,11}|[0-9]{9}";
    String vermontDL = "[0-9]{8}|[0-9]{7}[Aa]";
    String utahDL = "[0-9]{4,10}";
    String texasDL = "[0-9]{7,8}";
    String tennesseeDL= "[0-9]{7,9}";
    String southDakotaDL = "[0-9]{6,10}|[0-9]{12}";
    String southCarolinaDL = "[0-9]{5,11}";
    String rhodeIslandDL = "[0-9]{7}|[A-Za-z][0-9]{6}";
    String pennsylvaniaDL = "[0-9]{8}";
    String oregonDL = "[0-9]{1,9}";
    String oklahomaDL = "[A-Za-z]{9}|[0-9]{9}";
    String ohioDL = "[A-Za-z]{4,8}|[A-Za-z]{2}[0-9]{3,7}|[0-9]{8}";
    String northDakotaDL = "[A-Za-z]{3}[0-9]{6}|[0-9]{9}";    
    String northCarolinaDL = "[0-9]{1,12}";
    String newYorkDL = "[A-Za-z][0-9]{7}|[A-Za-z][0-9]{18}|[0-9]{8,9}|[0-9]{16}|[A-Za-z]{8}";
    String newMexicoDL = "[0-9]{8,9}";
    String newJerseyDL = "[A-Za-z][0-9]{14}";
    String newHampshireDL = "[0-9]{2}[A-Za-z]{3}[0-9]{5}";
    String nevadaDL = "[0-9]{9,10}|[0-9]{12}|[Xx][0-9]{8}";
    String nebraskaDL = "[A-Za-z]{6,8}";
    String montanaDL = "[A-Za-z][0-9]{8}|[0-9]{13}|[0-9]{9}|[0-9]{14}";
    String missouriDL = "[A-Za-z][0-9]{5,9}|[A-Za-z][0-9]{6}[Rr]|[0-9]{8}[A-Za-z]{2}|[0-9]{9}[A-Za-z]|[0-9]{9}";
    String mississippiDL = "[0-9]{9}";
    String minnesotaDL = "[A-Za-z][0-9]{12}";
    String michiganDL = "[A-Za-z][0-9]{10}|[A-Za-z][0-9]{12}";
    String massachusettsDL = "[A-Za-z][0-9]{8,9}";
    String marylandDL = "[0-9]{12}";
    String maineDL = "[0-9]{7,8}|[0-9]{7}[A-Za-z]";
    String louisianaDL = "[0-9]{1,9}";
    String kentuckyDL = "[A-Za-z][0-9]{8}|[A-Za-z][0-9]{9}|[0-9]{9}";
    String kansasDL = "[A-Za-z][0-9][A-Za-z][0-9][A-Za-z]|[A-Za-z][0-9]{8,9}";
    String iowaDL = "[0-9]{9}|[0-9]{3}[A-Za-z]{2}[0-9]{4}";
    String indianaDL = "[A-Za-z][0-9]{9}|[0-9]{9,10}";
    String illinoisDL = "[A-Za-z][0-9]{11,12}";
    String idahoDL = "[A-Za-z]{2}[0-9]{6}|[A-Za-z]{9}";
    String hawaiiDL = "[A-Za-z][0-9]{8}|[0-9]{9}";
    String georgiaDL = "[0-9]{7,9}";
    String floridaDL = "[A-Za-z][0-9]{12}";
    String districtOfColumbiaDL = "[0-9]{7}|[0-9]{9}";
    String delawareDL = "[0-9]{1,7}";
    String conneticutDL = "[0-9]{9}";
    String coloradoDL = "[0-9]{9}|[A-Za-z][0-9]{3,6}|[A-Za-z]{2}[0-9]{2,5}";
    String californiaDL = "[A-Za-z][0-9]{7}";
    String arkansasDL = "[0-9]{4,9}";
    String arizonaDL = "[A-Za-z][0-9]{8,9}";
    String alaskaDL = "[0-9]{7}";
    String alabamaDL = "[0-9]{1,8}"
		 */
		
		
		

//				Connecticut	9Numeric;
//				Delaware	1-7Numeric
//				District of Columbia	7Numeric or 9Numeric
//				Florida	1Alpha+12Numeric
//				Georgia	7-9Numeric
//				Hawaii	1Alpha+8Numeric or 9Numeric
//				Idaho	2Alpha+6Numeric+1Alpha or 9Numeric
//				Illinois	1Alpha+11Numeric or 1Alpha+12Numeric
//				Indiana	1Alpha+9Numeric or 9Numeric or 10Numeric
//				Iowa	9Numeric or 3Numeric+2Alpha+4Numeric
//				Kansas	1Alpha+1Numeric+1Alpha+1Numeric+1Alpha or 1Alpha+8Numeric or 9Numeric
//				Kentucky	1Alpha+8Numeric or 1Alpha+9Numeric or 9Numeric
//				Louisiana	1-9Numeric
//				Maine	7Numeric or 7Numeric+1Alpha or 8Numeric
//				Maryland	1Alpha+12Numeric
//				Massachusetts	1Alpha+8Numeric or 9Numeric
//				Michigan	1Alpha+10Numeric or 1Alpha+12Numeric
//				Minnesota	1Alpha+12Numeric
//				Mississippi	9Numeric
//				Missouri	1Alpha+5-9Numeric or 1Alpha+6Numeric+R or 8Numeric+2Alpha or 9Numeric+1Alpha or 9Numeric
//				Montana	1Alpha+8Numeric or 13Numeric or 9Numeric or 14Numeric
//				Nebraska	1Alpha+6-8Numeric
//				Nevada	9Numeric or 10Numeric or 12Numeric or X+8Numeric
//				New Hampshire	2Numeric+3Alpha+5Numeric
//				New Jersey	1Alpha+14Numeric
//				New Mexico	8Numeric or 9Numeric
//				New York	1Alpha+7Numeric or 1Alpha+18Numeric or 8Numeric or 9Numeric or 16 Numeric or 8Alpha
//				North Carolina	1-12Numeric
//				North Dakota	3Alpha+6Numeric or 9Numeric
//				Ohio	1Alpha+4-8Numeric or 2Alpha+3-7Numeric or 8Numeric
//				Oklahoma	1Alpha+9Numeric or 9Numeric
//				Oregon	1-9Numeric
//				Pennsylvania	8Numeric
//				Rhode Island	7Numeric or 1Alpha+6Numeric
//				South Carolina	5-11Numeric
//				South Dakota	6-10Numeric or 12Numeric
//				Tennessee	7-9Numeric
//				Texas	7-8Numeric
//				Utah	4-10Numeric
//				Vermont	8Numeric or 7Numeric+A
//				Virginia	1Alpha+8-to-11Numeric or 9Numeric
//				Washington	1-7Alpha+any combination of Alpha, Numeric, or * for a total of 12 characters
//				West Virginia	7Numeric or 1-2Alpha+5-6Numeric
//				Wisconsin	1Alpha+13Numeric
//				Wyoming	9-10Numeric

	}

	public static void main(String[] args) throws BusinessException {
		// TODO Auto-generated method stub
		// has to have state string state =with two characters
		// has to be 7 digit
		//
		/*
		 * default: if (s.matches("[A-Z]{1}[a-z]{2}\\d{1,}")) { filminfo( s ); } break;
		 */

		String state = "AL";
		String lic = "12345678";
		// String lic = "Tx-42-1998-9876543";
		boolean valid = isValidLicense(state, lic);
		System.out.println("Valid License: " + valid);

	}

}
