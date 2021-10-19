package com.prabhalearning.expensetrackerapi.repositories;
import com.prabhalearning.expensetrackerapi.domain.User;
import com.prabhalearning.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById(Integer userId);
}
