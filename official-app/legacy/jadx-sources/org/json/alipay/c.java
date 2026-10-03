package org.json.alipay;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.mla;
import io.netty.util.internal.StringUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public int a;
    public Reader b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f20759c;
    public boolean d;

    public c(Reader reader) {
        this.b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.d = false;
        this.a = 0;
    }

    private String a(int i) throws JSONException {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.d) {
            this.d = false;
            cArr[0] = this.f20759c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int i3 = this.b.read(cArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } catch (IOException e2) {
                throw new JSONException(e2);
            }
        }
        this.a += i2;
        if (i2 < i) {
            throw a("Substring bounds error");
        }
        this.f20759c = cArr[i - 1];
        return new String(cArr);
    }

    public final char b() throws JSONException {
        if (this.d) {
            this.d = false;
            char c2 = this.f20759c;
            if (c2 != 0) {
                this.a++;
            }
            return c2;
        }
        try {
            int i = this.b.read();
            if (i <= 0) {
                this.f20759c = (char) 0;
                return (char) 0;
            }
            this.a++;
            char c3 = (char) i;
            this.f20759c = c3;
            return c3;
        } catch (IOException e2) {
            throw new JSONException(e2);
        }
    }

    public final char c() {
        char cB;
        char cB2;
        while (true) {
            char cB3 = b();
            if (cB3 == '/') {
                char cB4 = b();
                if (cB4 == '*') {
                    while (true) {
                        char cB5 = b();
                        if (cB5 == 0) {
                            throw a("Unclosed comment");
                        }
                        if (cB5 == '*') {
                            if (b() == '/') {
                                break;
                            }
                            a();
                        }
                    }
                } else {
                    if (cB4 != '/') {
                        a();
                        return mla.SEPARATOR;
                    }
                    do {
                        cB = b();
                        if (cB == '\n' || cB == '\r') {
                            break;
                        }
                    } while (cB != 0);
                }
            } else if (cB3 == '#') {
                do {
                    cB2 = b();
                    if (cB2 == '\n' || cB2 == '\r') {
                        break;
                    }
                } while (cB2 != 0);
            } else if (cB3 == 0 || cB3 > ' ') {
                return cB3;
            }
        }
    }

    public final Object d() {
        String strA;
        char c2 = c();
        if (c2 != '\"') {
            if (c2 != '[') {
                if (c2 == '{') {
                    a();
                    return new b(this);
                }
                if (c2 != '\'') {
                    if (c2 != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cB = c2;
                        while (cB >= ' ' && ",:]}/\\\"[{;=#".indexOf(cB) < 0) {
                            stringBuffer.append(cB);
                            cB = b();
                        }
                        a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase(SpeechConstant.TRUE_STR)) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase(SpeechConstant.FALSE_STR)) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase("null")) {
                            return b.a;
                        }
                        if ((c2 < '0' || c2 > '9') && c2 != '.' && c2 != '-' && c2 != '+') {
                            return strTrim;
                        }
                        if (c2 == '0') {
                            try {
                                return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            try {
                                try {
                                    return new Integer(strTrim);
                                } catch (Exception unused2) {
                                    return new Double(strTrim);
                                }
                            } catch (Exception unused3) {
                                return new Long(strTrim);
                            }
                        } catch (Exception unused4) {
                            return strTrim;
                        }
                    }
                }
            }
            a();
            return new a(this);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            char cB2 = b();
            if (cB2 == 0 || cB2 == '\n' || cB2 == '\r') {
                break;
            }
            if (cB2 == '\\') {
                cB2 = b();
                if (cB2 == 'b') {
                    stringBuffer2.append('\b');
                } else if (cB2 == 'f') {
                    cB2 = '\f';
                } else if (cB2 == 'n') {
                    stringBuffer2.append('\n');
                } else if (cB2 != 'r') {
                    if (cB2 == 'x') {
                        strA = a(2);
                    } else if (cB2 == 't') {
                        cB2 = '\t';
                    } else if (cB2 == 'u') {
                        strA = a(4);
                    }
                    cB2 = (char) Integer.parseInt(strA, 16);
                } else {
                    stringBuffer2.append(StringUtil.CARRIAGE_RETURN);
                }
            } else if (cB2 == c2) {
                return stringBuffer2.toString();
            }
            stringBuffer2.append(cB2);
        }
        throw a("Unterminated string");
    }

    public final String toString() {
        return " at character " + this.a;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    public final JSONException a(String str) {
        return new JSONException(str + toString());
    }

    public final void a() {
        int i;
        if (this.d || (i = this.a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.a = i - 1;
        this.d = true;
    }
}
