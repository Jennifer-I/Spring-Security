package com.jennifer.sbank.services;


import com.jennifer.sbank.dto.RegistrationRequest;
import com.jennifer.sbank.dto.RegistrationResponseDto;
import com.jennifer.sbank.utils.ApiResponse;

public interface UserService {
    ApiResponse<RegistrationResponseDto> registerCustomer(RegistrationRequest registrationRequest);
}
