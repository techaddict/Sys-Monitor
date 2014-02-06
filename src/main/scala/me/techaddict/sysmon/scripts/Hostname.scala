package me.techaddict.sysmon.scripts

import scala.sys.process._

object Hostname{
  private def x = Process("/bin/hostname")
  private def out = x.lines_!.toArray
  def value = out.mkString("\n")
}