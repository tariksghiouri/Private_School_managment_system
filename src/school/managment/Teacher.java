package school.managment;

public class Teacher {
    private int id;
    private String FullName;
    private  int salary;

    public int getAllPayments() {
        return allPayments;
    }

    private  int allPayments;

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return FullName;
    }

    public int getSalary() {
        return salary;
    }
    public void pay(int amount){
        this.allPayments+=amount;
        School.AddToMoneyOut(amount);
    }

    public Teacher(int id, String fullName, int salary) {
        this.id = id;
        FullName = fullName;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return ("\n -- name:"+this.getFullName()+
                "\n -- ID: "+ this.getId() +
                "\n -- salary : " + this.getSalary()+
                "\n -_ overall this teacher has made "+this.getAllPayments()+"\n");
}
}
