package ru.fdo.bank.finrez.officeservicecommon.event

data class BranchOfficeCreatedEvent(
    val branchOfficeId: String,
    val number: String,
    val name: String,
    val macroregion: String,
    val address: String
)
