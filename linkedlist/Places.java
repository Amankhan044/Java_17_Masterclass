package linkedlist;

public record Places(String name, int Distance) {
    @Override
    public final String toString() {

        return String.format("%s (%d)", name, Distance);
    }
}
