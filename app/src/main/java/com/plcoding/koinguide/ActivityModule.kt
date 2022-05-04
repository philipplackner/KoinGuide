package com.plcoding.koinguide

import org.koin.core.qualifier.named
import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity> {
        scoped(qualifier = named("hello")) { "Hello" }
        scoped(qualifier = named("bye")) { "Bye" }
    }
}