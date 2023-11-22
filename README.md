# WhyConstraintCrashesInNavHost
This is a companion repo to the question asked on stackoverflow:
https://stackoverflow.com/questions/77505319/android-compose-constraint-layout-in-a-lazycolumn-in-a-navhost-error-replace/77523325#77523325

A very simple setup to reproduce a Compose bug with LazyColumn and NavHost: replace() called on item that was not placed at androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate.replace

Update:
This is indeed a Compose bug, and fixed in version:
constraintlayout-compose:1.1.0-alpha13
