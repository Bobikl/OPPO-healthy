package com.heytap.store.base.core.dpback;

import android.net.Uri;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.app.ActivityStartUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/core/dpback/ByteDanceBack;", "Lcom/heytap/store/base/core/dpback/IBackAPP;", "()V", "backAPP", "Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "backNamMap", "", "", "getBackAPPInfo", "gotoTargetApp", "", "backAPPInfo", "match", "", "urlParams", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ByteDanceBack implements IBackAPP {

    @Nullable
    private BackAPPInfo backAPP;

    @NotNull
    private Map<String, String> backNamMap = MapsKt__MapsKt.mapOf(TuplesKt.to("snssdk143", "今日头条"), TuplesKt.to("snssdk35", "今日头条 lite"), TuplesKt.to("snssdk32", "西瓜视频"), TuplesKt.to("snssdk1128", "抖音"), TuplesKt.to("snssdk2329", "抖音 lite"), TuplesKt.to("snssdk1112", "火山小视频"));

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean backIntercept() {
        return IBackAPP.DefaultImpls.backIntercept(this);
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    @Nullable
    /* JADX INFO: renamed from: getBackAPPInfo, reason: from getter */
    public BackAPPInfo getBackAPP() {
        return this.backAPP;
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public void gotoTargetApp(@Nullable BackAPPInfo backAPPInfo) {
        ActivityStartUtil.startOtherWebBrowserByActionView(ContextGetterUtils.INSTANCE.getApp(), backAPPInfo == null ? null : backAPPInfo.getBackUrl());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean match(@Nullable Map<String, String> urlParams) {
        boolean z;
        String str = urlParams == null ? null : urlParams.get("backurl");
        String str2 = str != null ? this.backNamMap.get(Uri.parse(str).getScheme()) : "";
        if (str2 == null) {
            z = false;
        } else {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        this.backAPP = new BackAPPInfo();
        if (urlParams != null) {
            Intrinsics.checkNotNull(str);
            urlParams.put(Constants.BACK_URL, str);
        }
        if (urlParams != null) {
            Intrinsics.checkNotNull(str2);
            urlParams.put(Constants.BTN_NAME, str2);
        }
        BackAPPInfo backAPPInfo = this.backAPP;
        Intrinsics.checkNotNull(backAPPInfo);
        backAPPInfo.parseDpUri(urlParams);
        return true;
    }
}
