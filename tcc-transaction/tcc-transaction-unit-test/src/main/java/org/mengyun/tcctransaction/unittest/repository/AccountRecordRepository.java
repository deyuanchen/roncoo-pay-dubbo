/*
 * ====
 * 陈德元：



 * ====
 */
package org.mengyun.tcctransaction.unittest.repository;

import org.mengyun.tcctransaction.unittest.entity.AccountRecord;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * 账户记录库.
 * Created by  on 12/3/15.
 */
@Repository
public class AccountRecordRepository {

    private Map<Long, AccountRecord> accountRecordMap = new HashMap<Long, AccountRecord>();

    {
    	/* 初始化3个账户：余额为0 **/
        accountRecordMap.put(1L, new AccountRecord(1, 0));
        accountRecordMap.put(2L, new AccountRecord(2, 0));
        accountRecordMap.put(3L, new AccountRecord(3, 0));
    }

    /** 根据ID获取账户信息 **/
    public AccountRecord findById(Long id) {
        return accountRecordMap.get(id);
    }
}
