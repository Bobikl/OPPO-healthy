package com.badlogic.gdx.graphics.g2d;

/* JADX INFO: loaded from: classes13.dex */
public enum PixmapPackerIO$ImageFormat {
    CIM(".cim"),
    PNG(".png");

    private final String extension;

    PixmapPackerIO$ImageFormat(String str) {
        this.extension = str;
    }

    public String getExtension() {
        return this.extension;
    }
}
