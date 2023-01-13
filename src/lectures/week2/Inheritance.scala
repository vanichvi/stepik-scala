package lectures.week2

//import lectures.week2.Inheritance.Account

object Inheritance extends App {
//  class Button(val label: String = "test") {
//    def click(): String = {
//      s"button -$label- has been clicked"
//    }
//  }
//
//  class RoundedClass(override val label: String) extends Button {
//    override def click(): String = {
//      s"rounded ${super.click()}"
//    }
//  }
//
//  abstract class Event {
//    def trigger(eventName: String): Unit
//  }
//
//  val someEvent = new Event {
//    override def trigger(eventName: String): Unit = println(s"trigger $eventName event")
//  }
//
//  class Listener(val eventName: String, var event: Event) {
//
//    def register(evt: Event) {
//      event = evt
//    }
//
//    def sendNotification() {
//      event.trigger(eventName)
//    }
//  }
//
//  val notification: Listener = new Listener("mousedown", null)
//  notification.register(someEvent)
//  notification.sendNotification()
//
//  object Configs {
//    val ACCOUNT_TYPE_DEFAULT = "free"
//    val ACCOUNT_TYPE_PAID = "paid"
//    val SUBSCRIPTION_STATUS = "active"
//  }
//
//  object Settings {
//    case class AccountSettings(
//                                email: String,
//                                password: String,
//                                picture: String)
//
//    case class SubscriptionSettings(
//                                     payment: String,
//                                     notifications: String,
//                                     expiration: String)
//  }
//
//  trait Subscriber {
//    def subscribe(settings: Settings.SubscriptionSettings): Unit = println("subscribed")
//  }
//
//  trait Unsubscriber {
//    def unsubscribe(): Unit = println("unsubscribed")
//  }
//
//  abstract class Account(accountID: String = "free", settings: Settings.AccountSettings = null) {
//    def info(): Unit
//  }
//
//  class FreeAccount(accountID: String, settings: Settings.AccountSettings) extends Account with Unsubscriber {
//
//    override def info(): Unit = println(s"Account Type: $Configs.ACCOUNT_TYPE_DEFAULT")
//  }
//
//  class PaidAccount(accountID: String, settings: Settings.AccountSettings) extends Account with Subscriber {
//
//    override def info(): Unit = {
//      println(s"Account Type: $Configs.ACCOUNT_TYPE_PAID")
//      println(s"Subscription Status: $Configs.SUBSCRIPTION_STATUS")
//    }
//  }
//  val paidAccount:PaidAccount =new PaidAccount("1", null)
//  paidAccount.subscribe(null)

  trait Event {
    def id: String

    def evType: String

    def operation: String
  }

  case class UserEvent(id: String, evType: String, operation: String) extends Event

  case class SystemEvent(id: String, evType: String, operation: String) extends Event

  trait Registrable[T <: Event] {
    def update(event: T, status: String):T
  }

  object EventOps {
    val userEvent = new Registrable[UserEvent] {
      def update(event: UserEvent, status: String): UserEvent = event.copy(operation = status)
    }

    val systemEvent = new Registrable[SystemEvent] {
      def update(event: SystemEvent, status: String): SystemEvent = event.copy(operation = status)
    }
  }

  class EventOps[T <: Event](event: T)(ops: Registrable[T]) {
    def update(status: String) = ops.update(event, status)
  }

  val user1Event = UserEvent("1", "user_event", "account_create")
  val user1Ops = new EventOps(user1Event)(EventOps.userEvent)
  val user1EventUpd = user1Ops.update("permission_add")

  println(s"User1 | Operation: ${user1EventUpd.operation}")
}
