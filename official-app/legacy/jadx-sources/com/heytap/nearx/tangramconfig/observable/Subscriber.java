package com.heytap.nearx.tangramconfig.observable;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.BuildConfig;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/nearx/tangramconfig/observable/Subscriber;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "Lcom/heytap/nearx/tangramconfig/observable/OnErrorSubscriber;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Subscriber<T> extends Function1<T, Unit>, OnErrorSubscriber {
}
