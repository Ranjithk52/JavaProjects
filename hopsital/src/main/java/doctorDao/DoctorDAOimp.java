package doctorDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Hospital.Doctor;
import Hospital.Patient;
import hospitalmanagement.HospitalManagement;

public class DoctorDAOimp implements DoctorDAO {
	public static List<Doctor> originalList = new ArrayList<Doctor>();
	public static List<Doctor> tempList = new ArrayList<Doctor>();
	public static List<Patient> plist=new ArrayList<Patient>();
	static Scanner sc = new Scanner(System.in);
	Doctor doctor = null;

	public void addDoctor() {
		int n = 1;
		while (n == 1) {
			doctor = new Doctor();
			System.out.println("Enter Docotor ID ");
			doctor.setDoctorid(sc.next());
			System.out.println("Enter Docotor Name");
			doctor.setDoctorname(sc.next());
			System.out.println("Enter Doctor Specialization ");
			doctor.setSpecialist(sc.next());
			System.out.println("Enter Doctor FEE ");
			doctor.setDoctorfee(sc.nextDouble());
			originalList.add(doctor);
			System.out.println("If you want to add more doctors enter 1 or else enter any key");
			n = sc.nextInt();

		}
		System.out.println("Successfully Doctors added....");

	}

	public Doctor viewDoctor(String doctorid) {
		Doctor doctor = new Doctor();
		for (Doctor searchdoctor : originalList) {
			if (searchdoctor.getDoctorid().equals(doctorid)) {
				doctor = searchdoctor;
				break;
			}
		}

		return doctor;
	}

	public List<Doctor> viewAlldoctors() {

		return originalList;
	}

	public void replaceDOctor(String doctorid) {
		tempList = new ArrayList<Doctor>();
		for (Doctor updatedoctor : originalList) {
			if (updatedoctor.getDoctorid().equals(doctorid)) {
				System.out
						.println("Select Your Choice : 1.Doctor Id 2.Doctor Name 3.Doctor Specialization 4.Doctor Fee");
				int ch = sc.nextInt();
				if (ch == 1) {

					System.out.println("Enter Updated Doctor ID ");
					updatedoctor.setDoctorid(sc.next());
				} else if (ch == 2) {
					System.out.println("Enter Updated Doctor Name");
					updatedoctor.setDoctorname(sc.next());
				} else if (ch == 3) {
					System.out.println("Enter Update Doctor Specialzation");
					updatedoctor.setSpecialist(sc.next());
				} else if (ch == 4) {
					System.out.println("Enter Update Doctor Fees");
					updatedoctor.setDoctorfee(sc.nextDouble());
				} else {
					System.out.println("Doctor not found");
				}
				tempList.add(updatedoctor);
			} else {
				tempList.add(updatedoctor);

			}
		}
		originalList = new ArrayList<Doctor>();
		for (Doctor updatedoctor : tempList) {
			originalList.add(updatedoctor);
		}
		System.out.println("Successfully Doctor Updated.....");
	}

	public void removeDoctor(String doctorid) {
		tempList = new ArrayList<Doctor>();
		for (Doctor removedoctor : originalList) {
			if (removedoctor.getDoctorid().equals(doctorid)) {

			} else {
				tempList.add(removedoctor);
			}
		}
		originalList = new ArrayList<Doctor>();
		for (Doctor removedoctor : tempList) {
			originalList.add(removedoctor);

		}
		System.out.println("Successfully Doctor Updated....");

	}

	public void appointment() {
		int x = 1;
		while (x == 1) {

			Doctor selecteddoc = new Doctor();
			tempList = new ArrayList<Doctor>();
			for (Doctor availabledoctor : originalList) {
				if (availabledoctor.getSpecialist().equals(patient.getHealth())) {
					selecteddoc = availabledoctor;
					tempList.add(selecteddoc);

				}
			}
			for (Doctor docavailable : tempList) {
				System.out.println(docavailable);
			}
			System.out.println("Which Doctor do you want ?");
	
			selecteddoc.setDoctorid(sc.next());

			System.out.println(patient);
			for (Doctor availabledoctor : originalList) {
				if (availabledoctor.getDoctorid().equals(selecteddoc.getDoctorid())) {
					System.out.println("-----------------------");
					System.out.println("          Fee          ");
					System.out.println("-----------------------");
					System.out.println("  Doctor ID  : " + selecteddoc.getDoctorid());
					System.out.println("  Doctor Name  : " + availabledoctor.getDoctorname());
					System.out.println("  Doctor FEE  : " + availabledoctor.getDoctorfee());
					x++;
					break;
				} else {
					System.out.println("Please enter corect Doctor id");

				}
			}
		}
	}

	public void back() {
		HospitalManagement.main(null);

	}

	static Patient patient = null;

	public void patientinfo() {
		patient = new Patient();
		System.out.println("-----Please enter your name-----");
		patient.setPname(sc.next());
		System.out.println("-----Please enter your Mobile number----");
		patient.setPmob(sc.nextDouble());
		System.out.println("-----Please enter your Email----");
		patient.setPemail(sc.next());
		System.out.println("----Please enter your AAdhar number----");
		patient.setAadhar(sc.nextDouble());
		System.out.println("-----Please enter your Health Issue----");
		patient.setHealth(sc.next());
		plist.add(patient);
	}

	public List<Patient> viewPatient() {
		
		return plist;
	}

	

	

	
	


}
