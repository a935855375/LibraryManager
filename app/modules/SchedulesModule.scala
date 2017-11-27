package modules

import actors.{Schedules, ScheduleActor}
import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport


class SchedulesModule extends AbstractModule with AkkaGuiceSupport {
  override def configure() = {
    bindActor[ScheduleActor]("scheduleactor")
    bind(classOf[Schedules]).asEagerSingleton()
  }
}
