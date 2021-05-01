public static Mathe2 {
	public static boolean isPrimLoop(int p){
    if(p < 2){
      return false;
    }
    for(int i = 2; i < p; ++i){
      if(p % i == 0){
        return false;
      }
    }
    return true;
  }

  public static boolean isPrimRek(int p){
    return isPrimeRekCheck(p, 3);
  }

  private static boolean isPrimeRekCheck(int p, int c){
    if (p < 2) {
      return false;
    }

    if (p % 2 == 0) {
      return (p == 2);
    }

    if (c >= p){
      return true;
    }

    if (p % c == 0) {
      return false;
    }

    return isPrimeRekCheck(p, c + 1);
  }
}