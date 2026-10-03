package com.oplus.aiunit.vision;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes12.dex */
public final class adm {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9304c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9305e;
    public String f;
    public String g;

    public adm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.f9304c = str3;
        this.d = str4;
        this.f9305e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final String toString() {
        StringBuilder sb;
        String strSubstring;
        StringBuilder sb2;
        String strSubstring2;
        StringBuilder sb3;
        String strSubstring3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.a);
        stringBuffer.append("," + this.b);
        stringBuffer.append("," + this.f9304c);
        stringBuffer.append("," + this.d);
        if (vam.c(this.f9305e) || this.f9305e.length() < 20) {
            sb = new StringBuilder(",");
            strSubstring = this.f9305e;
        } else {
            sb = new StringBuilder(",");
            strSubstring = this.f9305e.substring(0, 20);
        }
        sb.append(strSubstring);
        stringBuffer.append(sb.toString());
        if (vam.c(this.f) || this.f.length() < 20) {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.f;
        } else {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.f.substring(0, 20);
        }
        sb2.append(strSubstring2);
        stringBuffer.append(sb2.toString());
        if (vam.c(this.g) || this.g.length() < 20) {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.g;
        } else {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.g.substring(0, 20);
        }
        sb3.append(strSubstring3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
