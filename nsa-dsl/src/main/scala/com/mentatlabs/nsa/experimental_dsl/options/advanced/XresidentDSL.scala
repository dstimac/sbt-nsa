package com.mentatlabs.nsa
package experimental_dsl

trait XresidentDSL extends ExperimentalDSL {
  object Xresident {
    val unary_- = `-Xresident`
  }
}
