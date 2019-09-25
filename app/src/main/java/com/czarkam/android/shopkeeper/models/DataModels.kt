package com.czarkam.android.shopkeeper.models

data class BlogPost (
    var title: String,
    var body: String,
    var image: String,
    var username: String
)

data class DashboardEntry(
    var title: String,
    var values: Int
)