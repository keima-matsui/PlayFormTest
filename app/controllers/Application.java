package controllers;

import play.*;
import play.mvc.*;
import models.User;
import play.data.Form;
import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result submit() {
        
        Form<User> userForm = Form.form(User.class);
        User filledForm = userForm.bindFromRequest().get();
    
        return ok(result.render(filledForm));
    
        
    }

}
