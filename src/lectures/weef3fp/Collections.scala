package lectures.weef3fp

object Collections extends App {
  val progLanguages = List("java", "scala", "python")
  val lngAbbrev = List("JA", "SCA", "PY")
  val out = progLanguages.flatMap(lng => lngAbbrev.filter(_.substring(0, 2).toLowerCase().equals(lng.substring(0, 2))).map(abrv =>
    (abrv, lng)))
  println(out)

  val list = List(12, List(3, 4))
  //apply operation
//  val result = list.flatten
  //print result
//  println(result)

}
