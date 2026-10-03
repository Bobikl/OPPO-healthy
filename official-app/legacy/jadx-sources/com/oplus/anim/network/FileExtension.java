package com.oplus.anim.network;

import androidx.annotation.RestrictTo;
import com.oplus.aiunit.vision.hc3;

/* JADX INFO: loaded from: classes19.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public enum FileExtension {
    JSON(hc3.CLASSIC_CONFIG_SUFFIX),
    ZIP(".zip");

    public final String extension;

    FileExtension(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
