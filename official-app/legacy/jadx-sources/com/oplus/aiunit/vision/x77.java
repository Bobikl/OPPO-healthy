package com.oplus.aiunit.vision;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R$\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/x77;", "Lokio/ForwardingSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "i", "Lkotlin/jvm/functions/Function1;", "onException", "", "j", "Z", "hasErrors", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class x77 extends ForwardingSink {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean hasErrors;

    /* JADX WARN: Multi-variable type inference failed */
    public x77(@NotNull Sink sink, @NotNull Function1<? super IOException, Unit> function1) {
        super(sink);
        this.onException = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws EOFException {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }
}
