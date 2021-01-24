package ru.fdo.bank.finrez.officeservicecommon.event

data class BranchOfficeAddressUpdatedEvent(
    val branchOfficeId: String,
    val address: String
)
