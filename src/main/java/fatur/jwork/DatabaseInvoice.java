package fatur.jwork;
import java.util.ArrayList;

/**
 * Class DatabaseInvoice, sebagai database untuk invoice
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * Get invoice database
     * @return INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    /**
     * Get last id
     * @return lastId
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * Untuk mendapatkan invoice dengan menggunakan id
     * @param id
     * @return result
     * @throws InvoiceNotFoundException
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice result = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                result = invoice;
            } else {
                result = null;
            }
        }
        if (result == null){
            throw new InvoiceNotFoundException(id);
        }

        return result;
    }

    /**
     * Untuk mendapatkan invoice dengan menggunakan jobseeker
     * @param jobseekerid
     * @return temp
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * Untuk melakukan add invoice
     * @param invoice
     * @throws OngoingInvoiceAlreadyExistsException
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoices : INVOICE_DATABASE) {
            if (invoices.getInvoiceStatus() == InvoiceStatus.OnGoing && invoices.getId()==invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * Untuk mengubah status dari invoice
     * @param id
     * @param invoiceStatus
     * @return boolean
     */
    public static boolean changeInvoiceStatus(int id,InvoiceStatus invoiceStatus){
        boolean tempBool = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                tempBool = true;
            }
            else{
                tempBool = false;
            }
        }
        return tempBool;
    }

    /**
     * Untuk melakukan remove invoice
     * @param id
     * @return boolean
     * @throws InvoiceNotFoundException
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        boolean tempBool = false;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                tempBool = true;
                break;
            }
        }
        if (!tempBool) {
            throw new InvoiceNotFoundException(id);
        }
        return tempBool;
    }
}
