package com.example.plugins

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*


fun Application.configureStatusPages() {
    install(io.ktor.features.StatusPages) {
        status(HttpStatusCode.NotFound) {
            call.respond(
                message = "Page Not Found",
                status = HttpStatusCode.NotFound
            )
        }
    }
}