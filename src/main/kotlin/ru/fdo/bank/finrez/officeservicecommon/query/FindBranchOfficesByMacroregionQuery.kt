package ru.fdo.bank.finrez.officeservicecommon.query

import org.springframework.data.domain.Pageable

data class FindBranchOfficesByMacroregionQuery(
    val macroregion: String,
    val pageable: Pageable
)
