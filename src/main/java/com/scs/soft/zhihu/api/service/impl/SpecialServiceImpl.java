package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/**
 * @author Lenovo
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;
    @Override
    public List<Map> selectAll() {

        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
