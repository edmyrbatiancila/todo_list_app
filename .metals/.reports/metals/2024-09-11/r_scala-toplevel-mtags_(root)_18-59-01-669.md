error id: file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:[984..985) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala", "package models.lists

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ Future, ExecutionContext }
import java.util.UUID
import java.time.LocalDateTime

@Singleton
class ListsRepo @Inject()(val dcp: DatabaseConfigProvider)(using ec: ExecutionContext) {
    val dbConfig = dcp.get[PostgresProfile]
    import dbConfig._
    import profile.api._

    class ListsTable(tag: Tag) extends Table[Lists](tag, "LISTS") {
        val id              = column[Int]("ID", O.PrimaryKey, O.AutoInc)
        val idUser          = column[UUID]("ID_USER")
        val task            = column[String]("TASK", O.Length(255, true))
        val status          = column[String]("STATUS", O.Length(255, true))
        val description     = column[String]("DESCRIPTION")
        val due             = column[LocalDateTime]("DUE")
        val isHidden        = column[Boolean]("IS_HIDDEN", O.Default(false))

        def 
    }
}

")
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:26: error: expected identifier; obtained rbrace
    }
    ^
#### Short summary: 

expected identifier; obtained rbrace