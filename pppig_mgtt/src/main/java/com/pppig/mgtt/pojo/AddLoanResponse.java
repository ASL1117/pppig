package com.pppig.mgtt.pojo;

import lombok.Data;

/**
 * 开户，银行响应参数
 * @author ASL
 */
@Data
public class AddLoanResponse {
    private String version; // 版本号
    private String txCode; // 交易代码
    private String instCode; // 机构代码
    private String bankCode; // 银行代码
    private String txDate; // 交易日期
    private String txTime; // 交易时间
    private Integer seqNo; // 交易流水号
    private String channel; // 交易渠道
    private String retCode; // 响应代码
    private String retMsg; // 响应描述
    private String accountId; // 电子账号
    private String acqRes; // 请求方保留
}
