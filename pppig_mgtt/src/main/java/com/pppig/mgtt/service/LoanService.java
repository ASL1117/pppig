package com.pppig.mgtt.service;

import com.pppig.mgtt.pojo.Loan;

import java.util.List;

public interface LoanService {

    /**
     * 查询所有标的信息
     * @return 标的列表
     */
    List<Loan> loanList();

    /**
     * 录入一个标的
     * @param loan 标的信息
     */
    void addLoan(Loan loan);
}
