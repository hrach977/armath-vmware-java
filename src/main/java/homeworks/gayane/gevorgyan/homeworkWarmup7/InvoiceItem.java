package homeworks.gayane.gevorgyan.homeworkWarmup7;

// 1.5  Ex: The InvoiceItem Class

public class InvoiceItem {
    private  String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String i, String d, int q, double u){
        id = i;
        desc = d;
        qty = q;
        unitPrice = u;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
}
