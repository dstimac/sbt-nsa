package com.mentatlabs.nsa
package experimental_dsl

trait YDSL extends ExperimentalDSL {
  object Y {
    val unary_- = `-Y`
  }
}
