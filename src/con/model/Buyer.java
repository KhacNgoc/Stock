/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con.model;

/**
 *
 * @author khacngoc
 */
public class Buyer implements Comparable<Buyer>{
    private Double purchase;
    private int stock_num;

    public Double getPurchase() {
        return purchase;
    }

    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }

    public int getStock_num() {
        return stock_num;
    }

    public void setStock_num(int stock_num) {
        this.stock_num = stock_num;
    }

    public Buyer(Double purchase, int stock_num) {
        this.purchase = purchase;
        this.stock_num = stock_num;
    }

    @Override
    public String toString() {
        return "[Tien: "+this.purchase+", Co phieu: "+this.stock_num+"]";
    }

    @Override
    public int compareTo(Buyer buyer) {
        return buyer.purchase.compareTo(this.getPurchase());
    }
}
