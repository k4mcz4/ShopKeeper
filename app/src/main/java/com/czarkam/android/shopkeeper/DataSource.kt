package com.czarkam.android.shopkeeper

import com.czarkam.android.shopkeeper.models.ReportEntry

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<ReportEntry> {
            val list = ArrayList<ReportEntry>()

            list.add(
                ReportEntry(
                    "Inwentarz",
                    "Maj:",
                    "Jakis super diagram"
                )
            )
            list.add(
                ReportEntry(
                    "Sprzedaz",
                    "Maj:",
                    "Jakis super diagram"
                )
            )
            list.add(
                ReportEntry(
                    "Sprzedaz",
                    "Maj:",
                    "Jakis super diagram"
                )
            )

            return list
        }
    }
}