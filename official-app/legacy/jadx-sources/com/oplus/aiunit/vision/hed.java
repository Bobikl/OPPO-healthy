package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.api.OplusApi;
import com.oplus.ocs.base.internal.ClientSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/hed;", "Lcom/oplus/ocs/base/common/api/OplusApi;", "Lcom/oplus/ocs/base/common/api/Api$ApiOptions$NoOptions;", "", "a", "b", "", "I", "versionCode", "Landroid/content/Context;", "context", "", "authSwitchOn", "<init>", "(Landroid/content/Context;ZI)V", "Companion", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class hed extends OplusApi<Api.ApiOptions.NoOptions, hed> {

    @NotNull
    public static final Api<Api.ApiOptions.NoOptions> b = new Api<>("OcsClient.API", new ied(), new Api.ClientKey());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int versionCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hed(@NotNull Context context, boolean z, int i) {
        super(context, b, (Api.ApiOptions) null, new ClientSettings(context.getPackageName(), i, new ArrayList()), z);
        Intrinsics.checkNotNullParameter(context, "context");
        this.versionCode = i;
    }

    public final void a() {
        addThis2Cache();
    }

    public final void b() {
        releaseClientKey();
    }
}
