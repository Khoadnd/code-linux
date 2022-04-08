#pragma once
#include <vector>

class Graph {
  int v;
  std::vector<int> in;
  std::vector<std::vector<int>> g;

public:
  Graph();
  Graph(int);
  Graph(const Graph &);
  ~Graph();

  void addEdge(int, int);
  void print() const;
  void transMatrix(int **);

  void dfs(int, std::vector<bool> &) const;
  bool isConnected() const;
  bool isEuler() const;
  std::vector<int> findEuler(int = 0) const;
  Graph getUndirected() const;
};