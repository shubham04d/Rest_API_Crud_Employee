package com.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rest.models.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
