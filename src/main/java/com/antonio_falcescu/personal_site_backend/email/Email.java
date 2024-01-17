package com.antonio_falcescu.personal_site_backend.email;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Email {
    private String email;
    private String subject;
    private String content;
}
