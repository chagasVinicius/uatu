package org.uatu.clients

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.header
import io.ktor.client.statement.HttpResponse
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import kotlinx.serialization.json.Json
import io.ktor.serialization.kotlinx.json.json
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders

class AirflowClient {
    val client = HttpClient(CIO) {

        install(ContentNegotiation) {
            json(Json {
                    prettyPrint = true
                    isLenient = true
                })
        }

        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    "My customization: " + message
                }

            }
            level = LogLevel.ALL
        }

    // install(ResponseObserver) {
    //     onResponse { response ->
    //         Log.d("HTTP status:", "${response.status.value}")
    //     }
    // }

        install(Auth) {
            basic {
                credentials {
                    BasicAuthCredentials(username = "airflow", password = "airflow")
                }
            }
        }

        install(DefaultRequest) {
            header(HttpHeaders.ContentType, ContentType.Application.Json)
        }
    }
}
