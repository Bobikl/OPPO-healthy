package com.platform.usercenter.tools.word;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public interface IWordFactory {
    public static final int CONNECT_EX = -1003;
    public static final int JSON_PARSE_ERROR = -1004;
    public static final int NET_ERROR = -1001;
    public static final int NUMBER_PARSE_ERROR = -1000;
    public static final int SOCKET_TIME_OUT = -1002;
    public static final int UNKNOW_HOST_EX = -1005;

    IWordFactory addWord(int i, int i2);

    int getResId(int i);

    String getResString(Context context, int i, String str);
}
