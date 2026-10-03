package com.heytap.accessory.security.wms;

import com.heytap.accessory.utils.SystemUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public byte[] a;

    public b(byte[] bArr, byte[] bArr2) {
        this.a = new byte[bArr.length + bArr2.length];
        com.heytap.accessory.base.logging.a.a("ChallengeKey", "clientChallengeId: " + Arrays.toString(bArr));
        com.heytap.accessory.base.logging.a.a("ChallengeKey", "serverChallengeId: " + Arrays.toString(bArr2));
        SystemUtils.arraycopy(bArr, 0, this.a, 0, bArr.length);
        SystemUtils.arraycopy(bArr2, 0, this.a, bArr.length, bArr2.length);
        com.heytap.accessory.base.logging.a.a("ChallengeKey", "mKey: " + Arrays.toString(this.a));
    }

    public byte[] a() {
        return this.a;
    }
}
