double disabilityAmount() {
    final boolean seniority_condition = seniority < 2;
    final boolean monthsDisabled_condition = monthsDisabled > 12;

    if (seniority_condition || monthsDisabled_condition || isPartTime){
        return 0;
        }
  /*if (seniority < 2) {
    return 0;
  }
  if (monthsDisabled > 12) {
    return 0;
  }
  if (isPartTime) {
    return 0;
  }*/
  // Compute the disability amount.
  // ...
}