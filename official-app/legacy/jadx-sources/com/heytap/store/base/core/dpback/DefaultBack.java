package com.heytap.store.base.core.dpback;

import android.text.TextUtils;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.app.ActivityStartUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/base/core/dpback/DefaultBack;", "Lcom/heytap/store/base/core/dpback/IBackAPP;", "()V", "backAPP", "Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "getBackAPP", "()Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "setBackAPP", "(Lcom/heytap/store/base/core/dpback/BackAPPInfo;)V", "getBackAPPInfo", "gotoTargetApp", "", "backAPPInfo", "match", "", "urlParams", "", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DefaultBack implements IBackAPP {

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
        if (!((TextUtils.isEmpty(urlParams != null ? urlParams.get(Constants.BTN_NAME) : null) && TextUtils.isEmpty(urlParams == null ? null : urlParams.get(Constants.BACK_URL))) ? false : true)) {
            return false;
        }
        BackAPPInfo backAPPInfo = new BackAPPInfo();
        this.backAPP = backAPPInfo;
        Intrinsics.checkNotNull(backAPPInfo);
        backAPPInfo.parseDpUri(urlParams);
        return true;
    }

    public final void setBackAPP(@Nullable BackAPPInfo backAPPInfo) {
        this.backAPP = backAPPInfo;
    }
}
