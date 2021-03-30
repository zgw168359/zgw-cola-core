package com.zgw.cola.dao.mapper;

import com.zgw.cola.dao.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    public CustomerDO getById(String customerId);
}
