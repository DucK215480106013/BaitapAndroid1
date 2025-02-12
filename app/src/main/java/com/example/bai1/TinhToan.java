package com.example.bai1;

import android.webkit.JavascriptInterface;

public class TinhToan {
    private double r;
    @JavascriptInterface
    public Double tinhChuVi(){
        return r*2*Math.PI;
    }
    @JavascriptInterface
    public Double tinhDientich(){
        return Math.pow(r,2)*Math.PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
