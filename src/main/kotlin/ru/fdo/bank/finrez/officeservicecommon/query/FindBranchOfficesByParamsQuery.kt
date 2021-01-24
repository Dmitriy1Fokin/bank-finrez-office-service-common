package ru.fdo.bank.finrez.officeservicecommon.query

import org.springframework.data.domain.Pageable

data class FindBranchOfficesByParamsQuery(
    val searchParameters: Map<String, String>,
    val pageable: Pageable
)
