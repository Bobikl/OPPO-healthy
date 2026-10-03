package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class PushAuthCallerListParas {
    private String clientId;
    private List<String> scope = new ArrayList();

    public PushAuthCallerListParas(AuthCallerBody authCallerBody) {
        this.clientId = authCallerBody.getClientId();
        for (AuthCallerBody.ScopeBean scopeBean : authCallerBody.getScope()) {
            if (scopeBean.isSelected()) {
                this.scope.add(scopeBean.getCode());
            }
        }
    }
}
