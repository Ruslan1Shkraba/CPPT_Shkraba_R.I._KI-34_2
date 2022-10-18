import java.io.*;
import java.util.Scanner;
public class Lab2_Shkraba_KI34 {

    public static void main(String[] args) throws FileNotFoundException {
        int arrSize;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("Lab2.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Please enter the array size: ");
        arrSize = in.nextInt();
        in.nextLine();
        System.out.print("Please enter the array filler: ");
        filler = in.nextLine();

        //filling the array
        char[][] arr = new char[arrSize][];
        int j = 1;
        for (int i = 0; i < arrSize; i++) {
            if (i < arrSize / 2) {
                arr[i] = new char[0];
            } else {
                arr[i] = new char[(i + (++j) - arrSize / 2)];
            }

        }


        //printing array
        if (filler.length() == 1) {
            for (int i = 0; i < arrSize; i++) {
                for (int l = arrSize - i; l > 0; l--) {
                    fout.print("  ");
                    System.out.print("  ");
                }
                for (int y = 0; y < arr[i].length; y++) {
                    arr[i][y] = filler.charAt(0);
                    System.out.print(arr[i][y] + " ");
                    fout.print(arr[i][y] + " ");
                }
                System.out.print("\n");
                fout.print("\n");
            }
            fout.flush();
            fout.close();
        } else {
            System.out.println("Too many characters/Filler character has not been entered");
            
        }
    }
}