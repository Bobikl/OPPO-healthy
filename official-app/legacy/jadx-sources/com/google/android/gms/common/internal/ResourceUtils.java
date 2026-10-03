package com.google.android.gms.common.internal;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;

/* JADX INFO: loaded from: classes13.dex */
@KeepForSdk
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath(ResourcesUtil.ResourceType.DRAWABLE).build();

    private ResourceUtils() {
    }
}
