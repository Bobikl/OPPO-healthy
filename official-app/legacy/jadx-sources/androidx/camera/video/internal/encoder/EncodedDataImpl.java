package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.EncodedDataImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class EncodedDataImpl implements EncodedData {
    private final int mBufferIndex;
    private final MediaCodec.BufferInfo mBufferInfo;
    private final ByteBuffer mByteBuffer;
    private final AtomicBoolean mClosed = new AtomicBoolean(false);
    private final CallbackToFutureAdapter.Completer<Void> mClosedCompleter;
    private final ListenableFuture<Void> mClosedFuture;
    private final MediaCodec mMediaCodec;

    public EncodedDataImpl(@NonNull MediaCodec mediaCodec, int i, @NonNull MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        this.mMediaCodec = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.mBufferIndex = i;
        this.mByteBuffer = mediaCodec.getOutputBuffer(i);
        this.mBufferInfo = (MediaCodec.BufferInfo) Preconditions.checkNotNull(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.mClosedFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.oplus.aiunit.vision.gm6
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return EncodedDataImpl.lambda$new$0(atomicReference, completer);
            }
        });
        this.mClosedCompleter = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return "Data closed";
    }

    private void throwIfClosed() {
        if (this.mClosed.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        if (this.mClosed.getAndSet(true)) {
            return;
        }
        try {
            this.mMediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
            this.mClosedCompleter.set(null);
        } catch (IllegalStateException e2) {
            this.mClosedCompleter.setException(e2);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public MediaCodec.BufferInfo getBufferInfo() {
        return this.mBufferInfo;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ByteBuffer getByteBuffer() {
        throwIfClosed();
        this.mByteBuffer.position(this.mBufferInfo.offset);
        ByteBuffer byteBuffer = this.mByteBuffer;
        MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.mByteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ListenableFuture<Void> getClosedFuture() {
        return Futures.nonCancellationPropagating(this.mClosedFuture);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.mBufferInfo.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        return (this.mBufferInfo.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.mBufferInfo.size;
    }
}
