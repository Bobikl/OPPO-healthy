package com.oplus.aiunit.vision;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class pwa implements TextWatcher {
    public static final int DEFAULT_MAX_CODE_POINT_COUNT = 190;
    public static final int DEFAULT_MAX_NAME_CODE_POINT_COUNT = 45;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f15530j;

    public pwa(int i, EditText editText) {
        this.i = i;
        this.f15530j = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            return;
        }
        String string = editable.toString();
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= this.i) {
            return;
        }
        int iCodePointCount = string.codePointCount(0, string.length());
        int i = this.i;
        if (iCodePointCount > i) {
            string = string.substring(0, string.offsetByCodePoints(0, i));
        }
        int iCodePointCount2 = string.codePointCount(0, string.length());
        while (bytes.length > this.i) {
            string = string.substring(0, string.offsetByCodePoints(0, iCodePointCount2));
            bytes = string.getBytes(StandardCharsets.UTF_8);
            iCodePointCount2--;
        }
        EditText editText = this.f15530j;
        if (editText != null) {
            editText.setText(string);
            this.f15530j.setSelection(string.length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
