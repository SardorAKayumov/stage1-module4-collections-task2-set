package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();

        // Belong to first and second sets but not to third
        for (String str : firstSet) {
            if (secondSet.contains(str) && !thirdSet.contains(str))
                set.add(str);
        }

        // Unique element from third set
        for (String str : thirdSet) {
            if (!firstSet.contains(str) && !secondSet.contains(str))
                set.add(str);
        }

        return set;
    }
}
