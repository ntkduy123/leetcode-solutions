package org.dailycode.solutions.algorithm;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {

    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int stick : sticks) {
            heap.add(stick);
        }

        int result = 0;
        while (heap.size() > 1) {
            int stick1 = heap.remove();
            int stick2 = heap.remove();

            result += stick1 + stick2;

            heap.add(stick1 + stick2);
        }

        return result;
    }
}
