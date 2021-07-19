package com.zjm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebLog {
    private String ip;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;
    private String requestMethod;
    private String requestUrl;
    private String requestAgree;
    private int responesNum;
    private int dataSize;
    private String webOrigin;
    private String browserInfor;
    private int id;

}
