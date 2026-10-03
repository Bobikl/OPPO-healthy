package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class neg {
    public static int FROM_NONE = -1;
    public static int FROM_RGB = 2;
    public static int FROM_TIMEOUT = 3;
    public static int FROM_YUV = 1;
    public String a;
    public PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14483c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14484e;
    public PointF[] f;
    public int g = FROM_NONE;

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.g == FROM_RGB;
    }

    public boolean c() {
        return this.g == FROM_TIMEOUT;
    }

    public boolean d() {
        return this.g == FROM_YUV;
    }

    public neg e(String str) {
        this.a = str;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ScanResult{text='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", qrPointF=");
        sb.append(this.b);
        sb.append(", qrLeng=");
        sb.append(this.f14483c);
        sb.append(", qrRotate=");
        sb.append(this.d);
        sb.append(", isRotate=");
        sb.append(this.f14484e);
        sb.append(", mPointFS=");
        sb.append(Arrays.toString(this.f));
        sb.append(", from=");
        if (d()) {
            str = "yuv";
        } else if (b()) {
            str = "rgb";
        } else {
            str = c() ? "timeout" : SpeechConstant.ENGINE_TYPE_NONE;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
