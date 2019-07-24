package com.pppig.mgtt.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="loan")
@Data
public class Loan implements Serializable{

	@Id
	private Integer loan_id;//标编号

	private BigDecimal amount;//总额
	private String title;//借款标题
	private Integer borrower_id;//借款人userid
	private String borrower_nickname;//借入者昵称
	private Integer borrow_type;//借款用途，定义见LoanDef.BORROW_TYPE
	private String description;//
	private BigDecimal annual_Integererest_rate;//年化利率
	private BigDecimal max_annual_Integererest_rate;//年化利率区间上限
	private BigDecimal min_annual_Integererest_rate;//年化利率区间下限
	private Integer termCount;//还款周期数量，此字段和termUnit共同描述一个标的周期
	private Integer termUnit;//还款周期单位，见com.zkbc.core.consts.LoanDef
	private Integer minInvestUnit;//最小流转单位
	private java.util.Date nextRepayDate;//下一个还款日期，冗余
	private Integer repayedTermCount;//
	private BigDecimal biddingAmount;//目前已投标的金额
	private Integer repayType;//还款方式。目前此字段无实际作用，暂规定其值与ProductId一致
	private java.util.Date createTime;//标建立的时间，也就是借款者填写借款金额，期限后，提交的时间
	private java.util.Date submitTime;//标提交给审核的时间
	private java.util.Date openTime;//开标时间
	private java.util.Date openEndTime;//招标结束时间，如果标开放期限是7天，则此值即openTime+7天
	private java.util.Date fullTime;//满标时间
	private java.util.Date releaseTime;//放标时间
	private java.util.Date endTime;//最后一期还款时间
	private Long overDued;//是否逾期过
	private Integer viewCount;//被浏览的次数
	private Integer isStateOwnedEnterpriseGuarantee;//是否国企担保
	private Integer timeOut;//是否自动发标
	private Integer recommendWeight;//推荐权重
	private Integer status;//状态码，重要
	private BigDecimal startFeeRate;//开始的一次性费用百分比
	private BigDecimal monthFeeRate;//每月费用百分比
	private BigDecimal IntegererestFeeRate;//利息扣除百分比
	private Integer albumCapacity;//标相册容量，单位：MB。此标下所有照片的size加起来不能大于此
	private Integer auditorId;//当前此标的审贷员的id，对应staff表的staffId
	private Integer loanPortraitId;//标头像图片的id
	private String loanPortraitPath;//标头像图片的路径
	private Integer productId;//产品id，参考com.zkbc.core.consts.LoanDef.ProductId
	private String contractNo;//合同编号
	private Integer dealStatus;//用户处理结果：0未处理 ，1、同意 ，2、拒绝
	private String loanCode;//
	private BigDecimal totalFee;//
	private BigDecimal monthMoney;//
	private Integer loanType;//类型 1-个人标 2- 企业标
	private BigDecimal loanAmount;//金额
	private BigDecimal beginAmount;//起投金额
	private BigDecimal increaseAmount;//递增金额
	private Integer loanProductId;//
	private String creditDegree;//
	private Integer assureId;//
	private Integer recordnum;//
	private String loanSignType;//标的类型
	private BigDecimal upperLimitMoney;//最高限购额
	private Integer ifOrNotCoupon;//是否可用加息券
	private Integer ifOrNotCouponJx;//
	private BigDecimal annualIntegererestRateYs;//原始利率
	private BigDecimal annualIntegererestRateJx;//加息利率
	private Integer returnMoney;//是否反现:0否 1是
	private String vipUserId;//vip标投资人电话
	private Integer ifOrNotSyncBjp2p;//是否同步网贷协会数据
	private String loanNumber;//标的编号
	private Integer ifOrNotSyncSky;//是否推送网贷天眼 0否  1是
	private Integer extraRates;//是否贴息 0否  1是
	private Integer repayAhead;//是否开启提前还款
	private String beishu;//体验金倍数
	private Integer isCreditEnd;//是否结束债权
}
