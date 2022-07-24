package org.uatu.domain.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class DagDTO(
   @SerialName("dag_id") val dagId: String,
   @SerialName("root_dag_id") val rootDagId: String?,
   @SerialName("is_paused") val isPaused: Boolean?,
   @SerialName("is_active") val isActive: Boolean?,
   @SerialName("is_subdag") val isSubDag: Boolean,
   @SerialName("last_parsed_time") val lastParsedTime: String?,
   @SerialName("last_pickled") val lastPickled: String?,
   @SerialName("last_expired") val lastExpired: String?,
   @SerialName("scheduler_lock") val schedulerLock: Boolean?,
   @SerialName("pickle_id") val pickleId: String?,
   @SerialName("default_view") val defaultView: String?,
   @SerialName("fileloc") val fileLoc: String,
   @SerialName("file_token") val fileToken: String,
   @SerialName("owners")val owners: Array<String>,
   @SerialName("description")val description: String?,
   @SerialName("schedule_interval") val scheduleInterval: Any?,
   @SerialName("timetable_description") val timetableDescription: String?,
   @SerialName("tags") val tags: Any?,
   @SerialName("max_active_tasks") val maxActiveTasks: Int?,
   @SerialName("max_active_runs") val maxActiveRuns: Int?,
   @SerialName("has_task_concurrency_limits") val hasTaskConcurrencyLimits: Boolean?,
   @SerialName("has_import_errors") val hasImportErrors: Boolean?,
   @SerialName("next_dagrun") val nextDagRun: String?,
   @SerialName("next_dagrun_datainterval_start") val nextDagRunDataIntervalStart: String?,
   @SerialName("next_dagrun_datainterval_end") val nextDagRunDataIntervalEnd: String?,
   @SerialName("next_dagrun_createafter") val nextDagRunCreateAfter: String?
)
