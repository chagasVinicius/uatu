package org.uatu.routes

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject
import org.uatu.controllers.AirflowController

fun Route.DagRoute() {
    val airflowController by inject<AirflowController>()

    get("/dags") {
        call.respond(airflowController.getDags()[0])
    }
}
