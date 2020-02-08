package com.test.controller.controllers;

import com.test.controller.ApiController;
import com.test.user.facades.UserManager;

import javax.ejb.Stateless;

@Stateless
public class UserController extends ApiController {
    UserManager userManager;
    public void initializeFacades() {
        userManager = new UserManager();
        userManager.injectEntityManager(entityManager);
    }
}
