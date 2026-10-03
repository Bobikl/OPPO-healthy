package com.platform.usercenter.tools.word;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class WordManager {
    private static WordManager INSTANCE;

    private WordManager() {
    }

    public static WordManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WordManager();
        }
        return INSTANCE;
    }

    public IWordFactory addWord(int i, int i2) {
        return WordFactory.getInstance().addWord(i, i2);
    }

    public int getResId(int i) {
        return WordFactory.getInstance().getResId(i);
    }

    public String getString(Context context, int i, String str) {
        return WordFactory.getInstance().getResString(context, i, str);
    }
}
