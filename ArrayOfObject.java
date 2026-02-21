
class Student{
    int rollno;
    String Name;
    int marks;

}
public class ArrayOfObject {


    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.Name = "Navin";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.Name = "Jivan";
        s2.marks = 91;

        //System.out.print(s1.Name + ":" +s1.marks );

        Student s3 = new Student();
        s3.rollno = 3;
        s3.Name = "Adarsh";
        s3.marks = 80;

        Student student [] = new Student[3]; //create array student of "Student" to store data 
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for(int i =0; i <3; i++)
        // {
        //           System.out.println(student[i].Name + ":" +student[i].marks );

        // }

        //used inhanced for loop here

        for(Student stud : student)
        {
            System.out.println(stud.Name+" : "+stud.marks);
        }


    }
    
}
