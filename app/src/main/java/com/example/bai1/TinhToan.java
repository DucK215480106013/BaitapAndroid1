package com.example.bai1;

public class TinhToan {
    private double r;

    public Double tinhChuVi(){
        return r*2*Math.PI;
    }
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
