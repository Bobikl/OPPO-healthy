package com.oplus.aiunit.vision;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class jrk {
    public static tz a(String str) {
        if (str.equals(MessageDigestAlgorithms.SHA_1)) {
            return new tz(y2d.idSHA1, rj4.INSTANCE);
        }
        if (str.equals(MessageDigestAlgorithms.SHA_224)) {
            return new tz(fec.id_sha224, rj4.INSTANCE);
        }
        if (str.equals(MessageDigestAlgorithms.SHA_256)) {
            return new tz(fec.id_sha256, rj4.INSTANCE);
        }
        if (str.equals(MessageDigestAlgorithms.SHA_384)) {
            return new tz(fec.id_sha384, rj4.INSTANCE);
        }
        if (str.equals(MessageDigestAlgorithms.SHA_512)) {
            return new tz(fec.id_sha512, rj4.INSTANCE);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    public static ns5 b(tz tzVar) {
        if (tzVar.f().equals(y2d.idSHA1)) {
            return os5.a();
        }
        if (tzVar.f().equals(fec.id_sha224)) {
            return os5.b();
        }
        if (tzVar.f().equals(fec.id_sha256)) {
            return os5.c();
        }
        if (tzVar.f().equals(fec.id_sha384)) {
            return os5.d();
        }
        if (tzVar.f().equals(fec.id_sha512)) {
            return os5.e();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + tzVar.f());
    }
}
