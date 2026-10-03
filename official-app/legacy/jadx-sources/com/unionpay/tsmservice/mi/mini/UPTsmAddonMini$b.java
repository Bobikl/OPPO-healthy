package com.unionpay.tsmservice.mi.mini;

import android.os.Bundle;
import com.oplus.aiunit.vision.mfk;

/* JADX INFO: loaded from: classes10.dex */
final class UPTsmAddonMini$b extends ITsmCallback.Stub {
    final /* synthetic */ mfk a;
    private final ITsmCallback b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20350c;

    private UPTsmAddonMini$b(mfk mfkVar, ITsmCallback iTsmCallback, int i) {
        this.b = iTsmCallback;
        this.f20350c = i;
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onError(String str, String str2) {
        ITsmCallback iTsmCallback = this.b;
        if (iTsmCallback != null) {
            iTsmCallback.onError(str, str2);
        }
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.b != null) {
            bundle.putInt("interfaceId", this.f20350c);
            this.b.onResult(bundle);
        }
    }

    public /* synthetic */ UPTsmAddonMini$b(mfk mfkVar, ITsmCallback iTsmCallback, int i, byte b) {
        this(mfkVar, iTsmCallback, i);
    }
}
