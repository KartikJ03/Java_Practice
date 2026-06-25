class student{
    private int student_rollno;
    private String stu_name;
    private String stud_add;


    public int getStudent_rollno() {
        return student_rollno;
    }

    public void setStudent_rollno(int student_rollno) {
        this.student_rollno = student_rollno;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStud_add() {
        return stud_add;
    }
    public void setStud_add(String stud_add) {
        this.stud_add = stud_add;
    }
}
public class Access {

public static void main(String [] args){
    student kartik = new student();
    kartik.setStu_name("Kartik Jawanjal");
    kartik.setStudent_rollno(1027);
    kartik.setStud_add("Pashan Pune, Maharashtra");
    System.out.println(kartik.getStu_name());
    System.out.println(kartik.getStudent_rollno());
    System.out.println(kartik.getStud_add());


    }
}
