package org.uatu

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.netty.EngineMain
import org.uatu.plugins.configureRouting
import org.uatu.plugins.configureSerialization
import org.koin.ktor.plugin.Koin
import org.uatu.modules.DagModule

fun main(args: Array<String>): Unit =
    EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    install (Koin){
        modules(DagModule)
    }
}
