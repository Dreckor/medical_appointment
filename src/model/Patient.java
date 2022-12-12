package model;

public class Patient extends User{
    private String birthdate;
    private Double weight;
    private Double height;
    private String blood;

    public Patient(String name, String email){
        super(name,email);
    }


    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getWeight() {
        return this.weight+ " Kg.";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height+" Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthdate + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood" + getBlood();
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente del hospital B");
    }
}
