void printDetails(){
        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
}
void printOwing() {
  printBanner();
  printDetails();
}