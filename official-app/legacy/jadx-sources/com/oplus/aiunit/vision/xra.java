package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class xra extends Paint {
    public xra() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(l0c.c(i, 0, 255));
        } else {
            setColor((l0c.c(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public xra(int i) {
        super(i);
    }

    public xra(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public xra(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
