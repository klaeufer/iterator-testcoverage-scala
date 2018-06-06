import scala.collection.AbstractIterator
import scala.tools.testing.AssertUtil.assertSameElements
import org.junit.Test

class t10709 {

  // this method copied from scala_2.12.x/test/junit/scala/collection/IteratorTest.scala

  @Test def `scan is lazy enough`(): Unit = {
    val results = collection.mutable.ListBuffer.empty[Int]
    val it = new AbstractIterator[Int] {
      var cur = 1
      val max = 3
      override def hasNext = {
        results += -cur
        cur < max
      }
      override def next() = {
        val res = cur
        results += -res
        cur += 1
        res
      }
    }
    val xy = IteratorMethods.scanLeft(it)(10)((sum, x) => {
      results += -(sum + x)
      sum + x
    })
    val scan = collection.mutable.ListBuffer.empty[Int]
    for (i <- xy) {
      scan += i
      results += i
    }
    assertSameElements(List(10, 11, 13), scan)
    assertSameElements(List(10, -1, -1, -11, 11, -2, -2, -13, 13, -3), results)
  }
}
