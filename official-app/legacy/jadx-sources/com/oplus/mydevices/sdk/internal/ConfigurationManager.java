package com.oplus.mydevices.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.mydevices.sdk.DeviceSdk;
import com.oplus.mydevices.sdk.utils.LogUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/oplus/mydevices/sdk/internal/ConfigurationManager;", "", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext$delegate", "Lkotlin/Lazy;", "getXmlVersion", "", SpeechConstant.RESULT_TYPE_XML, "", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class ConfigurationManager {
    private static final String PROPERTY_VERSION = "version";
    private static final String TAG = "ConfigurationManager";
    private static final String TAG_CONFIG = "configuration";

    /* JADX INFO: renamed from: mContext$delegate, reason: from kotlin metadata */
    private final Lazy mContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.oplus.mydevices.sdk.internal.ConfigurationManager$mContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final Context invoke() {
            return DeviceSdk.getApplicationContext();
        }
    });

    private final Context getMContext() {
        return (Context) this.mContext.getValue();
    }

    public final long getXmlVersion(int xml) {
        Resources resources;
        if (getMContext() == null || xml == -1) {
            return 0L;
        }
        Context mContext = getMContext();
        XmlResourceParser xml2 = (mContext == null || (resources = mContext.getResources()) == null) ? null : resources.getXml(xml);
        if (xml2 == null) {
            LogUtils.INSTANCE.i(TAG, "parser is null");
            return 0L;
        }
        while (xml2.next() != 3) {
            if (xml2.getEventType() == 2 && Intrinsics.areEqual(xml2.getName(), "configuration")) {
                String attributeValue = xml2.getAttributeValue(null, "version");
                Intrinsics.checkNotNullExpressionValue(attributeValue, "parser.getAttributeValue(null, PROPERTY_VERSION)");
                long j2 = Long.parseLong(attributeValue);
                LogUtils.INSTANCE.d(TAG, "version : " + j2);
                return j2;
            }
        }
        return 0L;
    }
}
