package com.omron;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cy extends bs {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<a> f8867e;
    private int f;
    private boolean g;
    private boolean h;

    public static class a implements Serializable {
        public int a;
        public int b;
    }

    private cy(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
        this.f8867e = new LinkedList();
        a(bArr);
    }

    public static cy a(int i, int i2, byte[] bArr, int i3) {
        if (bArr == null) {
            return null;
        }
        return new cy(i, i2, bArr, i3);
    }

    @Override // com.omron.bs, com.omron.by
    public String toString() {
        return "EachUserData{users=" + this.f8867e + ", numberOfUser=" + this.f + ", isTimeNotSet=" + this.g + ", isPairingMode=" + this.h + '}';
    }

    private void a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("The byte sequence cannot be parsed as an Each UserDataKey Data.");
        }
        byte b = bArr[3];
        this.f = (b & 3) + 1;
        this.g = (b & 4) > 0;
        this.h = (b & 8) > 0;
        int i = 4;
        for (int i2 = 0; this.f > i2; i2++) {
            a aVar = new a();
            int i3 = i + 2;
            if (bArr.length < i3) {
                return;
            }
            aVar.a = ek.b(bArr, i, true);
            aVar.b = bArr[i3];
            i = i3 + 1;
            this.f8867e.add(aVar);
        }
    }
}
