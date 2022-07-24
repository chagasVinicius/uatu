package org.uatu.plugins

import org.uatu.plugins.DagRepository
import org.uatu.plugins.DagApi
import org.uatu.domain.model.DagDTO
import io.ktor.client.call.body


class DagRepositoryImpl(
    private val api: DagApi
): DagRepository {
    override suspend fun getDags(): DagDTO {
        val response = api.getDags()
        val result: DagDTO = response.body()
        print(result)
        return result
    }
}
