package com.zinke.workerman.domain

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "`commute_data`")
data class CommuteData (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val commuteId: Long,

        val workerId:Long,

        @Column(insertable = false, updatable = false)
        var attendanceAt: LocalDateTime? = null,  //출근시간

        @Column(insertable = false, updatable = false)
        var leaveWorkAt: LocalDateTime? = null,  //퇴근시간

        @Column(insertable = false, updatable = false)
        var workingDate: LocalDate? = null, //출근일자

        @Column(insertable = false, updatable = false)
        var workingHours: LocalDateTime? = null,  //일한 시간

        val holiday:Int? = null,

        val memo:String? = null
        )
