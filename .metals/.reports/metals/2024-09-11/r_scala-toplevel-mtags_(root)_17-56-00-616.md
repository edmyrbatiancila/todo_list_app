error id: file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:[432..433) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala", "package models.lists

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ Future, ExecutionContext }
import java.util.UUID
import java.time.LocalDate

@Singleton
class ListsRepo @Inject()(val dcp: DatabaseConfigProvider)(using ec: ExecutionContext) {
    val dbConfig = dcp.get[PostgresProfile]
    import dbConfig._
    import profile.api._

    class 
}

")
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:17: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace