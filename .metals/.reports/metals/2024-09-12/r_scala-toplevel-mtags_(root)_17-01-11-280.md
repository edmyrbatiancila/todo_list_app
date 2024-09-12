error id: file://<WORKSPACE>/todo_list/app/controllers/HomeController.scala:[708..709) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/controllers/HomeController.scala", "package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import models.users._
import scala.util.{ Try, Success, Failure }
import scala.concurrent.{ Future, ExecutionContext }
import java.time.LocalDateTime

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents, users: UsersRepo, auth: UsersAuthRepo)(using ec: ExecutionContext) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    val userId = request.session.get("user_id")
    userId match {
      case Some(value)  => 
        Redirect("/home")
      case None         =>
        Ok(views.html.index())
    }
  }

  def 
}
")
file://<WORKSPACE>/todo_list/app/controllers/HomeController.scala
file://<WORKSPACE>/todo_list/app/controllers/HomeController.scala:26: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace