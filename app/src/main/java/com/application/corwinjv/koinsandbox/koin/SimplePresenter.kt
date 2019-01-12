package com.application.corwinjv.koinsandbox.koin

class MySimplePresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}