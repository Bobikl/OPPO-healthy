package com.heytap.webpro.score;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class DomainScoreEntity {
    public int account;
    public int basicInfo;
    public int data;
    public int finance;
    public int location;
    public int score;
    public String url;

    public int getScoreByPermissionType(int i) {
        if (i == 0) {
            return this.score;
        }
        if (i == 1) {
            return this.basicInfo;
        }
        if (i == 2) {
            return this.location;
        }
        if (i == 3) {
            return this.account;
        }
        if (i == 4) {
            return this.data;
        }
        if (i != 5) {
            return 0;
        }
        return this.finance;
    }
}
