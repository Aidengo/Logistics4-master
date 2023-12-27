package com.logistics4.ssm.pojo;

import lombok.Data;

@Data
public class Order {
    //发件人
    private String shipments;

    private String shipnumber;

    private String path;

    //收件人
    private  String consignee;

    private String consnumber;

    //货物信息
    private String itemname;
    //订单编号
    private String ordernumber;
}
