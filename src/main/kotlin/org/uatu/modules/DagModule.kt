package org.uatu.modules

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.uatu.plugins.DagRepository
import org.uatu.plugins.DagRepositoryImpl
import org.uatu.plugins.DagApi

val DagModule = module {
    singleOf(::DagRepositoryImpl) { bind<DagRepository>() }
    singleOf(::DagApi)
}
