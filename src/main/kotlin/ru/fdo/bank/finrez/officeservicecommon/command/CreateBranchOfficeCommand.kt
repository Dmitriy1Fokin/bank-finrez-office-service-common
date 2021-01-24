package ru.fdo.bank.finrez.officeservicecommon.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class CreateBranchOfficeCommand(
    @TargetAggregateIdentifier val branchOfficeId: String,
    val number: String,
    val name: String,
    val macroregion: String,
    val address: String
)
