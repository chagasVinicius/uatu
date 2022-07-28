package org.uatu.domain.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class DagsDTO(
    val dags: List<DagDTO>,
    @SerialName("total_entries") val totalEntries: Int
)

@Serializable
data class DagDTO(
   @SerialName("dag_id") val dagId: String,
   @SerialName("root_dag_id") val rootDagId: String? = null,
   @SerialName("is_paused") val isPaused: Boolean? = null,
   @SerialName("is_active") val isActive: Boolean? = null,
   @SerialName("is_subdag") val isSubDag: Boolean,
   @SerialName("last_parsed_time") val lastParsedTime: String? = null,
   @SerialName("last_pickled") val lastPickled: String? = null,
   @SerialName("last_expired") val lastExpired: String? = null,
   @SerialName("scheduler_lock") val schedulerLock: Boolean? = null,
   @SerialName("pickle_id") val pickleId: String? = null,
   @SerialName("default_view") val defaultView: String? = null,
   @SerialName("fileloc") val fileLoc: String,
   @SerialName("file_token") val fileToken: String,
   @SerialName("owners")val owners: Array<String>,
   @SerialName("description") val description: String? = null,
   @SerialName("schedule_interval") val scheduleInterval: Map<String, String>? = null,
   @SerialName("timetable_description") val timetableDescription: String? = null,
   @SerialName("tags") val tags: List<Map<String, String>>? = null,
   @SerialName("max_active_tasks") val maxActiveTasks: Int? = null,
   @SerialName("max_active_runs") val maxActiveRuns: Int? = null,
   @SerialName("has_task_concurrency_limits") val hasTaskConcurrencyLimits: Boolean? = null,
   @SerialName("has_import_errors") val hasImportErrors: Boolean? = null,
   @SerialName("next_dagrun") val nextDagRun: String? = null,
   @SerialName("next_dagrun_datainterval_start") val nextDagRunDataIntervalStart: String? = null,
   @SerialName("next_dagrun_datainterval_end") val nextDagRunDataIntervalEnd: String? = null,
   @SerialName("next_dagrun_createafter") val nextDagRunCreateAfter: String? = null
)
