public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricksUsed = Math.min(goal/5, big);
    int remainingLength = goal-(maxBigBricksUsed*5);
    return small>=remainingLength;
}

