package com.lifesense.plugin.ble.device.a.a.a;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private String a;
    private byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8706c;
    private List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.lifesense.plugin.ble.device.ancs.a f8707e;
    private File f;

    public File a() {
        return this.f;
    }

    public byte[] b() {
        return this.b;
    }

    public int c() {
        return this.f8706c;
    }

    public com.lifesense.plugin.ble.device.ancs.a d() {
        return this.f8707e;
    }

    public String toString() {
        return "IPushMessage{pushMacAddress='" + this.a + "', pushData=" + Arrays.toString(this.b) + ", pushType=" + this.f8706c + ", pushValues=" + this.d + ", ancsMsg=" + this.f8707e + ", file=" + this.f + '}';
    }

    public void a(int i) {
        this.f8706c = i;
    }

    public void a(com.lifesense.plugin.ble.device.ancs.a aVar) {
        this.f8707e = aVar;
    }

    public void a(File file) {
        this.f = file;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(byte[] bArr) {
        this.b = bArr;
    }
}
