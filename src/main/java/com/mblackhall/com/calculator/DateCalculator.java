package com.mblackhall.com.calculator;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

@Component
public class DateCalculator {

  public long daysBetween(LocalDate fromDate, LocalDate toDate) {
    return DAYS.between(fromDate, toDate);
  }
}
