class Student extends Person{
  private int[] testScores;
  Student(String fn, String ln, int id, int[] testScores){
    super(fn,ln,id);
    this.testScores = testScores;
  }
  public char calculate(){
    int res = 0;
    for(int i=0; i<testScores.length;i++){
      res = res + testScores[i];
    }
    int avg = res/testScores.length;
    char[] arr = {'O','E','A','P','D','T'};
    if(avg>=90 && avg<=100){
      return arr[0];
    }else if(avg>=80 && avg<90){
      return arr[1];
    }else if(avg>=70 && avg<80){
      return arr[2];
    }else if(avg>=55 && avg<70){
      return arr[3];
    }else if(avg>=40 && avg<50){
      return arr[4];
    }else{
      return arr[5];
    }
  }
}
