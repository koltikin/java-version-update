package com.cydeo.generic_tasks.Task5;

public class Test {
}

class Shape {}
class Circle extends Shape {}
class Rectangle extends Shape {}

class Node<T> {}

//Node<Circle> nc = new Node<>();
//Node<Shape> ns = nc;

//  Given the following classes:
//  class Shape { /* ... */ }
//  class Circle extends Shape { /* ... */ } class Rectangle extends Shape { /* ... */ } class Node<T> { /* ... */ }
//  Will the following code compile? If not, why?
//  Node<Circle> nc = new Node<>(); Node<Shape> ns = nc;