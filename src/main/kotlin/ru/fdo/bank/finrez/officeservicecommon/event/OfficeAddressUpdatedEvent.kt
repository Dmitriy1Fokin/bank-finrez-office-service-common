package ru.fdo.bank.finrez.officeservicecommon.event

data class OfficeAddressUpdatedEvent(
    val officeId: String,
    val address: String
)
