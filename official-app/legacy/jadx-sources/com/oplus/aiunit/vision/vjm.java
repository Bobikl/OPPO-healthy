package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes12.dex */
@u2n(a = "update_item_file")
public class vjm {

    @v2n(a = "mAdcode", b = 6)
    public String a;

    @v2n(a = Const.Scheme.SCHEME_FILE, b = 6)
    public String b;

    public vjm() {
        this.a = "";
        this.b = "";
    }

    public static String b(String str) {
        return "mAdcode='" + str + "'";
    }

    public final String a() {
        return this.b;
    }

    public vjm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
