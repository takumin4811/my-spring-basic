package com.sample.domain;

import lombok.Data;

@Data
public class Hoge {

  public int id;

  public String value;

  @Override
  public String toString() {
    return "Hoge [id=" + id + ", value=" + value + "]";
  }
}
