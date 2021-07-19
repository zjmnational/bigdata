package com.zjm.mapper;

import com.zjm.pojo.GroupByIP;
import com.zjm.pojo.GroupByTime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类
@Mapper
@Repository
public interface WebLogMapper {
    List<GroupByTime> queryGroupByTime();
    List<GroupByIP> queryGroupByIP();
}
