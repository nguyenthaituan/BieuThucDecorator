/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Tru extends BieuthucDerector{
    float toanHang;

    public Tru(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.bt.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bt.bieuThuc() + "-"+toanHang;
    }
}
