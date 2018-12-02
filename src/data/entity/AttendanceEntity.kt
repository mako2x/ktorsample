package com.example.data.entity

import com.example.graphql.AttendanceStatus
import java.time.LocalDate

data class AttendanceEntity(val id: Int,
                            val userId: Int,
                            val date: LocalDate,
                            val status: AttendanceStatus)