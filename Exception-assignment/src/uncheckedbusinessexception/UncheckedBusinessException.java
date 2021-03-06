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
