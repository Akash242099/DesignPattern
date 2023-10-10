package StrategyPattern.Client;

import StrategyPattern.Modal.MergeSorting;
import StrategyPattern.Modal.SortingAlgo;
public class Main {
    public static void main(String[] args){
     SortingAlgo selectAlgo=new SortingAlgo(new MergeSorting());
     selectAlgo.applyAlgorithm();

}
}
