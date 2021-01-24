package ru.fdo.bank.finrez.officeservicecommon.query

import org.springframework.data.domain.Pageable

data class FindOfficesByBranchOfficeQuery(
    val branchOfficeId: String,
    val pageable: Pageable
)
