package main;

public class Copy {
	int copyId;
	String location;
	CopyFormat format;
	CopyStatus status;	

	Copy(String location, CopyFormat format, CopyStatus status){
		this.location = location;
		this.format = format;
		this.status = status;
	}
}
