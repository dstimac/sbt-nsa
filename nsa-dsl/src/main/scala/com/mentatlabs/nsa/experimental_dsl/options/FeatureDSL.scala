package com.mentatlabs.nsa
package experimental_dsl

trait FeatureDSL extends ExperimentalDSL {
  object feature {
    val unary_- = `-feature`
  }
}
