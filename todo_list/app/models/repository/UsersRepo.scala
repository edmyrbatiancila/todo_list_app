package models.users

import javax.inject._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.PostgresProfile
import scala.concurrent.{ Future, ExecutionContext }
import org.mindrot.jbcrypt.BCrypt
import java.util.UUID

@Singleton
class UsersRepo @Inject()(dcp: DatabaseConfigProvider) {
    
}
