/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mylv
 */
public class Quanly {

    public static void main(String[] args) {
        DSBN ds = new DSBN(10);
        for (int i = 0; i < 4; i++) {
            ds.dsbn[i] = new BNNT();
        }
        for (int i = 4; i < 8; i++) {
            ds.dsbn[i] = new BNNT();
            ds.dsbn[i].setDaihan(true);
        }

        for (int i = 4; i < 8; i++) {
            ds.dsbn[i] = new BNNT();
            ds.dsbn[i].setDaihan(false);
        }
        for (int i = 0; i < ds.n; i++) {
            System.out.println("Thong tin benh nhan la: ");
            System.out.println("Ho ten: " + ds.dsbn[i].getHoTen());
            System.out.println("Tuoi: " + ds.dsbn[i].getTuoi());
            System.out.println("Benh: " + ds.dsbn[i].getBenh());
        }

        System.out.println("Danh sach benh nhan ngoai tru: ");
        for (int i = 0; i < ds.n; i++) {
            if (ds.dsbn[i] instanceof BNNGT) {
                System.out.println(ds.dsbn[i].getHoTen());
            }
        }

        System.out.println("Danh sach benh nhan noi tru: ");
        for (int i = 0; i < ds.n; i++) {
            if (ds.dsbn[i] instanceof BNNT) {
                System.out.println(ds.dsbn[i].getHoTen());
            }
        }

        System.out.println("Danh sach benh nhan noi tru dai han: ");
        for (int i = 0; i < ds.n; i++) {
            if (ds.dsbn[i] instanceof BNNT) {
                if (ds.dsbn[i].getDaihan()) {
                    System.out.println(ds.dsbn[i].getHoTen());
                }
            }
        }
        float sum = 0;
        for (int i = 0; i < ds.n; i++) {
            if (ds.dsbn[i] instanceof BNNGT) {
                sum += ds.dsbn[i].getSolankham() * ds.dsbn[i].getChiphi() *;
            } else {
                if (ds.dsbn[i].getDaihan()) {
                    sum += ds.dsbn[i].getChiphi() * (ds.dsbn[i].getNgaynhapvien() - getNgayxuatvien());
                } else {
                    sum += ds.dsbn[i].getChiphi() * (ds.dsbn[i].getNgaynhapvien() - getNgayxuatvien()) * 0.7;
                }
            }
        }
        System.out.println("Tong vien phi: " + sum);

    }

}

class BN {

    String hoTen;
    int tuoi;
    String benh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getBenh() {
        return benh;
    }

    public void setBenh(String benh) {
        this.benh = benh;
    }
}

class BNNGT extends BN {

    BNNGT() {

    }
    private int solankham;
    private float chiphi;

    public int getSolankham() {
        return solankham;
    }

    public void setSolankham(int solankham) {
        this.solankham = solankham;
    }

    public float getChiphi() {
        return chiphi;
    }

    public void setChiphi(float chiphi) {
        this.chiphi = chiphi;
    }
}

class BNNT extends BN {

    BNNT() {

    }
    private boolean daihan;
    private float chiphi;
    private Date ngaynhapvien;
    private Date ngayraviendukien;

    public boolean isDaihan() {
        return daihan;
    }

    public void setDaihan(boolean daihan) {
        this.daihan = daihan;
    }

    public float getChiphi() {
        return chiphi;
    }

    public void setChiphi(float chiphi) {
        this.chiphi = chiphi;
    }

    public Date getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(Date ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public Date getNgayraviendukien() {
        return ngayraviendukien;
    }

    public void setNgayraviendukien(Date ngayraviendukien) {
        this.ngayraviendukien = ngayraviendukien;
    }

}

class DSBN {

    BN[] dsbn;
    int n;

    public DSBN(int n) {
        dsbn = new BN[n];
    }
}
