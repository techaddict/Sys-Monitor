package me.techaddict.sysmon.scripts

import scala.sys.process._
import scala.concurrent.{ Future, Promise }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

object Hostname{
  private def x = Future{
    Process("/bin/hostname").run(true)
  }
  def value = x.onComplete{
    case Success(x) => x
    case _ => "Error"
  }
}
