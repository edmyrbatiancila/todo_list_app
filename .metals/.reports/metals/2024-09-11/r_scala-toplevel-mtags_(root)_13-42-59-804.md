error id: file://<WORKSPACE>/todo_list/app/models/domain/Users.scala:[17..23) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/domain/Users.scala", "package models.

import play.api.libs.json._
import java.util.UUID

case class Users(username: String, password: String, id: UUID = UUID.randomUUID)

object Users {
    given Writes[Users] = new Writes {
        def writes(user: Users) = Json.obj(
            "id"        -> user.id,
            "username"  -> user.username
        )
    }
    given Reads[Users] = new Reads {
        def reads(json: JsValue) = for {
            username <- (json \ "username").validate[String]
            password <- (json \ "password").validate[String]
        }yield Users(username, password)
    }
}")
file://<WORKSPACE>/todo_list/app/models/domain/Users.scala
file://<WORKSPACE>/todo_list/app/models/domain/Users.scala:3: error: expected identifier; obtained import
import play.api.libs.json._
^
#### Short summary: 

expected identifier; obtained import