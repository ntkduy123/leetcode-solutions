package org.dailycode.solutions.algorithm;

import java.util.PriorityQueue;
import java.util.Queue;

public class FurthestBuildingYouCanReach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff < 0) {
                continue;
            }

            maxHeap.add(diff);
            bricks -= diff;
            if (bricks < 0 && ladders == 0) {
                return i;
            }

            if (bricks < 0) {
                bricks += maxHeap.remove();
                ladders--;
            }
        }

        return heights.length - 1;
    }
}
