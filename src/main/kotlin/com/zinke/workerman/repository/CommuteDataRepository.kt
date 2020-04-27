package com.zinke.workerman.repository

import com.zinke.workerman.domain.CommuteData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommuteDataRepository : JpaRepository<CommuteData, Long> {
    fun getCommuteDataByCommuteId(commuteId: Long): CommuteData?

}