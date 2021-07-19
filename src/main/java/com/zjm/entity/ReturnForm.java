package com.zjm.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ReturnForm {
    private List<String> keyName=new ArrayList<>();
    private List<Integer> valueList=new ArrayList<>();

    public ReturnForm() {
    }

    public List<String> getkeyName() {
        return keyName;
    }
    public void addkeyName(String key){
        keyName.add(key);
    }

    public List<Integer> getTotalList() {
        return valueList;
    }
    public void addTotalList(Integer total){
        valueList.add(total);
    }
    public void valueSort(){
        valueList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                }else if(o1 < o2){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }

}
