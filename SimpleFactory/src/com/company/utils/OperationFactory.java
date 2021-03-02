package com.company.utils;

import com.company.service.OperationService;
import com.company.service.impl.OperationAdd;
import com.company.service.impl.OperationDiv;
import com.company.service.impl.OperationMul;
import com.company.service.impl.OperationSub;

public class OperationFactory {

  public static OperationService createOperation(String operation){
    OperationService operationService=null;
    switch (operation) {
      case "+":
         operationService=new OperationAdd();
         break;
      case "-":
        operationService=new OperationSub();
        break;
      case "*":
        operationService=new OperationMul();
        break;
      case "/":
        operationService=new OperationDiv();
        break;
    }
    return operationService;
  }

}
