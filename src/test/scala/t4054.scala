import org.junit.Test

import scala.tools.testing.AssertUtil.assertSameElements

class t4054 {
  @Test def scanLeftSimpleTest(): Unit = {

    val i0 = Iterator.from(1).map(n => n * n)
    val it = IteratorMethods.scanLeft(i0)(0)(_ + _).take(5)

    // modified to ensure that the statement hasNext = false in scanLeft will be exercised

    assertSameElements(List(0, 1, 5, 14, 30), it)
  }
}
