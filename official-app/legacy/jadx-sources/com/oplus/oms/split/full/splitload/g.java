package com.oplus.oms.split.full.splitload;

import android.content.Context;
import com.oplus.aiunit.vision.e7i;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends d {
    public g(Context context) {
        super(context);
    }

    @Override // com.oplus.oms.split.full.splitload.d
    public e7i a(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) throws SplitLoadException {
        try {
            return e7i.a(classLoader, str, list, file, file2, list2);
        } catch (Throwable th) {
            throw new SplitLoadException(-27, th);
        }
    }
}
