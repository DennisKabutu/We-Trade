package com.example.androiddevchallenge

data class Positions(
    val abbre: String,
    val fullName: String,
    val gain: Double,
    val amount:String,
    val graph:Int
)


val CompaniesPosition = listOf<Positions>(
    Positions(
        abbre = "ALK",
        fullName = "Alaska Air Group, Inc.",
        gain = -0.54,
        amount = "$ 7918",
        graph = R.drawable.home_alk

    ),
    Positions(
        abbre = "BA",
        fullName = "Boeing Co.",
        gain = +4.18,
        amount = "$ 1,293",
        graph = R.drawable.home_ba

    ),
    Positions(
        abbre = "DAL",
        fullName = "Delta Airlines Inc.",
        gain = -0.54,
        amount = "$ 893.50",
        graph = R.drawable.home_dal

    ),
    Positions(
        abbre = "EXPE",
        fullName = "Expedia Group Inc.",
        gain = +2.51,
        amount = "$ 12,301",
        graph = R.drawable.home_exp

    ),
    Positions(
        abbre = "EADSY",
        fullName = "Airbus SE",
        gain = +1.38,
        amount = "$12,301",
        graph = R.drawable.home_eadsy

    ),
    Positions(
        abbre = "JBLU",
        fullName = "Jetblue Airways Corp",
        gain = +1.56,
        amount = "$8,521",
        graph = R.drawable.home_jblu

    ),
    Positions(
        abbre = "MAR",
        fullName = "Marriott International Inc",
        gain = +2.75,
        amount = "$ 521",
        graph = R.drawable.home_mar

    ),
    Positions(
        abbre = "CCL",
        fullName = "Carnival Corp",
        gain = + 0.14,
        amount = "$ 521",
        graph = R.drawable.home_ccl

    ),
    Positions(
        abbre = "RCL",
        fullName = "Royal Caribbean Cruises",
        gain = + 1.69,
        amount = "$ 9,184",
        graph = R.drawable.home_rcl

    ),
    Positions(
        abbre = "TRVL",
        fullName = "Travelocity Inc",
        gain = + 3.23,
        amount = "$ 654",
        graph = R.drawable.home_trvl

    )

)