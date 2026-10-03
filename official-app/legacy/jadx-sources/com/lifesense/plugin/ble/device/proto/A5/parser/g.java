package com.lifesense.plugin.ble.device.proto.A5.parser;

import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.setting.ATWeekDay;

/* JADX INFO: loaded from: classes5.dex */
/* synthetic */ class g {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ATWeekDay.values().length];
        b = iArr;
        try {
            iArr[ATWeekDay.Monday.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[ATWeekDay.Tuesday.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[ATWeekDay.Wednesday.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[ATWeekDay.Thursday.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[ATWeekDay.Friday.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[ATWeekDay.Saturday.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[ATWeekDay.Sunday.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[LSAppCategory.values().length];
        a = iArr2;
        try {
            iArr2[LSAppCategory.All.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[LSAppCategory.IncomingCall.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[LSAppCategory.Sms.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[LSAppCategory.Wechat.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[LSAppCategory.QQ.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[LSAppCategory.Facebook.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[LSAppCategory.Twitter.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            a[LSAppCategory.Line.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            a[LSAppCategory.Gmail.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            a[LSAppCategory.KaKao.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            a[LSAppCategory.WhatsApp.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            a[LSAppCategory.SeWellness.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            a[LSAppCategory.Instagram.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
