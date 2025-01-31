package com.campusdual.cd2023bfs3g1.ws.core.rest;

import com.campusdual.cd2023bfs3g1.api.core.service.IUserRoleService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userrole")
public class UserRoleRestController extends ORestController<IUserRoleService> {

    @Autowired
    IUserRoleService userRoleService;

    @Override
    public IUserRoleService getService() {
        return userRoleService;
    }
}
