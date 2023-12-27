package com.logistics4.ssm.pojo;

import lombok.Data;

@Data
public class Warehouse {

    private String area;

    private String name;

    //仓库类型
    private  String wareHouseType;

    private int size;

    //联系人
    private String linkman;

    private String phonenumber;
}
