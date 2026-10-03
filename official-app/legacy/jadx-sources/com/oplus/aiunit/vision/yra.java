package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class yra extends Paint {
    public yra() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(m0c.c(i, 0, 255));
        } else {
            setColor((m0c.c(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public yra(int i) {
        super(i);
    }

    public yra(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public yra(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
