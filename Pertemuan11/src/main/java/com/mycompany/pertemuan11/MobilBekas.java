/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author A-15
 */
class MobilBekas extends Mobil {

    private int tahun;
    private double harga;

    public MobilBekas(int tahun, double harga, String merk, String model) {
        super(merk, model);
        this.tahun = tahun;
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Mobil Bekas: " + getMerk() + " " + getModel() + " (" + tahun + ")");
    }

}