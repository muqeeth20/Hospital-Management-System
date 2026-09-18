public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private String phone;

    public Doctor(int doctorId, String name,
                  String specialization, String phone) {

        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void displayDoctor() {

        System.out.println("\n----- Doctor Details -----");
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Name           : " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Phone          : " + phone);
    }
}