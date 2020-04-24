package com.zinke.workerman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkermanApplication

fun main(args: Array<String>) {
    runApplication<WorkermanApplication>(*args)
}
