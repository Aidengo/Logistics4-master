package com.logistics4.ssm.pojo;

import lombok.Data;

@Data
public class Item {
    private String itemname;
    //数量
    private int number;
    //编号
    private int ref;
    //仓库
    private String warehousename;
    //承运商
    private String commonCarrier;
}
