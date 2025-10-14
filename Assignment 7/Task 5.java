
//Task5
public class ComplexNumber extends RealNumber{
    public double imaginaryValue;
    public ComplexNumber() {
        this(1.0, 1.0);
    }
    public ComplexNumber(double r, double i) {
        super(r);
        imaginaryValue = i;
    }
    public String toString(){
        return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
}


