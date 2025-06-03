package com.ngom.dev.niit.sn.jenkins;

import com.ngom.dev.niit.sn.jenkins.controller.EtudiantController;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import jakarta.persistence.EntityListeners;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@EntityListeners(AuditingEntityListener.class)
public class TestJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
    }

}
