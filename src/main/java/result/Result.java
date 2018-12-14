package result;

public class Result {

  private String fromDate;
  private String toDate;
  private Long daysBetween;

  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public Long getDaysBetween() {
    return daysBetween;
  }

  public void setDaysBetween(Long daysBetween) {
    this.daysBetween = daysBetween;
  }
}
