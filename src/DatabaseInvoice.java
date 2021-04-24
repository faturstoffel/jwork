import java.util.ArrayList;
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;


    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id){
        Invoice tempVar = null;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                tempVar = invoice;
            }
            else{
                tempVar =  null;
            }
        }
        return tempVar;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId)
    {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                temp.add(invoice);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean removeInvoice (int id)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == invoice.getId()) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
