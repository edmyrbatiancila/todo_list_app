error id: file://<WORKSPACE>/todo_list/app/models/repository/UsersRepo.scala:[506..507) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/repository/UsersRepo.scala", "package models.users

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ Future, ExecutionContext }
import org.mindrot.jbcrypt.BCrypt
import java.util.UUID

@Singleton
class UsersRepo @Inject()(dcp: DatabaseConfigProvider, auth: UsersAuthRepo) {
    val dbConfig = dcp.get[PostgresProfile]
    import dbConfig._
    import profile.api._
    
    class UsersTable(tag: Tag) extends Table[Users](tag, "USERS") {
        def 
    }
}
")
file://<WORKSPACE>/todo_list/app/models/repository/UsersRepo.scala
file://<WORKSPACE>/todo_list/app/models/repository/UsersRepo.scala:18: error: expected identifier; obtained rbrace
    }
    ^
#### Short summary: 

expected identifier; obtained rbrace