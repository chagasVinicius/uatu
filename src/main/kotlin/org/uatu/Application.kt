package org.uatu

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.uatu.plugins.configureRouting
import org.uatu.plugins.configureSerialization
import org.koin.ktor.plugin.Koin
import org.uatu.modules.DagModule

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8888) {
        configureRouting()
        configureSerialization()
        install (Koin){
            modules(DagModule)
    }
    }.start(wait = true)
}
