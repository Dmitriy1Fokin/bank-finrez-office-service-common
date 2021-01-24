package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class CreateOfficeCommand(
    @TargetAggregateIdentifier val officeId: String,
    val number: String,
    val name: String,
    val address: String,
    val branchOfficeId: String
)
