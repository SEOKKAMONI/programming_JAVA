package ch12;

//equals 오버라이딩
public class Student {
    private int num;
    private String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student) {
//            Student student = (Student) obj;
//            if (this.num == student.num) {
//                return true;
//            }
//        }
//        return false;
//    }
}
