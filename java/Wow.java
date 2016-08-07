package hrj.interwow;

public class Wow {
  private static String svg(int width, int height, String n) {
    return
      "<svg xmlns:svg='http://www.w3.org/2000/svg'  xmlns='http://www.w3.org/2000/svg'  version='1.1' width='"+width+"' height='"+height+"' >" +
      n +
      "</svg>";
  }

  private static String group(String n) {
    return "<g id='layer1'>"+n+"</g>";
  }

  private static String rect() {
    return "<rect width='100' height='100' x='10' y='10' style='fill:maroon;' />";
  }


  public static void main(String args[]) {
    System.out.println("<?xml version='1.0' encoding='UTF-8' standalone='no'?>");
    System.out.println(
        svg(120, 120,
          group(
            rect()
            )
          )
        );
  }
}
