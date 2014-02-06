package me.techaddict.sysmon.scripts

import scala.sys.process._

object Users{
  private def x = Process("/usr/bin/awk", Seq("-F:", "{ if ($3<=499) print \"system,\"$1\",\"$6; else print \"user,\"$1\",\"$6; }"))
  private def y = Process("/etc/passwd")
  private def z = x #< y
  def value = {
    var x = ""
    try {
      x = z.lines_!.toArray.mkString("\n")
    } catch {
      case _: Throwable =>
    }
    x
  }
}