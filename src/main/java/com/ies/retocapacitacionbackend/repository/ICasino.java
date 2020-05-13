package com.ies.retocapacitacionbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ies.retocapacitacionbackend.model.Casino;

@Repository	
public interface ICasino extends CrudRepository <Casino, Long>{

}
