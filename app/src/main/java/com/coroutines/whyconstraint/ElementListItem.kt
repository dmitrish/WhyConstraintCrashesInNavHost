package com.coroutines.whyconstraint

import android.annotation.SuppressLint
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout


@OptIn(ExperimentalComposeUiApi::class)
@SuppressLint("SuspiciousIndentation")


@Composable
fun HistoryListItem(
    element: String,
    ) {

    ConstraintLayout() {
        val (
            divider, year, description, image,
            overflow
        ) = createRefs()

        Text(
            text = "element:  {$element}",
            modifier = Modifier.constrainAs(year) {
                linkTo(
                    start = parent.start,
                    end = parent.end,
                )
            }
        )
    }
}







