public int close10(int a, int b) {
  int diffa= Math.abs(10-a);
  int diffb= Math.abs(10-b);
  if(diffa<diffb){
    return a;
  } else if(diffb<diffa){
    return b;
  } else{
    return 0;
  }
}

