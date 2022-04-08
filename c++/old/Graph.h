#pragma once
#include <tuple>
#include <vector>

class Graph {
  int v;
  int e;
  std::vector<std::tuple<int, int>> *g;

public:
  Graph();
  Graph(int, int);
  Graph(int, int, int **);
  ~Graph();

  void trans(int **);
  void printGraph();
  std::tuple<bool, int, int> hasEuler();
  void addEdge(int, int);
  void findEuler(int = 0);
};