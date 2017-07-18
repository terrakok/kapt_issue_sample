package ru.sample

import javax.inject.Inject

/**
 * Created by Konstantin Tskhovrebov (aka @terrakok) on 08.07.17.
 */
class Computer @Inject constructor(
        @ComputerId private val id: java.lang.Long,
        companyInfo: CompanyInfo
) {

    val info = "Manufacturer[$id ${companyInfo.name}]"

}