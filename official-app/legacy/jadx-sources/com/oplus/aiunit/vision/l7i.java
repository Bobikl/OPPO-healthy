package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l7i {
    public static final int LENGTH = 2;

    public interface a {
        void a(int i, Bundle bundle);

        void b(List<Bundle> list);

        void c(int i, Bundle bundle);

        void d(int i, Bundle bundle);

        void onError(Bundle bundle);
    }

    @SuppressLint({"UnsafeHashAlgorithmDetector"})
    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest((str).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString().hashCode();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UnsupportedEncodingException", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("NoSuchAlgorithmException", e3);
        }
    }

    public static int b(Collection<? extends f2a> collection) {
        int iA = 0;
        if (collection != null && !collection.isEmpty()) {
            Iterator<? extends f2a> it = collection.iterator();
            while (it.hasNext()) {
                iA += a(it.next().a());
            }
        }
        return iA;
    }

    public static Bundle c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        return bundle;
    }

    public abstract void d(int i, a aVar) throws RemoteException;

    public abstract boolean e(int i);

    public abstract boolean f(int i);

    public abstract void g(int i, a aVar) throws RemoteException;

    public abstract void h(a aVar) throws RemoteException;

    public abstract void i(com.oplus.oms.split.full.core.splitinstall.a aVar);

    public abstract void j(List<String> list, a aVar);
}
