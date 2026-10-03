package com.oplus.oms.split.full.splitload;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface e {
    d a();

    void a(ClassLoader classLoader);

    void a(String str) throws SplitLoadException;

    ClassLoader b(ClassLoader classLoader, String str, List<String> list, File file, File file2, List<String> list2) throws SplitLoadException;
}
