public int makeChocolate(int small, int big, int goal) {
    int maxBigBars = Math.min(goal/5, big);
    int remaining = goal-(maxBigBars*5);
    if (small>=remaining) {
        return remaining;
    } else {
        return -1;
    }
}
