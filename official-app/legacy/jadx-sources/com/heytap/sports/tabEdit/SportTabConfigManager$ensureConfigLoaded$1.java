package com.heytap.sports.tabEdit;

import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.tabEdit.SportTabConfigManager", f = "SportTabConfigManager.kt", i = {0}, l = {137, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD}, m = "ensureConfigLoaded", n = {"this"}, s = {"L$0"})
public final class SportTabConfigManager$ensureConfigLoaded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SportTabConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportTabConfigManager$ensureConfigLoaded$1(SportTabConfigManager sportTabConfigManager, Continuation<? super SportTabConfigManager$ensureConfigLoaded$1> continuation) {
        super(continuation);
        this.this$0 = sportTabConfigManager;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
