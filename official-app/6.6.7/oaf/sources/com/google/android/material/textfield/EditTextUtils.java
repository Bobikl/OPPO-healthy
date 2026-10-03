package com.google.android.material.textfield;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(@NonNull EditText editText) {
        return editText.getInputType() != 0;
    }
}
