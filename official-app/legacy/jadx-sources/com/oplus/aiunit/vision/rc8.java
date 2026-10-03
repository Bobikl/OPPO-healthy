package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufDeserializationException;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufSerializationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class rc8 {
    public static final Gson a = new GsonBuilder().serializeNulls().create();

    public static <T> T a(Class<T> cls, byte[] bArr) throws ProtobufDeserializationException {
        z6b.q("GsonSerializer", "========== JSON Deserialize Start ==========");
        if (cls == null) {
            z6b.o("GsonSerializer", "Deserialize FAILED: target class is null");
            return null;
        }
        if (bArr == null) {
            z6b.o("GsonSerializer", "Deserialize FAILED: input bytes is null, target class: " + cls.getName());
            return null;
        }
        z6b.q("GsonSerializer", "Target class: " + cls.getName());
        z6b.q("GsonSerializer", "Compressed bytes length: " + bArr.length);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream, StandardCharsets.UTF_8);
                    try {
                        StringBuilder sb = new StringBuilder();
                        char[] cArr = new char[4096];
                        while (true) {
                            int i = inputStreamReader.read(cArr);
                            if (i <= 0) {
                                String string = sb.toString();
                                inputStreamReader.close();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                z6b.k("GsonSerializer", "Decompressed JSON length: " + string.length());
                                z6b.k("GsonSerializer", "JSON preview (first 200 chars): " + string);
                                T t = (T) a.fromJson(string, (Class) cls);
                                z6b.q("GsonSerializer", "Deserialization SUCCESS");
                                z6b.q("GsonSerializer", "Result object: " + t);
                                z6b.q("GsonSerializer", "========== JSON Deserialize End ==========");
                                return t;
                            }
                            sb.append(cArr, 0, i);
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    gZIPInputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException e2) {
            z6b.o("GsonSerializer", "========== JSON Deserialize FAILED ==========");
            z6b.o("GsonSerializer", "Target class: " + cls.getName());
            z6b.o("GsonSerializer", "Compressed bytes length: " + bArr.length);
            z6b.p("GsonSerializer", "IOException (GZIP decompression error): " + e2.getMessage(), e2);
            throw new ProtobufDeserializationException("JSON deserialization failed for class " + cls.getName() + " (GZIP decompression error): " + e2.getMessage(), e2);
        } catch (Exception e3) {
            z6b.o("GsonSerializer", "========== JSON Deserialize FAILED ==========");
            z6b.o("GsonSerializer", "Target class: " + cls.getName());
            z6b.p("GsonSerializer", "Exception (JSON parsing error): " + e3.getMessage(), e3);
            throw new ProtobufDeserializationException("JSON deserialization failed for class " + cls.getName() + " (JSON parsing error): " + e3.getMessage(), e3);
        }
    }

    public static byte[] b(Object obj) throws ProtobufSerializationException {
        if (obj == null) {
            z6b.u("GsonSerializer", "trySerialize: target is null");
            return null;
        }
        Class<?> cls = obj.getClass();
        z6b.q("GsonSerializer", "========== JSON Serialize Start ==========");
        z6b.q("GsonSerializer", "Target class: " + cls.getName());
        try {
            String json = a.toJson(obj);
            z6b.k("GsonSerializer", "JSON string length: " + json.length());
            z6b.k("GsonSerializer", "JSON preview (first 200 chars): " + json);
            byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
            z6b.k("GsonSerializer", "JSON bytes length: " + bytes.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, StandardCharsets.UTF_8);
                try {
                    outputStreamWriter.write(json);
                    outputStreamWriter.close();
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    z6b.q("GsonSerializer", "Serialization SUCCESS");
                    z6b.q("GsonSerializer", "Compressed bytes length: " + byteArray.length + " (compression ratio: " + String.format("%.2f", Double.valueOf((((double) byteArray.length) / ((double) bytes.length)) * 100.0d)) + "%)");
                    z6b.q("GsonSerializer", "========== JSON Serialize End ==========");
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e2) {
            z6b.o("GsonSerializer", "========== JSON Serialize FAILED ==========");
            z6b.o("GsonSerializer", "Target class: " + cls.getName());
            z6b.p("GsonSerializer", "Exception: " + e2.getMessage(), e2);
            throw new ProtobufSerializationException("JSON serialization failed for class " + cls.getName() + ": " + e2.getMessage(), e2);
        }
    }
}
