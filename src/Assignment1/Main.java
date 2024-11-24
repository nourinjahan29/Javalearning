package Assignment1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TeacherInfo teacherDetails = new TeacherInfo();
             teacherDetails.setName("Nourin");
             String a= teacherDetails.getName();
        System.out.println(a);
        teacherDetails.setId(1864);
        int b = teacherDetails.getId();
        System.out.println(b);
        teacherDetails.setPhoneNumber("01755726094");
        String c= teacherDetails.getPhoneNumber();
        System.out.println(c);
        teacherDetails.setTeacherAge(27);
        int d= teacherDetails.getTeacherAge();
        System.out.println(d);
        teacherDetails.setTeacherSalary(41000l);
        long e= teacherDetails.getTeacherSalary();
        System.out.println(e);


        StudentInfo studentDetails = new StudentInfo();
        studentDetails.setName("Rony");
        String f = studentDetails.getName();
        System.out.println(f);
        studentDetails.setId(1723);
        int g= studentDetails.getId();
        System.out.println(g);
        studentDetails.setStudentRollNumber(17135221);
        long h = studentDetails.getStudentRollNumber();
        System.out.println(h);
        studentDetails.setPhoneNumber("01988841890");
        String j = studentDetails.getPhoneNumber();
        System.out.println(j);
        studentDetails.setStudentClassName("Class Four");
        String k = studentDetails.getStudentClassName();
        System.out.println(k);
        int xx = studentDetails.calculate(2,4);
        System.out.println(xx);
        int yy = teacherDetails.calculate(20,40);
        System.out.println(yy);


        //StudentResult myStudentResult= new StudentResult(); abstrac class will generate an error

        }


    }