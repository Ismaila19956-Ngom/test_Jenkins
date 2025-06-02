package com.ngom.dev.niit.sn.jenkins.domains.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HttpResponse implements Serializable {
    private String time;
    private int code;
    private String path;
    private HttpStatus status;
    private String message;
    private String exception;
    private Map<?, ?> data;
}
