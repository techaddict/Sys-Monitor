package me.techaddict.sysmon

import org.scalatra._
import scalate.ScalateSupport

class SysMonitorServlet extends SysmonitorStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
