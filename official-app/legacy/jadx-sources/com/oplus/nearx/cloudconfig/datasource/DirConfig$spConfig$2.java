package com.oplus.nearx.cloudconfig.datasource;

import android.content.SharedPreferences;
import com.oplus.aiunit.vision.gt5;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 16})
final class DirConfig$spConfig$2 extends Lambda implements Function0<SharedPreferences> {
    final /* synthetic */ gt5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirConfig$spConfig$2(gt5 gt5Var) {
        super(0);
        this.this$0 = gt5Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return this.this$0.context.getSharedPreferences(this.this$0.sharePreferenceKey, 0);
    }
}
