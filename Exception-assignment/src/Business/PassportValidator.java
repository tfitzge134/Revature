package Business;

public class PassportValidator {
	
	public boolean isvalid(String validpassportNumber) throws BusinessException {
		if(!validpassportNumber.matches("\\+1-[0-9]{10}") and passportNumber < 10) {
			throw new InvalidContactException("Entered contact "+validpassportNumber+" is invalid");
//			}
		//	
		}
		return true;
	}

}
//public boolean isValidAge(int age) throws InvalidAgeException {
//	
//	if(age<=0) {
//		throw new InvalidAgeException("Age cannot be zero or -ve");
//	}
//	
//	if(age<18 || age >35) {
//		throw new InvalidAgeException("Users with age between 18 and 35 are allowed");
//	}
//	
//	return true;
//}
//
//
//public boolean isValidMobileNumber(String contact) {
//	
//	if(!contact.matches("\\+1-[0-9]{10}")) {
//		throw new InvalidContactException("Entered contact "+contact+" is invalid");
//	}
//	
//	return true;
//}
//}
