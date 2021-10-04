class Student{
    protected int numberOfStudents;
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public static void main(String[] args){
        Student stu = new Student();
        System.out.println(stu.getNumberOfStudents());
        Engineering eng = new Engineering();
        System.out.println(eng.getNumberOfStudents());
        Literature lit = new Literature();
        System.out.println(lit.getNumberOfStudents());
        Commerce com = new Commerce();
        System.out.println(com.getNumberOfStudents());
    }
}