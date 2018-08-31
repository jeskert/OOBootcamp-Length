public class Length {
    private int length;

    public Length(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Length length1 = (Length) o;

        return length == length1.length;
    }
}
