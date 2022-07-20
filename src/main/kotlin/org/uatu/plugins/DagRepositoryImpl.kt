package org.uatu.plugins

import org.uatu.plugins.DagRepository
import org.uatu.plugins.DagApi
import org.uatu.domain.model.dag.GetDagsResponse
import io.ktor.client.call.body


class DagRepositoryImpl(
    private val api: DagApi
): DagRepository {
    override suspend fun getDags(): Any {
        val response = api.getDags()
        val result: GetDagsResponse = response.body()
        print(result)
        return response
    }
}
