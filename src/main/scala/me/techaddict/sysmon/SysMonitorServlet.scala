package me.techaddict.sysmon

import org.scalatra._
import scalate.ScalateSupport
import scala.sys.process._

class SysMonitorServlet extends SysmonitorStack {
  val x = Process("/bin/df", Seq("-h"))
  val y = Process("awk", Seq("{print $1\", \"$2\", \"$3\", \"$4\", \"$5\", \"$6}"))
  val z = x #| y
  val out = z.lines_!.toArray
  get("/") {
    jade("/index", "out" -> out.mkString("\n"))
  }
}
