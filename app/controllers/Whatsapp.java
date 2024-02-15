package controllers;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import security.AppSecurity;

@Security.Authenticated(AppSecurity.class)
public class Whatsapp extends Controller {

    @Transactional
    public Result inicio(){
        return ok(views.html.whatsapp.whatsapp.render());
    }
}
