class DataTypes{
  //primative
  public  char character;
  public int num1;//2 billion to -2 billion
  public long num2;//3*10^7 bigger range than int
  public float num3;//7 decimal places
  public double num4;//16 decimal places
  //non primative
  String hello = "Hi";
  Integer num5 = 5;
  public DataTypes(){
    character = 'h';//can also be a numerical, hex, binary value in UTF-16 characterset
    num1 = 4;
    num2 = 2;
    num3 = 2.21f;
    num4 = 8.01;
    System.out.println();
    Demo();
  }
  public void Demo(){
    System.out.println(character);
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(hello);
  }
}
/*
Primative no built in methods or attributes for data type
*/