package com.zinke.workerman.controller

import com.zinke.workerman.domain.CommuteData
import com.zinke.workerman.service.CommuteDataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v1/worker/{workId}")
class CommuteDataController (
        val commuteDataService: CommuteDataService
) {
    @GetMapping("/data/{commuteId}")
    fun getCommuteData(
         @PathVariable workId: Int,
         @PathVariable (required = true) commuteId: Long
    ): Mono<CommuteData> = commuteDataService.getCommuteData(commuteId)
}