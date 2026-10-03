package com.google.mlkit.vision.barcode.internal;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class zzb {

    @VisibleForTesting
    static final AtomicReference zza;
    private static final SparseArray zzb;
    private static final SparseArray zzc;

    @SuppressLint({"UseSparseArrays"})
    private static final Map zzd;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        zzc = sparseArray2;
        zza = new AtomicReference();
        sparseArray.put(-1, zzrn.zza);
        sparseArray.put(1, zzrn.zzb);
        sparseArray.put(2, zzrn.zzc);
        sparseArray.put(4, zzrn.zzd);
        sparseArray.put(8, zzrn.zze);
        sparseArray.put(16, zzrn.zzf);
        sparseArray.put(32, zzrn.zzg);
        sparseArray.put(64, zzrn.zzh);
        sparseArray.put(Barcode.FORMAT_ITF, zzrn.zzi);
        sparseArray.put(256, zzrn.zzj);
        sparseArray.put(512, zzrn.zzk);
        sparseArray.put(Barcode.FORMAT_UPC_E, zzrn.zzl);
        sparseArray.put(Barcode.FORMAT_PDF417, zzrn.zzm);
        sparseArray.put(4096, zzrn.zzn);
        sparseArray2.put(0, zzro.zza);
        sparseArray2.put(1, zzro.zzb);
        sparseArray2.put(2, zzro.zzc);
        sparseArray2.put(3, zzro.zzd);
        sparseArray2.put(4, zzro.zze);
        sparseArray2.put(5, zzro.zzf);
        sparseArray2.put(6, zzro.zzg);
        sparseArray2.put(7, zzro.zzh);
        sparseArray2.put(8, zzro.zzi);
        sparseArray2.put(9, zzro.zzj);
        sparseArray2.put(10, zzro.zzk);
        sparseArray2.put(11, zzro.zzl);
        sparseArray2.put(12, zzro.zzm);
        HashMap map = new HashMap();
        zzd = map;
        map.put(1, zzvw.zzb);
        map.put(2, zzvw.zzc);
        map.put(4, zzvw.zzd);
        map.put(8, zzvw.zze);
        map.put(16, zzvw.zzf);
        map.put(32, zzvw.zzg);
        map.put(64, zzvw.zzh);
        map.put(Integer.valueOf(Barcode.FORMAT_ITF), zzvw.zzi);
        map.put(256, zzvw.zzj);
        map.put(512, zzvw.zzk);
        map.put(Integer.valueOf(Barcode.FORMAT_UPC_E), zzvw.zzl);
        map.put(Integer.valueOf(Barcode.FORMAT_PDF417), zzvw.zzm);
        map.put(4096, zzvw.zzn);
    }

    public static zzrn zza(@Barcode.BarcodeFormat int i) {
        zzrn zzrnVar = (zzrn) zzb.get(i);
        return zzrnVar == null ? zzrn.zza : zzrnVar;
    }

    public static zzro zzb(@Barcode.BarcodeValueType int i) {
        zzro zzroVar = (zzro) zzc.get(i);
        return zzroVar == null ? zzro.zza : zzroVar;
    }

    public static zzvz zzc(BarcodeScannerOptions barcodeScannerOptions) {
        int iZza = barcodeScannerOptions.zza();
        zzcp zzcpVar = new zzcp();
        if (iZza == 0) {
            zzcpVar.zze(zzd.values());
        } else {
            for (Map.Entry entry : zzd.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iZza) != 0) {
                    zzcpVar.zzd((zzvw) entry.getValue());
                }
            }
        }
        zzvx zzvxVar = new zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static String zzd() {
        return true != zzf() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void zze(zzwp zzwpVar, final zzrb zzrbVar) {
        zzwpVar.zzf(new zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zza
            public final zzwe zza() {
                zzrd zzrdVar = new zzrd();
                zzra zzraVar = zzb.zzf() ? zzra.zzc : zzra.zzb;
                zzrb zzrbVar2 = zzrbVar;
                zzrdVar.zze(zzraVar);
                zzrs zzrsVar = new zzrs();
                zzrsVar.zzb(zzrbVar2);
                zzrdVar.zzh(zzrsVar.zzc());
                return zzws.zzf(zzrdVar);
            }
        }, zzrc.zzm);
    }

    public static boolean zzf() {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zZzd = zzo.zzd(MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(Boolean.valueOf(zZzd));
        return zZzd;
    }
}
