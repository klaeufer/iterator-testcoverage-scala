import org.junit.Test

class t4054 {
  @Test def scanLeftSimpleTest(): Unit = {

    val i0 = Iterator.from(1).take(4).map(n => n * n)
    val it = IteratorMethods.scanLeft(i0)(0)(_ + _)

    assert(it.next == 0)
    assert(it.next == 1)
    assert(it.next == 5)
    assert(it.next == 14)
    assert(it.next == 30)
  }
}
