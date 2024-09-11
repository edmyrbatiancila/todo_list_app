error id: file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:[2214..2215) in Input.VirtualFile("file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala", "package models.lists

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ Future, ExecutionContext }
import java.util.UUID
import java.time.LocalDateTime
import java.time.LocalDate

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

        def *               = (id, idUser, task, status, description, due, isHidden).mapTo[ListsTable]
    }

    val lists = TableQuery[ListsTable]

    def add(idUser: UUID, task: String, description: String, due: LocalDateTime) = {
        val query = lists += Lists(task, status, description, due, idUser = idUser)
        db.run(query)
    }

    def get(idUser: UUID) = {
        val query = lists.filter(_.idUser === idUser).result
        db.run(query)
    }

    def get(id: Int) = {
        val query = lists.filter(l => l.id === id && l.isHidden === isHidden).result
        db.run(query)
    }

    def get(id: Int) = {
        val query = lists.filter(_.id === id).result
        db.run(query)
    }

    def get(idUser: UUID, status: String) = {
        val query = lists.filter(l => l.idUser === idUser && l.status === status).result
        db.run(query)
    }

    def update(idUser: UUID, id: Int, task: String, status: String, description: String, due: LocalDateTime) = {
        val query = 
            lists.filter(l => l.idUser === idUser && l.id === id)
            .map(l => (l.task, l.status, l.description, l.due)).update((task,status, description, due))
        db.run(query)
    }

    def 
}

")
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala
file://<WORKSPACE>/todo_list/app/models/repository/ListsRepo.scala:64: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace