package com.unionpay.tsmservice.mini;

import android.os.Bundle;
import com.oplus.aiunit.vision.lfk;

/* JADX INFO: loaded from: classes10.dex */
final class UPTsmAddonMini$b extends ITsmCallback.Stub {
    final /* synthetic */ lfk a;
    private final ITsmCallback b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20351c;

    private UPTsmAddonMini$b(lfk lfkVar, ITsmCallback iTsmCallback, int i) {
        this.b = iTsmCallback;
        this.f20351c = i;
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onError(String str, String str2) {
        ITsmCallback iTsmCallback = this.b;
        if (iTsmCallback != null) {
            iTsmCallback.onError(str, str2);
        }
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.b != null) {
            bundle.putInt("interfaceId", this.f20351c);
            this.b.onResult(bundle);
        }
    }

    public /* synthetic */ UPTsmAddonMini$b(lfk lfkVar, ITsmCallback iTsmCallback, int i, byte b) {
        this(lfkVar, iTsmCallback, i);
    }
}
