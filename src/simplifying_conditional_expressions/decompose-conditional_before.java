void IsSummer(){
    if(date.after(SUMMER_END) || date.before(SUMMER_START)){
        return false;
        }
    return true;
        }
if (IsSummer) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}