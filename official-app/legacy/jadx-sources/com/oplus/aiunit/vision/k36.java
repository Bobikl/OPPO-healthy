package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
public class k36 extends ofg {
    @Override // com.oplus.aiunit.vision.dx9
    public boolean d(String str) {
        return a8i.DOWNLOAD.equalsIgnoreCase(str);
    }

    @Override // com.oplus.aiunit.vision.ofg
    public void f(Uri uri, String str, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("childDispatcher uri = ");
        sb.append(uri.toString());
    }
}
