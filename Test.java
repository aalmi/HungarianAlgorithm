/**
 * Test Class for HungarianAlgorithm.java
 *
 * @author https://github.com/aalmi | march 2014
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

      // the problem is written in the form of a matrix
      int[][] dataMatrix = {
      //col0  col1  col2  col3
        {70,  40,   20,   55},  //row0
        {65,  60,   45,   90},  //row1
        {30,  45,   50,   75},  //row2
        {25,  30,   55,   40}   //row3
      };

      //find optimal assignment
      HungarianAlgorithm ha = new HungarianAlgorithm(dataMatrix);
      int[][] assignment = ha.findOptimalAssignment();

      if (assignment.length > 0) {
        // print assignment
        for (int i = 0; i < assignment.length; i++) {
          System.out.print("Col" + assignment[i][0] + " => Row" + assignment[i][1] + " (" + dataMatrix[assignment[i][0]][assignment[i][1]] + ")");
          System.out.println();
        }
      } else {
        System.out.println("no assignment found!");
      }
    }
}
