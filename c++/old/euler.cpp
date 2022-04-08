#include "Graph.h"
#include <fstream>
#include <iostream>
#include <tuple>

// References:
// https://math.stackexchange.com/questions/1871065/euler-path-for-directed-graph

std::tuple<int, int **> getDataFromFile() {
  std::ifstream read;
  read.open("Graph.txt");

  int v, **g = nullptr;
  read >> v;

  g = new int *[v];
  for (int i = 0; i < v; i++)
    g[i] = new int[v];

  for (int i = 0; i < v; i++)
    for (int j = 0; j < v; j++)
      read >> g[i][j];
  read.close();
  return std::make_tuple(v, g);
}

void execute() {
  std::tuple<int, int **> data = getDataFromFile();

  Graph *graph =
      new Graph(std::get<0>(data), std::get<0>(data) * std::get<0>(data),
                std::get<1>(data));
  graph->findEuler();
}

int main() {
  execute();

  return 0;
}