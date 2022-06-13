public class ScannProduct extends Product{
    private static final int stFee=300;
    public ScannProduct(int ProdId, String ProdNames, String ProdPhone) {
        super(ProdId, ProdNames, ProdPhone);
    }
    public String ProdDept(){
        return "Scanner";
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+ProdFee+"\t"+totals()+"\t"+ProdDept();
    }
    public int totals(){
        return ProdFee*3;
    }
}
