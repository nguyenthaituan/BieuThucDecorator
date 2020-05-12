
public class Chia extends BieuthucDerector{
   
 float toanHang;

    public Chia(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.bt.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bt.bieuThuc() + "/"+toanHang;
    }
 
}
