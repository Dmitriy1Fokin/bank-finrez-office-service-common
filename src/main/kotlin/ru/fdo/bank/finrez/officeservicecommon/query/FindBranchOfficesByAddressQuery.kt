package ru.fdo.bank.finrez.officeservicecommon.query

import org.springframework.data.domain.Pageable

data class FindBranchOfficesByAddressQuery(
    val address: String,
    val pageable: Pageable
)
