import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital() {

        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    // Add Patient
    public void addPatient(Patient patient) {

        patients.add(patient);

        System.out.println("Patient added successfully.");
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {

        doctors.add(doctor);

        System.out.println("Doctor added successfully.");
    }

    // Find Patient
    public Patient findPatient(int patientId) {

        for (Patient patient : patients) {

            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }

        return null;
    }

    // Find Doctor
    public Doctor findDoctor(int doctorId) {

        for (Doctor doctor : doctors) {

            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }

        return null;
    }

    // Search Patient
    public void searchPatient(int patientId) {

        Patient patient = findPatient(patientId);

        if (patient != null) {
            patient.displayPatient();
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Search Doctor
    public void searchDoctor(int doctorId) {

        Doctor doctor = findDoctor(doctorId);

        if (doctor != null) {
            doctor.displayDoctor();
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Add Appointment
    public void addAppointment(Appointment appointment) {

        appointments.add(appointment);

        System.out.println("Appointment booked successfully.");
    }

    // Display Patients
    public void displayAllPatients() {

        if (patients.isEmpty()) {

            System.out.println("No patient records available.");
            return;
        }

        for (Patient patient : patients) {
            patient.displayPatient();
        }
    }

    // Display Doctors
    public void displayAllDoctors() {

        if (doctors.isEmpty()) {

            System.out.println("No doctor records available.");
            return;
        }

        for (Doctor doctor : doctors) {
            doctor.displayDoctor();
        }
    }

    // Display Appointments
    public void displayAllAppointments() {

        if (appointments.isEmpty()) {

            System.out.println("No appointments available.");
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }
}