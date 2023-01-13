package lectures.weef3fp

object PartialFunctions extends App{
    val unliftedChatBot: PartialFunction[String, String] = {
      case "hello" => "Hi, I'm Bot"
      case "bye" => "Bye-bye"
      case "what's up" => "sup-sup"
    }
  val chatbot = unliftedChatBot.lift
  print(chatbot("helo"))

}
