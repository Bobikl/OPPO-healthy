package com.omron;

import android.support.annotation.NonNull;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes5.dex */
public class dk {

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.RegisterNewUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.RegisterNewUserWithUserIndex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.Consent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.DeleteUserData.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        Reserved((byte) 0),
        RegisterNewUser((byte) 1),
        Consent((byte) 2),
        DeleteUserData((byte) 3),
        ResponseCode((byte) 32),
        RegisterNewUserWithUserIndex((byte) 64);

        final byte a;

        b(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }

        public static b a(byte b) {
            for (b bVar : values()) {
                if (bVar.a() == b) {
                    return bVar;
                }
            }
            throw new IllegalArgumentException("Invalid value : " + ((int) b));
        }
    }

    public static class c {
        public final b a;
        public final Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f8925c;

        private c(b bVar, Integer num, Integer num2) {
            this.a = bVar;
            this.b = num;
            this.f8925c = num2;
        }

        @NonNull
        public byte[] a() {
            byte[] bArr;
            int i = a.a[this.a.ordinal()];
            if (i == 1) {
                bArr = new byte[]{0, (byte) (this.f8925c.intValue() & 255), (byte) ((this.f8925c.intValue() >> 8) & 255)};
            } else if (i == 2 || i == 3) {
                bArr = new byte[]{0, this.b.byteValue(), (byte) (this.f8925c.intValue() & 255), (byte) ((this.f8925c.intValue() >> 8) & 255)};
            } else {
                if (i != 4) {
                    throw new AndroidRuntimeException("Invalid op code.");
                }
                bArr = new byte[1];
            }
            bArr[0] = this.a.a();
            return bArr;
        }

        public String toString() {
            return "UCP.Request{opCode=" + this.a + ", userIndex=" + this.b + ", consentCode=" + this.f8925c + '}';
        }

        public /* synthetic */ c(b bVar, Integer num, Integer num2, a aVar) {
            this(bVar, num, num2);
        }
    }

    public static class d {
        public final b a;
        public final b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f8926c;
        public final Integer d;

        private d(b bVar, b bVar2, e eVar, Integer num) {
            this.a = bVar;
            this.b = bVar2;
            this.f8926c = eVar;
            this.d = num;
        }

        public String toString() {
            return "UCP.Response{opCode=" + this.a + ", requestOpCode=" + this.b + ", responseValue=" + this.f8926c + ", userIndex=" + this.d + '}';
        }

        public /* synthetic */ d(b bVar, b bVar2, e eVar, Integer num, a aVar) {
            this(bVar, bVar2, eVar, num);
        }
    }

    public enum e {
        Reserved((byte) 0),
        Success((byte) 1),
        OpCodeNotSupported((byte) 2),
        InvalidParameter((byte) 3),
        OperationFailed((byte) 4),
        UserNotAuthorized((byte) 5);

        final byte a;

        e(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }

        public static e a(byte b) {
            for (e eVar : values()) {
                if (eVar.a() == b) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Invalid value : " + ((int) b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static c a() {
        return new c(b.DeleteUserData, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    @NonNull
    public static c b(int i, int i2) {
        return new c(b.RegisterNewUserWithUserIndex, Integer.valueOf(i), Integer.valueOf(i2), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static c a(int i) {
        return new c(b.RegisterNewUser, null, Integer.valueOf(i), 0 == true ? 1 : 0);
    }

    @NonNull
    public static c a(int i, int i2) {
        return new c(b.Consent, Integer.valueOf(i), Integer.valueOf(i2), null);
    }

    @NonNull
    public static d a(@NonNull byte[] bArr) {
        b bVarA = b.a(bArr[0]);
        b bVarA2 = b.a(bArr[1]);
        e eVarA = e.a(bArr[2]);
        if (bVarA == b.ResponseCode) {
            return new d(bVarA, bVarA2, eVarA, (a.a[bVarA2.ordinal()] == 1 && eVarA == e.Success) ? Integer.valueOf(bArr[3]) : null, null);
        }
        throw new IllegalArgumentException("Invalid data.");
    }
}
