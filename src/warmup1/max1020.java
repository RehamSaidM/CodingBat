public int max1020(int a, int b) {
  boolean aRange= a>=10 && a<=20;
  boolean bRange= b>=10 && b<=20;
  
  if(aRange&& bRange){
    return Math.max(a,b);
  }else if(aRange){
    return a;
  }else if(bRange){
    return b;
  }else {
    return 0;
  }
}
