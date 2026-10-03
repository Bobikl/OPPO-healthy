package com.ted.number;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.interconnection.netnumber.INetNumberProvider;
import com.ted.number.entrys.RecognitionNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = "/dic/INetNumberProvider")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ted/number/NetNumberProvider;", "Lcom/heytap/health/interconnection/netnumber/INetNumberProvider;", "()V", "getRecognitionNumber", "Lcom/ted/number/entrys/RecognitionNumber;", "telNum", "", "type", "", "init", "", "context", "Landroid/content/Context;", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetNumberProvider implements INetNumberProvider {
    @Override // com.heytap.health.interconnection.netnumber.INetNumberProvider
    @Nullable
    public RecognitionNumber getRecognitionNumber(@NotNull String telNum, int type) {
        Intrinsics.checkNotNullParameter(telNum, "telNum");
        return TedServiceHelper.getInstance().queryNumberInfo(telNum, type);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
