package main.kotlin

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

object Routes {
    fun Routing.brands() {
        get("/brands") {
            call.respondText("FOO")
        }
    }
}