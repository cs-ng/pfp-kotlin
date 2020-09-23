package main.kotlin

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import main.kotlin.Routes.brands

fun main() {
    embeddedServer(Netty, watchPaths = listOf("pfp-kotlin"), port = 8080, module = Application::cart).start(true)
}

fun Application.cart() {
    routing {
        brands()
    }
}
