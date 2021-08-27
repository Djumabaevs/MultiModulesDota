package com.djumabaevs.core

sealed class ProgressBarState {

    object Loading: ProgressBarState()

    object Idle: ProgressBarState()
}
