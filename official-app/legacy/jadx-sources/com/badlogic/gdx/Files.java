package com.badlogic.gdx;

import com.oplus.aiunit.vision.kb7;

/* JADX INFO: loaded from: classes13.dex */
public interface Files {

    public enum FileType {
        Classpath,
        Internal,
        External,
        Absolute,
        Local
    }

    kb7 a(String str);

    String b();

    kb7 c(String str, FileType fileType);

    String d();

    kb7 e(String str);
}
