package com.platform.usercenter.tools.word;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"StaticFieldLeak"})
public class WordFactory implements IWordFactory {
    private static final int DEFAULT_VALUE = -1;
    private static WordFactory INSTANCE;
    private final SparseIntArray mWordSpa = new SparseIntArray();

    private WordFactory() {
    }

    public static WordFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WordFactory();
        }
        return INSTANCE;
    }

    @Override // com.platform.usercenter.tools.word.IWordFactory
    public IWordFactory addWord(int i, int i2) {
        this.mWordSpa.append(i, i2);
        return this;
    }

    @Override // com.platform.usercenter.tools.word.IWordFactory
    public int getResId(int i) {
        return this.mWordSpa.get(i, -1);
    }

    @Override // com.platform.usercenter.tools.word.IWordFactory
    public String getResString(Context context, int i, String str) {
        int i2 = this.mWordSpa.get(i, -1);
        if (i2 != -1) {
            return context.getString(i2) + "[" + i + "]";
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + "[" + i + "]";
    }
}
