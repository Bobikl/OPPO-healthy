package androidx.security.crypto;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager;
import com.google.crypto.tink.streamingaead.StreamingAeadConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes12.dex */
public final class EncryptedFile {
    private static final String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final Context mContext;
    final File mFile;
    final String mMasterKeyAlias;
    final StreamingAead mStreamingAead;

    public static final class Builder {
        final Context mContext;
        File mFile;
        final FileEncryptionScheme mFileEncryptionScheme;
        final String mMasterKeyAlias;
        String mKeysetPrefName = EncryptedFile.KEYSET_PREF_NAME;
        String mKeysetAlias = EncryptedFile.KEYSET_ALIAS;

        public Builder(@NonNull File file, @NonNull Context context, @NonNull String str, @NonNull FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context;
            this.mMasterKeyAlias = str;
        }

        @NonNull
        public EncryptedFile build() throws GeneralSecurityException, IOException {
            StreamingAeadConfig.register();
            return new EncryptedFile(this.mFile, this.mKeysetAlias, (StreamingAead) new AndroidKeysetManager.Builder().withKeyTemplate(this.mFileEncryptionScheme.getKeyTemplate()).withSharedPref(this.mContext, this.mKeysetAlias, this.mKeysetPrefName).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + this.mMasterKeyAlias).build().getKeysetHandle().getPrimitive(StreamingAead.class), this.mContext);
        }

        @NonNull
        public Builder setKeysetAlias(@NonNull String str) {
            this.mKeysetAlias = str;
            return this;
        }

        @NonNull
        public Builder setKeysetPrefName(@NonNull String str) {
            this.mKeysetPrefName = str;
            return this;
        }
    }

    public static final class EncryptedFileInputStream extends FileInputStream {
        private final InputStream mEncryptedInputStream;

        public EncryptedFileInputStream(FileDescriptor fileDescriptor, InputStream inputStream) {
            super(fileDescriptor);
            this.mEncryptedInputStream = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() throws IOException {
            return this.mEncryptedInputStream.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedInputStream.close();
        }

        @Override // java.io.FileInputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.mEncryptedInputStream.mark(i);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.mEncryptedInputStream.markSupported();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws IOException {
            return this.mEncryptedInputStream.read();
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            this.mEncryptedInputStream.reset();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            return this.mEncryptedInputStream.skip(j2);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(@NonNull byte[] bArr) throws IOException {
            return this.mEncryptedInputStream.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            return this.mEncryptedInputStream.read(bArr, i, i2);
        }
    }

    public static final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream mEncryptedOutputStream;

        public EncryptedFileOutputStream(FileDescriptor fileDescriptor, OutputStream outputStream) {
            super(fileDescriptor);
            this.mEncryptedOutputStream = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.mEncryptedOutputStream.flush();
        }

        @Override // java.io.FileOutputStream
        @NonNull
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(@NonNull byte[] bArr) throws IOException {
            this.mEncryptedOutputStream.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            this.mEncryptedOutputStream.write(i);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            this.mEncryptedOutputStream.write(bArr, i, i2);
        }
    }

    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB(AesGcmHkdfStreamingKeyManager.aes256GcmHkdf4KBTemplate());

        private final KeyTemplate mStreamingAeadKeyTemplate;

        FileEncryptionScheme(KeyTemplate keyTemplate) {
            this.mStreamingAeadKeyTemplate = keyTemplate;
        }

        public KeyTemplate getKeyTemplate() {
            return this.mStreamingAeadKeyTemplate;
        }
    }

    public EncryptedFile(@NonNull File file, @NonNull String str, @NonNull StreamingAead streamingAead, @NonNull Context context) {
        this.mFile = file;
        this.mContext = context;
        this.mMasterKeyAlias = str;
        this.mStreamingAead = streamingAead;
    }

    @NonNull
    public FileInputStream openFileInput() throws GeneralSecurityException, IOException {
        if (this.mFile.exists()) {
            FileInputStream fileInputStream = new FileInputStream(this.mFile);
            return new EncryptedFileInputStream(fileInputStream.getFD(), this.mStreamingAead.newDecryptingStream(fileInputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
        }
        throw new IOException("file doesn't exist: " + this.mFile.getName());
    }

    @NonNull
    public FileOutputStream openFileOutput() throws GeneralSecurityException, IOException {
        if (!this.mFile.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.mFile);
            return new EncryptedFileOutputStream(fileOutputStream.getFD(), this.mStreamingAead.newEncryptingStream(fileOutputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
        }
        throw new IOException("output file already exists, please use a new file: " + this.mFile.getName());
    }
}
