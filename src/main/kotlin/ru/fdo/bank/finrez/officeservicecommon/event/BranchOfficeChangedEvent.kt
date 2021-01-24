package ru.fdo.bank.finrez.officeservicecommon.event

data class BranchOfficeChangedEvent(
    val officeId: String,
    val branchOfficeId: String
)
