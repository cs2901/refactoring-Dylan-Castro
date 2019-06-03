void renderBanner() {
    final boolean condition1 = (platform.toUpperCase().indexOf("MAC") > -1);
    final boolean condition2 = (browser.toUpperCase().indexOf("IE") > -1);
    final boolean condition4 = resize > 0;
  if (condition1 &&
        condition2 &&
        wasInitialized() && condition4 )
  {
    // do something
  }
}