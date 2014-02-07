package me.techaddict.sysmon.scripts

import scala.sys.process._

object OSInfo{
  private def x = Process("cat", Seq("/etc/issue"))
  private def out = x.lines_!.toArray
  def value = out.mkString("\n")
}
