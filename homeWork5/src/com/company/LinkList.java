package com.company;

public class LinkList {
    private Node _head;
    private Node _hvost;

    public int get(int index) throws MyExeption {

        int element = 0;
        int ind = 0;
        Node elem = _head;
        if (index <= 0) {
            throw new MyExeption();
        }
        while (_head != null) {
            ind++;
            if (ind < index) {
                throw new MyExeption();
            } else {
                if (ind == index) {
                    element = elem.value;
                    break;
                } else elem = elem.next;
            }
        }
        return element;
    }

    public void remove(int index) throws MyExeption {
        Node elem = _head;
        if (index <= 0){
            throw new MyExeption();
        }
        if (index == 1) {
            _head = elem.next;
        }
        int ind = 0;
        while (elem.next != null) {
            ind++;
            if (ind < index) {
                throw new MyExeption();
            }else {
            if (ind == index - 1) {
                elem.next = elem.next.next;
                break;
            }
            }
            elem = elem.next;

        }
    }

        public void add ( int value){
            Node a = new Node();
            a.value = value;
            if (_hvost == null) {
                _head = a;
                _hvost = a;
            } else {
                _hvost.next = a;
                _hvost = a;
            }

        }
        public void print () {
            Node elem = _head;
            while (elem != null) {
                System.out.println(elem.value);
                elem = elem.next;
            }
        }
    }

