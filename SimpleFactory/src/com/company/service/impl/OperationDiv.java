package com.company.service.impl;

import com.company.model.Operation;
import com.company.service.OperationService;

public class OperationDiv implements OperationService {

  @Override
  public double getResult( Operation operation) throws Exception {
    if (operation.getNumberB()==0){
      throw new Exception("除数不能为0。");
    }
    return operation.getNumberA()/operation.getNumberB();
  }
}
