package ru.fdo.bank.finrez.officeservicecommon.event

data class OfficeNameUpdatedEvent(
    val officeId: String,
    val name: String
)
