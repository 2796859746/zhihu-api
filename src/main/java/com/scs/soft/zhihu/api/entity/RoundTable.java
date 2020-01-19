package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Lenovo
 */
@Data
@Builder
public class RoundTable {
    private String roundTableId;
    private String name;
    private String urlToken;
    private String banner;
    private Integer visitsCount;
    private Integer includeCount;
}
