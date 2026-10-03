package com.heytap.accessory.security.protocol;

import com.heytap.accessory.logging.SensitiveLogUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public byte a;
    public byte b;
    public b c;
    public c d;
    public a e;

    public static class a {
        public byte a;
        public byte[] b;

        public String toString() {
            return "AuthConfirm{statusCode=" + ((int) this.a) + "responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.b) + '}';
        }
    }

    public static class b {
        public byte[] a;
        public long b;
        public byte[] c;
        public byte[] d;
        public byte[] e;

        public String toString() {
            return "AuthRequestParams{challengeCode=" + SensitiveLogUtils.toHiddenIfNeed(this.a) + ", time=" + this.b + ", responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.c) + ", deviceId=" + SensitiveLogUtils.toHiddenIfNeed(this.d) + ", kscAlias=" + SensitiveLogUtils.toHiddenIfNeed(this.e) + '}';
        }
    }

    public static class c {
        public byte a;
        public byte[] b;
        public long c;
        public byte[] d;

        public String toString() {
            return "AuthResponseParams{challengeCode=" + SensitiveLogUtils.toHiddenIfNeed(this.b) + ", time=" + this.c + ", responseCode=" + SensitiveLogUtils.toHiddenIfNeed(this.d) + '}';
        }
    }

    public String toString() {
        return "AccessoryAuthenticateMessageParams{authVersion = " + ((int) this.a) + ", messageType = " + ((int) this.b) + ", authRequestParams = " + this.c + ", authResponseParams = " + this.d + ", authConfirm = " + this.e + '}';
    }
}
