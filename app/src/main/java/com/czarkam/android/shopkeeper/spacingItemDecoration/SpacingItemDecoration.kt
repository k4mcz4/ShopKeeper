package com.czarkam.android.shopkeeper.spacingItemDecoration

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class SpacingItemDecoration(private val paddingTop: Int,
                            private val paddingLeft: Int,
                            private val paddingRight: Int,
                            private val paddingBottom: Int = 0) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.apply {
            top = paddingTop
            left = paddingLeft
            right = paddingRight
            bottom = paddingBottom
        }
    }
}