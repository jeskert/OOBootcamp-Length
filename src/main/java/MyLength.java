public class MyLength {

    private final int length;

    public MyLength(int value) {
        this.length = value;
    }

    public int getValue() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyLength myLength = (MyLength) o;

        return length == myLength.length;

    }

    @Override
    public int hashCode() {
        return length;
    }
}
