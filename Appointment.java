public class Appointment {

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;

    public Appointment(int appointmentId, int patientId,
                       int doctorId, String date, String time) {

        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void displayAppointment() {

        System.out.println("\n----- Appointment Details -----");
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Date           : " + date);
        System.out.println("Time           : " + time);
    }
}