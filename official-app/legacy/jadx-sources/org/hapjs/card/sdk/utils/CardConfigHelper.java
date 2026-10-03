package org.hapjs.card.sdk.utils;

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

        private static String getCardConfig(Context context, Context context2) throws Throwable {
            String cardConfigFile = readCardConfigFile(context);
            if (!TextUtils.isEmpty(cardConfigFile) || context == context2) {
                return cardConfigFile;
            }
            Log.d(TAG, "getCardConfig: try resContext");
            return readCardConfigFile(context2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getPlatform(Context context, Context context2) throws Throwable {
            String cardConfig = getCardConfig(context, context2);
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

        /* JADX WARN: Code duplicated, block: B:38:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0056: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x0056 */
        private static String readCardConfigFile(Context context) throws Throwable {
            InputStream inputStreamOpen;
            InputStream inputStream;
            InputStream inputStream2 = null;
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
                        Log.e(TAG, "Fail to get card config from context: " + context, e);
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }
    }

    public static String getPlatform(Context context, Context context2) throws Throwable {
        String str = sPlatform.get(context.getPackageName());
        if (str != null) {
            return str;
        }
        String platform = CardConfig.getPlatform(context, context2);
        sPlatform.put(context.getPackageName(), platform);
        return platform;
    }

    public static boolean isLoadFromLocal(Context context, Context context2) {
        return TextUtils.equals(getPlatform(context, context2), context.getPackageName());
    }
}
