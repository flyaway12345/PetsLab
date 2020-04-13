package pets.Objects;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Pets implements Comparable<Pets>, Comparator<Pets> {
    private String name;
    public Pets(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Pets Are Good Bois & Girls";
    }

    @Override
    public String toString() {
        return "Pets";
    }

    @Override
    public int compareTo(Pets o) {
        return 0;
    }

    @Override
    public int compare(Pets o1, Pets o2) {
        return 0;
    }

    @Override
    public Comparator<Pets> reversed() {
        return null;
    }

    @Override
    public Comparator<Pets> thenComparing(Comparator<? super Pets> other) {
        return null;
    }

    @Override
    public <U> Comparator<Pets> thenComparing(Function<? super Pets, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Pets> thenComparing(Function<? super Pets, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Pets> thenComparingInt(ToIntFunction<? super Pets> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Pets> thenComparingLong(ToLongFunction<? super Pets> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Pets> thenComparingDouble(ToDoubleFunction<? super Pets> keyExtractor) {
        return null;
    }
}
