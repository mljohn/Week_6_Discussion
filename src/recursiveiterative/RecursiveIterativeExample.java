/**
 * File: RecursiveIterativeExample
 * Author: Michelle John
 * Date: 03 Dec 2017
 * Purpose: Week 6 Discussion
 */
package recursiveiterative;

public class RecursiveIterativeExample {

  private static final int TOTAL_DISTANCE = 100;
  private static int numberRecursions = 0;
  private static int numberIterations = 0;

  public static void main(String[] args) {
    
    RecursiveIterativeExample example = new RecursiveIterativeExample();
    
    example.recursiveZeno(TOTAL_DISTANCE);
    System.out.println("\n\n");
    example.iterativeXeno(TOTAL_DISTANCE);
    
    System.out.println("Number of recursions: " + numberRecursions);
    System.out.println("Number of iterations: " + numberIterations);

  }

  private void recursiveZeno(int remainingDistance) {
    if (remainingDistance <= 1) {
      System.out.print("-");
      return;
    }
    for (int i = 0; i <= remainingDistance; i++) {
      System.out.print("-");
    }
    System.out.println("\n");
    numberRecursions++;
    recursiveZeno((int) remainingDistance / 2);
  }

  private void iterativeXeno(int totalDistance) {
    int remainingDistance = totalDistance;
    
    while (remainingDistance >= 1) {
      for (int i = 0; i <= remainingDistance; i++) {
        System.out.print("-");
      }
      System.out.println("\n");
      numberIterations++;
      remainingDistance = remainingDistance / 2;
    }
  }
}
