package com.heytap.store.apm.Net.stetho;

import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.wa4;
import com.oplus.aiunit.vision.xc8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;

/* JADX INFO: loaded from: classes19.dex */
public class RequestBodyHelper {
    static final String DEFLATE_ENCODING = "deflate";
    static final String GZIP_ENCODING = "gzip";
    private ByteArrayOutputStream mDeflatedOutput;
    private wa4 mDeflatingOutput;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;

    public RequestBodyHelper(NetworkEventReporter networkEventReporter, String str) {
        this.mEventReporter = networkEventReporter;
        this.mRequestId = str;
    }

    private void throwIfNoBody() {
        if (!hasBody()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }

    public OutputStream createBodySink(@Nullable String str) throws IOException {
        OutputStream inflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (GZIP_ENCODING.equals(str)) {
            inflaterOutputStream = xc8.a(byteArrayOutputStream);
        } else {
            inflaterOutputStream = DEFLATE_ENCODING.equals(str) ? new InflaterOutputStream(byteArrayOutputStream) : byteArrayOutputStream;
        }
        wa4 wa4Var = new wa4(inflaterOutputStream);
        this.mDeflatingOutput = wa4Var;
        this.mDeflatedOutput = byteArrayOutputStream;
        return wa4Var;
    }

    public byte[] getDisplayBody() {
        throwIfNoBody();
        return this.mDeflatedOutput.toByteArray();
    }

    public boolean hasBody() {
        return this.mDeflatedOutput != null;
    }

    public void reportDataSent() {
        throwIfNoBody();
        this.mEventReporter.dataSent(this.mRequestId, this.mDeflatedOutput.size(), (int) this.mDeflatingOutput.a());
    }
}
