package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Test
    void selectPopular() {
        List<RoundTable> roundTables = roundTableMapper.selectPopular();
        roundTables.forEach(System.out::println);
    }

    @Test
    void selectAllRoundTable() {
        List<Map> roundTables = roundTableMapper.selectAllRoundTable();
        roundTables.forEach(System.out::println);
    }
}