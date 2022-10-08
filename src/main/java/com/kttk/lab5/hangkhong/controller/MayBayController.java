package com.kttk.lab5.hangkhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kttk.lab5.hangkhong.entities.MayBay;
import com.kttk.lab5.hangkhong.services.MayBayService;

@RestController
@RequestMapping("/api/v1/may-bay")
public class MayBayController {
  @Autowired
  MayBayService mayBayService;

  @GetMapping("/tam-bay/lon-hon/{tamBay}")
  public List<MayBay> getMayBayByTamBayLonHon(@PathVariable(name = "tamBay") int tamBay) {
    return mayBayService.findByTamBayLonHon(tamBay);
  }

  @GetMapping("/loai/{loai}")
  public List<MayBay> getMayBayByLoai(@PathVariable(name = "loai") String loai) {
    return mayBayService.findByLoai(loai);
  }

  @GetMapping("/ho-nhan-vien/{hoNhanVien}")
  public List<MayBay> getMayBayByHoNhanVien(@PathVariable(name = "hoNhanVien") String hoNhanVien) {
    return mayBayService.findByHoNhanVien(hoNhanVien);
  }

  @GetMapping("/ma-cb/{maCB}")
  public List<MayBay> getMayBayByMaCB(@PathVariable(name = "maCB") String maCB) {
    return mayBayService.findByMaCB(maCB);
  }
}
