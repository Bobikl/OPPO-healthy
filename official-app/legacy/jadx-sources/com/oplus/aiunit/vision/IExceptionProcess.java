package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public interface IExceptionProcess {
    boolean filter(Thread thread, Throwable th);

    m7k getKvProperties();

    String getModuleVersion();
}
