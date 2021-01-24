package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateNameBranchOfficeCommand(
    @TargetAggregateIdentifier val branchOfficeId: String,
    val name: String
)
