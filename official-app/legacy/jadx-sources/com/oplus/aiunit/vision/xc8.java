package com.oplus.aiunit.vision;

import com.heytap.store.apm.Net.stetho.ExceptionUtil;
import com.heytap.store.apm.Net.stetho.StethoUtils;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes19.dex */
public class xc8 extends FilterOutputStream {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ExecutorService f18574j = Executors.newCachedThreadPool();
    public final Future<Void> i;

    public static class a implements Callable<Void> {
        public final InputStream i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final OutputStream f18575j;

        public a(InputStream inputStream, OutputStream outputStream) {
            this.i = inputStream;
            this.f18575j = outputStream;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws IOException {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(this.i);
            try {
                StethoUtils.copy(gZIPInputStream, this.f18575j, new byte[1024]);
                return null;
            } finally {
                gZIPInputStream.close();
                this.f18575j.close();
            }
        }
    }

    public xc8(OutputStream outputStream, Future<Void> future) throws IOException {
        super(outputStream);
        this.i = future;
    }

    public static xc8 a(OutputStream outputStream) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        return new xc8(new PipedOutputStream(pipedInputStream), f18574j.submit(new a(pipedInputStream, outputStream)));
    }

    public static <T> T g(Future<T> future) throws Throwable {
        while (true) {
            try {
                return future.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                ExceptionUtil.propagateIfInstanceOf(cause, IOException.class);
                ExceptionUtil.propagate(cause);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
            g(this.i);
        } catch (Throwable th) {
            try {
                g(this.i);
            } catch (IOException unused) {
            }
            throw th;
        }
    }
}
