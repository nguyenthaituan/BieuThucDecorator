
public class Main {

   
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(5);
        
        bt = new Cong(4,bt);
        bt = new Cong(5,bt);
        bt = new Tru(2, bt);
        bt = new Nhan(4, bt);
        bt = new Chia(3,bt);
        System.out.println(bt.bieuThuc() + " = " +bt.giaTri());
      
    }
    
}
