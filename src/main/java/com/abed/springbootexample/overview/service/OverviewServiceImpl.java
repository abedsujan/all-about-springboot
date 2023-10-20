package com.abed.springbootexample.overview.service;

import com.abed.springbootexample.overview.model.OverviewEnvelop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OverviewServiceImpl implements OverviewService{


    public OverviewEnvelop getSummary(){
       return OverviewEnvelop.builder().build();
    }
}
