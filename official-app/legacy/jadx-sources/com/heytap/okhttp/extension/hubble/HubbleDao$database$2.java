package com.heytap.okhttp.extension.hubble;

import android.content.Context;
import com.heytap.baselib.database.TapDatabase;
import com.oplus.aiunit.vision.bl9;
import com.oplus.aiunit.vision.p15;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/heytap/baselib/database/TapDatabase;", "invoke"}, k = 3, mv = {1, 4, 0})
final class HubbleDao$database$2 extends Lambda implements Function0<TapDatabase> {
    final /* synthetic */ bl9 this$0;

    public HubbleDao$database$2(bl9 bl9Var) {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @Nullable
    public final TapDatabase invoke() {
        Context contextA = bl9.a(null);
        if (contextA != null) {
            return new TapDatabase(contextA, new p15(bl9.DB_NAME, 1, new Class[]{HubbleEntity.class}));
        }
        return null;
    }
}
