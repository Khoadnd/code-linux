#include "Graph.h"
#include <iostream>
#include <stack>
#include <unordered_map>

Graph::Graph() : v(0) {}

Graph::Graph(int v) : v(v) {
  in.resize(v);
  g.resize(v);
}

Graph::Graph(const Graph &graph) {
  this->v = graph.v;
  this->g = graph.g;
  this->in = graph.in;
}

Graph::~Graph(){};

void Graph::transMatrix(int **g) {
  for (int i = 0; i < v; i++)
    for (int j = 0; j < v; j++)
      if (g[i][j] == 1) {
        this->g[i].push_back(j);
        in[j]++;
      }
}

void Graph::print() const {
  for (int i = 0; i < v; i++) {
    std::cout << i << ": ";
    for (auto const j : g[i])
      std::cout << j << " ";
    std::cout << '\n';
  }
}

std::vector<int> Graph::findEuler(int start) const {
  if (!this->isEuler())
    return std::vector<int>();
  Graph graph(*this);
  std::unordered_map<int, int> edgeCount;
  for (int i = 0; i < graph.g.size(); i++)
    edgeCount[i] = graph.g[i].size();

  std::stack<int> currentPath;
  std::vector<int> path;

  currentPath.push(start);
  int currentV = start;

  while (!currentPath.empty()) {
    if (edgeCount[currentV]) {
      currentPath.push(currentV);
      int nextV = graph.g[currentV].back();
      edgeCount[currentV]--;
      graph.g[currentV].pop_back();
      currentV = nextV;
    } else {
      path.push_back(currentV);
      currentV = currentPath.top();
      currentPath.pop();
    }
  }

  return path;
}

void Graph::addEdge(int w1, int w2) {
  g[w1].push_back(w2);
  in[w2]++;
}

bool Graph::isEuler() const {
  /*
    b. nhieu nhat 1 dinh co so canh vao = so canh ra + 1
    a. nhieu nhat 1 dinh co so canh ra = so canh vao + 1
    c. tat ca cac canh con lai co so canh vao = so canh ra
  */

  bool a = false, b = false;
  int an = 0, bn = 0;
  for (int i = 0; i < this->v; i++) {
    int out = g[i].size();
    int in = this->in[i];
    if (in != out) {
      if (!a && out == in + 1) {
        a = true;
        an = i;
      } else if (!b && in == out + 1) {
        b = true;
        bn = i;
      } else {
        return false;
      }
    }
  }
  return this->getUndirected().isConnected();
}

void Graph::dfs(int v, std::vector<bool> &visited) const {
  visited[v] = true;
  for (auto const i : g[v])
    if (!visited[i])
      dfs(i, visited);
}

bool Graph::isConnected() const {
  std::vector<bool> visited(v, false);

  for (int i = 0; i < v; i++)
    if (g[i].size())
      dfs(i, visited);

  for (int i = 0; i < v; i++)
    if (!visited[i] && g[i].size())
      return false;

  return true;
}

Graph Graph::getUndirected() const {
  Graph g(this->v);
  for (int i = 0; i < this->v; i++)
    for (auto const j : this->g[i]) {
      g.addEdge(j, i);
      g.addEdge(i, j);
    }
  return g;
}