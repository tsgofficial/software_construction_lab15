package lab.sict.must.edu.mn;

/**
 * Хуваах үйлдэл гүйцэтгэгч класс.
 */
public final class Division {

    /**
     * Хоёр тоог хуваана.
     *
     * @param a хуваагдагч
     * @param b хуваагч
     * @return хуваалтын үр дүн
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
