package com.zjm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupByTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;
    private int total;
    public String getTime(){
        return year+"/"+month+"/"+day+"/"+" "+hour+":"+minutes;
    }
    public int getTotal(){
        return total;
    }
}
