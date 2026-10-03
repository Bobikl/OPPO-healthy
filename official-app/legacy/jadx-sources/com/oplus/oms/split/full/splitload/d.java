package com.oplus.oms.split.full.splitload;

import android.content.Context;
import com.oplus.aiunit.vision.d7i;
import com.oplus.aiunit.vision.e7i;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public final Context a;

    public d(Context context) {
        this.a = context;
    }

    public e7i a(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) throws SplitLoadException {
        return null;
    }

    public void b(ClassLoader classLoader, List<String> list, File file, File file2) throws SplitLoadException {
    }

    public final void c(String str) throws SplitLoadException {
        try {
            Context context = this.a;
            d7i.a(context, context.getResources(), str);
        } catch (Throwable th) {
            throw new SplitLoadException(-21, th);
        }
    }
}
