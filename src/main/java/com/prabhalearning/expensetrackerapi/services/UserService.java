package com.prabhalearning.expensetrackerapi.services;

import com.prabhalearning.expensetrackerapi.domain.User;
import com.prabhalearning.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {
    User validateUSer(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
 }
