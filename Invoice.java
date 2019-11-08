package sample;

public class Invoice {
    int invoiceID;
    int clientID;
    int examID;
    float InvoiceTotal;



    public Invoice(int invoiceID, int clientID, int examID, float invoiceTotal) {
        this.invoiceID = invoiceID;
        this.clientID = clientID;
        this.examID = examID;
        InvoiceTotal = invoiceTotal;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public float getInvoiceTotal() {
        return InvoiceTotal;
    }

    public void setInvoiceTotal(float invoiceTotal) {
        InvoiceTotal = invoiceTotal;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", clientID=" + clientID +
                ", examID=" + examID +
                ", InvoiceTotal=" + InvoiceTotal +
                '}';
    }
}
