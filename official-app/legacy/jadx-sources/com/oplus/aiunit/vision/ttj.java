package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.a;

/* JADX INFO: loaded from: classes13.dex */
public class ttj<T extends com.badlogic.gdx.graphics.a> implements Comparable<ttj<T>> {
    public T i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Texture.TextureFilter f17148j;
    public Texture.TextureFilter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Texture.TextureWrap f17149l;
    public Texture.TextureWrap m;

    public ttj(T t, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.i = null;
        d(t, textureFilter, textureFilter2, textureWrap, textureWrap2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(ttj<T> ttjVar) {
        if (ttjVar == this) {
            return 0;
        }
        T t = this.i;
        int i = t == null ? 0 : t.i;
        T t2 = ttjVar.i;
        int i2 = t2 == null ? 0 : t2.i;
        if (i != i2) {
            return i - i2;
        }
        int iP = t == null ? 0 : t.p();
        T t3 = ttjVar.i;
        int iP2 = t3 == null ? 0 : t3.p();
        if (iP != iP2) {
            return iP - iP2;
        }
        Texture.TextureFilter textureFilter = this.f17148j;
        if (textureFilter != ttjVar.f17148j) {
            int gLEnum = textureFilter == null ? 0 : textureFilter.getGLEnum();
            Texture.TextureFilter textureFilter2 = ttjVar.f17148j;
            return gLEnum - (textureFilter2 != null ? textureFilter2.getGLEnum() : 0);
        }
        Texture.TextureFilter textureFilter3 = this.k;
        if (textureFilter3 != ttjVar.k) {
            int gLEnum2 = textureFilter3 == null ? 0 : textureFilter3.getGLEnum();
            Texture.TextureFilter textureFilter4 = ttjVar.k;
            return gLEnum2 - (textureFilter4 != null ? textureFilter4.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap = this.f17149l;
        if (textureWrap != ttjVar.f17149l) {
            int gLEnum3 = textureWrap == null ? 0 : textureWrap.getGLEnum();
            Texture.TextureWrap textureWrap2 = ttjVar.f17149l;
            return gLEnum3 - (textureWrap2 != null ? textureWrap2.getGLEnum() : 0);
        }
        Texture.TextureWrap textureWrap3 = this.m;
        if (textureWrap3 == ttjVar.m) {
            return 0;
        }
        int gLEnum4 = textureWrap3 == null ? 0 : textureWrap3.getGLEnum();
        Texture.TextureWrap textureWrap4 = ttjVar.m;
        return gLEnum4 - (textureWrap4 != null ? textureWrap4.getGLEnum() : 0);
    }

    public void d(T t, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2) {
        this.i = t;
        this.f17148j = textureFilter;
        this.k = textureFilter2;
        this.f17149l = textureWrap;
        this.m = textureWrap2;
    }

    public <V extends T> void e(ttj<V> ttjVar) {
        this.i = ttjVar.i;
        this.f17148j = ttjVar.f17148j;
        this.k = ttjVar.k;
        this.f17149l = ttjVar.f17149l;
        this.m = ttjVar.m;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ttj)) {
            return false;
        }
        ttj ttjVar = (ttj) obj;
        return ttjVar.i == this.i && ttjVar.f17148j == this.f17148j && ttjVar.k == this.k && ttjVar.f17149l == this.f17149l && ttjVar.m == this.m;
    }

    public int hashCode() {
        T t = this.i;
        long jP = ((((long) (t == null ? 0 : t.i)) * 811) + ((long) (t == null ? 0 : t.p()))) * 811;
        Texture.TextureFilter textureFilter = this.f17148j;
        long gLEnum = (jP + ((long) (textureFilter == null ? 0 : textureFilter.getGLEnum()))) * 811;
        Texture.TextureFilter textureFilter2 = this.k;
        long gLEnum2 = (gLEnum + ((long) (textureFilter2 == null ? 0 : textureFilter2.getGLEnum()))) * 811;
        Texture.TextureWrap textureWrap = this.f17149l;
        long gLEnum3 = (gLEnum2 + ((long) (textureWrap == null ? 0 : textureWrap.getGLEnum()))) * 811;
        Texture.TextureWrap textureWrap2 = this.m;
        long gLEnum4 = gLEnum3 + ((long) (textureWrap2 != null ? textureWrap2.getGLEnum() : 0));
        return (int) ((gLEnum4 >> 32) ^ gLEnum4);
    }

    public ttj(T t) {
        this(t, null, null, null, null);
    }

    public ttj() {
        this.i = null;
    }
}
