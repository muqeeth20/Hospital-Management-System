import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        int patientId = 101;
        int doctorId = 201;
        int appointmentId = 301;

        while (true) {

            System.out.println("\n======================================");
            System.out.println("       HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Search Patient");
            System.out.println("4. Search Doctor");
            System.out.println("5. Book Appointment");
            System.out.println("6. Display All Patients");
            System.out.println("7. Display All Doctors");
            System.out.println("8. Display Appointments");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Patient
                case 1:

                    System.out.print("Enter patient name: ");
                    String patientName = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();

                    if (!Utils.isValidName(patientName)) {
                        System.out.println("Invalid name.");
                        break;
                    }

                    if (!Utils.isValidAge(age)) {
                        System.out.println("Invalid age.");
                        break;
                    }

                    if (!Utils.isValidPhone(phone)) {
                        System.out.println("Invalid phone number.");
                        break;
                    }

                    Patient patient =
                            new Patient(
                                    patientId++,
                                    patientName,
                                    age,
                                    gender,
                                    phone,
                                    disease
                            );

                    hospital.addPatient(patient);

                    break;

                // Add Doctor
                case 2:

                    System.out.print("Enter doctor name: ");
                    String doctorName = sc.nextLine();

                    System.out.print("Enter specialization: ");
                    String specialization = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String doctorPhone = sc.nextLine();

                    if (!Utils.isValidName(doctorName)) {
                        System.out.println("Invalid name.");
                        break;
                    }

                    if (!Utils.isValidPhone(doctorPhone)) {
                        System.out.println("Invalid phone number.");
                        break;
                    }

                    Doctor doctor =
                            new Doctor(
                                    doctorId++,
                                    doctorName,
                                    specialization,
                                    doctorPhone
                            );

                    hospital.addDoctor(doctor);

                    break;

                // Search Patient
                case 3:

                    System.out.print("Enter patient ID: ");
                    int searchPatientId = sc.nextInt();

                    hospital.searchPatient(searchPatientId);

                    break;

                // Search Doctor
                case 4:

                    System.out.print("Enter doctor ID: ");
                    int searchDoctorId = sc.nextInt();

                    hospital.searchDoctor(searchDoctorId);

                    break;

                // Book Appointment
                case 5:

                    System.out.print("Enter patient ID: ");
                    int appointmentPatientId = sc.nextInt();

                    System.out.print("Enter doctor ID: ");
                    int appointmentDoctorId = sc.nextInt();

                    sc.nextLine();

                    if (hospital.findPatient(appointmentPatientId) == null) {

                        System.out.println("Patient not found.");
                        break;
                    }

                    if (hospital.findDoctor(appointmentDoctorId) == null) {

                        System.out.println("Doctor not found.");
                        break;
                    }

                    System.out.print("Enter appointment date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter appointment time: ");
                    String time = sc.nextLine();

                    if (!Utils.isValidDate(date) ||
                        !Utils.isValidTime(time)) {

                        System.out.println("Invalid date or time.");
                        break;
                    }

                    Appointment appointment =
                            new Appointment(
                                    appointmentId++,
                                    appointmentPatientId,
                                    appointmentDoctorId,
                                    date,
                                    time
                            );

                    hospital.addAppointment(appointment);

                    break;

                // Display Patients
                case 6:

                    hospital.displayAllPatients();

                    break;

                // Display Doctors
                case 7:

                    hospital.displayAllDoctors();

                    break;

                // Display Appointments
                case 8:

                    hospital.displayAllAppointments();

                    break;

                // Exit
                case 9:

                    System.out.println(
                            "Thank you for using Hospital Management System."
                    );

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}