package com.oplus.aiunit.vision;

import com.heytap.speech.engine.HeytapSpeechEngine;
import com.heytap.speech.engine.process.OperationStatus;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.activepush.PushData;
import com.heytap.speech.engine.protocol.directive.activepush.PushMessage;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/i55;", "Lcom/oplus/aiunit/vision/bmd;", "", "process", "", "", "a", "[Ljava/lang/String;", "FILTER_DIRECTIVES", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class i55 extends bmd {

    @NotNull
    public static final String TAG = "DefaultOperation";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String[] FILTER_DIRECTIVES = {"Conditional.GeneralCondition", "ActivePush.PushMessage", "CustomerData.UploadResult"};

    @Override // com.oplus.aiunit.vision.bmd, com.oplus.aiunit.vision.tmd
    public void process() {
        sq mAgent;
        Directive<? extends DirectivePayload> directive = getDirective();
        if (directive != null) {
            String str = directive.getHeader().getNamespace() + '.' + directive.getHeader().getName();
            t7b.INSTANCE.b(TAG, Intrinsics.stringPlus("data is ", str));
            if (Intrinsics.areEqual(str, "ActivePush.PushMessage")) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DirectivePayload payload = directive.getPayload();
                    if (payload == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.heytap.speech.engine.protocol.directive.activepush.PushMessage");
                    }
                    PushData data = ((PushMessage) payload).getData();
                    z3f z3fVar = z3f.INSTANCE;
                    String originData = getOriginData();
                    if (originData == null) {
                        originData = "";
                    }
                    z3fVar.a(data, originData);
                    Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
            }
            if (!ArraysKt___ArraysKt.contains(this.FILTER_DIRECTIVES, str) && (mAgent = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent()) != null) {
                mAgent.onDirectiveNotFound(directive, getConversationInfo());
            }
        }
        setStatus(OperationStatus.SUCCESS);
    }
}
