package com.heytap.accessory.security.wms;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.security.deviceId.DeviceIdFactory;
import com.heytap.accessory.utils.HexUtils;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public byte[] a;
    public long b;
    public String c;
    public int d;
    public SecureRandom e;
    public long f = 0;
    public SecretKey g;
    public byte[] h;
    public int i;

    public c(@NonNull String str, @NonNull int i, int i2) {
        this.c = str;
        this.d = i;
        this.i = i2;
        com.heytap.accessory.base.logging.a.a("LocalParams - kscTrack", "create selfParams, remoteId: " + HexUtils.hideAddress(this.c) + " transportType:" + i);
        this.b = SystemClock.elapsedRealtime() / 1000;
        SecureRandom secureRandom = new SecureRandom();
        this.e = secureRandom;
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
        return this.c;
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

    public void a(long j) {
        this.f = j;
    }
}
