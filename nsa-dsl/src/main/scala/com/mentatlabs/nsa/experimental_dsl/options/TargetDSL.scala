package com.mentatlabs.nsa
package experimental_dsl

trait TargetDSL extends ExperimentalDSL {
  object target {
    val unary_- = `-target`
  }
}
