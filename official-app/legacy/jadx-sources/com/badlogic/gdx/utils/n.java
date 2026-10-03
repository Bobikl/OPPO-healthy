package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.nwi;
import com.oplus.aiunit.vision.r51;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes13.dex */
public class n implements r51 {
    public boolean a = true;

    @Override // com.oplus.aiunit.vision.r51
    public JsonValue a(kb7 kb7Var) {
        try {
            return d(kb7Var.l(8192));
        } catch (Exception e2) {
            throw new SerializationException("Error parsing file: " + kb7Var, e2);
        }
    }

    public JsonValue b(DataInputStream dataInputStream) throws IOException {
        try {
            return c(dataInputStream, dataInputStream.readByte());
        } finally {
            nwi.a(dataInputStream);
        }
    }

    public JsonValue c(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 91) {
            return e(dataInputStream);
        }
        if (b == 123) {
            return g(dataInputStream);
        }
        if (b == 90) {
            return new JsonValue(JsonValue.ValueType.nullValue);
        }
        if (b == 84) {
            return new JsonValue(true);
        }
        if (b == 70) {
            return new JsonValue(false);
        }
        if (b != 66 && b != 85) {
            if (b == 105) {
                return new JsonValue(this.a ? dataInputStream.readShort() : dataInputStream.readByte());
            }
            if (b == 73) {
                return new JsonValue(this.a ? dataInputStream.readInt() : dataInputStream.readShort());
            }
            if (b == 108) {
                return new JsonValue(dataInputStream.readInt());
            }
            if (b == 76) {
                return new JsonValue(dataInputStream.readLong());
            }
            if (b == 100) {
                return new JsonValue(dataInputStream.readFloat());
            }
            if (b == 68) {
                return new JsonValue(dataInputStream.readDouble());
            }
            if (b == 115 || b == 83) {
                return new JsonValue(j(dataInputStream, b));
            }
            if (b == 97 || b == 65) {
                return f(dataInputStream, b);
            }
            if (b == 67) {
                return new JsonValue(dataInputStream.readChar());
            }
            throw new GdxRuntimeException("Unrecognized data type");
        }
        return new JsonValue(m(dataInputStream));
    }

    public JsonValue d(InputStream inputStream) throws Throwable {
        DataInputStream dataInputStream = null;
        try {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(inputStream);
                try {
                    JsonValue jsonValueB = b(dataInputStream2);
                    nwi.a(dataInputStream2);
                    return jsonValueB;
                } catch (IOException e2) {
                    e = e2;
                    throw new SerializationException(e);
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    nwi.a(dataInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public JsonValue e(DataInputStream dataInputStream) throws IOException {
        byte b;
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        byte b2 = dataInputStream.readByte();
        if (b2 == 36) {
            b = dataInputStream.readByte();
            b2 = dataInputStream.readByte();
        } else {
            b = 0;
        }
        long jI = -1;
        if (b2 == 35) {
            jI = i(dataInputStream, false, -1L);
            if (jI < 0) {
                throw new GdxRuntimeException("Unrecognized data type");
            }
            if (jI == 0) {
                return jsonValue;
            }
            b2 = b == 0 ? dataInputStream.readByte() : b;
        }
        JsonValue jsonValue2 = null;
        long j2 = 0;
        while (dataInputStream.available() > 0 && b2 != 93) {
            JsonValue jsonValueC = c(dataInputStream, b2);
            jsonValueC.o = jsonValue;
            if (jsonValue2 != null) {
                jsonValueC.q = jsonValue2;
                jsonValue2.p = jsonValueC;
                jsonValue.r++;
            } else {
                jsonValue.f1284n = jsonValueC;
                jsonValue.r = 1;
            }
            if (jI > 0) {
                j2++;
                if (j2 >= jI) {
                    break;
                }
            }
            jsonValue2 = jsonValueC;
            b2 = b == 0 ? dataInputStream.readByte() : b;
        }
        return jsonValue;
    }

    public JsonValue f(DataInputStream dataInputStream, byte b) throws IOException {
        byte b2 = dataInputStream.readByte();
        long jN = b == 65 ? n(dataInputStream) : m(dataInputStream);
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        JsonValue jsonValue2 = null;
        long j2 = 0;
        while (j2 < jN) {
            JsonValue jsonValueC = c(dataInputStream, b2);
            jsonValueC.o = jsonValue;
            if (jsonValue2 != null) {
                jsonValue2.p = jsonValueC;
                jsonValue.r++;
            } else {
                jsonValue.f1284n = jsonValueC;
                jsonValue.r = 1;
            }
            j2++;
            jsonValue2 = jsonValueC;
        }
        return jsonValue;
    }

    public JsonValue g(DataInputStream dataInputStream) throws IOException {
        byte b;
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.object);
        byte b2 = dataInputStream.readByte();
        if (b2 == 36) {
            b = dataInputStream.readByte();
            b2 = dataInputStream.readByte();
        } else {
            b = 0;
        }
        long jI = -1;
        if (b2 == 35) {
            jI = i(dataInputStream, false, -1L);
            if (jI < 0) {
                throw new GdxRuntimeException("Unrecognized data type");
            }
            if (jI == 0) {
                return jsonValue;
            }
            b2 = dataInputStream.readByte();
        }
        JsonValue jsonValue2 = null;
        long j2 = 0;
        while (dataInputStream.available() > 0 && b2 != 125) {
            String strK = k(dataInputStream, true, b2);
            JsonValue jsonValueC = c(dataInputStream, b == 0 ? dataInputStream.readByte() : b);
            jsonValueC.N(strK);
            jsonValueC.o = jsonValue;
            if (jsonValue2 != null) {
                jsonValueC.q = jsonValue2;
                jsonValue2.p = jsonValueC;
                jsonValue.r++;
            } else {
                jsonValue.f1284n = jsonValueC;
                jsonValue.r = 1;
            }
            if (jI > 0) {
                j2++;
                if (j2 >= jI) {
                    break;
                }
            }
            b2 = dataInputStream.readByte();
            jsonValue2 = jsonValueC;
        }
        return jsonValue;
    }

    public long h(DataInputStream dataInputStream, byte b, boolean z, long j2) throws IOException {
        if (b == 105) {
            return m(dataInputStream);
        }
        if (b == 73) {
            return o(dataInputStream);
        }
        if (b == 108) {
            return n(dataInputStream);
        }
        if (b == 76) {
            return dataInputStream.readLong();
        }
        if (!z) {
            return j2;
        }
        return ((long) (dataInputStream.readByte() & 255)) | (((long) (b & 255)) << 24) | (((long) (dataInputStream.readByte() & 255)) << 16) | (((long) (dataInputStream.readByte() & 255)) << 8);
    }

    public long i(DataInputStream dataInputStream, boolean z, long j2) throws IOException {
        return h(dataInputStream, dataInputStream.readByte(), z, j2);
    }

    public String j(DataInputStream dataInputStream, byte b) throws IOException {
        return k(dataInputStream, false, b);
    }

    public String k(DataInputStream dataInputStream, boolean z, byte b) throws IOException {
        long jH = -1;
        if (b == 83) {
            jH = i(dataInputStream, true, -1L);
        } else if (b == 115) {
            jH = m(dataInputStream);
        } else if (z) {
            jH = h(dataInputStream, b, false, -1L);
        }
        if (jH >= 0) {
            return jH > 0 ? l(dataInputStream, jH) : "";
        }
        throw new GdxRuntimeException("Unrecognized data type, string expected");
    }

    public String l(DataInputStream dataInputStream, long j2) throws IOException {
        byte[] bArr = new byte[(int) j2];
        dataInputStream.readFully(bArr);
        return new String(bArr, "UTF-8");
    }

    public short m(DataInputStream dataInputStream) throws IOException {
        return (short) (dataInputStream.readByte() & 255);
    }

    public long n(DataInputStream dataInputStream) throws IOException {
        return ((long) dataInputStream.readInt()) & (-1);
    }

    public int o(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readShort() & UShort.MAX_VALUE;
    }
}
