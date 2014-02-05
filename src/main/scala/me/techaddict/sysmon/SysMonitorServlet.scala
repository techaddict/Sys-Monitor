package me.techaddict.sysmon

import org.scalatra._
import scalate.ScalateSupport

class SysMonitorServlet extends SysmonitorStack {
  get("/") {
    jade("/index", "DiskUsage" -> scripts.DiskUsage.value)
  }
}
