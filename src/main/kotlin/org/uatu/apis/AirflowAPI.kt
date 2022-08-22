package org.uatu.apis

import io.ktor.client.statement.HttpResponse
import org.uatu.clients.AirflowClient
import io.ktor.client.request.get

class AirflowAPI(val airflowClient: AirflowClient) {
    val client = airflowClient.client
    val url: String = "http://localhost:8080/"
    suspend fun getDags(): HttpResponse = client.get(url + "/api/v1/dags")
}
