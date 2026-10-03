package com.oplus.aiunit.vision;

import com.heytap.nearx.protobuff.wire.FieldEncoding;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.ByteString;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes17.dex */
public final class f1f {
    public final BufferedSource a;
    public int d;
    public FieldEncoding h;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11171c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11172e = 2;
    public int f = -1;
    public long g = -1;

    public f1f(BufferedSource bufferedSource) {
        this.a = bufferedSource;
    }

    public final void a(int i) throws IOException {
        if (this.f11172e != i) {
            long j2 = this.b;
            long j3 = this.f11171c;
            if (j2 > j3) {
                throw new IOException("Expected to end at " + this.f11171c + " but was " + this.b);
            }
            if (j2 != j3) {
                this.f11172e = 7;
                return;
            } else {
                this.f11171c = this.g;
                this.g = -1L;
            }
        }
        this.f11172e = 6;
    }

    public final long b() throws IOException {
        if (this.f11172e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f11172e);
        }
        long j2 = this.f11171c - this.b;
        this.a.require(j2);
        this.f11172e = 6;
        this.b = this.f11171c;
        this.f11171c = this.g;
        this.g = -1L;
        return j2;
    }

    public long c() throws IOException {
        if (this.f11172e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.d + 1;
        this.d = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j2 = this.g;
        this.g = -1L;
        this.f11172e = 6;
        return j2;
    }

    public void d(long j2) throws IOException {
        if (this.f11172e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.d - 1;
        this.d = i;
        if (i < 0 || this.g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.b == this.f11171c || i == 0) {
            this.f11171c = j2;
            return;
        }
        throw new IOException("Expected to end at " + this.f11171c + " but was " + this.b);
    }

    public final int e() throws IOException {
        int i;
        this.b++;
        byte b = this.a.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & ByteCompanionObject.MAX_VALUE;
        this.b++;
        byte b2 = this.a.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            this.b++;
            byte b3 = this.a.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                this.b++;
                byte b4 = this.a.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    this.b++;
                    byte b5 = this.a.readByte();
                    int i4 = i3 | (b5 << 28);
                    if (b5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.b++;
                        if (this.a.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i = b4 << 21;
            }
        }
        return i | i2;
    }

    public int f() throws IOException {
        int i = this.f11172e;
        if (i == 7) {
            this.f11172e = 2;
            return this.f;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.b < this.f11171c && !this.a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iE >> 3;
            this.f = i2;
            int i3 = iE & 7;
            if (i3 == 0) {
                this.h = FieldEncoding.VARINT;
                this.f11172e = 0;
                return i2;
            }
            if (i3 == 1) {
                this.h = FieldEncoding.FIXED64;
                this.f11172e = 1;
                return i2;
            }
            if (i3 == 2) {
                this.h = FieldEncoding.LENGTH_DELIMITED;
                this.f11172e = 2;
                int iE2 = e();
                if (iE2 < 0) {
                    throw new ProtocolException("Negative length: " + iE2);
                }
                if (this.g != -1) {
                    throw new IllegalStateException();
                }
                long j2 = this.f11171c;
                this.g = j2;
                long j3 = this.b + ((long) iE2);
                this.f11171c = j3;
                if (j3 <= j2) {
                    return this.f;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.h = FieldEncoding.FIXED32;
                    this.f11172e = 5;
                    return i2;
                }
                throw new ProtocolException("Unexpected field encoding: " + i3);
            }
            n(i2);
        }
        return -1;
    }

    public FieldEncoding g() {
        return this.h;
    }

    public ByteString h() throws IOException {
        return this.a.readByteString(b());
    }

    public int i() throws IOException {
        int i = this.f11172e;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f11172e);
        }
        this.a.require(4L);
        this.b += 4;
        int intLe = this.a.readIntLe();
        a(5);
        return intLe;
    }

    public long j() throws IOException {
        int i = this.f11172e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f11172e);
        }
        this.a.require(8L);
        this.b += 8;
        long longLe = this.a.readLongLe();
        a(1);
        return longLe;
    }

    public String k() throws IOException {
        return this.a.readUtf8(b());
    }

    public int l() throws IOException {
        int i = this.f11172e;
        if (i == 0 || i == 2) {
            int iE = e();
            a(0);
            return iE;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f11172e);
    }

    public long m() throws IOException {
        int i = this.f11172e;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f11172e);
        }
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.b++;
            byte b = this.a.readByte();
            j2 |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                a(0);
                return j2;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n(int i) throws IOException {
        while (this.b < this.f11171c && !this.a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iE >> 3;
            int i3 = iE & 7;
            if (i3 == 0) {
                this.f11172e = 0;
                m();
            } else if (i3 == 1) {
                this.f11172e = 1;
                j();
            } else if (i3 == 2) {
                long jE = e();
                this.b += jE;
                this.a.skip(jE);
            } else if (i3 == 3) {
                n(i2);
            } else if (i3 == 4) {
                if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i3 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i3);
                }
                this.f11172e = 5;
                i();
            }
        }
        throw new EOFException();
    }
}
