package org.uatu.domain.model.dag

import kotlinx.serialization.Serializable
import org.uatu.domain.model.dag.DagDTO

@Serializable
data class GetDagsResponse(
    val dags: List<DagDTO>
)
