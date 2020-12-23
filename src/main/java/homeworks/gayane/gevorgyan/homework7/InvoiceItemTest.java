package homeworks.gayane.gevorgyan.homework7;

public class InvoiceItemTest {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("1", "Pen", 50, 100);
        InvoiceItem invoiceItem2 = new InvoiceItem("2", "Notepad", 30, 300);


        System.out.println("InvoiceItem [id = " + invoiceItem1.getId() + ",  decs = " + invoiceItem1.getDesc() + ", qty = " + invoiceItem1.getQty() + ", unitPrice = "+ invoiceItem1.getUnitPrice()+ "]" );
        System.out.println("Total = " + invoiceItem1.getTotal());
        System.out.println("InvoiceItem [id = " + invoiceItem2.getId() + ",  decs = " + invoiceItem2.getDesc() + ", qty = " + invoiceItem2.getQty() + ", unitPrice = "+ invoiceItem2.getUnitPrice()+ "]" );
        System.out.println("Total = " + invoiceItem2.getTotal());
    }
}
