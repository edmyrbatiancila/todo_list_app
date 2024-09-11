error id: file://<WORKSPACE>/todo_list/app/models/repository/UsersAuthRepo.scala:[916..917) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/repository/UsersAuthRepo.scala", "package models.users

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ ExecutionContext }
import java.util.UUID
import java.time.Instant

@Singleton
class UsersAuthRepo @Inject()(dcp: DatabaseConfigProvider)(using ec: ExecutionContext) {
    val dbConfig = dcp.get[PostgresProfile]
    import dbConfig._
    import profile.api._

    class UsersAuthTable(tag: Tag) extends Table[UsersAuth](tag, "USERS_AUTH") {
        def idUser          = column[UUID]("ID", O.PrimaryKey, O.Default(UUID.randomUUID))
        def isSuccess       = column[Boolean]("IS_SUCCESS")
        def attemptAt       = column[Instant]("ATTEMPT_AT")
        def ip              = column[String]("IP_ADDRESS")

        def *               = (idUser, isSuccess, attemptAt, ip).mapTo[UsersAuth]
    }

    val usersAuth = TableQuery[UsersAuthTable]

    case class 
}

")
file://<WORKSPACE>/todo_list/app/models/repository/UsersAuthRepo.scala
file://<WORKSPACE>/todo_list/app/models/repository/UsersAuthRepo.scala:28: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace