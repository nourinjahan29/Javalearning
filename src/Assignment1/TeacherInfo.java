package Assignment1;

public class TeacherInfo extends CommonInfo implements CommonFunction {
 private int teacherAge;
 private long teacherSalary;

    public void setTeacherAge ( int teacherAge){
        this.teacherAge = teacherAge;
    }
    public int getTeacherAge(){
        return teacherAge;
    }

    public void setTeacherSalary(long teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public long getTeacherSalary() {
        return teacherSalary;
    }

    @Override
    public int calculate(int a, int b) {
        int y = a+b;
        return y;
    }
}
