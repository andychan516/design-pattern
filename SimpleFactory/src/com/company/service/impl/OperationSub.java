package com.company.service.impl;

import com.company.model.Operation;
import com.company.service.OperationService;

public class OperationSub implements OperationService {

  @Override
  public double getResult( Operation operation) {
    return operation.getNumberA()-operation.getNumberB();
  }
}
