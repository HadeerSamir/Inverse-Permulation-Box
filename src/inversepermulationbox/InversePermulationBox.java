package inversepermulationbox;

import java.util.LinkedList;
import java.util.Scanner;

public class InversePermulationBox {

    public static void inverse(int[] permulationTable, int input) {

        LinkedList<Integer>inversedPermulationTable= new LinkedList<>();
        //int index = 0;
        boolean found = false;

            for (int i = 0; i < permulationTable.length; i++) {

                for(int j=0;j<permulationTable.length;j++){
                if (i+ 1 == permulationTable[j]) {

                    inversedPermulationTable.add(j+1);
                    //index++;
                    found = true;
                    break;

                }
                else{
                    found=false;
                }
                

            }
            if (found == false) {
                if (inversedPermulationTable.size() <input) {
                     System.out.println("IMPOSSIBLE");
                    System.exit(0);
                } else {
                   break;
                }

            }
          
        }

        for (int i = 0; i < inversedPermulationTable.size(); i++) {
            System.out.print(inversedPermulationTable.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int output = scan.nextInt();

        int[] permulationTable = new int[output];

        for (int i = 0; i < output; i++) {
            int value = Integer.parseInt(scan.next());
            permulationTable[i] = value;  //decimalNumbersOfPermulationTable

        }

        int value1 = 0;

        for (int i = 0; i < permulationTable.length; i++) {
            value1 = permulationTable[i];
            if (value1 > input || value1 <= 0 || input>output) {
                System.out.println("IMPOSSIBLE");
                System.exit(0);
            }
        }
        inverse(permulationTable, input);

    }

}
