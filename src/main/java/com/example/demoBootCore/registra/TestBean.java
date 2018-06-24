package com.example.demoBootCore.registra;

import lombok.Data;

@Data
public class TestBean {
  private String aa;

  public String getStr() {
	  return this.getClass().getName();
  }
}
