package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
public class b4l {
    public static final int VOICE_TYPE_CONNECT = 10;
    public static final int VOICE_TYPE_DISCONNECT = 11;
    public static final int VOICE_TYPE_EVERY_1KM = 9;
    public static final int VOICE_TYPE_FULL_GOAL = 8;
    public static final int VOICE_TYPE_GPS_NORMAL = 6;
    public static final int VOICE_TYPE_GPS_WEAK = 5;
    public static final int VOICE_TYPE_HALF_GOAL = 7;
    public static final int VOICE_TYPE_PAUSE = 2;
    public static final int VOICE_TYPE_RESUME = 3;
    public static final int VOICE_TYPE_START = 1;
    public static final int VOICE_TYPE_STOP = 4;
    public int a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9595c;

    public b4l(int i, long j2) {
        this.f9595c = false;
        this.a = i;
        this.b = j2;
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.f9595c;
    }

    public b4l(int i, long j2, boolean z) {
        this.a = i;
        this.b = j2;
        this.f9595c = z;
    }
}
