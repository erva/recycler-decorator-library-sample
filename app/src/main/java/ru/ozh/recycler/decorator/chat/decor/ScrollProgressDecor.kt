package ru.surfstudio.android.recycler.decorator.sample.easyadapter.chat.decor

import android.graphics.*
import android.util.Log
import androidx.annotation.FloatRange
import androidx.recyclerview.widget.RecyclerView
import ru.surfstudio.android.recycler.decorator.Decorator
import ru.surfstudio.android.recycler.decorator.sample.toPx

abstract class ScrollProgressDecor : Decorator.RecyclerViewDecor {

    abstract fun draw(canvas: Canvas, recyclerView: RecyclerView, state: RecyclerView.State, @FloatRange(from = .0, to = 1.0) progress: Float)

    override fun draw(canvas: Canvas, recyclerView: RecyclerView, state: RecyclerView.State) {

        val currentOffset = recyclerView.computeVerticalScrollOffset()
        val maxOffset = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()
        val scrollProgress = currentOffset.toFloat() / maxOffset
        draw(canvas, recyclerView, state, scrollProgress)
    }
}