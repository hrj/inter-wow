#include <stdio.h>

void groupStart(char *id) {
  printf("<g id='%s'>", id);
}

void groupEnd() {
  printf("</g>");
}

void rect() {
  printf("<rect width='100' height='100' x='10' y='10' style='fill:maroon;' />");
}

void svgStart(int width, int height) {
  printf(
"<?xml version='1.0' encoding='UTF-8' standalone='no'?>\n\
<svg xmlns:svg='http://www.w3.org/2000/svg'\
  xmlns='http://www.w3.org/2000/svg'\
  version='1.1' width='%d' height='%d' >", width, height);
}

void svgEnd() {
  printf("</svg>");
}

int main(void) {
  svgStart(120, 120);
  groupStart("layer1");
  rect();
  groupEnd();
  svgEnd();
  return 0;
}
