package org.uatu.modules

import org.uatu.apis.AirflowAPI
import org.uatu.clients.AirflowClient
import org.uatu.controllers.AirflowController
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dagModule = module {
    singleOf(::AirflowController)
    singleOf(::AirflowAPI)
    singleOf(::AirflowClient)
}
