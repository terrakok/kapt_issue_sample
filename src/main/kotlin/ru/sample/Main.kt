package ru.sample

import toothpick.Toothpick
import toothpick.config.Module

/**
 * Created by Konstantin Tskhovrebov (aka @terrakok) on 08.07.17.
 */
fun main(args: Array<String>) {
    println("Hello Yann :)")

    val scope = Toothpick.openScope("root")
    scope.installModules(object : Module() {
        init {
            bind(Long::class.java).withName(ComputerId::class.java).to(42L)
            bind(CompanyInfo::class.java).toInstance(CompanyInfo("Terrakok Inc."))
        }
    })

    val computer = scope.getInstance(Computer::class.java)
    println("Computer: ${computer.info}")

    Toothpick.closeScope("root")
}