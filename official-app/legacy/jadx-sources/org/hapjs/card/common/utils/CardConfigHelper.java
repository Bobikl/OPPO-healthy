package org.hapjs.card.common.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class CardConfigHelper {
    private static Map<String, String> sPlatform = new HashMap();

    public static class CardConfig {
        private static final String CARD_CONFIG_NAME = "hap/card.json";
        private static final String INSTANT_PLATFORM = "com.nearme.instant.platform";
        private static final String KEY_PLATFORM = "platform";
        private static final String TAG = "CardConfig";

        private CardConfig() {
        }

        /* JADX WARN: Code duplicated, block: B:33:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.io.InputStream] */
        private static String getCardConfig(Context context) throws Throwable {
            Throwable th;
            InputStream inputStreamOpen;
            try {
                try {
                    inputStreamOpen = context.getResources().getAssets().open(CARD_CONFIG_NAME);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                        return str;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e(TAG, "Fail to get card config", e);
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (context != 0) {
                        try {
                            context.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                inputStreamOpen = null;
            } catch (Throwable th3) {
                th = th3;
                context = 0;
                if (context != 0) {
                    context.close();
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getPlatform(Context context) throws Throwable {
            String cardConfig = getCardConfig(context);
            String strOptString = null;
            if (cardConfig != null) {
                try {
                    strOptString = new JSONObject(cardConfig).optString("platform", null);
                } catch (JSONException e2) {
                    Log.e(TAG, "Fail to get platform", e2);
                }
            }
            return TextUtils.isEmpty(strOptString) ? "com.nearme.instant.platform" : strOptString;
        }
    }

    public static String getPlatform(Context context) throws Throwable {
        String str = sPlatform.get(context.getPackageName());
        if (str != null) {
            return str;
        }
        String platform = CardConfig.getPlatform(context);
        sPlatform.put(context.getPackageName(), platform);
        return platform;
    }

    public static boolean isLoadFromLocal(Context context) {
        return TextUtils.equals(getPlatform(context), context.getPackageName());
    }
}
