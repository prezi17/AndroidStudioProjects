package com.example.mcalc;

public class Mortgagemodel
{
        private double principle;
        private int amortization;
        private double interest;

    public Mortgagemodel(String principle,String amortization,String annualInterest)
    {
            this.principle = Double.parseDouble(principle);

            this.amortization = Integer.parseInt(amortization);
            this.interest= Double.parseDouble(annualInterest);

    }

        public String computePayment(){

                double r = (this.interest/100)/12;
                double P = this.principle;
                double n = this.amortization*12;
                double payment = (r*P)/(1-Math.pow((1+r),-n));

                String result =String.format("$%,.2f" ,payment);
                 return result;
    }

      /*  public static void main(String[] args)
        {
            Mortgagemodel myModel = new Mortgagemodel("700000", "25","2.75");
            System.out.println(String.format(myModel.computePayment()));


    }      */
}

