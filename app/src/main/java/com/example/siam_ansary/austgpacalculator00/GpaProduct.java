package com.example.siam_ansary.austgpacalculator00;

/**
 * Created by Siam-Ansary on 8/8/2016.
 */
public class GpaProduct {

    private int _id;
    private String _productname;

    public GpaProduct() {

    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }

    public GpaProduct(String productname) {
        this._productname = productname;
    }
}
