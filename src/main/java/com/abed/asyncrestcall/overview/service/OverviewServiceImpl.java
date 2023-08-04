package com.abed.asyncrestcall.overview.service;

import com.abed.asyncrestcall.overview.OverviewQuery;
import com.abed.asyncrestcall.overview.model.OverviewEnvelop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OverviewServiceImpl implements OverviewService{


    public OverviewEnvelop getSummary(OverviewQuery overviewQuery){
       return OverviewEnvelop.builder().build();
    }
}
