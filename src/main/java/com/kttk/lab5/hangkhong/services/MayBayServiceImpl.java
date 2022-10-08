package com.kttk.lab5.hangkhong.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.repository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService {
  @Autowired
  MayBayRepository mayBayRepository;

  @Override
  public List<MayBay> findByTamBayLonHon(int tamBay) {
    List<MayBay> mayBays = mayBayRepository.findByTamBayLonHon(tamBay);
    return mayBays;
  }

  @Override
  public List<MayBay> findByLoai(String loai) {
    List<MayBay> mayBays = mayBayRepository.findByLoai(loai);
    return mayBays;
  }

  @Override
  public List<MayBay> findByHoNhanVien(String hoNhanVien) {
    return mayBayRepository.findByHoNhanVien(hoNhanVien);
  }

  @Override
  public List<MayBay> findByMaCB(String maCB) {
    return mayBayRepository.findByMaCB(maCB);
  }
}
