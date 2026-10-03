package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class kyk extends bxb {
    public static final int DurationFieldNum = 2;
    public static final int HostingProviderFieldNum = 1;
    public static final int UrlFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("video", 184);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.STRING;
        bxbVar.e(new w97("url", 0, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("hosting_provider", 1, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("duration", 2, 134, 1.0d, 0.0d, "ms", false, Profile$Type.UINT32));
    }

    public kyk(bxb bxbVar) {
        super(bxbVar);
    }
}
