package rhys.parsing

object Main extends ArithExprParser with App {
  
  val input = "2 * (3 + (7 * 4 - 1)) / 2 - 1"

  println(parseAll(expr, input).get)  // prints 29.0
  
}