package SchoolSystem;

/*
* Created By: Bashayer Hijji
* This class is responsible for keeping track of students
*/

public class Student {
    private int id;
    private String name;
    private int grade;
    private int paidFees;
    private int totalFees;

    // creating constracter
    public Student(int id, String name, int grade){
        paidFees=0;
        totalFees=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //not going to alter id or name so no need for setter methods


    // to update student grades
    public void setGrade(int grade){
        this.grade=grade;
    }

    //keep adding the fees to paidfees feild
    // the parms is what the student has paid
    public void payFees(int fees) {
        paidFees+=fees;
        School.updateTotalMoneyEarned(paidFees);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public int getGrade() {
        return grade;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getRemainingFees(){
        return totalFees -=paidFees;
    }
}
