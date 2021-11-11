package ua.com.devEduction.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartController {

    public void start() {
        System.out.println("Hello! it`s homework did Pivovarov Kirill. Choose your option\n"+
                "Exit - 0");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select your option");
    String position;
        try{
        runNavigation();
        while ((position = reader.readLine()) != null) {

            startProgram(position);
            position = reader.readLine();
            if (position.equals("0")) {
                System.exit(0);
            }
            System.out.println("Select your option");
            runNavigation();
            startProgram(position);
        }
    }catch(IOException e) {
        System.out.println("problem: = " + e.getMessage());
    }

}

    private void startProgram(String position) {

        switch(position){
            case "1":
                ControllerIf constructorIf = new ControllerIf();
                    constructorIf.run();
                    break;
            case "2":
                ControllerLoops controllerLoops = new ControllerLoops();
                    controllerLoops.run();
                    break;
            case "3":
                ControllerArrays controllerArrays = new ControllerArrays();
                    controllerArrays.run();
                    break;
            case "4" :
            ControllerFunction controllerFunction = new ControllerFunction();
                    controllerFunction.run();
                    break;
            case "0":
                System.out.println("Goodbye!");
                System.exit( 0);
            default:
                System.out.println("Incorrect choose");

    }
}

    private void runNavigation(){
        System.out.println("""
                Conditional - 1
                Loops - 2
                Simple Array - 3
                Function - 4
                """);
    }
}
