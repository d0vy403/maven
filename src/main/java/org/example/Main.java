package org.example;

import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        Range<Integer> range1 = Range.closed(1, 10);
        Range<Integer> range2 = Range.openClosed(5,15);

        System.out.println("Range1: " + range1);
        System.out.println("Range2: " + range2);

        int valueCheck = 5;
        System.out.println("Range contains " + valueCheck + ": " + range1.contains(valueCheck));
        System.out.println("Range contains " + valueCheck + ": " + range2.contains(valueCheck));

        try{
            Range<Integer> intersection = range1.intersection(range2);
            System.out.println("Intersection of range1 and range2: " + intersection);
        } catch (IllegalArgumentException e) {
            System.out.println("range1 and range2 do not intersect.");
        }

        Range<Integer> span = range1.span(range2);
        System.out.println("Span of range1 and range2: " + span);

    }
}