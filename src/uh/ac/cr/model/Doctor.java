package uh.ac.cr.model;

public  class Doctor extends  Person{
    private String specialization;



    public Doctor(int id, String name, String lastName, double income, String specialization) {
        super(id, name, lastName,income);
        this.specialization = specialization;
    }

    @Override
    public void requestMoney() {
    }
    @Override
    public void lendMoney(){}

    public void depositMoney(){
    }


    public void withdrawMoney(){
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialty(String specialization) {
        this.specialization = specialization;
    }


}
