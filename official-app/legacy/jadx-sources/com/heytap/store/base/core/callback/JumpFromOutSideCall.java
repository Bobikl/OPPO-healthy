package com.heytap.store.base.core.callback;

import android.content.Intent;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/heytap/store/base/core/callback/JumpFromOutSideCall;", "", "getJumpUrl", "", "isActivityStartForOutsideCall", "", "isJumpFromOutside", "", "intent", "Landroid/content/Intent;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface JumpFromOutSideCall {
    @Nullable
    String getJumpUrl();

    boolean isActivityStartForOutsideCall();

    void isJumpFromOutside(@Nullable Intent intent);
}
