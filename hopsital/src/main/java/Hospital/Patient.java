package Hospital;

public class Patient {
String pname;
double pmob;
String pemail;
double aadhar;
String health;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPmob() {
	return pmob;
}
public void setPmob(double pmob) {
	this.pmob = pmob;
}
public String getPemail() {
	return pemail;
}
public void setPemail(String pemail) {
	this.pemail = pemail;
}
public double getAadhar() {
	return aadhar;
}
public void setAadhar(double aadhar) {
	this.aadhar = aadhar;
}
public String getHealth() {
	return health;
}
public void setHealth(String health) {
	this.health = health;
}
@Override
public String toString() {
	return "Patient Details" + "\n" + "Patient Name= " + pname + "\n" + "Patient mobile=" + pmob + "\n" + "Patient email=" + pemail +"\n" + "Patient Aadhar=" + aadhar +" \n " + "Patient Health="
			+ health ;
}

}
