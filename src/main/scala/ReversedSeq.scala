object ReversedSeq extends App {

  def makeList (Number : Int) : List[Int] = {
    val x = (20 to Number).toList.reverse
    x
  }
println(makeList(50))
}
