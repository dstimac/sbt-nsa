package com.mentatlabs.nsa
package experimental_dsl

trait PrintDSL extends ExperimentalDSL {
  object print {
    val unary_- = `-print`
  }
}
