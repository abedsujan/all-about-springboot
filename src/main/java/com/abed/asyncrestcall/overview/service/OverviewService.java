package com.abed.asyncrestcall.overview.service;

import com.abed.asyncrestcall.overview.OverviewQuery;
import com.abed.asyncrestcall.overview.model.OverviewEnvelop;

public interface OverviewService {
    /*
    *
    * */
    OverviewEnvelop getSummary(OverviewQuery overviewQuery);
}
