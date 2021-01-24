package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class ChangeBranchOfficeCommand(
    @TargetAggregateIdentifier val officeId: String,
    val branchOfficeId: String
)
