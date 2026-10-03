package com.heytap.store.base.core.dpback;

import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.app.ActivityStartUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/base/core/dpback/TencentBack;", "Lcom/heytap/store/base/core/dpback/IBackAPP;", "()V", "backAPP", "Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "getBackAPP", "()Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "setBackAPP", "(Lcom/heytap/store/base/core/dpback/BackAPPInfo;)V", "getBackAPPInfo", "gotoTargetApp", "", "backAPPInfo", "match", "", "urlParams", "", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TencentBack implements IBackAPP {

    @Nullable
    private BackAPPInfo backAPP;

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean backIntercept() {
        return IBackAPP.DefaultImpls.backIntercept(this);
    }

    @Nullable
    public final BackAPPInfo getBackAPP() {
        return this.backAPP;
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    @Nullable
    public BackAPPInfo getBackAPPInfo() {
        return this.backAPP;
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public void gotoTargetApp(@Nullable BackAPPInfo backAPPInfo) {
        ActivityStartUtil.startOtherWebBrowserByActionView(ContextGetterUtils.INSTANCE.getApp(), backAPPInfo == null ? null : backAPPInfo.getBackUrl());
    }

    @Override // com.heytap.store.base.core.dpback.IBackAPP
    public boolean match(@Nullable Map<String, String> urlParams) {
        String str = urlParams == null ? null : urlParams.get("back_name");
        String str2 = urlParams == null ? null : urlParams.get(Constants.BACK_URL);
        if (!((str == null || str2 == null || (urlParams != null ? urlParams.get("back_pkg") : null) == null) ? false : true)) {
            return false;
        }
        this.backAPP = new BackAPPInfo();
        if (urlParams != null) {
            Intrinsics.checkNotNull(str2);
            urlParams.put(Constants.BACK_URL, str2);
        }
        if (urlParams != null) {
            Intrinsics.checkNotNull(str);
            urlParams.put(Constants.BTN_NAME, str);
        }
        BackAPPInfo backAPPInfo = this.backAPP;
        Intrinsics.checkNotNull(backAPPInfo);
        backAPPInfo.parseDpUri(urlParams);
        return true;
    }

    public final void setBackAPP(@Nullable BackAPPInfo backAPPInfo) {
        this.backAPP = backAPPInfo;
    }
}
