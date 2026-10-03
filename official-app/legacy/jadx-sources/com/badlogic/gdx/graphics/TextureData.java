package com.badlogic.gdx.graphics;

import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.qc7;

/* JADX INFO: loaded from: classes13.dex */
public interface TextureData {

    public enum TextureDataType {
        Pixmap,
        Custom
    }

    public static class a {
        public static TextureData a(kb7 kb7Var, Pixmap.Format format, boolean z) {
            if (kb7Var == null) {
                return null;
            }
            if (kb7Var.g().endsWith(".cim")) {
                return new qc7(kb7Var, b.a(kb7Var), format, z);
            }
            if (kb7Var.g().endsWith(".etc1")) {
                return new com.badlogic.gdx.graphics.glutils.a(kb7Var, z);
            }
            return (kb7Var.g().endsWith(".ktx") || kb7Var.g().endsWith(".zktx")) ? new com.badlogic.gdx.graphics.glutils.b(kb7Var, z) : new qc7(kb7Var, new Pixmap(kb7Var), format, z);
        }
    }

    boolean a();

    boolean b();

    void c(int i);

    Pixmap d();

    boolean f();

    boolean g();

    Pixmap.Format getFormat();

    int getHeight();

    TextureDataType getType();

    int getWidth();

    void prepare();
}
