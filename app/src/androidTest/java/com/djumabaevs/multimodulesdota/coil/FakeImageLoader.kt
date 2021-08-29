package com.djumabaevs.multimodulesdota.coil

import android.content.Context
import coil.ImageLoader
import coil.request.Disposable

class FakeImageLoader {
    companion object Factory {
        fun build(context: Context): ImageLoader {

            private val disposable = object: Disposable {
                override val isDisposed get() = true
                override fun dispose() {}
                override suspend fun await() {}
            }
        }
    }
}