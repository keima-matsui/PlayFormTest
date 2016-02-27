package controllers;

import play.*;
import play.mvc.*;
import models.User;
import views.html.*;
import play.data.Form;

public class Single extends Controller {

    Form<User> userForm = Form.form(User.class);

    public Result form() {
        return ok(form.render(userForm));
    }

}
