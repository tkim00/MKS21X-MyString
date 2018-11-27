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
    return subSequence(0, data.length);//this is taking the subSequence of the data as a whole.
  }
  public int compareTo(CharSequence o){
    if(o == null){
      throw new NullPointerException("the specified object cannot be null.");
    }
    //if()
    if(this.equals(o)){
      return 0;
    }
    int smaller = 0;
    if(length() < o.length()){
      smaller = length();
    }else{
      smaller = o.length();
    }
    for(int i = 0; i < smaller; i++){
      if(this.charAt(i) != o.charAt(i)){
        return this.charAt(i) - o.charAt(i);
      }
    }
    return length() - o.length();
  }
}
