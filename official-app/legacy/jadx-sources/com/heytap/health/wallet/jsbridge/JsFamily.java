package com.heytap.health.wallet.jsbridge;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class JsFamily {
    private ArrayList<Class> classList = new ArrayList<>();
    private String name;

    public Class getClass(int i) {
        if (i < 0 || i >= getSize()) {
            return null;
        }
        return this.classList.get(i);
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.classList.size();
    }

    public void setName(String str) {
        this.name = str;
    }
}
