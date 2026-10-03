package com.oplus.oms.split.full.splitload;

import android.content.Intent;
import com.oplus.aiunit.vision.ajd;
import com.oplus.aiunit.vision.asm;
import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.w7i;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20037e = "SplitSingleModeLoadTaskImpl";

    public h(r7i r7iVar, List<Intent> list, ajd ajdVar) {
        super(r7iVar, list, ajdVar);
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public d a() {
        return new i(c());
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public ClassLoader b(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) throws SplitLoadException {
        d().b(classLoader, list, file, file2);
        return classLoader;
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public void a(ClassLoader classLoader) {
        try {
            asm.a(classLoader);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            w7i.i(f20037e, "unloadCode error " + e2.getMessage(), new Object[0]);
        }
    }
}
