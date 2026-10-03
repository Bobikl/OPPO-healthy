package com.heytap.accessory.security.protocol;

import com.heytap.accessory.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public byte a;
    public byte b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f2682c;
    public c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0258a f2683e;

    /* JADX INFO: renamed from: com.heytap.accessory.security.protocol.a$a, reason: collision with other inner class name */
    public static class C0258a {
        public byte a;
        public byte[] b;

        public String toString() {
            return "AuthConfirm{statusCode=" + ((int) this.a) + "responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.b) + '}';
        }
    }

    public static class b {
        public byte[] a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f2684c;
        public byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f2685e;

        public String toString() {
            return "AuthRequestParams{challengeCode=" + SensitiveLogUtils.toHiddenIfNeed(this.a) + ", time=" + this.b + ", responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.f2684c) + ", deviceId=" + SensitiveLogUtils.toHiddenIfNeed(this.d) + ", kscAlias=" + SensitiveLogUtils.toHiddenIfNeed(this.f2685e) + '}';
        }
    }

    public static class c {
        public byte a;
        public byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2686c;
        public byte[] d;

        public String toString() {
            return "AuthResponseParams{challengeCode=" + SensitiveLogUtils.toHiddenIfNeed(this.b) + ", time=" + this.f2686c + ", responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.d) + '}';
        }
    }

    public String toString() {
        return "AccessoryAuthenticateMessageParams{authVersion = " + ((int) this.a) + ", messageType = " + ((int) this.b) + ", authRequestParams = " + this.f2682c + ", authResponseParams = " + this.d + ", authConfirm = " + this.f2683e + '}';
    }
}
