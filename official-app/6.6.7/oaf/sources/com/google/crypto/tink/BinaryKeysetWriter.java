package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class BinaryKeysetWriter implements KeysetWriter {
    private final boolean closeStreamAfterReading;
    private final OutputStream outputStream;

    private BinaryKeysetWriter(OutputStream outputStream, boolean z) {
        this.outputStream = outputStream;
        this.closeStreamAfterReading = z;
    }

    public static KeysetWriter withFile(File file) throws IOException {
        return new BinaryKeysetWriter(new FileOutputStream(file), true);
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new BinaryKeysetWriter(outputStream, false);
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            keyset.writeTo(this.outputStream);
        } finally {
            if (this.closeStreamAfterReading) {
                this.outputStream.close();
            }
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        try {
            encryptedKeyset.writeTo(this.outputStream);
        } finally {
            if (this.closeStreamAfterReading) {
                this.outputStream.close();
            }
        }
    }
}
