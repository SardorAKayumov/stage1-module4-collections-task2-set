package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                hashSet.add(num);
                while (num % 2 == 0) {
                    num /= 2;
                    hashSet.add(num);
                }
            } else {
                hashSet.add(num);
                hashSet.add(num*2);
            }
        }

        return hashSet;
    }
}
