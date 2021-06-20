package fatur.jwork;

/**
 * Class FeeCalculator, untuk menghitung total fee dari invoice
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class FeeCalculator implements Runnable{
    private Invoice invoice;

    /**
     * Konstruktor dari class FeeCalculator
     * @param invoice
     */
    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run(){
        System.out.println("Calculating invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Finished calculating invoice id: " + invoice.getId());
    }
}
