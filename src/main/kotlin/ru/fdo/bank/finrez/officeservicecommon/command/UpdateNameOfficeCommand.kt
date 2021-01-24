package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateNameOfficeCommand(
    @TargetAggregateIdentifier val officeId: String,
    val name: String
)
