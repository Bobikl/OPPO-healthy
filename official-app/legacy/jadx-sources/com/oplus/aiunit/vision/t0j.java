package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Arrays;
import okhttp3.internal.connection.RealConnection;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes13.dex */
public class t0j implements Appendable, CharSequence {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public char[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16839j;

    public t0j() {
        this.i = new char[16];
    }

    public static int A(long j2, int i) {
        int i2 = j2 < 0 ? 2 : 1;
        while (true) {
            j2 /= (long) i;
            if (j2 == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int z(int i, int i2) {
        int i3 = i < 0 ? 2 : 1;
        while (true) {
            i /= i2;
            if (i == 0) {
                return i3;
            }
            i3++;
        }
    }

    public t0j B(char c2, String str) {
        int length = str.length();
        int i = 0;
        while (i != this.f16839j) {
            if (this.i[i] == c2) {
                C(i, i + 1, str);
                i += length;
            } else {
                i++;
            }
        }
        return this;
    }

    public final void C(int i, int i2, String str) {
        if (i >= 0) {
            int i3 = this.f16839j;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 > i) {
                int length = str.length();
                int i4 = (i2 - i) - length;
                if (i4 > 0) {
                    char[] cArr = this.i;
                    System.arraycopy(cArr, i2, cArr, i + length, this.f16839j - i2);
                } else if (i4 < 0) {
                    y(-i4, i2);
                }
                str.getChars(0, length, this.i, i);
                this.f16839j -= i4;
                return;
            }
            if (i == i2) {
                str.getClass();
                x(i, str);
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public void D(int i) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        char[] cArr = this.i;
        if (i > cArr.length) {
            w(i);
        } else {
            int i2 = this.f16839j;
            if (i2 < i) {
                Arrays.fill(cArr, i2, i, (char) 0);
            }
        }
        this.f16839j = i;
    }

    public String E(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f16839j) {
            throw new StringIndexOutOfBoundsException();
        }
        return i == i2 ? "" : new String(this.i, i, i2 - i);
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t0j append(char c2) {
        q(c2);
        return this;
    }

    public t0j b(double d) {
        s(Double.toString(d));
        return this;
    }

    public t0j c(float f) {
        s(Float.toString(f));
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i < 0 || i >= this.f16839j) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.i[i];
    }

    public t0j d(int i) {
        return e(i, 0);
    }

    public t0j e(int i, int i2) {
        return f(i, i2, '0');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t0j t0jVar = (t0j) obj;
        int i = this.f16839j;
        if (i != t0jVar.f16839j) {
            return false;
        }
        char[] cArr = this.i;
        char[] cArr2 = t0jVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public t0j f(int i, int i2, char c2) {
        if (i == Integer.MIN_VALUE) {
            s("-2147483648");
            return this;
        }
        if (i < 0) {
            q(Soundex.SILENT_MARKER);
            i = -i;
        }
        if (i2 > 1) {
            for (int iZ = i2 - z(i, 10); iZ > 0; iZ--) {
                append(c2);
            }
        }
        if (i >= 10000) {
            if (i >= 1000000000) {
                q(k[(int) ((((long) i) % RealConnection.IDLE_CONNECTION_HEALTHY_NS) / p6i.MILLI)]);
            }
            if (i >= 100000000) {
                q(k[(i % 1000000000) / 100000000]);
            }
            if (i >= 10000000) {
                q(k[(i % 100000000) / 10000000]);
            }
            if (i >= 1000000) {
                q(k[(i % 10000000) / 1000000]);
            }
            if (i >= 100000) {
                q(k[(i % 1000000) / 100000]);
            }
            q(k[(i % 100000) / 10000]);
        }
        if (i >= 1000) {
            q(k[(i % 10000) / 1000]);
        }
        if (i >= 100) {
            q(k[(i % 1000) / 100]);
        }
        if (i >= 10) {
            q(k[(i % 100) / 10]);
        }
        q(k[i % 10]);
        return this;
    }

    public t0j g(long j2) {
        return h(j2, 0);
    }

    public t0j h(long j2, int i) {
        return i(j2, i, '0');
    }

    public int hashCode() {
        int i = this.f16839j + 31;
        for (int i2 = 0; i2 < this.f16839j; i2++) {
            i = (i * 31) + this.i[i2];
        }
        return i;
    }

    public t0j i(long j2, int i, char c2) {
        if (j2 == Long.MIN_VALUE) {
            s("-9223372036854775808");
            return this;
        }
        if (j2 < 0) {
            q(Soundex.SILENT_MARKER);
            j2 = -j2;
        }
        if (i > 1) {
            for (int iA = i - A(j2, 10); iA > 0; iA--) {
                append(c2);
            }
        }
        if (j2 >= 10000) {
            if (j2 >= 1000000000000000000L) {
                q(k[(int) ((j2 % 1.0E19d) / 1.0E18d)]);
            }
            if (j2 >= 100000000000000000L) {
                q(k[(int) ((j2 % 1000000000000000000L) / 100000000000000000L)]);
            }
            if (j2 >= 10000000000000000L) {
                q(k[(int) ((j2 % 100000000000000000L) / 10000000000000000L)]);
            }
            if (j2 >= 1000000000000000L) {
                q(k[(int) ((j2 % 10000000000000000L) / 1000000000000000L)]);
            }
            if (j2 >= 100000000000000L) {
                q(k[(int) ((j2 % 1000000000000000L) / 100000000000000L)]);
            }
            if (j2 >= 10000000000000L) {
                q(k[(int) ((j2 % 100000000000000L) / 10000000000000L)]);
            }
            if (j2 >= 1000000000000L) {
                q(k[(int) ((j2 % 10000000000000L) / 1000000000000L)]);
            }
            if (j2 >= 100000000000L) {
                q(k[(int) ((j2 % 1000000000000L) / 100000000000L)]);
            }
            if (j2 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                q(k[(int) ((j2 % 100000000000L) / RealConnection.IDLE_CONNECTION_HEALTHY_NS)]);
            }
            if (j2 >= p6i.MILLI) {
                q(k[(int) ((j2 % RealConnection.IDLE_CONNECTION_HEALTHY_NS) / p6i.MILLI)]);
            }
            if (j2 >= 100000000) {
                q(k[(int) ((j2 % p6i.MILLI) / 100000000)]);
            }
            if (j2 >= 10000000) {
                q(k[(int) ((j2 % 100000000) / 10000000)]);
            }
            if (j2 >= 1000000) {
                q(k[(int) ((j2 % 10000000) / 1000000)]);
            }
            if (j2 >= 100000) {
                q(k[(int) ((j2 % 1000000) / 100000)]);
            }
            q(k[(int) ((j2 % 100000) / 10000)]);
        }
        if (j2 >= 1000) {
            q(k[(int) ((j2 % 10000) / 1000)]);
        }
        if (j2 >= 100) {
            q(k[(int) ((j2 % 1000) / 100)]);
        }
        if (j2 >= 10) {
            q(k[(int) ((j2 % 100) / 10)]);
        }
        q(k[(int) (j2 % 10)]);
        return this;
    }

    public boolean isEmpty() {
        return this.f16839j == 0;
    }

    public t0j j(t0j t0jVar) {
        if (t0jVar == null) {
            v();
        } else {
            u(t0jVar.i, 0, t0jVar.f16839j);
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public t0j append(CharSequence charSequence) {
        if (charSequence == null) {
            v();
        } else if (charSequence instanceof t0j) {
            t0j t0jVar = (t0j) charSequence;
            u(t0jVar.i, 0, t0jVar.f16839j);
        } else {
            s(charSequence.toString());
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t0j append(CharSequence charSequence, int i, int i2) {
        r(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f16839j;
    }

    public t0j m(Object obj) {
        if (obj == null) {
            v();
        } else {
            s(obj.toString());
        }
        return this;
    }

    public t0j n(String str) {
        s(str);
        return this;
    }

    public t0j o(boolean z) {
        s(z ? SpeechConstant.TRUE_STR : SpeechConstant.FALSE_STR);
        return this;
    }

    public t0j p(char[] cArr) {
        t(cArr);
        return this;
    }

    public final void q(char c2) {
        int i = this.f16839j;
        if (i == this.i.length) {
            w(i + 1);
        }
        char[] cArr = this.i;
        int i2 = this.f16839j;
        this.f16839j = i2 + 1;
        cArr[i2] = c2;
    }

    public final void r(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i < 0 || i2 < 0 || i > i2 || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        s(charSequence.subSequence(i, i2).toString());
    }

    public final void s(String str) {
        if (str == null) {
            v();
            return;
        }
        int length = str.length();
        int i = this.f16839j + length;
        if (i > this.i.length) {
            w(i);
        }
        str.getChars(0, length, this.i, this.f16839j);
        this.f16839j = i;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return E(i, i2);
    }

    public final void t(char[] cArr) {
        int length = this.f16839j + cArr.length;
        if (length > this.i.length) {
            w(length);
        }
        System.arraycopy(cArr, 0, this.i, this.f16839j, cArr.length);
        this.f16839j = length;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = this.f16839j;
        return i == 0 ? "" : new String(this.i, 0, i);
    }

    public final void u(char[] cArr, int i, int i2) {
        if (i > cArr.length || i < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset out of bounds: " + i);
        }
        if (i2 < 0 || cArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException("Length out of bounds: " + i2);
        }
        int i3 = this.f16839j + i2;
        if (i3 > this.i.length) {
            w(i3);
        }
        System.arraycopy(cArr, i, this.i, this.f16839j, i2);
        this.f16839j = i3;
    }

    public final void v() {
        int i = this.f16839j + 4;
        if (i > this.i.length) {
            w(i);
        }
        char[] cArr = this.i;
        int i2 = this.f16839j;
        int i3 = i2 + 1;
        cArr[i2] = 'n';
        int i4 = i3 + 1;
        cArr[i3] = 'u';
        int i5 = i4 + 1;
        cArr[i4] = 'l';
        this.f16839j = i5 + 1;
        cArr[i5] = 'l';
    }

    public final void w(int i) {
        char[] cArr = this.i;
        int length = (cArr.length >> 1) + cArr.length + 2;
        if (i <= length) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.f16839j);
        this.i = cArr2;
    }

    public final void x(int i, String str) {
        if (i < 0 || i > this.f16839j) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        if (length != 0) {
            y(length, i);
            str.getChars(0, length, this.i, i);
            this.f16839j += length;
        }
    }

    public final void y(int i, int i2) {
        char[] cArr = this.i;
        int length = cArr.length;
        int i3 = this.f16839j;
        if (length - i3 >= i) {
            System.arraycopy(cArr, i2, cArr, i + i2, i3 - i2);
            return;
        }
        int i4 = i3 + i;
        int length2 = (cArr.length << 1) + 2;
        if (i4 <= length2) {
            i4 = length2;
        }
        char[] cArr2 = new char[i4];
        System.arraycopy(cArr, 0, cArr2, 0, i2);
        System.arraycopy(this.i, i2, cArr2, i + i2, this.f16839j - i2);
        this.i = cArr2;
    }

    public t0j(int i) {
        if (i >= 0) {
            this.i = new char[i];
            return;
        }
        throw new NegativeArraySizeException();
    }

    public t0j(String str) {
        int length = str.length();
        this.f16839j = length;
        char[] cArr = new char[length + 16];
        this.i = cArr;
        str.getChars(0, length, cArr, 0);
    }
}
