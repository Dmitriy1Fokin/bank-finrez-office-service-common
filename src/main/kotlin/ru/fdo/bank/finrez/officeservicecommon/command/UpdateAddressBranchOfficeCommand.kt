package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateAddressBranchOfficeCommand(
    @TargetAggregateIdentifier val branchOfficeId: String,
    val address: String
)
