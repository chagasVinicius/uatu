package org.uatu

import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.cookies.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.config.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.testing.*
import kotlin.test.*

class ApplicationTest {
    @Test
    val application = TestApplication(
        externalServices = {
            hosts("http://google.com", "https://google.com", "http://google.com:8080") {
                routing {
                    get("/") {
                        call.respond("Hello, world!")
                    }
                }
            }
        }
    )
}
