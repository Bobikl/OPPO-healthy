package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class adg {
    public void a(h1h h1hVar) {
        if (h1hVar == null) {
            a7b.b("SaveOperation", "shareType == null!");
        } else if (h1hVar.d().equals("image/*")) {
            h1hVar.k();
        } else {
            a7b.b("SaveOperation", "not support share type for saveOperation!");
        }
    }
}
