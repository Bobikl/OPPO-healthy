package com.alibaba.fastjson;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public abstract class JSONValidator implements Cloneable, Closeable {
    protected char ch;
    protected boolean eof;
    protected Type type;
    private Boolean validateResult;
    protected int pos = -1;
    protected int count = 0;
    protected boolean supportMultiValue = false;

    public static class ReaderValidator extends JSONValidator {
        private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
        private char[] buf;
        final Reader r;
        private int end = -1;
        private int readCount = 0;

        public ReaderValidator(Reader reader) {
            this.r = reader;
            ThreadLocal<char[]> threadLocal = bufLocal;
            char[] cArr = threadLocal.get();
            this.buf = cArr;
            if (cArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new char[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.r.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos;
            if (i < this.end) {
                char[] cArr = this.buf;
                int i2 = i + 1;
                this.pos = i2;
                this.ch = cArr[i2];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                Reader reader = this.r;
                char[] cArr2 = this.buf;
                int i3 = reader.read(cArr2, 0, cArr2.length);
                this.readCount++;
                if (i3 > 0) {
                    this.ch = this.buf[0];
                    this.pos = 0;
                    this.end = i3 - 1;
                } else {
                    if (i3 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.ch = (char) 0;
                    this.eof = true;
                    throw new JSONException("read error");
                }
            } catch (IOException unused) {
                throw new JSONException("read error");
            }
        }
    }

    public enum Type {
        Object,
        Array,
        Value
    }

    public static class UTF16Validator extends JSONValidator {
        private final String str;

        public UTF16Validator(String str) {
            this.str = str;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public final void fieldName() {
            char cCharAt;
            int i = this.pos;
            do {
                i++;
                if (i >= this.str.length() || (cCharAt = this.str.charAt(i)) == '\\') {
                    next();
                    while (true) {
                        char c2 = this.ch;
                        if (c2 == '\\') {
                            next();
                            if (this.ch == 'u') {
                                next();
                                next();
                                next();
                                next();
                                next();
                            } else {
                                next();
                            }
                        } else if (c2 == '\"') {
                            next();
                            return;
                        } else if (this.eof) {
                            return;
                        } else {
                            next();
                        }
                    }
                }
            } while (cCharAt != '\"');
            int i2 = i + 1;
            this.ch = this.str.charAt(i2);
            this.pos = i2;
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos + 1;
            this.pos = i;
            if (i < this.str.length()) {
                this.ch = this.str.charAt(this.pos);
            } else {
                this.ch = (char) 0;
                this.eof = true;
            }
        }
    }

    public static class UTF8InputStreamValidator extends JSONValidator {
        private static final ThreadLocal<byte[]> bufLocal = new ThreadLocal<>();
        private byte[] buf;
        private final InputStream is;
        private int end = -1;
        private int readCount = 0;

        public UTF8InputStreamValidator(InputStream inputStream) {
            this.is = inputStream;
            ThreadLocal<byte[]> threadLocal = bufLocal;
            byte[] bArr = threadLocal.get();
            this.buf = bArr;
            if (bArr != null) {
                threadLocal.set(null);
            } else {
                this.buf = new byte[8192];
            }
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            bufLocal.set(this.buf);
            this.is.close();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos;
            if (i < this.end) {
                byte[] bArr = this.buf;
                int i2 = i + 1;
                this.pos = i2;
                this.ch = (char) bArr[i2];
                return;
            }
            if (this.eof) {
                return;
            }
            try {
                InputStream inputStream = this.is;
                byte[] bArr2 = this.buf;
                int i3 = inputStream.read(bArr2, 0, bArr2.length);
                this.readCount++;
                if (i3 > 0) {
                    this.ch = (char) this.buf[0];
                    this.pos = 0;
                    this.end = i3 - 1;
                } else {
                    if (i3 == -1) {
                        this.pos = 0;
                        this.end = 0;
                        this.buf = null;
                        this.ch = (char) 0;
                        this.eof = true;
                        return;
                    }
                    this.pos = 0;
                    this.end = 0;
                    this.buf = null;
                    this.ch = (char) 0;
                    this.eof = true;
                    throw new JSONException("read error");
                }
            } catch (IOException unused) {
                throw new JSONException("read error");
            }
        }
    }

    public static class UTF8Validator extends JSONValidator {
        private final byte[] bytes;

        public UTF8Validator(byte[] bArr) {
            this.bytes = bArr;
            next();
            skipWhiteSpace();
        }

        @Override // com.alibaba.fastjson.JSONValidator
        public void next() {
            int i = this.pos + 1;
            this.pos = i;
            byte[] bArr = this.bytes;
            if (i < bArr.length) {
                this.ch = (char) bArr[i];
            } else {
                this.ch = (char) 0;
                this.eof = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x019c  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private boolean any() {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11 = this.ch;
        if (c11 == '\"') {
            next();
            while (!this.eof) {
                char c12 = this.ch;
                if (c12 == '\\') {
                    next();
                    if (this.ch == 'u') {
                        next();
                        next();
                        next();
                        next();
                        next();
                    } else {
                        next();
                    }
                } else {
                    if (c12 == '\"') {
                        next();
                        this.type = Type.Value;
                        return true;
                    }
                    next();
                }
            }
            return false;
        }
        if (c11 != '+' && c11 != '-') {
            if (c11 == '[') {
                next();
                skipWhiteSpace();
                if (this.ch == ']') {
                    next();
                    this.type = Type.Array;
                    return true;
                }
                while (any()) {
                    skipWhiteSpace();
                    char c13 = this.ch;
                    if (c13 != ',') {
                        if (c13 != ']') {
                            return false;
                        }
                        next();
                        this.type = Type.Array;
                        return true;
                    }
                    next();
                    skipWhiteSpace();
                }
                return false;
            }
            if (c11 == 'f') {
                next();
                if (this.ch != 'a') {
                    return false;
                }
                next();
                if (this.ch != 'l') {
                    return false;
                }
                next();
                if (this.ch != 's') {
                    return false;
                }
                next();
                if (this.ch != 'e') {
                    return false;
                }
                next();
                if (!isWhiteSpace(this.ch) && (c8 = this.ch) != ',' && c8 != ']' && c8 != '}' && c8 != 0) {
                    return false;
                }
                this.type = Type.Value;
                return true;
            }
            if (c11 == 'n') {
                next();
                if (this.ch != 'u') {
                    return false;
                }
                next();
                if (this.ch != 'l') {
                    return false;
                }
                next();
                if (this.ch != 'l') {
                    return false;
                }
                next();
                if (!isWhiteSpace(this.ch) && (c9 = this.ch) != ',' && c9 != ']' && c9 != '}' && c9 != 0) {
                    return false;
                }
                this.type = Type.Value;
                return true;
            }
            if (c11 == 't') {
                next();
                if (this.ch != 'r') {
                    return false;
                }
                next();
                if (this.ch != 'u') {
                    return false;
                }
                next();
                if (this.ch != 'e') {
                    return false;
                }
                next();
                if (!isWhiteSpace(this.ch) && (c10 = this.ch) != ',' && c10 != ']' && c10 != '}' && c10 != 0) {
                    return false;
                }
                this.type = Type.Value;
                return true;
            }
            if (c11 == '{') {
                next();
                while (isWhiteSpace(this.ch)) {
                    next();
                }
                if (this.ch == '}') {
                    next();
                    this.type = Type.Object;
                    return true;
                }
                while (this.ch == '\"') {
                    fieldName();
                    skipWhiteSpace();
                    if (this.ch != ':') {
                        break;
                    }
                    next();
                    skipWhiteSpace();
                    if (!any()) {
                        return false;
                    }
                    skipWhiteSpace();
                    char c14 = this.ch;
                    if (c14 != ',') {
                        if (c14 != '}') {
                            break;
                        }
                        next();
                        this.type = Type.Object;
                        return true;
                    }
                    next();
                    skipWhiteSpace();
                }
                return false;
            }
            switch (c11) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    return false;
            }
        }
        if (c11 == '-' || c11 == '+') {
            next();
            skipWhiteSpace();
            char c15 = this.ch;
            if (c15 >= '0' && c15 <= '9') {
                do {
                    next();
                    c2 = this.ch;
                    if (c2 >= '0') {
                    }
                    if (c2 == '.') {
                        next();
                        c7 = this.ch;
                        if (c7 >= '0' || c7 > '9') {
                            return false;
                        }
                        while (true) {
                            char c16 = this.ch;
                            if (c16 >= '0' && c16 <= '9') {
                                next();
                            }
                        }
                    }
                    c3 = this.ch;
                    if (c3 != 'e' || c3 == 'E') {
                        next();
                        c4 = this.ch;
                        if (c4 != '-' || c4 == '+') {
                            next();
                        }
                        c5 = this.ch;
                        if (c5 >= '0' && c5 <= '9') {
                            next();
                            while (true) {
                                c6 = this.ch;
                                if (c6 < '0' && c6 <= '9') {
                                    next();
                                }
                            }
                        }
                    }
                    this.type = Type.Value;
                    return true;
                } while (c2 <= '9');
                if (c2 == '.') {
                    next();
                    c7 = this.ch;
                    if (c7 >= '0') {
                    }
                    return false;
                }
                c3 = this.ch;
                if (c3 != 'e') {
                }
                next();
                c4 = this.ch;
                if (c4 != '-') {
                    next();
                } else {
                    next();
                }
                c5 = this.ch;
                if (c5 >= '0') {
                    next();
                    while (true) {
                        c6 = this.ch;
                        if (c6 < '0') {
                        }
                        this.type = Type.Value;
                        return true;
                        next();
                    }
                }
            }
        } else {
            do {
                next();
                c2 = this.ch;
                if (c2 >= '0') {
                }
                if (c2 == '.') {
                    next();
                    c7 = this.ch;
                    if (c7 >= '0') {
                    }
                    return false;
                }
                c3 = this.ch;
                if (c3 != 'e') {
                }
                next();
                c4 = this.ch;
                if (c4 != '-') {
                    next();
                } else {
                    next();
                }
                c5 = this.ch;
                if (c5 >= '0') {
                    next();
                    while (true) {
                        c6 = this.ch;
                        if (c6 < '0') {
                        }
                        this.type = Type.Value;
                        return true;
                        next();
                    }
                }
            } while (c2 <= '9');
            if (c2 == '.') {
                next();
                c7 = this.ch;
                if (c7 >= '0') {
                }
                return false;
            }
            c3 = this.ch;
            if (c3 != 'e') {
            }
            next();
            c4 = this.ch;
            if (c4 != '-') {
                next();
            } else {
                next();
            }
            c5 = this.ch;
            if (c5 >= '0') {
                next();
                while (true) {
                    c6 = this.ch;
                    if (c6 < '0') {
                    }
                    this.type = Type.Value;
                    return true;
                    next();
                }
            }
        }
        return false;
    }

    public static JSONValidator from(String str) {
        return new UTF16Validator(str);
    }

    public static JSONValidator fromUtf8(byte[] bArr) {
        return new UTF8Validator(bArr);
    }

    public static final boolean isWhiteSpace(char c2) {
        return c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == '\f' || c2 == '\b';
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void fieldName() {
        next();
        while (true) {
            char c2 = this.ch;
            if (c2 == '\\') {
                next();
                if (this.ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c2 == '\"') {
                    next();
                    return;
                }
                next();
            }
        }
    }

    public Type getType() {
        if (this.type == null) {
            validate();
        }
        return this.type;
    }

    public boolean isSupportMultiValue() {
        return this.supportMultiValue;
    }

    public abstract void next();

    public JSONValidator setSupportMultiValue(boolean z) {
        this.supportMultiValue = z;
        return this;
    }

    public void skipWhiteSpace() {
        while (isWhiteSpace(this.ch)) {
            next();
        }
    }

    public boolean string() {
        next();
        while (!this.eof) {
            char c2 = this.ch;
            if (c2 == '\\') {
                next();
                if (this.ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            } else {
                if (c2 == '\"') {
                    next();
                    return true;
                }
                next();
            }
        }
        return false;
    }

    public boolean validate() {
        Boolean bool = this.validateResult;
        if (bool != null) {
            return bool.booleanValue();
        }
        while (any()) {
            skipWhiteSpace();
            this.count++;
            if (this.eof) {
                this.validateResult = Boolean.TRUE;
                return true;
            }
            if (!this.supportMultiValue) {
                this.validateResult = Boolean.FALSE;
                return false;
            }
            skipWhiteSpace();
            if (this.eof) {
                this.validateResult = Boolean.TRUE;
                return true;
            }
        }
        this.validateResult = Boolean.FALSE;
        return false;
    }

    public static JSONValidator from(Reader reader) {
        return new ReaderValidator(reader);
    }

    public static JSONValidator fromUtf8(InputStream inputStream) {
        return new UTF8InputStreamValidator(inputStream);
    }
}
