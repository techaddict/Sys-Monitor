package me.techaddict.sysmon.scripts

import scala.sys.process._

object DiskUsage{
  private def x = Process("/bin/df", Seq("-h"))
  private def y = Process("awk", Seq("{print $1\", \"$2\", \"$3\", \"$4\", \"$5\", \"$6}"))
  private def z = x #| y
  private def out = z.lines_!.toArray
  def value = out.mkString("\n")
  def value1 = out
}
