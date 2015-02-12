package nl.amsscala.academy2
import scala.compat.Platform.currentTime

trait AppEx extends DelayedInit {

  val executionStart: Long = currentTime

  protected def args: Array[String] = _args

  // Trick: Multi-value assignment
  private var (_args, codeBlock) = (Array.empty[String], List.empty[() => Unit])

  def main(args: Array[String]) = {
    _args = args
    codeBlock.head()
    println(s"Successfully completed without errors. [total ${currentTime - executionStart} ms]")
  }

  override def delayedInit(body: => Unit) {
    codeBlock ++= List(() => body)
  }
}

object HelloWorld extends AppEx {
  println(args.mkString("Hello World: ",", ",""))
}
