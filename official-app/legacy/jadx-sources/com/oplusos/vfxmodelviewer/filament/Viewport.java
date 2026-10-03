package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes9.dex */
public class Viewport {
    public int bottom;

    @IntRange(from = 0)
    public int height;
    public int left;

    @IntRange(from = 0)
    public int width;

    public Viewport(int i, int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        this.left = i;
        this.bottom = i2;
        this.width = i3;
        this.height = i4;
    }
}
