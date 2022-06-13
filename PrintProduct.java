public class PrintProduct extends Product {
    private static final String ProdFee = 400;

    public PrintProduct(int ProdId, String ProdNames, String Prodmanufacturer) {
        super(ProdId,ProdNames, Prodmanufacturer);
    }

    public String ProdDept() {
        return "Print";
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + prodFee + "\t" + totals() + "\t" + ProdDept();
    }

    public int totals() {
        return ProdFee * 3;
    }
}
