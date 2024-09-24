package com.testwebsite.testwebsite.run;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty String title,

        LocalDateTime startedOn,
        LocalDateTime endedOn,
        @Positive Integer miles,
        Location location
) {
    public Run
    {
        if(!endedOn.isAfter(startedOn))
        {
            throw new IllegalArgumentException("The started on is after the ended on");
        }
    }
}