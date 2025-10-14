//Task1
public class BBAStudent extends Student{
    public BBAStudent(){
        setDepartment("BBA");
    }
    public BBAStudent(String name){
        setDepartment("BBA");
        setName(name);
    }
    public void details() {
        super.details();
    }
}

