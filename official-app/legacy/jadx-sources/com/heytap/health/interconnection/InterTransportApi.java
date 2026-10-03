package com.heytap.health.interconnection;

import android.content.Context;
import com.heytap.health.voiceassistant.VoiceAssistantApi;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/interconnection/InterTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/interconnection/IInterTransportApi;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/interconnection/IInterTransportApi$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/interconnection/IInterTransportApi$Stub;", "mBinder", "<init>", "()V", "Companion", "device_interconnection_release"}, k = 1, mv = {1, 8, 0})
public final class InterTransportApi implements cm9<IInterTransportApi> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<InterTransportApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.interconnection.InterTransportApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.interconnection.InterTransportApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IInterTransportApi.Stub() { // from class: com.heytap.health.interconnection.InterTransportApi$mBinder$2.1
                @Override // com.heytap.health.interconnection.IInterTransportApi
                public void sendCarBindInfo() {
                    VoiceAssistantApi voiceAssistantApi = (VoiceAssistantApi) x0.d().b("/device_interconnect/voiceassistant/api_privider").navigation();
                    if (voiceAssistantApi != null) {
                        voiceAssistantApi.sendCarBindInfo();
                    }
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/interconnection/InterTransportApi$Companion;", "", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_interconnection_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new InterTransportApi$Companion$sendCarBindInfo$1(null), 3, null);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IInterTransportApi.Stub e() {
        return (IInterTransportApi.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IInterTransportApi d() {
        return e();
    }
}
