package com.pppig.mgtt.service.impl;

import com.pppig.mgtt.mapper.LoanMapper;
import com.pppig.mgtt.pojo.Loan;
import com.pppig.mgtt.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanMapper loanMapper;

    public List<Loan> loanList(){
        return loanMapper.selectAll();
    }

    @Override
    public void addLoan(Loan loan) {

    }
}
