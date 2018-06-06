import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito._

class t10709spy {

  @Test def `scan is lazy enough w/ spy`(): Unit = {
    val input = spy(Iterator(1, 2, 3))
    val expected = Array(0, 1, 3, 6)
    val result = IteratorMethods.scanLeft(input)(0)(_ + _)
    for (i <- expected.indices) {
      assertEquals(expected(i), result.next())
      verify(input, times(i)).next()
    }
  }
}
