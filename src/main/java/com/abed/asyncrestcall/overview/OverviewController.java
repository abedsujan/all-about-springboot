package com.abed.asyncrestcall.overview;

import com.abed.asyncrestcall.overview.model.OverviewEnvelop;
import com.abed.asyncrestcall.overview.service.OverviewService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/dk/external")
//@PreAuthorize("hasAuthority('admin_user')")
@Tag(name="overview", description = "Account and Holdings overview of a client")
public class OverviewController {

    private final OverviewService overviewService;

    @GetMapping(value = "overview/{customerId}")
    public ResponseEntity<OverviewEnvelop> getOverview(@PathVariable String customerId,
                                                       @RequestParam(name="useCache", defaultValue = "true") boolean useCache){
        return ResponseEntity.ok(overviewService.getSummary());
    }

}
