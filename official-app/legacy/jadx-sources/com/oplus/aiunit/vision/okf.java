package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.reflect.ReflectionException;

/* JADX INFO: loaded from: classes13.dex */
public class okf<T> extends mne<T> {
    public final c14 d;

    public okf(Class<T> cls, int i, int i2) {
        super(i, i2);
        c14 c14VarF = f(cls);
        this.d = c14VarF;
        if (c14VarF != null) {
            return;
        }
        throw new RuntimeException("Class cannot be created (missing no-arg constructor): " + cls.getName());
    }

    @Override // com.oplus.aiunit.vision.mne
    public T c() {
        try {
            return (T) this.d.b(null);
        } catch (Exception e2) {
            throw new GdxRuntimeException("Unable to create new instance: " + this.d.a().getName(), e2);
        }
    }

    public final c14 f(Class<T> cls) {
        try {
            try {
                return kc3.b(cls, null);
            } catch (Exception unused) {
                c14 c14VarC = kc3.c(cls, null);
                c14VarC.c(true);
                return c14VarC;
            }
        } catch (ReflectionException unused2) {
            return null;
        }
    }
}
