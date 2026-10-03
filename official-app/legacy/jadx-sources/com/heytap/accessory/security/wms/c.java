package com.heytap.accessory.security.wms;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.security.deviceId.DeviceIdFactory;
import com.heytap.accessory.utils.HexUtils;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public byte[] a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2688c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f2689e;
    public long f = 0;
    public SecretKey g;
    public byte[] h;
    public int i;

    public c(@NonNull String str, @NonNull int i, int i2) {
        this.f2688c = str;
        this.d = i;
        this.i = i2;
        com.heytap.accessory.base.logging.a.a("LocalParams - kscTrack", "create selfParams, remoteId: " + HexUtils.hideAddress(this.f2688c) + " transportType:" + i);
        this.b = SystemClock.elapsedRealtime() / 1000;
        SecureRandom secureRandom = new SecureRandom();
        this.f2689e = secureRandom;
        byte[] bArr = new byte[8];
        this.a = bArr;
        secureRandom.nextBytes(bArr);
        com.heytap.accessory.base.logging.a.a("LocalParams - kscTrack", "generate hashMac, challengeCode: " + HexUtils.byteArrayToHexStr(this.a) + "; time: " + this.b);
        this.h = DeviceIdFactory.getIDeviceIdFetcher().loadDeviceId(PlatformUtils.getContext());
    }

    public void a() {
    }

    public byte[] b() {
        return this.a;
    }

    public byte[] c() {
        return this.h;
    }

    @NonNull
    public SecretKey d() throws e {
        SecretKey secretKey = this.g;
        if (secretKey != null) {
            return secretKey;
        }
        throw new e("matchedKsc not found");
    }

    public String e() {
        return this.f2688c;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.i;
    }

    public void a(byte[] bArr) {
    }

    public void a(SecretKey secretKey) {
        this.g = secretKey;
    }

    public void a(long j2) {
        this.f = j2;
    }
}
