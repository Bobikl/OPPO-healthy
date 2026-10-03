package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.math.Rectangle;
import com.oplus.aiunit.vision.tke;

/* JADX INFO: loaded from: classes13.dex */
public class PixmapPacker$PixmapPackerRectangle extends Rectangle {
    public int offsetX;
    public int offsetY;
    public int originalHeight;
    public int originalWidth;
    public int[] pads;
    public tke page;
    public int[] splits;

    public PixmapPacker$PixmapPackerRectangle(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.offsetX = 0;
        this.offsetY = 0;
        this.originalWidth = i3;
        this.originalHeight = i4;
    }

    public PixmapPacker$PixmapPackerRectangle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4);
        this.offsetX = i5;
        this.offsetY = i6;
        this.originalWidth = i7;
        this.originalHeight = i8;
    }
}
