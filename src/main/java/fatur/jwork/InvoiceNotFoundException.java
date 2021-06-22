package fatur.jwork;

/**
 * Class InvoiceNotFoundException, sebagai exception jika invoice tidak ditemukan
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */
public class InvoiceNotFoundException extends Exception{
    private int invoice_error;

    /**
     * Konstruktor class InvoiceNotFoundException
     * @param invoice_input
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    public String getMessage() {
        return super.getMessage() + invoice_error + "Not Found";
    }
}
