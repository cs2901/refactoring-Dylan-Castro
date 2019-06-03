public double getPayAmount() {
  double result;
  if (isDead){
    return deadAmount();
  }
  if(isSeparated){
      return separatedAmount();
  }
  else if(isRetired){
        return separatedAmount();
        }

  return normalPayAmount();
}