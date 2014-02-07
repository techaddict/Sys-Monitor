package me.techaddict.sysmon.scripts

import scala.sys.process._

object Memory{
  private def x = Process("free", Seq("-tmo"))
  private def y = Process("awk", Seq("{print $1","$2","$3","$4}"))
  private def z = x #| y
  private def out = x.lines_!.toArray
  def value = out.mkString("\n")
  def value1 = out
}
