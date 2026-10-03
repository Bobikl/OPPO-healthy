package com.oplus.aiunit.vision;

import com.xingin.xhssharesdk.XhsShareSdkTools;
import com.xingin.xhssharesdk.model.sharedata.XhsNote;

/* JADX INFO: loaded from: classes10.dex */
public final class bdm {
    public final String a;
    public final zim b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9692c = false;

    public bdm(XhsNote xhsNote) {
        String strGenerateSessionId = XhsShareSdkTools.generateSessionId(xhsNote);
        this.a = strGenerateSessionId;
        this.b = new zim(strGenerateSessionId);
    }
}
