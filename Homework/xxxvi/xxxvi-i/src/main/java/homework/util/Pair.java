package homework.util;

public class Pair<F, S> {
    public F first;
    public S second;

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return first + ", " + second;
    }
}
