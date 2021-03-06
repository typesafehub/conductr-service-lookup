package com.example

import akka.actor.{ Actor, ActorLogging, Props }

object BoatActor {
  val props: Props = Props(new BoatActor)
}

class BoatActor extends Actor with ActorLogging {

  def receive = {
    case TransportMessage(msg) =>
      log.info("BoatActor - received message: {}", msg)
      sender() ! Status.Success
  }
}
