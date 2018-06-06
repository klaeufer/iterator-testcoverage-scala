import scala.collection.AbstractIterator

object IteratorMethods {
  def scanLeft[A, B](self: Iterator[A])(z: B)(op: (B, A) => B): Iterator[B] = new Iterator[B] {
    var hasNext = true
    var elem = z
    def next() = if (hasNext) {
      val res = elem
      if (self.hasNext) elem = op(elem, self.next())
      else hasNext = false
      res
    } else Iterator.empty.next()
  }
}