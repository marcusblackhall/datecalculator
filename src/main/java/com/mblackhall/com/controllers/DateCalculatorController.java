package com.mblackhall.com.controllers;

import com.mblackhall.com.calculator.DateCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import result.Result;

import java.time.LocalDate;

@RestController
public class DateCalculatorController {

  @Autowired private DateCalculator dateCalculator;

  @GetMapping(name = "/daysBetween")
  public Result daysBetween(
      @RequestParam(name = "fromDate") String fromDate,
      @RequestParam(name = "toDate") String toDate) {
    long daysBetween =
        dateCalculator.daysBetween(LocalDate.parse(fromDate), LocalDate.parse(toDate));
    Result result = new Result();
    result.setFromDate(fromDate);
    result.setToDate(toDate);
    result.setDaysBetween(daysBetween);
    return result;
  }
}
