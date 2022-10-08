package com.kttk.lab5.hangkhong.services;

import java.util.List;

import com.kttk.lab5.hangkhong.entities.MayBay;

public interface MayBayService {
  List<MayBay> findByTamBayLonHon(int tamBay);

  List<MayBay> findByLoai(String loai);

  List<MayBay> findByHoNhanVien(String hoNhanVien);

  List<MayBay> findByMaCB(String maCB);
}
