package com.abed.springbootexample.internal;

import com.abed.springbootexample.internal.Service.UserService;
import com.abed.springbootexample.internal.model.UserDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/dk/internal")
@PreAuthorize("hasAuthority('admin_user')")
@Tag(name="internal", description = "all internal endpoints for verification")
public class InternalController {

    private final UserService userService;

    @GetMapping(value = "profile/{userId}")
    public ResponseEntity<UserDTO> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserDetails());
    }

}
