package com.kttk.lab5.hangkhong.entities;

import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "maybay")
public class MayBay {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MaMb")
  private int maMB;
  @Column(name = "Loai", length = 50)
  private String loai;
  @Column(name = "TamBay")
  private int tamBay;

  public MayBay() {
  }

  public MayBay(int maMB, String loai, int tamBay) {
    this.maMB = maMB;
    this.loai = loai;
    this.tamBay = tamBay;
  }

  public int getMaMB() {
    return maMB;
  }

  public void setMaMB(int maMB) {
    this.maMB = maMB;
  }

  public String getLoai() {
    return loai;
  }

  public void setLoai(String loai) {
    this.loai = loai;
  }

  public int getTamBay() {
    return tamBay;
  }

  public void setTamBay(int tamBay) {
    this.tamBay = tamBay;
  }

  @Override
  public String toString() {
    return "MayBay [loai=" + loai + ", maMB=" + maMB + ", tamBay=" + tamBay + "]";
  }

}
