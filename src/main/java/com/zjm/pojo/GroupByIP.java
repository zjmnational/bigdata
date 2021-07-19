package com.zjm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupByIP {
    private String ip;
    private int total;

    public String getWebOrigin() {
        return ip;
    }

    public int getTotal() {
        return total;
    }
}
