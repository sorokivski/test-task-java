package controller;



import service.Task2Service;

import java.util.Scanner;

public class Task2Controller {
    private static final Scanner scan = new Scanner(System.in);
    private static final Task2Service task2service = new Task2Service();

    public void run() {

        System.out.println("Num of tests:");
        int numOfTests = scan.nextInt();
        while (numOfTests != 0) { // for all tests
            runTest();
            numOfTests--;
        }
    }

    public void runTest() {
        runInputData();
        runTestData();
    }

    private void runTestData() {

        System.out.println("Number of pathes to find:");
        int num_to_find = scan.nextInt();

        while (num_to_find != 0) {

            System.out.println("Found minimum cost of path from___ to ___:");
            String name1 = scan.nextLine();
            String name2 = scan.nextLine();
            task2service.pathFromToIndex(name1, name2);
            System.out.println(" Cheaper cost is: " + task2service.cheapestCost());
            num_to_find--;
        }
    }

    private void runInputData() {

        System.out.println("Num of cities:");
        int numOfCities = scan.nextInt();
        int num = numOfCities;// value for changing during while-cycle

        Task2Service.initCosts(numOfCities);
        int id = 1;
        while (num != 0) { // for all Cities
            scan.nextLine();
            System.out.println("Enter city:"); // Initialization of data
            String name = scan.nextLine();
            Task2Service.addCityToArr(id, name);

            System.out.println("Enter number of relations:");
            int numOfRelations = scan.nextInt();
            while (numOfRelations != 0) { // for all relations
                System.out.println("Enter id and cost:");

                int id1 = scan.nextInt();
                int cost = scan.nextInt();
                task2service.addCostToMatrix(id, id1, cost);

                numOfRelations--;
            }

            num--;
            id++;
        }
    }

}
