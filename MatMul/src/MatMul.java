
import java.util.Random;  /* for random number */

import java.lang.*;		/* for Math.abs funciton  */

import in.co.s13.sips.lib.*;

class MatMul {

    public static void main(String args[]) {
         SIPS sim = new SIPS("MatMul");
        double a[][] = new double[1000][1000];
        double b[][] = new double[1000][1000];
        double c[][] = new double[a[0].length][b[1].length];

        int nra, nca; 
        /* nra is number of rows of a, nca is number of col. of a */

        int nrb, ncb;
        int nrc, ncc;

        /* fix order n by n */
        nra = nca = nrb = ncb = a[0].length;

        /*initialize a[][]with random numbers */
        sim.simulateSection();
        Random rand = new Random();

        
        /* display a[][] and b[][] temporarily for checking */
       // System.out.println("Elements of a[][] array are : ");
        for (int i = 0; i < nra; i++) {
            for (int j = 0; j < nca; j++) {
                a[i][j] = rand.nextDouble();
            //    System.out.print(a[i][j] + "   ");
             //   sim.simulateLoop();
            }
         //   System.out.println();
        }

        //System.out.println("Elements of b[][] array are : ");
        for (int i = 0; i < nrb; i++) {
            for (int j = 0; j < ncb; j++) {
                b[i][j] = rand.nextDouble();
            //    System.out.print(b[i][j] + "   ");
            //    sim.simulateLoop();
            }
           // System.out.println();
        }
        //System.out.println("Elements of resultant array are : ");
        sim.saveValues("" + nra, "" + ncb, "" + nca);
        sim.saveObject("a",0,a);
        sim.saveObject("b",1,b);
        sim.endSimulateSection();
        a=(double [][])sim.resolveObject("a", 0);
        b=(double [][])sim.resolveObject("b", 1);
        
        /* start matrix multiplication */
        sim.parallelFor();
        for (int i = 0; i < nra; i++) {
            for (int j = 0; j < ncb; j++) {
                c[i][j] = 0;
                for (int k = 0; k < nca; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + "   ");

            }
            System.out.println();
        }
        sim.endParallelFor();
    }
}
