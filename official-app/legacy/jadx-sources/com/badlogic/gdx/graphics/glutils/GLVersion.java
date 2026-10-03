package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.oplus.aiunit.vision.x38;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class GLVersion {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1236c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1237e;
    public final String f;
    public final Type g;
    public final String h = "GLVersion";

    public enum Type {
        OpenGL,
        GLES,
        WebGL,
        NONE
    }

    public GLVersion(Application.ApplicationType applicationType, String str, String str2, String str3) {
        if (applicationType == Application.ApplicationType.Android || applicationType == Application.ApplicationType.iOS) {
            this.g = Type.GLES;
        } else if (applicationType == Application.ApplicationType.Desktop || applicationType == Application.ApplicationType.Applet) {
            this.g = Type.OpenGL;
        } else if (applicationType == Application.ApplicationType.WebGL) {
            this.g = Type.WebGL;
        } else {
            this.g = Type.NONE;
        }
        Type type = this.g;
        if (type == Type.GLES) {
            a("OpenGL ES (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.WebGL) {
            a("WebGL (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.OpenGL) {
            a("(\\d(\\.\\d){0,2})", str);
        } else {
            this.a = -1;
            this.b = -1;
            this.f1236c = -1;
            str2 = "";
            str3 = "";
        }
        this.d = str;
        this.f1237e = str2;
        this.f = str3;
    }

    public final void a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            String[] strArrSplit = matcher.group(1).split("\\.");
            this.a = c(strArrSplit[0], 2);
            this.b = strArrSplit.length < 2 ? 0 : c(strArrSplit[1], 0);
            this.f1236c = strArrSplit.length >= 3 ? c(strArrSplit[2], 0) : 0;
            return;
        }
        x38.app.c("GLVersion", "Invalid version string: " + str2);
        this.a = 2;
        this.b = 0;
        this.f1236c = 0;
    }

    public int b() {
        return this.a;
    }

    public final int c(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            x38.app.error("libGDX GL", "Error parsing number: " + str + ", assuming: " + i);
            return i;
        }
    }
}
