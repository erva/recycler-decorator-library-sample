package com.ozh.dd.example.sample

import android.graphics.Color
import androidx.annotation.ColorInt
import com.ozh.dd.example.sample.Rules.END
import com.ozh.dd.example.sample.Rules.MIDDLE

/**
 * Модель для описания разделителя
 * @param color цвет разделителя
 * @param height высота разделителя
 * @param paddingStart отступ слева для разделителя
 * @param paddingEnd отступ справа для разделителя
 * @param rule rule for draw item divider
 */
class Gap(
    @ColorInt val color: Int = Color.TRANSPARENT,
    val height: Int = 0,
    val paddingStart: Int = 0,
    val paddingEnd: Int = 0,
    @DividerRule val rule: Int = MIDDLE or END
)

const val UNDEFINE_VIEW_HOLDER: Int = -1