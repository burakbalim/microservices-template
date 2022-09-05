package com.test.demo;

import java.util.*;
import java.util.stream.Collectors;

public class UniquePairCounter implements PairCounter {

    private int[] input;
    public UniquePairCounter(int[] input) {
        this.input = input;
    }

    @Override
    public long countPairs() {
        Set<Integer> set = new HashSet<>();
        for (int item : input) {O(n)
            int searchItem = item * -1;
            if (Arrays.stream(input).filter(item1 -> item1 == searchItem).findAny().isPresent() (logn)&&
                    Arrays.stream(input).filter(item1 -> item1 == item).findAny().isPresent() (long)) {
                if (searchItem)
                set.add(searchItem);
            }
        }
        try (InputStream )

        set.forEach(System.out::println);
        return set.size();
    }
}
