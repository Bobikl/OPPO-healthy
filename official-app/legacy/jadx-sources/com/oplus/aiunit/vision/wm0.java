package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.oplus.ocs.authenticate.data.AuthenticationDb;
import com.oplus.ocs.authenticate.info.AuthResult;
import java.util.Base64;

/* JADX INFO: loaded from: classes8.dex */
public class wm0 {
    public static final byte[] DEFAULT_SYSTEM_PERMISSION = {-1, -1, -1, -1};
    public static final String a = "wm0";

    public static Pair<Integer, byte[]> a(Context context, String str, String str2, boolean z) {
        int iA = mlm.a(context, str);
        if (iA == 1000) {
            return new Pair<>(1001, DEFAULT_SYSTEM_PERMISSION);
        }
        AuthResult authResultB = b(context, str, str2, z ? AuthenticationDb.e(context).d().a(iA, str2) : null, iA);
        return new Pair<>(Integer.valueOf(authResultB.a), authResultB.b);
    }

    public static AuthResult b(Context context, String str, String str2, nlm nlmVar, int i) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            Log.d(a, "get target packageName is empty");
            return new AuthResult("", 0, 1009, new byte[0]);
        }
        if (i == 1000) {
            return new AuthResult(str, i, 1001, DEFAULT_SYSTEM_PERMISSION);
        }
        String[] strArrF = mbm.f(context, str);
        if (mbm.d(context, strArrF)) {
            return new AuthResult(str, i, 1001, DEFAULT_SYSTEM_PERMISSION);
        }
        str2.hashCode();
        switch (str2) {
            case "LEDGER_CLIENT":
                str3 = "ocs.ledger.AUTH_CODE";
                break;
            case "OAF_CLIENT":
                str3 = "ocs.oaf.AUTH_CODE";
                break;
            case "CAR_LINK_CLIENT":
                str3 = "ocs.car.AUTH_CODE";
                break;
            case "LOCATION_CLIENT":
                str3 = "ocs.location.AUTH_CODE";
                break;
            case "AIRVIEW_CLIENT":
                str3 = "ocs.airview.AUTH_CODE";
                break;
            case "LINK_BOOST_CLIENT":
                str3 = "ocs.link.AUTH_CODE";
                break;
            case "CAMERA_CLIENT":
                str3 = "ocs.camera.AUTH_CODE";
                break;
            case "AR_CLIENT":
                str3 = "ocs.ar.AUTH_CODE";
                break;
            case "MEDIA_CLIENT":
                str3 = "ocs.media.AUTH_CODE";
                break;
            case "COMPUTE_FUSION_CLIENT":
                str3 = "ocs.computefusion.AUTH_CODE";
                break;
            case "SDP_CLIENT":
                str3 = "ocs.sdp.AUTH_CODE";
                break;
            case "CARD_CLIENT":
                str3 = "ocs.card.AUTH_CODE";
                break;
            case "SYNERGY_CLIENT":
                str3 = "ocs.synergy.AUTH_CODE";
                break;
            case "GALLERY_CLIENT":
                str3 = "ocs.gallery.AUTH_CODE";
                break;
            case "CAST_CLIENT":
                str3 = "ocs.cast.AUTH_CODE";
                break;
            case "WEAR_ENGINE_CLIENT":
                str3 = "ocs.wearengine.AUTH_CODE";
                break;
            case "AI_CLIENT":
                str3 = "ocs.ai.AUTH_CODE";
                break;
            case "HYPER_BOOST_CLIENT":
                str3 = "ocs.hyper.AUTH_CODE";
                break;
        }
        String strB = mlm.b(context, str, str3);
        if (TextUtils.isEmpty(strB)) {
            Log.d(a, "get target application authCode is empty");
            return new AuthResult(str, i, 1004, new byte[0]);
        }
        if (nlmVar != null && !TextUtils.isEmpty(nlmVar.b) && nlmVar.b.equals(strB) && i == nlmVar.d) {
            String str4 = a;
            Log.d(str4, "database is not empty");
            if (nlmVar.f < System.currentTimeMillis()) {
                return new AuthResult(str, i, 1003, new byte[0]);
            }
            if (!nlmVar.f14552c) {
                return new AuthResult(str, i, 1006, new byte[0]);
            }
            if (nlmVar.h + (nlmVar.i * 1000) > System.currentTimeMillis()) {
                Log.d(str4, "database check ok");
                return new AuthResult(str, i, 1001, nlmVar.g);
            }
        }
        String[] strArrSplit = strB.split(";");
        if (strArrSplit.length > 0) {
            int length = strArrSplit.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2;
                int i4 = length;
                String[] strArr = strArrSplit;
                String str5 = strB;
                AuthResult authResultC = c(context, strArrSplit[i2], str, nlmVar, strB, i, str2, strArrF);
                if (authResultC.a == 1001) {
                    return authResultC;
                }
                Log.d(a, "auth result is not ok, error code is " + authResultC.a);
                i2 = i3 + 1;
                length = i4;
                strArrSplit = strArr;
                strB = str5;
            }
        }
        return new AuthResult(str, i, 1010, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    public static AuthResult c(Context context, String str, String str2, nlm nlmVar, String str3, int i, String str4, String[] strArr) {
        int i2;
        byte b;
        byte[] bArr;
        try {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            byte b2 = bArrDecode[0];
            byte[] bArr2 = {b2};
            boolean z = Integer.parseInt(mbm.a(b2).substring(7)) == 1;
            byte[] bArr3 = new byte[1];
            switch (str4) {
                case "CAMERA_CLIENT":
                    b = 1;
                    break;
                case "MEDIA_CLIENT":
                    b = 2;
                    break;
                case "LINK_BOOST_CLIENT":
                    b = 3;
                    break;
                case "HYPER_BOOST_CLIENT":
                    b = 4;
                    break;
                case "AR_CLIENT":
                    b = 5;
                    break;
                case "OAF_CLIENT":
                    b = 6;
                    break;
                case "AIRVIEW_CLIENT":
                    b = 7;
                    break;
                case "COMPUTE_FUSION_CLIENT":
                    b = 8;
                    break;
                case "AI_CLIENT":
                    b = 9;
                    break;
                case "GALLERY_CLIENT":
                    b = 10;
                    break;
                case "CAR_LINK_CLIENT":
                    b = 11;
                    break;
                case "SDP_CLIENT":
                    b = 12;
                    break;
                case "LOCATION_CLIENT":
                    b = 13;
                    break;
                case "LEDGER_CLIENT":
                    b = 14;
                    break;
                case "CARD_CLIENT":
                    b = 15;
                    break;
                case "SYNERGY_CLIENT":
                    b = 16;
                    break;
                case "CAST_CLIENT":
                    b = 17;
                    break;
                case "WEAR_ENGINE_CLIENT":
                    b = 32;
                    break;
                default:
                    b = 0;
                    break;
            }
            bArr3[0] = b;
            byte[] bArr4 = new byte[4];
            if (z) {
                fpm.a(bArrDecode, bArrDecode.length - 4, bArr4, 0, 4);
            }
            byte[] bArr5 = new byte[4];
            if (z) {
                fpm.a(bArrDecode, bArrDecode.length - 8, bArr5, 0, 4);
            } else {
                fpm.a(bArrDecode, bArrDecode.length - 4, bArr5, 0, 4);
            }
            if (z) {
                bArr = new byte[bArrDecode.length - 9];
                fpm.a(bArrDecode, 1, bArr, 0, bArrDecode.length - 9);
            } else {
                bArr = new byte[bArrDecode.length - 5];
                fpm.a(bArrDecode, 1, bArr, 0, bArrDecode.length - 5);
            }
            if (!jum.b(str2, z, bArr2, bArr3, bArr5, bArr4, bArr, strArr)) {
                return new AuthResult(str2, i, 1002, new byte[0]);
            }
            long j2 = ((long) (((bArr5[0] << 24) & (-16777216)) | ((bArr5[1] << 16) & 16711680) | ((bArr5[2] << 8) & 65280) | (bArr5[3] & 255))) * 1000;
            if (j2 < System.currentTimeMillis()) {
                return new AuthResult(str2, i, 1003, new byte[0]);
            }
            i2 = i;
            try {
                new Thread(new gpm(context, str3, i, str4, j2, bArr4, nlmVar)).start();
                Log.i(a, "permission check ok");
                return new AuthResult(str2, i2, 1001, bArr4);
            } catch (Exception e2) {
                e = e2;
                Log.e(a, String.format("check key get exception %s", e.getMessage()));
                return new AuthResult(str2, i2, 1002, new byte[0]);
            }
        } catch (Exception e3) {
            e = e3;
            i2 = i;
        }
    }
}
