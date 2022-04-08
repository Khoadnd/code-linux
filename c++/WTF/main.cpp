
#define inFile "graph.txt"
#define outFile "result.txt"
#define maxN 99

#include <fstream>
#include <iostream>
#include <vector>

std::fstream file;
unsigned int _data[maxN][maxN];
unsigned int n;

void read() {
  file.open(inFile, std::ios::in);
  file >> n;
  if (n > maxN)
    throw "Exceeded limit";

  for (unsigned int i = 0; i < n; i++)
    for (unsigned int j = 0; j < n; j++)
      file >> _data[i][j];

  file.close();
}

void print() {
  file.open(outFile, std::ios::out);
  for (unsigned int i = 0; i < n; i++) {
    for (unsigned int j = 0; j < n; j++)
      file << _data[i][j] << ' ';
    file << '\n';
  }

  file.close();
}

unsigned int solve(unsigned int x, unsigned int y) {
  while (nextX)
    unsigned int nextX, nextY;
  if (_data[nextX + 1][nextY] < _data[nextX][nextY + 1])
    nextX++;
  else
    nextY++;
}

int main() {
  read();
  print();

  n--;
  unsigned int result = solve(0, 0);
  n++;

  std::cout << result;

  return 0;
}
