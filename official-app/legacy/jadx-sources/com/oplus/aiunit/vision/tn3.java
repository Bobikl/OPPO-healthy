package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/tn3;", "Lcom/oplus/aiunit/vision/rs9;", "Lcom/oplus/aiunit/vision/lyb;", "messageProcessor", "", "f", "listener", "c", "", "messageId", "onMessageSending", "onMessageSendSuccess", "", "errorCode", EngineConstant.REASON, "onMessageSendFailed", "messageContent", "d", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/CopyOnWriteArraySet;", "a", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mMessageListenerSet", "b", "Lcom/oplus/aiunit/vision/lyb;", "getMMessageProcessor", "()Lcom/oplus/aiunit/vision/lyb;", "setMMessageProcessor", "(Lcom/oplus/aiunit/vision/lyb;)V", "mMessageProcessor", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class tn3 implements rs9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile tn3 f17069c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArraySet<rs9> mMessageListenerSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public lyb mMessageProcessor;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tn3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/tn3$a;", "", "Lcom/oplus/aiunit/vision/tn3;", "a", "()Lcom/oplus/aiunit/vision/tn3;", "getInstance$annotations", "()V", "instance", "", "TAG", "Ljava/lang/String;", "sMessageStateDispatcher", "Lcom/oplus/aiunit/vision/tn3;", "<init>", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final tn3 a() {
            if (tn3.f17069c == null) {
                synchronized (tn3.class) {
                    if (tn3.f17069c == null) {
                        tn3.f17069c = new tn3(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return tn3.f17069c;
        }
    }

    public /* synthetic */ tn3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final synchronized void c(@Nullable rs9 listener) {
        if (listener != null) {
            this.mMessageListenerSet.add(listener);
        }
    }

    public void d(@Nullable String messageId, @NotNull String messageContent) {
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        lyb lybVar = this.mMessageProcessor;
        if (lybVar == null) {
            return;
        }
        lybVar.n(messageContent);
    }

    public final synchronized void e() {
        t7b.INSTANCE.b("CommonMessageDispatcher", "release.");
        this.mMessageListenerSet.clear();
    }

    public final void f(@NotNull lyb messageProcessor) {
        Intrinsics.checkNotNullParameter(messageProcessor, "messageProcessor");
        this.mMessageProcessor = messageProcessor;
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void onMessageSendFailed(@Nullable String messageId, int errorCode, @Nullable String reason) {
        t7b.INSTANCE.c("CommonMessageDispatcher", "onMessageSendFailed", ", messageId is ", messageId, ", errorCode is ", String.valueOf(errorCode), ", reason is ", reason);
        Iterator<rs9> it = this.mMessageListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onMessageSendFailed(messageId, errorCode, reason);
        }
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void onMessageSendSuccess(@Nullable String messageId) {
        Iterator<rs9> it = this.mMessageListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onMessageSendSuccess(messageId);
        }
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void onMessageSending(@Nullable String messageId) {
        Iterator<rs9> it = this.mMessageListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onMessageSending(messageId);
        }
    }

    public tn3() {
        this.mMessageListenerSet = new CopyOnWriteArraySet<>();
    }
}
