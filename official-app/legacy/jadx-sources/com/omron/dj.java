package com.omron;

import android.support.annotation.NonNull;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes5.dex */
public class dj {

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[d.values().length];
            b = iArr;
            try {
                iArr[d.AllRecords.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[d.GreaterThanOrEqualTo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[c.values().length];
            a = iArr2;
            try {
                iArr2[c.NumberOfStoredRecordsResponse.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.ResponseCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.SequenceNumberOfLatestRecordResponse.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.ReportStoredRecords.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.ReportNumberOfStoredRecords.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.DeleteStoredRecords.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.ReportSequenceNumberOfLatestRecord.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        Reserved((byte) 0),
        SequenceNumber((byte) 1),
        UserFacingTime((byte) 2);

        final byte a;

        b(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    public enum c {
        Reserved((byte) 0),
        ReportStoredRecords((byte) 1),
        DeleteStoredRecords((byte) 2),
        ReportNumberOfStoredRecords((byte) 4),
        NumberOfStoredRecordsResponse((byte) 5),
        ResponseCode((byte) 6),
        ReportSequenceNumberOfLatestRecord((byte) 16),
        SequenceNumberOfLatestRecordResponse((byte) 17);

        private final byte a;

        c(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }

        public static c a(byte b) {
            for (c cVar : values()) {
                if (cVar.a() == b) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Invalid value : " + ((int) b));
        }
    }

    public enum d {
        Null((byte) 0),
        AllRecords((byte) 1),
        GreaterThanOrEqualTo((byte) 3);

        final byte a;

        d(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    public static class e {
        public final c a;
        public final d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f8916c;
        public final Integer d;

        private e(c cVar, d dVar, b bVar, Integer num) {
            this.a = cVar;
            this.b = dVar;
            this.f8916c = bVar;
            this.d = num;
        }

        @NonNull
        public byte[] a() {
            byte[] bArr;
            int i = a.a[this.a.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    int i2 = a.b[this.b.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AndroidRuntimeException("Invalid operator.");
                        }
                        bArr = new byte[]{0, 0, b.SequenceNumber.a(), (byte) (this.d.intValue() & 255), (byte) ((this.d.intValue() >> 8) & 255)};
                    }
                } else if (i != 6) {
                    if (i != 7) {
                        throw new AndroidRuntimeException("Invalid op code.");
                    }
                } else if (a.b[this.b.ordinal()] != 1) {
                    throw new AndroidRuntimeException("Invalid operator.");
                }
                bArr = new byte[2];
            } else {
                int i3 = a.b[this.b.ordinal()];
                if (i3 == 1) {
                    bArr = new byte[2];
                } else {
                    if (i3 != 2) {
                        throw new AndroidRuntimeException("Invalid operator.");
                    }
                    bArr = new byte[]{0, 0, b.SequenceNumber.a(), (byte) (this.d.intValue() & 255), (byte) ((this.d.intValue() >> 8) & 255)};
                }
            }
            bArr[0] = this.a.a();
            bArr[1] = this.b.a();
            return bArr;
        }

        public String toString() {
            return "RACP.Request{opCode=" + this.a + ", operator=" + this.b + ", filterType=" + this.f8916c + ", sequenceNumber=" + this.d + '}';
        }

        public /* synthetic */ e(c cVar, d dVar, b bVar, Integer num, a aVar) {
            this(cVar, dVar, bVar, num);
        }
    }

    public static class f {
        public final c a;
        public final c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f8917c;
        public final Integer d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f8918e;

        private f(c cVar, c cVar2, g gVar, Integer num, Integer num2) {
            this.a = cVar;
            this.b = cVar2;
            this.f8917c = gVar;
            this.d = num;
            this.f8918e = num2;
        }

        public String toString() {
            return "RACP.Response{opCode=" + this.a + ", requestOpCode=" + this.b + ", responseValue=" + this.f8917c + ", numberOfRecords=" + this.d + ", sequenceNumber=" + this.f8918e + '}';
        }

        public /* synthetic */ f(c cVar, c cVar2, g gVar, Integer num, Integer num2, a aVar) {
            this(cVar, cVar2, gVar, num, num2);
        }
    }

    public enum g {
        Reserved((byte) 0),
        Success((byte) 1),
        OpCodeNotSupported((byte) 2),
        InvalidOperator((byte) 3),
        OperatorNotSupported((byte) 4),
        InvalidOperand((byte) 5),
        NoRecordsFound((byte) 6),
        AbortUnsuccessful((byte) 7),
        ProcedureNotCompleted((byte) 8),
        OperandNotSupported((byte) 9);

        final byte a;

        g(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }

        public static g a(byte b) {
            for (g gVar : values()) {
                if (gVar.a() == b) {
                    return gVar;
                }
            }
            throw new IllegalArgumentException("Invalid value : " + ((int) b));
        }
    }

    @NonNull
    public static e a() {
        return new e(c.DeleteStoredRecords, d.AllRecords, null, null, null);
    }

    @NonNull
    public static e b() {
        return new e(c.ReportNumberOfStoredRecords, d.AllRecords, null, null, null);
    }

    @NonNull
    public static e c() {
        return new e(c.ReportSequenceNumberOfLatestRecord, d.Null, null, null, null);
    }

    @NonNull
    public static e d() {
        return new e(c.ReportStoredRecords, d.AllRecords, null, null, null);
    }

    @NonNull
    public static e a(int i) {
        return new e(c.ReportNumberOfStoredRecords, d.GreaterThanOrEqualTo, b.SequenceNumber, Integer.valueOf(i), null);
    }

    @NonNull
    public static e b(int i) {
        return new e(c.ReportStoredRecords, d.GreaterThanOrEqualTo, b.SequenceNumber, Integer.valueOf(i), null);
    }

    @NonNull
    public static f a(@NonNull byte[] bArr) {
        Integer numValueOf;
        g gVarA;
        Integer numValueOf2;
        c cVarA = c.a(bArr[0]);
        int i = a.a[cVarA.ordinal()];
        c cVar = null;
        if (i == 1) {
            numValueOf = Integer.valueOf(ek.b(bArr, 2, true));
            gVarA = null;
            numValueOf2 = null;
        } else if (i == 2) {
            c cVarA2 = c.a(bArr[2]);
            gVarA = g.a(bArr[3]);
            numValueOf = null;
            numValueOf2 = null;
            cVar = cVarA2;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Invalid data.");
            }
            numValueOf2 = Integer.valueOf(ek.b(bArr, 2, true));
            gVarA = null;
            numValueOf = null;
        }
        return new f(cVarA, cVar, gVarA, numValueOf, numValueOf2, null);
    }
}
