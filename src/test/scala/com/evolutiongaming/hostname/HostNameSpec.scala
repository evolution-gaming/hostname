package com.evolutiongaming.hostname

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class HostNameSpec extends AnyFunSuite with Matchers {

  private val hostName = HostName()

  private val name = hostName.fold("undefined")(_.toString)

  test(s"apply at $name") {
    hostName.isDefined shouldEqual true
  }

  test("inetAddress") {
    HostName.inetAddress().isDefined shouldEqual true
  }

  test("win or unit") {
    val hostName = HostName.win() orElse HostName.unix()
    hostName.isDefined shouldEqual true
  }
}