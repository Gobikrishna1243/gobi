import java.util.Scanner;

      /*  int a[][]=new int[2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=70;
        a[1][1]=40;
        for(int i=0;i<2;i++){
            for (int j=0; j<2;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

            }
*/
      public class Main {
            public static void main(String[] args) {
                boys r1 = new boys();
                boys r2 = new boys();
                boys r3 = new boys();

                r1.name = "mariyamma ";
                r2.name = "jothi ";
                r3.name = "muthumari ";

                r1.department = "CSE";
                r2.department = "ECE";
                r3.department = "EEE";

                System.out.println(r1.name+r1.department);
                System.out.println(r2.name+r2.department);
                System.out.println(r3.name+r3.department);

                r1.drdo();

            }
        }