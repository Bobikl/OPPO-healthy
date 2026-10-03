package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.activepush.PushData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/z3f;", "", "Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;", "data", "", "originData", "", "a", "", "Lcom/oplus/aiunit/vision/u3f;", "Ljava/util/Set;", "listenerSet", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class z3f {

    @NotNull
    public static final z3f INSTANCE = new z3f();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Set<u3f> listenerSet = new LinkedHashSet();

    public final void a(@Nullable PushData data, @NotNull String originData) {
        Intrinsics.checkNotNullParameter(originData, "originData");
        if (data == null) {
            return;
        }
        String type = data.getType();
        if (!Intrinsics.areEqual(type, "directive")) {
            if (Intrinsics.areEqual(type, "message")) {
                Iterator<u3f> it = listenerSet.iterator();
                while (it.hasNext()) {
                    it.next().a(data.getScene(), data.getMessageContent());
                }
                return;
            }
            return;
        }
        ArrayList<Object> directives = data.getDirectives();
        if (directives == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = directives.iterator();
        while (it2.hasNext()) {
            Directive<?> directiveA = lt5.INSTANCE.a(it2.next());
            if (directiveA != null) {
                arrayList.add(directiveA);
            }
        }
        umd.INSTANCE.a().h(arrayList, originData);
    }
}
