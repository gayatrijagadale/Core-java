class demo{
    private int marks;
    private String Student_name;

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks= marks;
    }

    public String getStudent_name()
    {
        return Student_name;
    }
    public void setStudent_name(String Student_name)
    {
        this.Student_name= Student_name;
    }
}


public class thisKeyword {

    public static void main(String[] args) {

        demo obj = new demo();
         obj.setMarks(90);
         obj.setStudent_name("Gayatri");

        System.out.println(obj.getStudent_name() + " : " +obj.getMarks());
        
    }
    
}
