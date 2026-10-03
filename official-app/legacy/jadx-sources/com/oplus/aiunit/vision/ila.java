package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ila;", "Lcom/oplus/aiunit/vision/ma4$a;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/oplus/aiunit/vision/evf;", "retrofit", "Lcom/oplus/aiunit/vision/ma4;", "Lcom/oplus/aiunit/vision/cuf;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lcom/oplus/aiunit/vision/evf;)Lcom/oplus/aiunit/vision/ma4;", "a", "Lcom/oplus/aiunit/vision/ma4$a;", "pbFactory", "b", "jsonFactory", "<init>", "()V", "Companion", "network_release"}, k = 1, mv = {1, 6, 0})
public final class ila extends ma4.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ma4.a pbFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ma4.a jsonFactory;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ila$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/ila$a;", "", "Lcom/oplus/aiunit/vision/ila;", "a", "<init>", "()V", "network_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ila a() {
            return new ila(null);
        }
    }

    public /* synthetic */ ila(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    @Nullable
    public ma4<cuf, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull evf retrofit) {
        String strValue;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        int length = annotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = annotations[i];
            i++;
            boolean z = annotation instanceof euf;
            if (z) {
                euf eufVar = z ? (euf) annotation : null;
                String str = "";
                if (eufVar != null && (strValue = eufVar.value()) != null) {
                    str = strValue;
                }
                if (Intrinsics.areEqual(euf.PROTO, str)) {
                    return this.pbFactory.responseBodyConverter(type, annotations, retrofit);
                }
            }
        }
        return this.jsonFactory.responseBodyConverter(type, annotations, retrofit);
    }

    public ila() {
        z0f z0fVarA = z0f.a();
        Intrinsics.checkNotNullExpressionValue(z0fVarA, "create()");
        this.pbFactory = z0fVarA;
        mc8 mc8VarA = mc8.a();
        Intrinsics.checkNotNullExpressionValue(mc8VarA, "create()");
        this.jsonFactory = mc8VarA;
    }
}
