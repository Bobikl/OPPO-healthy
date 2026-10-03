package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class uke implements TextureData {
    public final Pixmap a;
    public final Pixmap.Format b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17506c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17507e;

    public uke(Pixmap pixmap, Pixmap.Format format, boolean z, boolean z2) {
        this(pixmap, format, z, z2, false);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f17507e;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        return this.a;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean f() {
        return this.f17506c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        return this.d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.a.s();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.a.u();
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        throw new GdxRuntimeException("prepare() must not be called on a PixmapTextureData instance as it is already prepared.");
    }

    public uke(Pixmap pixmap, Pixmap.Format format, boolean z, boolean z2, boolean z3) {
        this.a = pixmap;
        this.b = format == null ? pixmap.o() : format;
        this.f17506c = z;
        this.d = z2;
        this.f17507e = z3;
    }
}
