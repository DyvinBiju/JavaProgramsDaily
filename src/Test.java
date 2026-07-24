class Student
{
    int mark;

    Student(int m)
    {
        mark = m;
    }
}


public class Test
{

    static void updateMark(Student s)
    {
        s.mark = 95;
    }


    public static void main(String args[])
    {

        Student st = new Student(70);


        System.out.println("Before : " + st.mark);


        updateMark(st);


        System.out.println("After : " + st.mark);

    }
}

