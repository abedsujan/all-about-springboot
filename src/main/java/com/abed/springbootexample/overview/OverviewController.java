package com.abed.springbootexample.overview;

import com.abed.springbootexample.overview.model.OverviewEnvelop;
import com.abed.springbootexample.overview.service.OverviewService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/dk/external")
@Tag(name="overview", description = "Account and Holdings overview of a client")
public class OverviewController {

    private final OverviewService overviewService;

    @GetMapping(value = "overview/{customerId}")
    public ResponseEntity<OverviewEnvelop> getOverview(@PathVariable String customerId,
                                                       @RequestParam(name="useCache", defaultValue = "true") boolean useCache){
        return ResponseEntity.ok(overviewService.getSummary());
    }

}
