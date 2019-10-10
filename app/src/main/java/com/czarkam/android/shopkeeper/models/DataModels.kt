package com.czarkam.android.shopkeeper.models

data class ReportEntry (
    var reportTitle: String,
    var reportName: String,
    var reportDiagram: String // TODO: Change it to Diagram object
)

data class ItemEntry (
    var sku: String,
    var itemName: String,
    var priceNet: Float
)
