package com.example.project;

public class PQElement<T> {
    public T data;
    public int p;
    int priority;

    public PQElement(T e, int prt){
        data=e;
        p=prt;
    }

  
}
