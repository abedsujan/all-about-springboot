package com.abed.asyncrestcall.overview;

import com.abed.asyncrestcall.overview.model.OverviewEnvelop;
import com.abed.asyncrestcall.overview.service.OverviewService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/dk/external")
//@PreAuthorize("hasAuthority('admin_user')")
@Tag(name = "overview", description = "Account and Holdings overview of a client")
public class OverviewController {

    private final OverviewService overviewService;

    @GetMapping(value = "overview/{customerId}")
    public ResponseEntity<OverviewEnvelop> getOverview(
            @Parameter(example = "11223344")
            @PathVariable String customerId,
            @Parameter(description = "Date is used to filter")
            @RequestParam(name = "date") @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate date,
            @Parameter(description = "Uses cache per default, set to false if need to get latest update")
            @RequestParam(name = "useCache", defaultValue = "true") boolean useCache) {

        return ResponseEntity.ok(overviewService.getSummary(
                OverviewQuery.builder()
                        .customerId(customerId)
                        .userCache(useCache)
                        .build()
        ));
    }

}
