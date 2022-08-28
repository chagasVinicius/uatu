package org.uatu.controllers

import org.uatu.apis.AirflowAPI
import org.uatu.models.dag.DagDTO
import org.koin.ktor.ext.inject
import io.ktor.client.call.body
import org.uatu.models.dag.DagsDTO

class AirflowController(
    val airflowApi: AirflowAPI
) {

    suspend fun getDags(): List<DagDTO> {
        val airflowResponse = airflowApi.getDags()
        val result: DagsDTO = airflowResponse.body()
        return result.dags
    }
}
