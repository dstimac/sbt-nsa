package com.mentatlabs.nsa
package experimental_dsl

trait HelpDSL extends ExperimentalDSL {
  object help {
    val unary_- = `-help`
  }
}
