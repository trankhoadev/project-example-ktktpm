package com.kttk.lab5.hangkhong.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
  @EmbeddedId 
  private ChungNhanKey id = new ChungNhanKey();
}
