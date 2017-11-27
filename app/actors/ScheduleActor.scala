package actors


import javax.inject.Singleton

import akka.actor.{Actor, ActorSystem}
import com.google.inject.Inject
import services.MailerService

import scala.concurrent.ExecutionContext

@Singleton
class ScheduleActor @Inject()(actorSystem: ActorSystem, mailer: MailerService)(implicit ec: ExecutionContext) extends Actor {
  //private lazy val logger = play.api.Logger(this.getClass)

  override def receive = {
    case _ =>
  }
}
