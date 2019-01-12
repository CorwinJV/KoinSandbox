package com.application.corwinjv.koinsandbox.koin

import org.koin.dsl.module.module

val appModule = module {
    single<HelloRepository> { HelloRepositoryImpl() }

    factory { MySimplePresenter(get()) }
}