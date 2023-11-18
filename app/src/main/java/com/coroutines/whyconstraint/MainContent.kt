package com.coroutines.whyconstraint

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coroutines.whyconstraint.ui.theme.WhyConstraintTheme


@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun MainContent() {
    WhyConstraintTheme {
        val listState = rememberLazyListState()
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            var listItems = mutableListOf<ElementHolder>()
            for (i in 1.rangeTo(149)) {
                listItems.add(ElementHolder(i.toString()))
            }
            BoxWithConstraints(Modifier.fillMaxSize()) {
                LazyColumn(
                    state = listState,
                    contentPadding = PaddingValues(1.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    items(listItems) { item: ElementHolder ->
                        ElementListItem(
                            element = item.itemDescription,
                        )
                    }
                }
            }
        }
    }
}