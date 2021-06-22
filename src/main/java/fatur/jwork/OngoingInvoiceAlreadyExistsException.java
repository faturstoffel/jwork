package fatur.jwork;

/**
 * Class OngoingInvoiceAlreadyExistException, sebagai exception jika invoice on going sudah ada
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class OngoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    /**
     * Konstruktor dari class OngoingInvoiceAlreadyExistException
     * @param invoice_input
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Invoice Status: ");
        this.invoice_error = invoice_input;
    }

    /**
     * Get message
     * @return error message
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " Already Exists.";
    }
}
