package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes13.dex */
public class jcg {
    public final pbb<ona, String> a = new pbb<>(1000);
    public final Pools.Pool<b> b = x07.d(10, new a());

    public class a implements x07.d<b> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.x07.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class b implements x07.f {
        public final MessageDigest i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final umi f12841j = umi.a();

        public b(MessageDigest messageDigest) {
            this.i = messageDigest;
        }

        @Override // com.oplus.aiunit.vision.x07.f
        @NonNull
        public umi e() {
            return this.f12841j;
        }
    }

    public final String a(ona onaVar) {
        b bVar = (b) cpe.d(this.b.acquire());
        try {
            onaVar.updateDiskCacheKey(bVar.i);
            return uqk.y(bVar.i.digest());
        } finally {
            this.b.release(bVar);
        }
    }

    public String b(ona onaVar) {
        String strF;
        synchronized (this.a) {
            strF = this.a.f(onaVar);
        }
        if (strF == null) {
            strF = a(onaVar);
        }
        synchronized (this.a) {
            this.a.j(onaVar, strF);
        }
        return strF;
    }
}
