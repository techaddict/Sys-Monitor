package me.techaddict.sysmon

import org.scalatra._
import scalate.ScalateSupport

class SysMonitorServlet extends SysmonitorStack {
  import scripts._
  get("/") {
    redirect("/index")
  }
}
