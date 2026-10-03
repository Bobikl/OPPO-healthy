package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.io.EOFException;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0006H\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/d4l;", "", "", MapSchema.FIELD_NAME_ENTRY, "", "sessionId", "", "d", "", "byteArray", "i", "readBuffer", "readMaxSize", b2n.f, "a", b2n.g, "f", "", "Ljava/lang/String;", "TAG", "b", "I", "IDLE_SESSION_ID", "c", "()I", "setSessionId", "(I)V", "", "J", "()J", "setSessionInitTime", "(J)V", "sessionInitTime", "Lokio/Buffer;", "Lokio/Buffer;", "innerBuffer", "Z", "isSyncReadFinish", "Ljava/lang/Object;", "dataProducer", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVoiceRecognizeDataBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceRecognizeDataBuffer.kt\ncom/heytap/health/voiceassistant/ovs/VoiceRecognizeDataBuffer\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,100:1\n558#2:101\n564#2:102\n*S KotlinDebug\n*F\n+ 1 VoiceRecognizeDataBuffer.kt\ncom/heytap/health/voiceassistant/ovs/VoiceRecognizeDataBuffer\n*L\n74#1:101\n88#1:102\n*E\n"})
public final class d4l {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile long sessionInitTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isSyncReadFinish;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "VAM_Ovs";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int IDLE_SESSION_ID = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile int sessionId = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Buffer innerBuffer = new Buffer();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Object dataProducer = new Object();

    public final void a() {
        this.isSyncReadFinish = true;
        f();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSessionInitTime() {
        return this.sessionInitTime;
    }

    public final void d(int sessionId) throws EOFException {
        this.sessionId = sessionId;
        this.sessionInitTime = System.currentTimeMillis();
        this.innerBuffer.clear();
    }

    public final boolean e() {
        return this.sessionId == this.IDLE_SESSION_ID;
    }

    public final void f() {
        synchronized (this.dataProducer) {
            this.dataProducer.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int g(@NotNull byte[] readBuffer, int readMaxSize) {
        int i;
        Intrinsics.checkNotNullParameter(readBuffer, "readBuffer");
        this.isSyncReadFinish = false;
        while (!this.isSyncReadFinish) {
            synchronized (this.dataProducer) {
                Ref.IntRef intRef = new Ref.IntRef();
                synchronized (this.innerBuffer) {
                    i = this.innerBuffer.read(readBuffer, 0, readMaxSize);
                    intRef.element = i;
                    Unit unit = Unit.INSTANCE;
                }
                if (i > 0) {
                    a7b.f(this.TAG, "Read from buffer, size=" + i + ", buffer remain size=" + this.innerBuffer.size());
                    return intRef.element;
                }
                a7b.f(this.TAG, "Read start waiting");
                this.dataProducer.wait();
            }
        }
        return 0;
    }

    public final void h() {
        a7b.f(this.TAG, "Voice buffer on release, sessionId=" + this.sessionId);
        this.sessionId = this.IDLE_SESSION_ID;
        synchronized (this.innerBuffer) {
            this.innerBuffer.clear();
            Unit unit = Unit.INSTANCE;
        }
        a();
    }

    public final void i(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        synchronized (this.innerBuffer) {
            this.innerBuffer.write(byteArray);
            a7b.f(this.TAG, "Write to buffer, writeSize=" + byteArray.length + " bufferSize=" + this.innerBuffer.size());
            Unit unit = Unit.INSTANCE;
        }
        f();
    }
}
