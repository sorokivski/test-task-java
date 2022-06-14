package algorithm;


import entity.City;

public class CommisVoyageur {


    private City[] cities;
    private int[][] matrixOfCosts;
    private int numOfCities;
    private int begin_index;
    private int second;

    public void setNumOfCities(int numOfCities) {
        this.numOfCities = numOfCities;
    }

    public int algoDejkstra() {
        int[] d = new int[numOfCities]; // min cost
        int[] v = new int[numOfCities]; // visited vertexes
        int temp, minindex, min;
        for (int i = 0; i < numOfCities; i++) {
            d[i] = 999999999;
            v[i] = 1;
        }
        d[begin_index] = 0;

        do {
            minindex = 999999999;
            min = 999999999;
            for (int i = 0; i < numOfCities; i++) { // if vertex is not visited and it has cost less then min
                if ((v[i] == 1) && (d[i] < min)) { //  set min cost = cost and min index =i
                    min = d[i];
                    minindex = i;
                }
            }
            // ADDING FoUNDED MINIMUM COST TO CURRENT VALUE OF VERTEX
            // then comparing to current minimum cost of vertex
            if (minindex != 999999999) {
                for (int i = 0; i < numOfCities; i++) {
                    if (matrixOfCosts[minindex][i] > 0) {
                        temp = min + matrixOfCosts[minindex][i];
                        if (temp < d[i]) {
                            d[i] = temp;
                        }
                    }
                }
                v[minindex] = 0;
            }
        } while (minindex < 999999999);
        return d[second];
    }

    public void fulfillMatrixWithDefaultValues() {
        cities = new City[numOfCities];

        matrixOfCosts = new int[numOfCities][numOfCities];
        for (int i = 0; i < numOfCities; i++) {
            for (int j = 0; j < numOfCities; j++) {
                if (i == j) matrixOfCosts[i][j] = 0;
                else
                    matrixOfCosts[i][j] = 999999999;
            }
        }
    }

    public void addCityToArr(int id, String name) {
        cities[id - 1] = new City(id, name);
    }

    public void addCostToMatrix(int id, int id1, int cost) {
        matrixOfCosts[id - 1][id1 - 1] = cost; // initialization of costs for setted pathes

    }

    public void pathFromToIndex(String name1, String name2) {
    begin_index =0;
    second =0;

        for (int i = 0; i < numOfCities; i++) {
            if (name1.equals(cities[i].getCity())) {
                begin_index = i;
            } else if (name2.equals(cities[i].getCity())) {
                second = i;

            } else continue;
        }
    }

    public int getCheapestCost() {
        return algoDejkstra();
    }
}

