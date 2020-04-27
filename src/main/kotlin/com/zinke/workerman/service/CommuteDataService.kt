package com.zinke.workerman.service

import com.zinke.workerman.domain.CommuteData
import com.zinke.workerman.repository.CommuteDataRepository
import io.delibird.productman.exception.RestException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CommuteDataService (val commuteDataRepository: CommuteDataRepository){
    fun getCommuteData(commuteId: Long): Mono<CommuteData> {
        return Mono.just(commuteId)
                .map{
                    commuteDataRepository.getCommuteDataByCommuteId(commuteId)
                }
    }
}
