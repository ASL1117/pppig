package com.pppig.mgtt.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="a")
@Data
public class A implements Serializable{

	@Id
	private Integer id;//ID

	private String version;//版本号
	private String tx_code;//交易代码
	private String inst_code;//机构代码
	private String bank_code;//银行代码
	private String tx_date;//交易日期
	private String tx_time;//交易时间
	private Integer seq_no;//交易流水号
	private String channel;//交易渠道
	private Long account_id;//电子账号
	private Long product_desc;//标的号
	private String raise_date;//募集日
	private String raise_end_date;//募集结束日期
	private String int_type;//付息方式
	private String int_pay_day;//利息每月支付日
	private Integer duration;//借款期限(天数,从满标日期开始计算)
	private Double tx_amout;//借款金额
	private Double rate;//年化利率(百分比)
	private Long tx_fee;//平台手续费
	private Long bail_accountld;//担保电子账户
	private Long nominal_account_id;//名义借款人电子账户（不用）
	private Long acq_res;//请求方保留

}
