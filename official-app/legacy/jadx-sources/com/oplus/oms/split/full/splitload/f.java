package com.oplus.oms.split.full.splitload;

import android.content.Intent;
import com.oplus.aiunit.vision.a7i;
import com.oplus.aiunit.vision.ajd;
import com.oplus.aiunit.vision.e7i;
import com.oplus.aiunit.vision.r7i;
import com.oplus.aiunit.vision.w7i;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20036e = "SplitMultipleModeLoadTaskImpl";

    public f(r7i r7iVar, List<Intent> list, ajd ajdVar) {
        super(r7iVar, list, ajdVar);
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public d a() {
        return new g(c());
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public ClassLoader b(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) throws SplitLoadException {
        e7i e7iVarE = a7i.f().e(str);
        w7i.a(f20036e, "loadCode:" + str, new Object[0]);
        if (e7iVarE != null) {
            return e7iVarE;
        }
        e7i e7iVarA = d().a(classLoader, str, list, file, file2, list2);
        e7iVarA.h(true);
        a7i.f().d(str, e7iVarA);
        return e7iVarA;
    }

    @Override // com.oplus.oms.split.full.splitload.e
    public void a(ClassLoader classLoader) {
        if (classLoader instanceof e7i) {
            a7i.f().g(((e7i) classLoader).g());
        }
    }
}
