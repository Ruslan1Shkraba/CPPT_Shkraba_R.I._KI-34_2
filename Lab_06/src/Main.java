import java.io.*;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Main {
	public static void main(String[] args) throws IOException {
        double x = 20.22;
        CalcRW calc=new CalcRW();
        calc.calculate(x);
        System.out.println(calc.getResult());
        calc.writeBIN("resultBIN.bin");
        calc.writeTXT("resultTXT.txt",x);

        calc.readBIN("resultBIN.bin");
        System.out.println(calc.getResult());
        /*calc.readTXT("resultTXT.txt");*/
        System.out.println(calc.getResult());
    }
}

class CalcRW{
    double result=0.0;
    public void writeTXT(String fileName,double x) throws IOException {
        PrintWriter pf = new PrintWriter(fileName);
        for(int i =0;i<5;i++) {
            calculate(x);
            pf.printf("%f", result);
            pf.print("\t");
            pf.println(x);
            x++;
        }
        pf.close();
    }

    public void readTXT(String fileName) throws FileNotFoundException {
       try {
           File f = new File(fileName);
           if (f.exists()) {
               Scanner s = new Scanner(f);
               result = s.nextDouble();
               s.close();
           } else {
               throw new FileNotFoundException("Can`t find the file" + fileName + "\n");
           }
       }catch (FileNotFoundException e)
       {
           System.out.println(e.getMessage());
       }
    }

    public void writeBIN(String fileName) throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(fileName));
        dos.writeDouble(result);
        dos.close();
    }


    public void readBIN(String fileName) throws IOException {
        DataInputStream f= new DataInputStream(new FileInputStream(fileName));
        result=f.readDouble();
        f.close();
    }


    public double calculate(double x) throws IOException {
        try {
            //Y=2/x; //test

            result =sin(x - 9) / (x - cos(2 * x));
            if(result==Double.POSITIVE_INFINITY||result==Double.NEGATIVE_INFINITY){
                throw new ArithmeticException();
            }

            return result;
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception! Dividing by zero");

            return 0;
        }

    }
    public double getResult(){
        return result;
    }



}