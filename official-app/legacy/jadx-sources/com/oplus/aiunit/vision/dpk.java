package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/UserInfo;", "", "millis", "", "a", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class dpk {
    public static final int a(@Nullable UserInfo userInfo, long j2) {
        String birthday = userInfo != null ? userInfo.getBirthday() : null;
        if (birthday == null || birthday.length() == 0) {
            birthday = UserInfo.BIRTHDAY_DEFAULT;
        }
        return (int) ((j2 - x05.i(birthday, "yyyy-MM-dd")) / 31536000000L);
    }
}
