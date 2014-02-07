package me.techaddict.sysmon.scripts

import scala.sys.process._

object IPAddr{
  private def a = Process("/sbin/ifconfig")
  private def b = Process("grep", Seq("-B1", "inet addr"))
  private def c = Process("awk", Seq("-B1", "{ if ( $1 == \"inet\" ) { print $2 } else if ( $2 == \"Link\" ) { printf \"%s:\",$1 } }"))
  private def d = Process("awk", Seq("-F", "{ print $1\",\"$3 }"))
  private def z = a #| b #| c #| d
  private def out = z.lines_!.toArray
  private def ext = Process("curl", Seq("http://ipecho.net/plain;", "echo"))
  private def extout = ext.lines_!.toArray
  def value = out.mkString("\n")
  def value1 = out
  def extValue = extout.mkString("\n")
}