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
public class Seller implements Comparable<Seller>{
     private Double sale_total;
    private int stock_num;

    public Double getSale_total() {
        return sale_total;
    }

    public void setSale_total(Double sale_total) {
        this.sale_total = sale_total;
    }

    public int getStock_num() {
        return stock_num;
    }

    public void setStock_num(int stock_num) {
        this.stock_num = stock_num;
    }

    public Seller(Double sale_total, int stock_num) {
        this.sale_total = sale_total;
        this.stock_num = stock_num;
    }

    @Override
    public String toString() {
        return "[Tien: "+this.sale_total+", Co phieu: "+this.stock_num+"]";
    }

    @Override
    public int compareTo(Seller seller) {
        return this.sale_total.compareTo(seller.sale_total);
    }
}
