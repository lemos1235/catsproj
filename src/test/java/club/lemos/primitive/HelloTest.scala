package club.lemos.primitive

import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("Test difference") {
    val a = Set("a", "b", "a", "c")
    val b = Set("b", "d")
    assert(a -- b === Set("a", "c"))
  }

}
