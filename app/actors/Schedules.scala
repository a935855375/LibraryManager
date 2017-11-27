package actors

import akka.actor.{ActorRef, ActorSystem}
import javax.inject.{Inject, Named}


import scala.concurrent.duration._
import scala.concurrent.ExecutionContext

class Schedules @Inject()(actorSystem: ActorSystem,
                          @Named("scheduleactor") someActor: ActorRef)(implicit ec: ExecutionContext) {

  actorSystem.scheduler.schedule(
    initialDelay = 0.microseconds,
    interval = 10.seconds,
    receiver = someActor,
    message = "tick"
  )

}
