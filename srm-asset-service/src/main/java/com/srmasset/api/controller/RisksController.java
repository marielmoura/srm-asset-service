package com.srmasset.api.controller;

import com.srmasset.api.model.Risk;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("risks")
public class RisksController {

    @GetMapping()
    public Risk[] getAll() {
        return Risk.values();
    }

}
