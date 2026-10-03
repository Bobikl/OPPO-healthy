package com.heytap.health.watchface;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.jjd;
import com.oplus.aiunit.vision.kid;
import com.oplus.aiunit.vision.ljd;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchFaceApi extends IProvider {
    public static final String OPERATE_CONNECTSTATE = "WatchFaceManagerContract.CONNECT_STATUS";
    public static final String OPERATE_MAC_ADDRESS = "currentMac";
    public static final int PAGE_ALBUM_V2_HOME = 9;
    public static final int PAGE_FLEXIBLE_MANAGER = 11;
    public static final int PAGE_LIVEPHOTO_HOME = 10;
    public static final int PAGE_WF_ADD = 1;
    public static final int PAGE_WF_DETAIL = 2;
    public static final int PAGE_WF_MY = 0;
    public static final String SERVICE_WATCH_FACE_OUT_API = "/watch_face/getCurrentPreview";

    void B1(AppCompatActivity appCompatActivity, String str, String str2, int i, int i2, String str3, boolean z);

    float C7(Context context, float f, int i, int i2);

    void D9(String str, boolean z);

    void L2(String str, kid kidVar);

    void M7(AppCompatActivity appCompatActivity, String str, String str2, int i, int i2, String str3);

    String S3();

    void V5(boolean z, jjd jjdVar);

    void h8(String str, int i, ljd ljdVar);

    void o(String str);

    void onDeviceConnected(String str);

    void r1(String str, kid kidVar);

    void unbind(String str, String str2);
}
