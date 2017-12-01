/*
   @author Siam-Al-mer Chowdhury
   CSC 201-004N
   Professor Tanes Kanchanawanchai
 A program in that computes your tax accoroding to income and filing status
   */
import java.util.Scanner;
public class ComputeTax {
    public static void main(String[] args){
        //Create a scanner
        Scanner keyborad=new Scanner(System.in);

        System.out.print("Hello. Enter. 0-single filer,1-married jointly or " + "qualifying widow(er),2-married seperately, 3-head of "+"houshold Enter the filing status: ");
        int status=keyborad.nextInt();

        //promp user for taxable income
        System.out.print("Enter taxable income: ");
        double income=keyborad.nextDouble();

        //Compute Tax
        double tax=0;

        if(status==0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * .33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * .33 + (income - 379250);
        }
            else if (status==1){
            //married file jointly or qualifying widow(er)
        }
        else if (status==2){
                //married separately
        }
        else if (status==3){
            //compute tax for head of household
        }
        else{
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        //result
        System.out.println("Tax is "+(int)(tax*100)/100.0);

        }


    }


