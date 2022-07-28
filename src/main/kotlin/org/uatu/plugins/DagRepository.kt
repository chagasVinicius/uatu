package org.uatu.plugins

import org.uatu.domain.model.DagsDTO

interface DagRepository {
    suspend fun getDags(): DagsDTO
}
