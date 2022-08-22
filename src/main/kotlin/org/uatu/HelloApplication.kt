package org.uatu

import io.ktor.server.application.*
import io.ktor.server.engine.commandLineEnvironment
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger
import org.uatu.routes.DagRoute
import org.uatu.modules.dagModule

fun main(args: Array<String>) {
    // Start Ktor
    embeddedServer(Netty, commandLineEnvironment(args)).start(wait = true)
}

fun Application.main() {
    // Install Ktor features
//    install(DefaultHeaders)
//    install(CallLogging)
    install(Koin) {
        slf4jLogger()
        modules(helloAppModule, dagModule)
    }

    // Lazy inject HelloService
    val service by inject<HelloService>()

    // Routing section
    routing {
        get("/hello") {
            call.respondText(service.sayHello())
        }
        DagRoute()
    }
}
