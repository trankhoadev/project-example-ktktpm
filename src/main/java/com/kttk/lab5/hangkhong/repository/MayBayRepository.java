package com.kttk.lab5.hangkhong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kttk.lab5.hangkhong.entities.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, String> {

  @Query(value = "select * from maybay m where m.tamBay >= ?1", nativeQuery = true)
  List<MayBay> findByTamBayLonHon(int tamBay);

  @Query(value = "select * from maybay m where m.loai like '%?1%'", nativeQuery = true)
  List<MayBay> findByLoai(String loai);

  @Query(value = "select * from maybay m join chungnhan c join nhanvien n on m.maMB = c.maMB and c.maNV = n.maNV where n.ten like CONCAT(?1, '%')", nativeQuery = true)
  List<MayBay> findByHoNhanVien(String hoNhanVien);

  @Query(value = "select * from maybay m where m.tamBay >= (select c.doDai from chuyenbay c where c.maCB = ?1)", nativeQuery = true)
  List<MayBay> findByMaCB(String maCB);
}
