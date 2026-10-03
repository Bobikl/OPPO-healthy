package com.lifesense.plugin.ble.device.ancs;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    public static final int ANCS_TITLE_MAX_BYTE = 32;
    public static final String DEFAULT_TITLE = "unknown";
    public static final int DEVICE_GET_CONTENT = 161;
    public static final int MODE_ADD = 0;
    public static final int MODE_MODIFIED = 1;
    public static final int MODE_REMOVED = 2;
    public static final String PACKAGE_NAME_FACEBOOK = "com.facebook.katana";
    public static final String PACKAGE_NAME_GMAIL = "com.google.android.gm";
    public static final String PACKAGE_NAME_INSTAGRAM = "com.instagram.android";
    public static final String PACKAGE_NAME_KAKAO = "com.kakao.talk";
    public static final String PACKAGE_NAME_LINE = "jp.naver.line.android";
    public static final String PACKAGE_NAME_QQ = "com.tencent.mobileqq";
    public static final String PACKAGE_NAME_SEWELLNESS = "com.sewellness.android";
    public static final String PACKAGE_NAME_TWITTER = "com.twitter.android";
    public static final String PACKAGE_NAME_TianruiHealth = "cn.com.tianruihealth";
    public static final String PACKAGE_NAME_WEIXIN = "com.tencent.mm";
    public static final String PACKAGE_NAME_WHATSAPP = "com.whatsapp";
    public static final String PACKAGE_NAME_Wgh3h = "tw.com.wgh3h";
    public static final String PACKAGE_NAME_Wgh3hSee = "tw.com.wgh3h_SEE";
    public static final int PEDOMETER_REQUEST_CONTENT_LENGHT = 3;
    public static final int PEDOMETER_REQUEST_TITLE_LENGHT = 2;
    public static final int RESPONSE_ERR_VERIFY = 0;
    public static final int RESPONSE_FACTORY_MODE_OR_CHARGE = 4;
    public static final int RESPONSE_MESSAGE_CONTENT = 193;
    public static final int RESPONSE_SUCCESS = 1;
    public static final int TYPE_SOCIAL = 4;
    protected byte[] a;

    public static String d(String str) {
        Matcher matcher = Pattern.compile("^\\[\\d+条\\]").matcher(str);
        return matcher.find() ? str.substring(matcher.group().length()) : str;
    }

    public static int e(String str) {
        Matcher matcher = Pattern.compile("\\[\\d+条\\]").matcher(str);
        if (!matcher.find()) {
            return 1;
        }
        String strGroup = matcher.group();
        if (str.indexOf(strGroup) == 0) {
            return Integer.parseInt(strGroup.substring(strGroup.indexOf("[") + 1, strGroup.indexOf("条]")));
        }
        return 1;
    }

    public int a(byte b) {
        return b & 255;
    }

    public int b(short s) {
        return 65535 & s;
    }

    public int c(byte[] bArr) {
        if (bArr.length <= 0) {
            return 0;
        }
        int iA = 0;
        for (byte b : bArr) {
            iA += a(b);
        }
        return iA;
    }

    public static int a(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://sms"), null, "type = 1 and read = 0", null, null);
        if (cursorQuery == null) {
            return 1;
        }
        int count = cursorQuery.getCount();
        cursorQuery.close();
        return count;
    }

    public int b(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readShort();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public byte[] d(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static String b(String str, String str2) {
        String strD = d(str);
        String strA = a(strD, str2);
        int iIndexOf = strD.indexOf(strA + ":");
        if (iIndexOf == 0) {
            return strD.substring((strA + ":").length());
        }
        if (iIndexOf != -1) {
            return strD;
        }
        return " " + strD;
    }

    public int a(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readInt();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static LSAppCategory a(Context context, String str) {
        if (str == null || str.length() == 0) {
            return LSAppCategory.Unknown;
        }
        if ("com.tencent.mm".equalsIgnoreCase(str)) {
            return LSAppCategory.Wechat;
        }
        if (PACKAGE_NAME_LINE.equalsIgnoreCase(str)) {
            return LSAppCategory.Line;
        }
        if (PACKAGE_NAME_GMAIL.equalsIgnoreCase(str)) {
            return LSAppCategory.Gmail;
        }
        if (PACKAGE_NAME_WHATSAPP.equalsIgnoreCase(str)) {
            return LSAppCategory.WhatsApp;
        }
        if (PACKAGE_NAME_SEWELLNESS.equalsIgnoreCase(str)) {
            return LSAppCategory.SeWellness;
        }
        if (PACKAGE_NAME_KAKAO.equalsIgnoreCase(str)) {
            return LSAppCategory.KaKao;
        }
        if ("com.tencent.mobileqq".equalsIgnoreCase(str)) {
            return LSAppCategory.QQ;
        }
        if (PACKAGE_NAME_FACEBOOK.equalsIgnoreCase(str)) {
            return LSAppCategory.Facebook;
        }
        if (PACKAGE_NAME_TWITTER.equalsIgnoreCase(str)) {
            return LSAppCategory.Twitter;
        }
        if (PACKAGE_NAME_TianruiHealth.equalsIgnoreCase(str)) {
            return LSAppCategory.TianruiHealth;
        }
        if (PACKAGE_NAME_WHATSAPP.equalsIgnoreCase(str)) {
            return LSAppCategory.WhatsApp;
        }
        if (PACKAGE_NAME_Wgh3h.equalsIgnoreCase(str)) {
            return LSAppCategory.WoWgoHealth;
        }
        if (PACKAGE_NAME_Wgh3hSee.equalsIgnoreCase(str)) {
            return LSAppCategory.iCare;
        }
        return PACKAGE_NAME_INSTAGRAM.equalsIgnoreCase(str) ? LSAppCategory.Instagram : LSAppCategory.Other;
    }

    @SuppressLint({"NewApi"})
    public static ATTextMessage a(Context context, String str, Notification notification) {
        try {
            if (notification == null) {
                Objects.toString(notification);
                return null;
            }
            Bundle bundle = notification.extras;
            if (bundle == null) {
                Objects.toString(bundle);
                return null;
            }
            if (notification.tickerText == null) {
                Objects.toString(notification.tickerText);
                return null;
            }
            ATTextMessage aTTextMessage = new ATTextMessage(LSAppCategory.Unknown);
            aTTextMessage.setPackageName(str);
            String string = bundle.getString(NotificationCompat.EXTRA_TITLE);
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            aTTextMessage.setContent(TextUtils.isEmpty(charSequence) ? "" : charSequence.toString());
            aTTextMessage.setTitle(string);
            aTTextMessage.setMsgCategory(a(context, aTTextMessage.getPackageName()));
            return aTTextMessage;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(String str, Context context) {
        try {
            String strC = com.lifesense.plugin.ble.c.f.c(context, str);
            return (strC == null || strC.length() == 0) ? str : strC;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String a(String str, String str2) {
        String strD = d(str);
        int iIndexOf = strD.indexOf(":");
        return iIndexOf != -1 ? strD.substring(0, iIndexOf) : str2;
    }

    public List a(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (bArr.length > i) {
            int i2 = 0;
            while (i2 < bArr.length - i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i2, bArr2, 0, i);
                i2 += i;
                arrayList.add(bArr2);
            }
            int length = bArr.length - i2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i2, bArr3, 0, length);
            arrayList.add(bArr3);
        } else {
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public byte[] a(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }
}
