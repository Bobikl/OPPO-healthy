package com.oplus.aiunit.ocr.client;

import android.content.Context;
import com.oplus.ocrclient.OcrClient;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
final class OcrCloudClient$ocrClient$2 extends Lambda implements Function0<OcrClient> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrCloudClient$ocrClient$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    public final OcrClient invoke() {
        OcrClient ocrClient = OcrClient.getInstance();
        ocrClient.init(this.$context);
        ocrClient.setAllowedEngineTypes(ocrClient.getAllowedEngineTypes() != -1 ? 1 | ocrClient.getAllowedEngineTypes() : 1);
        return ocrClient;
    }
}
