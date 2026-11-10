
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int studentNum;
        int total=0;
        double average, passedStudent;
        int passed=0, failed=0, distinction=0;

        System.out.print("Enter the number of Students: ");
        studentNum= input.nextInt();
         System.out.print("\n");
        int [] marks = new int[studentNum];


        for( int x = 0; x < studentNum; x++){

            System.out.print("Enter marks for student "+(x+1)+": ");
            marks[x]=input.nextInt();
            total+=marks[x];


        }
        average= total/studentNum;

      int lowest=marks [0];
     int highest= marks [0];

      for ( int x =1; x < marks.length ; x++){

          if(marks[x] < lowest){
                    lowest=marks[x];
              }
         if (marks[x]>=highest){
                    highest=marks[x];
         }

      }
      int count=0;
       for ( int x =0; x <marks.length; x++)
       {
            if(marks[x] >= 75){

             distinction ++;
         }

          if(marks[x]>= 50){

              passed ++;
          }
          else if (marks[x] < 50){

              failed ++;
          }
       }
      passedStudent= passed/ (double) studentNum * 100;

        System.out.println("\n========== STUDENT ANALYSIS ==========");
        System.out.print("Marks: ");

        for(int x =0 ; x<marks.length;x++){
        System.out.printf(" %3d",marks[x]);
        }
        System.out.print("\n");

     System.out.printf("%nTotal: %d",total);
     System.out.printf("%nAvarage: %.2f",average);
     System.out.printf("%nHighest marks: %d",highest);
     System.out.printf("%nLowest marks: %d",lowest);
     System.out.print("\n======================================");
     System.out.printf("%nPassed: %5d",passed);
    System.out.printf("%nFailed: %5d",failed);
     System.out.printf("%nDistinction: %5d",distinction);
    System.out.printf("%nPass Percentage: %5.2f%% ", passedStudent);

    }
}
