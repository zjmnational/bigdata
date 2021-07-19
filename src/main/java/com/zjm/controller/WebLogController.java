package com.zjm.controller;

import com.zjm.entity.ReturnForm;
import com.zjm.mapper.WebLogMapper;
import com.zjm.pojo.GroupByIP;
import com.zjm.pojo.GroupByTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebLogController {
    @Autowired
    private WebLogMapper webLogMapper;
    @GetMapping("/queryGroupbyTime")
    public ReturnForm queryGroupByTime(){
        ReturnForm aotbm = new ReturnForm();
        List<GroupByTime> webLogs = webLogMapper.queryGroupByTime();
        for (GroupByTime webLog : webLogs) {
            aotbm.addkeyName(webLog.getTime());
            aotbm.addTotalList(webLog.getTotal());
        }
        return aotbm;
    }
    @GetMapping("/queryGroupByIP")
    public ReturnForm queryGroupByIP(){
        ReturnForm rf = new ReturnForm();
        List<GroupByIP> groupByIPS = webLogMapper.queryGroupByIP();
        for (GroupByIP groupByIP : groupByIPS) {
            rf.addkeyName(groupByIP.getWebOrigin());
            rf.addTotalList(groupByIP.getTotal());
        }
        rf.valueSort();
        return rf;
    }
}
