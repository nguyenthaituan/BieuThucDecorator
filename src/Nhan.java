
public class Nhan extends BieuthucDerector{
   
 float toanHang;

    public Nhan(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.bt.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bt.bieuThuc() + "*"+toanHang;
    }
 
}
