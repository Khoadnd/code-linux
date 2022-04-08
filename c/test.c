#include <stdio.h>

typedef struct {
  int a[2];
  double d;
} struct_t;

double fun(int i) {
  volatile struct_t s;
  s.d = 3.14;
  s.a[i] = 1073741824;
  return s.d;
}

int main() {
  printf("%f", fun(0));
  printf("%f", fun(1));
  printf("%f", fun(2));
  printf("%f", fun(3));
  printf("%f", fun(4));
  printf("%f", fun(5));
  printf("%f", fun(6));

  return 0;
}