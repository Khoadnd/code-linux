#include "Graph.h"
#include <iostream>
#include <stack>
#include <unordered_map>

Graph::Graph() : v(0), e(0), g(nullptr) {}

Graph::Graph(int v, int e) : v(v), e(e) {
  g = new std::vector<std::tuple<int, int>>(e);
  g->clear();
}

Graph::Graph(int v, int e, int **graph) : v(v), e(e) {
  g = new std::vector<std::tuple<int, int>>(e);
  g->clear();
  this->trans(graph);
}

Graph::~Graph() { delete this->g; }

void Graph::trans(int **g) {
  for (int i = 0; i < v; i++)
    for (int j = 0; j < v; j++)
      if (g[i][j] == 1)
        this->g->push_back(std::make_tuple(i, j));
}

void Graph::printGraph() {
  for (auto const i : *g)
    std::cout << std::get<0>(i) << " " << std::get<1>(i) << std::endl;
}

std::tuple<bool, int, int> Graph::hasEuler() {
  std::vector<int> *in = new std::vector<int>(v);
  std::vector<int> *out = new std::vector<int>(v);

  for (auto const &i : *g) {
    in->at(std::get<0>(i))++;
    out->at(std::get<1>(i))++;
  }

  /*
    b. nhieu nhat 1 dinh co so canh vao = so canh ra + 1
    a. nhieu nhat 1 dinh co so canh ra = so canh vao + 1
    c. tat ca cac canh con lai co so canh vao = so canh ra
  */

  bool a = false, b = false;
  int an = 0, bn = 0;
  for (int i = 0; i < this->v; i++)
    if (out->at(i) != in->at(i)) {
      if (!a && out->at(i) == in->at(i) + 1) {
        a = true;
        an = i;
      } else if (!b && in->at(i) == out->at(i) + 1) {
        b = true;
        bn = i;
      } else {
        delete in, out;
        return std::make_tuple(false, 0, 0);
      }
    }
  delete in, out;
  return std::make_tuple(true, an, bn);
}

void Graph::addEdge(int w1, int w2) {
  this->g->push_back(std::make_tuple(w1, w2));
}

void Graph::findEuler(int start) {
  std::tuple<bool, int, int> result = this->hasEuler();

  if (!std::get<0>(result)) {
    std::cout << "Do thi khong euler" << std::endl;
    return;
  }

  this->addEdge(std::get<1>(result), std::get<2>(result));

  // Thuat toan Hierholzer
  std::unordered_map<int, int> edgeCount;
  std::vector<int> *in = new std::vector<int>(this->v);
  std::vector<int> *out = new std::vector<int>(this->v);

  for (auto const &i : *g) {
    in->at(std::get<0>(i))++;
    out->at(std::get<1>(i))++;
  }

  for (int i = 0; i < v; i++)
    edgeCount[i] = in->at(i) + out->at(i);

  std::stack<int> currentPath;
  std::vector<int> Path;

  currentPath.push(start);
  int currentV = start;

  while (!currentPath.empty()) {
    if (edgeCount[currentV]) {
      currentPath.push(currentV);
      int nextV = currentV = nextV;
    } else {
      Path.push_back(currentV);
      currentV = currentPath.top();
      currentPath.pop();
    }
  }

  for (int i = 0; i < Path.size(); i++) {
    if (i == Path.size() - 1)
      std::cout << Path[i] << std::endl;
    else
      std::cout << Path[i] << " ";
  }
}