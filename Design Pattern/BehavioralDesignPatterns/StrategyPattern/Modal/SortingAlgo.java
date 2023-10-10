package StrategyPattern.Modal;
public class SortingAlgo{
SortingStrategy sortStrategy;

public SortingAlgo(SortingStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
}


public void applyAlgorithm(){
    sortStrategy.sort();
}
}