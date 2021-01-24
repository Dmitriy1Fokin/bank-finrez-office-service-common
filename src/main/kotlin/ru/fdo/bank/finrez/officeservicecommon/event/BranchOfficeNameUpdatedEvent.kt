package ru.fdo.bank.finrez.officeservicecommon.event

data class BranchOfficeNameUpdatedEvent(
    val branchOfficeId: String,
    val name: String
)
