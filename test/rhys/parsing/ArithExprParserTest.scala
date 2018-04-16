package rhys.parsing

import org.scalatest.{FunSuite, Matchers}

class ArithExprParserTest extends FunSuite with Matchers {

  val instance = new ArithExprParser

  test("Test 1") {
    val input = "2 * (3 + (7 * 4 - 1)) / 2 - 1"
    instance.parseAll(instance.expr, input).get shouldEqual 29
  }

}
