public class Main{
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    double defaultDouble;
    float defaultFloat;
    char defaultChar;
    String defaultString;
    boolean defaultBoolean;
    public static void main(String[] args){
  
      Main r= new Main();
      System.out.println((Datatype.BYTE.ordinal() +1)+"default value of Byte"+r.defaultByte);
      System.out.println((Datatype.SHORT.ordinal() +1)+"default value of short"+r.defaultShort);
      System.out.println("default value of int"+r.defaultInt);
      System.out.println("default value of double"+r.defaultDouble);
      System.out.println("default value of float"+r.defaultFloat);
      System.out.println("default value of char"+r.defaultChar);
      System.out.println("default value of string"+r.defaultString);
      System.out.println("default value of boolean"+r.defaultBoolean);


    }
    enum Datatype {
    BYTE,
    SHORT,
    INT,
    DOUBLE,
    FLOAT,
    CHAR,
    STRING,
    BOOLEAN
}
}