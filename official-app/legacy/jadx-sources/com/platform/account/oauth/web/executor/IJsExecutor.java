package com.platform.account.oauth.web.executor;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface IJsExecutor {
    void execute(Fragment fragment, String str);

    String getMethodName();
}
