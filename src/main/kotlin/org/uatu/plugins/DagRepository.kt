package org.uatu.plugins

import org.uatu.domain.model.dag.GetDagsResponse

interface DagRepository {
    suspend fun getDags(): Any
}
