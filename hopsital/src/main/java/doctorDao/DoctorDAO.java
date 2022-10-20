package doctorDao;

import java.util.List;

import Hospital.Doctor;
import Hospital.Patient;

public interface DoctorDAO {
public void addDoctor();
public Doctor viewDoctor(String doctorid);
public List<Doctor> viewAlldoctors();
public void replaceDOctor(String doctorid);
public void removeDoctor(String doctorid);
public List<Patient> viewPatient();
public void appointment();
public void back();
}