public class Main {
    public static void main(String[] args) {

        // TODO complete this psvm main method to replicate the timing experiment from adts.py.
        //      Note: this will be client code of the various other classes needing to be written.
    }
    public abstract class MultiSet {
        /**
         * An abstract class representing the MultiSet ADT, which supports the
         * add, remove, is_empty, count, and contains operations.
         *
         * This class itself does not handle how the underlying data is stored,
         * so it just inherits Object's constructor.
         */

        // Add an item to the multiset
        public abstract void add(int item);

        // Remove an item from the multiset
        public abstract void remove(int item);

        // Check if the multiset contains a specific item
        public abstract boolean contains(int item);

        // Check if the multiset is empty
        public abstract boolean isEmpty();

        // Return the count of a specific item in the multiset
        public abstract int count(int item);

        // Return the size of the multiset (total number of items)
        public abstract int size();
    }

}
