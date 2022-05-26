package main;

import java.util.Date;

public class Rental {
	CopyStatus status;
	Date startDate;
	Date dueDate;
	int extensionCounter;
	
	boolean deleteCopy() {
		return false;
	}
	
	boolean updateRentalStatus() {
		return false;
	}
}
