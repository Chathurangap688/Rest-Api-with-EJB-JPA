package com.test.controller;

import javax.naming.InitialContext;

public class ControllerFactory {
    private static InitialContext initialContext;
    private static ControllerFactory controllerFactory;


    private ControllerFactory(){}

    public static ControllerFactory getInstance() throws Exception {
        try {
            if (controllerFactory == null){
                controllerFactory = new ControllerFactory();
                initialContext = new InitialContext();
            }
            return controllerFactory;
        } catch (Exception e) {
                throw new Exception("error in initializing");
        }
    }


}
