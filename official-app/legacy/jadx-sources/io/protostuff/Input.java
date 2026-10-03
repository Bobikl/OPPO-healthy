package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public interface Input {
    <T> void handleUnknownField(int i, Schema<T> schema) throws IOException;

    <T> T mergeObject(T t, Schema<T> schema) throws IOException;

    boolean readBool() throws IOException;

    byte[] readByteArray() throws IOException;

    ByteBuffer readByteBuffer() throws IOException;

    ByteString readBytes() throws IOException;

    void readBytes(ByteBuffer byteBuffer) throws IOException;

    double readDouble() throws IOException;

    int readEnum() throws IOException;

    <T> int readFieldNumber(Schema<T> schema) throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    float readFloat() throws IOException;

    int readInt32() throws IOException;

    long readInt64() throws IOException;

    int readSFixed32() throws IOException;

    long readSFixed64() throws IOException;

    int readSInt32() throws IOException;

    long readSInt64() throws IOException;

    String readString() throws IOException;

    int readUInt32() throws IOException;

    long readUInt64() throws IOException;

    void transferByteRangeTo(Output output, boolean z, int i, boolean z2) throws IOException;
}
