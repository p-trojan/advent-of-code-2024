import scala.io.Source

object Day1 extends App:
  val path: os.Path = os.home / "ScalaProjects" / "advent-of-code-2024" / "src" / "main" / "resources" / "day1_full.txt"
  val data: Seq[String] = os.read.lines(path)
  val left = data.map(it => it.split(" ")).map(it => it.head).map(it => it.toInt).sorted
  val right = data.map(it => it.split(" ")).map(it => it.last).map(it => it.toInt).sorted

  val part1result = left.zip(right).map(it => (it._1 - it._2).abs).sum

  val frequency = left.map(it => right.count(e => e == it))
  val part2result = left.zip(frequency).map(it => (it._1 * it._2)).sum
  println(part2result)