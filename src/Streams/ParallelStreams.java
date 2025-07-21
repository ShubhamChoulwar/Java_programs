package Streams;

/**
 * Parallel streams allow for parallel processing of collections,
 * which can improve performance for large datasets.
 * To use parallel streams, you can call the `parallel()` method on a stream.
 * This example counts the number of even integers in a range using parallel streams.
 * Note: Parallel streams should be used judiciously, as they can introduce overhead
 * and may not always lead to performance improvements, especially for small datasets.
 */

public class ParallelStreams {
    public static void main(String[] args) {
        long count = java.util.stream.IntStream.range(1, 2000000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();

        System.out.println("Count of even numbers: " + count);
        System.out.println("Total time consuming: " +
            java.time.Duration.between(java.time.Instant.now(), java.time.Instant.now().plusMillis(1000)).toMillis() + " ms");

        /**
         * Another example of using parallel streams to process a list of integers.
         */
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long evenCount = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Count of even numbers in the list: " + evenCount);
        /**
         * Note: The actual performance gain from using parallel streams
         * depends on the size of the dataset and the complexity of the operations.
         * For small datasets, the overhead of managing parallelism may outweigh the benefits.
         */
    }

}
