package com.oplus.aiunit.vision;

import android.os.FileObserver;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class m60 {
    public static final m60 g = new m60();
    public final Date a = new Date();
    public final Pattern b = Pattern.compile("^-----\\spid\\s(\\d+)\\sat\\s(.*)\\s-----$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pattern f13956c = Pattern.compile("^Cmd\\sline:\\s+(.*)$");
    public final long d = 15000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13957e = 0;
    public FileObserver f = null;

    public static m60 a() {
        return g;
    }

    public void b() {
        FileObserver fileObserver = this.f;
        if (fileObserver != null) {
            try {
                try {
                    fileObserver.stopWatching();
                } catch (Exception e2) {
                    xcrash.b.c().e("xcrash", "AnrHandler fileObserver stopWatching failed", e2);
                }
            } finally {
                this.f = null;
            }
        }
    }
}
