import java.util.*;

class BasicArray{
  int[] ray = new int[10];
  public BasicArray(){
    for(int x = 0;x < 10; x++){//filling array
      ray[x] = x;
    }
    demo();
  }
  public void demo(){
    System.out.println("Basic Array:");
    for(int element : ray){//cool way of going through arrays
      System.out.println(element);
    }
  }
}

class TwoDArray{
  public int[][] numbers = new int[3][3];
  public TwoDArray(){
    for(int x = 0; x < 3; x++){
      for(int y = 0; y < 3; y++){
        numbers[x][y] = x*y;
      }
    }
    demo();
  }
  public void demo(){
    System.out.println("Two Dimensional Array:");
    for(int[] row : numbers){
      for(int element : row){
        System.out.println(element);
      }
    }
  }
}

class ArrList{
  public List<Integer> nums = new ArrayList<Integer>();
  public ArrList(){
    for(int x = 0; x < 10; x++){
      nums.add(x);
    }
    demo();
  }
  public void demo(){
    System.out.println("Array List:");
    for(Integer num : nums){
      System.out.println(num);
    }
  }
}

class DataStructures{
  public DataStructures(){
    System.out.println("Data Structures Baby");
    BasicArray b = new BasicArray();
    TwoDArray t =  new TwoDArray();
    ArrList a = new ArrList();
  }
}