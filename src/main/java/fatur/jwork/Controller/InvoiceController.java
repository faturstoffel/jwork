package fatur.jwork.Controller;
import fatur.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class InvoiceController, untuk mengontrol invoice yang terkoneksi dengan jwork android
 * @author Fatur Rahman Stoffel
 * @version 20-06-2021
 */

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    /**
     * Untuk mendapatkan database invoice
     * @return DatabaseInvoice
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {
        return (DatabaseInvoice.getInvoiceDatabase());
    }

    /**
     * Untuk mendapatkan invoice dengan id
     * @param id
     * @return invoice
     */
    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    /**
     * Untuk mendapatkan invoice dengan jobseeker
     * @param jobseekerId
     * @return invoice
     */
    @RequestMapping("/jobseeker/{jobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerId) {
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceByJobseeker(jobseekerId);

        return invoice;
    }

    /**
     * Untuk melakukan remove invoice, jika membatalkan
     * @param id
     * @return DatabaseInvoice.removeInvoice(id)
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        try {
            DatabaseInvoice.removeInvoice(id);
            return true;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Untuk mendapatkan invoice dengan status
     * @param id
     * @param status
     * @return invoice
     */
    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    /**
     * Untuk membuat bank payment invoice
     * @param jobIdList
     * @param jobseekerId
     * @param adminFee
     * @return invoice
     */
    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                  @RequestParam(value = "jobseekerId") int jobseekerId,
                                  @RequestParam(value = "adminFee") int adminFee) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for (Integer integer : jobIdList) {
            try {
                jobs.add(DatabaseJob.getJobById(integer));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), adminFee);
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }

    /**
     * Untuk membuat ewallet invoice
     * @param jobIdList
     * @param jobseekerId
     * @param referralCode
     * @return invoice
     */
    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(@RequestParam(value = "jobIdList") ArrayList<Integer> jobIdList,
                                     @RequestParam(value = "jobseekerId") int jobseekerId,
                                     @RequestParam(value = "referralCode") String referralCode) {
        Invoice invoice = null;
        ArrayList<Job> jobs = new ArrayList<>();
        for(var i = 0; i < jobIdList.size(); i++) {
            try {
                jobs.add(DatabaseJob.getJobById(jobIdList.get(i)));
            } catch (JobNotFoundException e) {
                e.getMessage();
            }
        }
        try {
            invoice = new EwalletPayment(DatabaseInvoice.getLastId() + 1, jobs, DatabaseJobseekerPostgre.getJobseekerById(jobseekerId), DatabaseBonus.getBonusByReferralCode(referralCode));
            invoice.setTotalFee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean status = false;
        try {
            status = DatabaseInvoice.addInvoice(invoice);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }
        if (status) {
            return invoice;
        } else {
            return null;
        }
    }
}
