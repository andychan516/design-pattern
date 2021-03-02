package com.company.test;

import com.company.model.Operation;
import com.company.service.OperationService;
import com.company.utils.OperationFactory;

public class Test {
  public static void main(String[] args) throws Exception {
    Operation operation=new Operation();
    operation.setNumberA(5);
    operation.setNumberB(3);
    OperationService operationService=OperationFactory.createOperation("a/");
    double result = operationService.getResult(operation);
    System.out.println(result);
  }
}
