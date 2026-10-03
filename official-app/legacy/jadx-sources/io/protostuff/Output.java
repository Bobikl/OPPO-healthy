package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public interface Output {
    void writeBool(int i, boolean z, boolean z2) throws IOException;

    void writeByteArray(int i, byte[] bArr, boolean z) throws IOException;

    void writeByteRange(boolean z, int i, byte[] bArr, int i2, int i3, boolean z2) throws IOException;

    void writeBytes(int i, ByteString byteString, boolean z) throws IOException;

    void writeBytes(int i, ByteBuffer byteBuffer, boolean z) throws IOException;

    void writeDouble(int i, double d, boolean z) throws IOException;

    void writeEnum(int i, int i2, boolean z) throws IOException;

    void writeFixed32(int i, int i2, boolean z) throws IOException;

    void writeFixed64(int i, long j2, boolean z) throws IOException;

    void writeFloat(int i, float f, boolean z) throws IOException;

    void writeInt32(int i, int i2, boolean z) throws IOException;

    void writeInt64(int i, long j2, boolean z) throws IOException;

    <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException;

    void writeSFixed32(int i, int i2, boolean z) throws IOException;

    void writeSFixed64(int i, long j2, boolean z) throws IOException;

    void writeSInt32(int i, int i2, boolean z) throws IOException;

    void writeSInt64(int i, long j2, boolean z) throws IOException;

    void writeString(int i, CharSequence charSequence, boolean z) throws IOException;

    void writeUInt32(int i, int i2, boolean z) throws IOException;

    void writeUInt64(int i, long j2, boolean z) throws IOException;
}
