package org.uatu.plugins

import org.uatu.plugins.DagRepository
import org.uatu.plugins.DagApi
import org.uatu.domain.model.DagsDTO
import io.ktor.client.call.body


class DagRepositoryImpl(
    private val api: DagApi
): DagRepository {
    override suspend fun getDags(): DagsDTO {
        val response = api.getDags()
        val result: DagsDTO = response.body()
        print(result)
        return result
    }
}
