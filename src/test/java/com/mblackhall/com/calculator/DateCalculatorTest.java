package com.mblackhall.com.calculator;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DateCalculatorTest {

  @Test
  public void shouldCalculateDaysInJanuaryAs31() {

    assertEquals(
        31,
        new DateCalculator()
            .daysBetween(LocalDate.parse("2017-12-31"), LocalDate.parse("2018-01-31")));
  }
}
