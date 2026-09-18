public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String disease;

    public Patient(int patientId, String name, int age,
                   String gender, String phone, String disease) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayPatient() {

        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Phone      : " + phone);
        System.out.println("Disease    : " + disease);
    }
}