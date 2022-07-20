package org.uatu.plugins

import org.uatu.routes.DagRoute
import io.ktor.server.application.Application
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        DagRoute()
    }
}
