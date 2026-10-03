package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class e4n extends g4n {
    public static int a = 13;
    public static int b = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f10784e;

    public e4n(Context context, g4n g4nVar) {
        super(g4nVar);
        this.f10784e = context;
    }

    public static byte[] d(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = new byte[0];
        try {
            try {
                w0n.k(byteArrayOutputStream, "1.2." + a + "." + b);
                w0n.k(byteArrayOutputStream, DeviceInfoUtil.SYSTEM_NAME);
                w0n.k(byteArrayOutputStream, p0n.N());
                w0n.k(byteArrayOutputStream, p0n.G());
                w0n.k(byteArrayOutputStream, p0n.D(context));
                w0n.k(byteArrayOutputStream, Build.MANUFACTURER);
                w0n.k(byteArrayOutputStream, Build.MODEL);
                w0n.k(byteArrayOutputStream, Build.DEVICE);
                w0n.k(byteArrayOutputStream, p0n.R());
                w0n.k(byteArrayOutputStream, n0n.f(context));
                w0n.k(byteArrayOutputStream, n0n.h(context));
                w0n.k(byteArrayOutputStream, n0n.j(context));
                byteArrayOutputStream.write(new byte[]{0});
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                c2n.r(th2, "sm", "gh");
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                throw th3;
            }
        }
        return byteArray;
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) {
        byte[] bArrD = d(this.f10784e);
        byte[] bArr2 = new byte[bArrD.length + bArr.length];
        System.arraycopy(bArrD, 0, bArr2, 0, bArrD.length);
        System.arraycopy(bArr, 0, bArr2, bArrD.length, bArr.length);
        return bArr2;
    }
}
