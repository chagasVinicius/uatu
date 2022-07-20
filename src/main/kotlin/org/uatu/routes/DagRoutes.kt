package org.uatu.routes

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.uatu.plugins.DagRepositoryImpl
import org.koin.ktor.ext.inject

fun Route.DagRoute() {

    val dagRepository by inject<DagRepositoryImpl>()

    get("/dags") {
        val response = dagRepository.getDags()
        call.respond("Hello World")
    }
}
