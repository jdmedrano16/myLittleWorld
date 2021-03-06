package uh.ac.cr;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        Menu menu = new Menu();
        boolean exit = true;

        System.out.println("\n           Students: Andrey Vargas - Génesis Delgado - Daniel Medrano\n\n                             My Little World"  );

        while(exit && !menu.getGameOver()) {
            System.out.println("\n---------------------------------------------------------------------\n");
            menu.displayData();
            command = scanner.nextLine();
            command = command.trim();

            String[] commandList = command.split(" ");
            if (commandList.length == 4 && commandList[0].equals("start") && commandList[1].equals("new") && commandList[2].equals("world")) {
                menu.startNewWorld(commandList[3]);
            }else if (commandList.length == 2 && commandList[0].equals("load")) {
                menu.loadWorld(commandList[1]);
            } else {
                switch (command) {
                    case "help":
                        menu.help();
                        break;
                    case "exit":
                        menu.save();
                        exit = false;
                        break;
                    case "create doctor":
                        menu.createDoctor();
                        break;
                    case "create chef":
                        menu.createChef();
                        break;
                    case "create builder":
                        menu.createBuilder();
                        break;
                    case "create blacksmith":
                        menu.createBlacksmith();
                        break;
                    case "create carpenter":
                        menu.createCarpenter();
                        break;
                    case "build house":
                        menu.buildHouse();
                        break;
                    case "plant tree":
                        menu.plantTree();
                        break;
                    case "build bicycle":
                        menu.createBicycle();
                        break;
                    case "buy bicycle":
                        menu.buyBicycle();
                        break;
                    case "drive bicycle":
                        menu.driveBicycle();
                        break;
                    case "build car":
                        menu.createCar();
                        break;
                    case "buy car":
                        menu.buyCar();
                        break;
                    case "drive car":
                        menu.driveCar();
                        break;
                    case "request loan":
                        menu.requestLoan();
                        break;
                    case "pay loan":
                        menu.payLoan();
                        break;
                    case "print statistics":
                        menu.printStatistics();
                        break;
                    default:
                        System.err.println("\nERROR: Not a valid command. In case you need help, type \"help\".\n");
                        break;
                }
            }
        }
        if (menu.getGameOver()) {
            System.out.println("\n\nGAME OVER\n\n");
        }
    }
}