package ru.fdo.bank.finrez.officeservicecommon.event

data class OfficeCreatedEvent(
    val officeId: String,
    val number: String,
    val name: String,
    val address: String,
    val branchOfficeId: String
)
