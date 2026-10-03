package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public class qc7 implements TextureData {
    public final kb7 a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15743c;
    public Pixmap.Format d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Pixmap f15744e;
    public boolean f;
    public boolean g = false;

    public qc7(kb7 kb7Var, Pixmap pixmap, Pixmap.Format format, boolean z) {
        this.b = 0;
        this.f15743c = 0;
        this.a = kb7Var;
        this.f15744e = pixmap;
        this.d = format;
        this.f = z;
        if (pixmap != null) {
            this.b = pixmap.u();
            this.f15743c = this.f15744e.s();
            if (format == null) {
                this.d = this.f15744e.o();
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return this.g;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        if (!this.g) {
            throw new GdxRuntimeException("Call prepare() before calling getPixmap()");
        }
        this.g = false;
        Pixmap pixmap = this.f15744e;
        this.f15744e = null;
        return pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean f() {
        return this.f;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return this.d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f15743c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Pixmap;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.g) {
            throw new GdxRuntimeException("Already prepared");
        }
        if (this.f15744e == null) {
            if (this.a.d().equals("cim")) {
                this.f15744e = com.badlogic.gdx.graphics.b.a(this.a);
            } else {
                this.f15744e = new Pixmap(this.a);
            }
            this.b = this.f15744e.u();
            this.f15743c = this.f15744e.s();
            if (this.d == null) {
                this.d = this.f15744e.o();
            }
        }
        this.g = true;
    }

    public String toString() {
        return this.a.toString();
    }
}
