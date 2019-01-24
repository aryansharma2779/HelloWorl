package main;

public class MyStudentListADT {

    private String name;
    private long rollNumber;
    private int listBottom=-1;

    MyStudentListADT[] sectionG;
    public MyStudentListADT() {
        sectionG =new MyStudentListADT[37];
    }

void insert(MyStudentListADT student)
{
    // cehck if list is already full
    if(this.isFull())
    {
        System.out.println("List is Full");
    }
    else
    {
        // insert into the list
     listBottom++;
     sectionG[listBottom]=student;

    }
}

boolean isFull()
{
    //check list is full or not
    boolean response=false;
    if(sectionG.length-1==listBottom && sectionG[sectionG.length-1]!= null)
    {
        response=true;
    }
    return response;
}
}
