package org.uatu.plugins

import org.uatu.domain.model.DagDTO

interface DagRepository {
    suspend fun getDags(): DagDTO
}
