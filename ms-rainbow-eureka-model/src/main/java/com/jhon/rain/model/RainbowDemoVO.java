package com.jhon.rain.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by jiangy19 on 2017/12/13.
 */
@Data
public class RainbowDemoVO implements Serializable {

  /** 姓名 **/
  private String name;

  /** 地址 **/
  private String address;
}
