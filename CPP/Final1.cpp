/*
 * Adam Karrer
 * April 2017 Semester
 * COS 213
 * Final Project 1
 * */
#include <iostream>
using namespace std;

class node{
    void *info;
    node *next;
    int number;

public:
    node (void *v) {info = v; next = 0;}
    void put_next(node *n) {next = n;}
    node *get_next() {return next;}
    void *get_info() {return info;}

    bool isEmpty(node *head){
        if (head == NULL)
            return true;
        else
            return false;
    }

    void insertAsFirst(node *&head, node *&last, node *&info){
        node *temp = new node(&number);
        temp->info = info;
        temp->next = NULL;
        head = temp;
        last = temp;

    }

    void insert(node *&head, node *&last, node *&info){
        if(isEmpty(head))
            insertAsFirst(head, last, info);
        else
    {
        node *temp = new node(&number);
        temp->info = info;
        temp->next = NULL;
        last->next = temp;
        last = temp;
    }

    }
};



int main() {
    node* head = NULL;
    node* last = NULL;
    int x=5;
    int y = 52;
    node z = new node(&x);

    z.insert(head,last, *&y);
    return 0;
}