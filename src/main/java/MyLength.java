public class MyLength {

    private final int length;
    private String unitStr;

    public MyLength(int value) {
        this.length = value;
    }

    public MyLength(int value, String unitStr) {
        this.length = value;
        this.unitStr = unitStr;
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

    public boolean longerThan(MyLength length2) {
        return true;
    }
}
