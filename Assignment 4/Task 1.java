//Task1
class Student{
    String name;
    String prog;
    public Student(String n, String d){
        name = n;
        prog = d;
    }
    public void updateName(String na){
        name = na;
    }
    public void updateProgram(String de){
        prog = de;
    }
    public String accessProgram(){
        return prog;
    }
}
