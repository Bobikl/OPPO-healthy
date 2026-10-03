package com.oplus.aiunit.vision;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/y4;", "Lcom/oplus/aiunit/vision/qs9;", "Lcom/oplus/aiunit/vision/qs9$a;", "completionListener", "", "setOnCompletionListener", "Lcom/oplus/aiunit/vision/qs9$d;", "preparedListener", "setOnPreparedListener", "Lcom/oplus/aiunit/vision/qs9$b;", "errorListener", "setOnErrorListener", "Lcom/oplus/aiunit/vision/qs9$c;", "firstFrameListener", "setOnFirstFrameListener", "Lcom/oplus/aiunit/vision/qs9$d;", "getPreparedListener", "()Lcom/oplus/aiunit/vision/qs9$d;", "setPreparedListener", "(Lcom/oplus/aiunit/vision/qs9$d;)V", "Lcom/oplus/aiunit/vision/qs9$c;", "getFirstFrameListener", "()Lcom/oplus/aiunit/vision/qs9$c;", "setFirstFrameListener", "(Lcom/oplus/aiunit/vision/qs9$c;)V", "Lcom/oplus/aiunit/vision/qs9$a;", "getCompletionListener", "()Lcom/oplus/aiunit/vision/qs9$a;", "setCompletionListener", "(Lcom/oplus/aiunit/vision/qs9$a;)V", "Lcom/oplus/aiunit/vision/qs9$b;", "getErrorListener", "()Lcom/oplus/aiunit/vision/qs9$b;", "setErrorListener", "(Lcom/oplus/aiunit/vision/qs9$b;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public abstract class y4 implements qs9 {

    @Nullable
    private qs9.a completionListener;

    @Nullable
    private qs9.b errorListener;

    @Nullable
    private qs9.c firstFrameListener;

    @Nullable
    private qs9.d preparedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public y4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public y4(@Nullable Context context) {
    }

    @Nullable
    public final qs9.a getCompletionListener() {
        return null;
    }

    @Nullable
    public final qs9.b getErrorListener() {
        return null;
    }

    @Nullable
    public final qs9.c getFirstFrameListener() {
        return null;
    }

    @Nullable
    public final qs9.d getPreparedListener() {
        return null;
    }

    public final void setCompletionListener(@Nullable qs9.a aVar) {
    }

    public final void setErrorListener(@Nullable qs9.b bVar) {
    }

    public final void setFirstFrameListener(@Nullable qs9.c cVar) {
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setOnCompletionListener(@NotNull qs9.a completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setOnErrorListener(@NotNull qs9.b errorListener) {
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setOnFirstFrameListener(@NotNull qs9.c firstFrameListener) {
        Intrinsics.checkNotNullParameter(firstFrameListener, "firstFrameListener");
    }

    @Override // com.oplus.aiunit.vision.qs9
    public void setOnPreparedListener(@NotNull qs9.d preparedListener) {
        Intrinsics.checkNotNullParameter(preparedListener, "preparedListener");
    }

    public final void setPreparedListener(@Nullable qs9.d dVar) {
    }

    public /* synthetic */ y4(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context);
    }
}
