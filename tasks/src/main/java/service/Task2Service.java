package service;


import algorithm.CommisVoyageur;

public class Task2Service {
    private static CommisVoyageur cv = new CommisVoyageur();

    public static void initCosts(int numOfCities) {
        cv.setNumOfCities(numOfCities);
        cv.fulfillMatrixWithDefaultValues();
    }


    public static void addCityToArr(int id, String name) {
        cv.addCityToArr(id, name);
    }

    public void addCostToMatrix(int id, int id1, int cost) {
        cv.addCostToMatrix(id, id1, cost);
    }

    public void pathFromToIndex(String name1, String name2) {
        cv.pathFromToIndex(name1, name2);
    }

    public int cheapestCost() {
        return cv.getCheapestCost();
    }
}
