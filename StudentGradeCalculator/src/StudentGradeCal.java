import java.util.Scanner;

public class StudentGradeCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student-Grade-Calculator");
        System.out.println("Enter number of subjects in your academics :");
        int nS = sc.nextInt();
        int total = 0;
        for(int i=0; i<nS;i++){
            System.out.println("Enter marks obtained in "+i+" : ");
            int marks = sc.nextInt();
            total += marks;
        }
        float averageP=(float) total/nS;
        char Grade ;
        if(averageP>=90){
            Grade='O';
        }
        else if(averageP >= 80){
            Grade = 'A';
        }
        else if(averageP >= 70){
            Grade = 'B';
        }
        else if(averageP >= 60){
            Grade = 'C';
        }
        else if(averageP >= 50){
            Grade = 'D';
        }
        else if(averageP >= 40){
            Grade = 'E';
        }
        else{
            Grade = 'F';
        }
        System.out.println("Total marks scored :"+total);
        System.out.println("Average percentage gained :"+averageP+"%");
        System.out.println("Grade :"+Grade);
    }
}