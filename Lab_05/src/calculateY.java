import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class calculateY {
    private double X;
    private double Y;

    FileWriter fr;
        {
            try {
                fr = new FileWriter("lab5.txt");
            } catch (IOException e) {
                System.out.println("IOException");
            }
        }

    calculateY(double x){
        X=x;
    }

    calculateY(){
        X=0;
    }

    public double calculate(double x) throws IOException {
        try {
            //Y=2/x; //test

            Y =sin(x - 9) / (x - cos(2 * x));
            if(Y==Double.POSITIVE_INFINITY||Y==Double.NEGATIVE_INFINITY){
                throw new ArithmeticException();
            }
            fr.write("Result is: "+Y);
            fr.close();
            return Y;
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception! Dividing by zero");
            fr.write("Arithmetic Exception! Dividing by zero");
            fr.close();
            return 0;
        }
        catch (IOException ioe){
            System.out.println("IOException occurred");
            fr.write("IOException occurred");
            fr.close();
            return 0;
        }

    }

}
