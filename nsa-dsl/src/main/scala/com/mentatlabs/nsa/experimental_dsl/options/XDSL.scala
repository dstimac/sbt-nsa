package com.mentatlabs.nsa
package experimental_dsl

trait XDSL extends ExperimentalDSL {
  object X {
    val unary_- = `-X`
  }
}
