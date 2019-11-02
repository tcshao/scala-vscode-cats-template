package com.ocp

import org.scalatest.{FunSpec, Matchers}
import com.ocp.Example._

class ExampleSpec extends FunSpec with Matchers {

  it("Should run a test") {
    addInts(1,3) shouldBe(4)
  }
}
