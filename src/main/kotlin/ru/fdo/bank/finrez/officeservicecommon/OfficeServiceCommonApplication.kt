package ru.fdo.bank.finrez.officeservicecommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class OfficeServiceCommonApplication

fun main(args: Array<String>) {
	runApplication<OfficeServiceCommonApplication>(*args)
}
