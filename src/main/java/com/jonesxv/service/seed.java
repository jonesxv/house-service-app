package com.jonesxv.service;

import com.jonesxv.service.company.Company;
import com.jonesxv.service.company.CompanyRepository;
import com.jonesxv.service.user.User;
import com.jonesxv.service.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class seed implements CommandLineRunner {
    private UserRepository userRepository;
    private CompanyRepository companyRepository;

    public seed(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
    @Override
    public void run(String... arg0) throws Exception {
        User james = new User("James","Milner","j@j.com");
        userRepository.save(james);

        Company help = new Company("Help You");
        companyRepository.save(help);
    }
}
