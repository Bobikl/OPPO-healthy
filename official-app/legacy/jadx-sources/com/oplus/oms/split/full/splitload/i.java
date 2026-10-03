package com.oplus.oms.split.full.splitload;

import android.content.Context;
import com.oplus.aiunit.vision.asm;
import com.oplus.aiunit.vision.pum;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends d {
    public i(Context context) {
        super(context);
    }

    @Override // com.oplus.oms.split.full.splitload.d
    public void b(ClassLoader classLoader, List<String> list, File file, File file2) throws SplitLoadException {
        d(classLoader, file2);
        e(classLoader, list, file);
    }

    public final void d(ClassLoader classLoader, File file) throws SplitLoadException {
        if (file != null) {
            try {
                pum.a(classLoader, file);
            } catch (Throwable th) {
                throw new SplitLoadException(-22, th);
            }
        }
    }

    public final void e(ClassLoader classLoader, List<String> list, File file) throws SplitLoadException {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new File(it.next()));
            }
            try {
                asm.b(classLoader, file, arrayList);
            } catch (Throwable th) {
                throw new SplitLoadException(-23, th);
            }
        }
    }
}
