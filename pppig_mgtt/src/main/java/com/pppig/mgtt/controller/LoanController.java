package com.pppig.mgtt.controller;

import com.pppig.mgtt.pojo.AddLoan;
import com.pppig.mgtt.pojo.AddLoanResponse;
import com.pppig.mgtt.pojo.Loan;
import com.pppig.mgtt.service.LoanService;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping("/loanList")
    @ResponseBody
    public List<Loan> loanList(){
        return loanService.loanList();
    }

    @PostMapping("/addLoan")
    public void addLoan(@RequestBody AddLoan a) throws IOException {
        CloseableHttpClient closeHttpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;

        String url="http://10.1.68.21:9082/user/accountOpen";
        //POST的URL
        HttpPost httpPost = new HttpPost(url);

        // httpPost.setEntity();
        httpPost.setEntity(new UrlEncodedFormEntity((Iterable<? extends NameValuePair>) a, Consts.UTF_8));
        closeHttpClient.execute(httpPost);

        //loanService.addLoan(loan);
    }

    @PostMapping("/addLoanCallBack")
    @ResponseBody
    public String addLoanCallBack(@RequestBody AddLoanResponse addLoanResponse){
        if (addLoanResponse.getRetCode().equals("000000")){
            System.out.println(addLoanResponse.getRetCode());
            //loanService.addAccountId();
        }
        return "success";
    }
}
