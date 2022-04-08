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
  int v = std::get<0>(data);
  int **g = std::get<1>(data);

  Graph *graph = new Graph(v);
  graph->transMatrix(g);
  graph->print();
  std::vector<int> path = graph->findEuler(0);

  if (path.empty()) {
    std::cout << "No Euler path exists\n";
    return;
  } else
    std::cout << "Euler path exists\n";

  for (auto i = path.begin(); i < path.end() - 1; i++)
    std::cout << *i << " -> ";
  std::cout << path.back() << '\n';

  delete graph;
  for (int i = 0; i < v; i++)
    delete[] g[i];
  delete[] g;
}

int main() {
  execute();
  return 0;
}