public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
  }

  public char charAt(int index){
    if(index < 0 || index >= length()){
      throw new IndexOutOfBoundsException("index cannot be negative or not less than length()");
    }
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
    if(start < 0 || end < 0 || end > length() || start > end){
      throw new IndexOutOfBoundsException("starting or ending index cannot be negative.
      ending index cannot be greater than length(). starting index cannot be greater than ending index.");
    }
    String sub = "";
    for(int i = start; i < end; i++){
      sub+=data[i];
    }
    return sub;
  }
  public String toString(){
    return subSequence(0, data.length);
  }
}
