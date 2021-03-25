package com.citeck.task1;

public class Number implements Comparable<Number> {
    private int num;
    private int count;

    public Number(int num, int count) {
        this.num = num;
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Number o) {
        int res = Integer.compare(o.count, this.count);
        if (res == 0) {
            res = Integer.compare(this.num, o.num);
        }
        return res;

    }

    @Override
    public String toString() {
        return "Number{" +
                "num=" + num +
                ", count=" + count +
                '}';
    }
}
