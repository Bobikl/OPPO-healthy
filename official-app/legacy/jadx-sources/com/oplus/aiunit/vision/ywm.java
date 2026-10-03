package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Base64;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.customer.feedback.sdk.util.LogUtil;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ywm {
    public static final /* synthetic */ int feedbackb = 0;
    public final Context a;

    public ywm(Context context) {
        this.a = context;
    }

    public final byte[] a(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        String str3 = yvm.feedbacka;
        String str4 = yvm.feedbackb + yvm.feedbackc;
        File file = new File(str);
        try {
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            LogUtil.d("feedbackc.feedbackh", "file buffer size is " + length);
            fileInputStream.read(bArr);
            fileInputStream.close();
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", file.getName());
            jSONObject.put(Const.Scheme.SCHEME_FILE, strEncodeToString);
            jSONObject.put("id", str2);
            jSONObject.put("pid", HeaderInfoHelper.getAppCode(this.a));
            return qwm.a(str4, jSONObject.toString());
        } catch (FileNotFoundException unused) {
            LogUtil.e("feedbackc.feedbackh", "FileNotFoundException");
            return null;
        } catch (IOException unused2) {
            LogUtil.e("feedbackc.feedbackh", "IOException");
            return null;
        } catch (Exception unused3) {
            LogUtil.e("feedbackc.feedbackh", "Exception");
            return null;
        }
    }
}
