package Patient;

public class Patient {
    private int pID;//patient id
    private String surname;//patient surname
    private String name;//patient name
    private String midName;//patient midle name
    private String address;//patient address.
    private int pNumber;//patient phone number
    private int medCardNum;// number of patient med card
    private String diagnosis;// patient diagnosis
    public Patient(int pID,String surname,String name,String midName,String address,int pNumber,int medCardNum,String diagnosis){
        this.pID = pID;
        this.surname = surname;
        this.name = name;
        this.midName = midName;
        this.address = address;
        this.pNumber = pNumber;
        this.medCardNum = medCardNum;
        this.diagnosis = diagnosis;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void setMedCardNum(int medCardNum) {
        this.medCardNum = medCardNum;
    }
    public void setMidName(String midName) {
        this.midName = midName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setpID(int pID) {
        this.pID = pID;
    }
    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getMedCardNum() {
        return medCardNum;
    }
    public int getpID() {
        return pID;
    }
    public int getpNumber() {
        return pNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getMidName() {
        return midName;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Patient.Patient ID: " + pID + "\n" +
                "Patient.Patient Surname: " + surname + "\n" +
                "Patient.Patient Name: " + name + "\n" +
                "Patient.Patient Midlename: " + midName + "\n" +
                "Patient.Patient Address: " + address + "\n" +
                "Patient.Patient Phone Number: " + pNumber + "\n" +
                "Patient.Patient Med. Card Number: " + medCardNum + "\n" +
                "Patient.Patient Diagnosis: " + diagnosis;}
}