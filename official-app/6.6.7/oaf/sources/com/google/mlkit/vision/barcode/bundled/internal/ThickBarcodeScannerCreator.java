package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbp;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
@DynamiteApi
public class ThickBarcodeScannerCreator extends zzbp {
    public zzbn newBarcodeScanner(IObjectWrapper iObjectWrapper, zzba zzbaVar) {
        return new zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbaVar);
    }
}
