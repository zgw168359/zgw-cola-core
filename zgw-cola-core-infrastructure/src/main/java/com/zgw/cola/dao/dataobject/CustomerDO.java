package com.zgw.cola.dao.dataobject;

import lombok.Data;

@Data
public class CustomerDO {
    private String customerId;
    private String memberId;
    private String globalId;
    private long registeredCapital;
    private String companyName;
}
