public class CompProduct extends Product{
    private static final int ProdFee=350;

    public CompProduct(int ProdId, String ProdNames, String Prodmanufacturer,version number) {
        super(ProdId, ProdNames, Prodmanufacturer, Version number);
    }
    public String ProdDept(){
        return "Computer";
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+ProdFee+"\t"+totals()+"\t"+ProdDept();
    }
    public int totals(){
        return ProdFee*3;
    }
}