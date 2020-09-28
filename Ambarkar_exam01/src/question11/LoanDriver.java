/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Scanner;

/**
 *
 * @author Sai Prashansa Ambarkar
 */
public class LoanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = scan.nextDouble();
        System.out.print("Number of Years: ");
        int years = scan.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = scan.nextDouble();
        Loan l=new Loan(loanAmount,years,interestRate);
        System.out.println("\nMonthly payment: "+l.monthlyPay());
        System.out.println("\nTotal payment: "+l.totalPay());
        System.out.println("Payment#     Interest     Principal     Balance");
         for(int i=1;i<=years*12;i++){
             System.out.printf("%-13d%-13.2f%-13.2f%-15.2f\n",i,l.getMonthlyIntPay(),l.getprincipleAmount(),l.getbalance());
        }
    }
       
    
}

