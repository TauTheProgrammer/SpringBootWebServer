package com.tau.rest.journal;

import com.tau.beans.EmotionalRecord;
import org.springframework.web.bind.annotation.*;

@RestController
public class JournalRestService {

    // TODO: Make every string literal a constant
    @PostMapping("/journal")
    @CrossOrigin(origins = "http://localhost:3000")
    public void addJournalEntry(@RequestBody EmotionalRecord emotionalRecord) {
        System.out.println("");
    }
}
