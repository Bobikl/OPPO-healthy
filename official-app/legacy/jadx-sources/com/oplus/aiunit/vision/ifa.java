package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class ifa {
    public static final JsonMapper a;
    public static final ObjectWriter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ObjectWriter f12512c;
    public static final ObjectReader d;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        a = jsonMapper;
        b = jsonMapper.writer();
        f12512c = jsonMapper.writer().withDefaultPrettyPrinter();
        d = jsonMapper.readerFor(ela.class);
    }

    public static ela a(byte[] bArr) throws IOException {
        return (ela) d.readValue(bArr);
    }

    public static String b(ela elaVar) {
        try {
            return f12512c.writeValueAsString(elaVar);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(ela elaVar) {
        try {
            return b.writeValueAsString(elaVar);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] d(Object obj) throws IOException {
        return a.writeValueAsBytes(obj);
    }
}
