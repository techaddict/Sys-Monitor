package me.techaddict.sysmon.scripts

import scala.sys.process._

object Users{
  private def x = Process("/usr/bin/awk", Seq("-F:", "{ if ($3<=499) print \"system,\"$1\",\"$6; else print \"user,\"$1\",\"$6; }"))
  private def y = Process("cat", Seq("/etc/passwd"))
  private def z = y #> x
  private var out = Array[String]()
  def value = {
    try {
      out = z.lines_!.toArray
    } catch {
      case _: Throwable =>
    }
    out.mkString("\n")
  }
  def value1 = {
    try {
      out = z.lines_!.toArray
    } catch {
      case _: Throwable =>
    }
    out
  }
}
