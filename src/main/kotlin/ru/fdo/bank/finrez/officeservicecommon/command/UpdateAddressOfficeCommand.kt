package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateAddressOfficeCommand(
    @TargetAggregateIdentifier val officeId: String,
    val address: String
)
