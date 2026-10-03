package org.hapjs.features.channel.appinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.oplus.aiunit.vision.gym;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class AndroidApplication {
    private Context mContext;
    public String mPkgName;
    public String[] mSignatureList;

    public AndroidApplication(Context context, String str, String... strArr) {
        this.mContext = context;
        this.mPkgName = str;
        this.mSignatureList = strArr;
    }

    private PackageInfo getPackageInfo() {
        try {
            return this.mContext.getPackageManager().getPackageInfo(this.mPkgName, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean checkInstalled() {
        return getPackageInfo() != null;
    }

    public boolean checkSignMatched() {
        String lowerCase;
        String[] strArr = this.mSignatureList;
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        PackageInfo packageInfo = getPackageInfo();
        if (packageInfo == null) {
            return false;
        }
        for (Signature signature : packageInfo.signatures) {
            byte[] byteArray = signature.toByteArray();
            char[] cArr = gym.a;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr2 = new char[bArrDigest.length * 2];
                for (int i = 0; i < bArrDigest.length; i++) {
                    int i2 = bArrDigest[i] & 255;
                    int i3 = i * 2;
                    char[] cArr3 = gym.a;
                    cArr2[i3] = cArr3[i2 >>> 4];
                    cArr2[i3 + 1] = cArr3[i2 & 15];
                }
                lowerCase = new String(cArr2);
            } catch (NoSuchAlgorithmException e2) {
                Log.e("MessageChannel-Utils", "Md5 algorithm NOT found.", e2);
                lowerCase = "".toLowerCase();
            }
            for (String str : this.mSignatureList) {
                if (TextUtils.equals(str, lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }
}
