package com.carloosx.gesturerecorder.dialogs;

import android.content.Intent;

public interface DialogResultListener {
    void onDialogResult(int requestCode, int resultCode, Intent data);
}
