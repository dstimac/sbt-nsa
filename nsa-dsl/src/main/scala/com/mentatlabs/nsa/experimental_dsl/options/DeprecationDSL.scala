package com.mentatlabs.nsa
package experimental_dsl

trait DeprecationDSL extends ExperimentalDSL {
  object deprecation {
    val unary_- = `-deprecation`
  }
}
