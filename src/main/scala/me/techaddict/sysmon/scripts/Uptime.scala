package me.techaddict.sysmon.scripts

import scala.sys.process._

object Uptime{
  private def x = Process("cat", Seq("/proc/uptime"))
  private def out = x.lines_!.toArray
  def value = out(0).split(" ")(0)
}
