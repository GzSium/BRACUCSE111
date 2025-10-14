//Task4
public class Vehicle2010 extends Vehicle{
    // deafault 0, super dia mention
    public void moveUpperRight(){
      super.moveUp();
      super.moveRight();
    }
      public void moveLowerRight(){
        super.moveDown();
        super.moveRight();
     }
    public void moveLowerLeft(){
      super.moveDown();
      super.moveLeft();
    }
    public void moveUpperLeft(){
      super.moveUp();
      super.moveLeft();
    }
}

