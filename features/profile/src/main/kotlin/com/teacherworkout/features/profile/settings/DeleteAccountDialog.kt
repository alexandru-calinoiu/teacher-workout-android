package com.teacherworkout.features.profile.settings

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.teacherworkout.features.profile.R

@Composable
fun DeleteAccountDialog(
    isOpen: Boolean,
    onCloseRequest: () -> Unit,
    onDismissRequest: () -> Unit,
    onDelete: () -> Unit
) {
    GenericDialog(
        isOpen = isOpen,
        onCloseRequest = onCloseRequest,
        onDismissRequest = onDismissRequest,
        iconImageVector = Icons.Outlined.Warning,
        iconContentDescription = stringResource(R.string.question_delete_description),
        mainText = stringResource(R.string.question_delete_account),
        secondaryText = stringResource(R.string.warning_delete_account),
        actionText = stringResource(R.string.label_delete_account)
    ) {
        onCloseRequest()
        onDelete()
    }
}