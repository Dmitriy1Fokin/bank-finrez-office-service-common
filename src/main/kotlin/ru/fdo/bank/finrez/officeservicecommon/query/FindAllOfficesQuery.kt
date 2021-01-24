package ru.fdo.bank.finrez.officeservicecommon.query

import org.springframework.data.domain.Pageable

data class FindAllOfficesQuery(
    val pageable: Pageable
)
