public class StudentInfo extends CommonInfo implements CommonFunction{
    private long studentRollNumber;
    private String studentClassName;

    public void setStudentRollNumber(long studentRollNumber){
        this.studentRollNumber = studentRollNumber;
    }
    public long getStudentRollNumber(){
        return studentRollNumber;
    }

    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }

    public String getStudentClassName() {
        return studentClassName;
    }

    @Override
    public int calculate(int a, int b) {
        int x = a+b;
        return x;
    }
}
