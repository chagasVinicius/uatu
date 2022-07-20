package org.uatu.plugins

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.header
import io.ktor.client.statement.HttpResponse
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.BasicAuthConfig
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders

class DagApi {
    val client = HttpClient(CIO) {

        install(ContentNegotiation) {
            json()
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

    suspend fun getDags(): HttpResponse = client.get("http://localhost:8080/api/v1/dags")
}
