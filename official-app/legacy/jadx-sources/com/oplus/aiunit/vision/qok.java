package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.account.AccountUserInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"Lcom/heytap/databaseengine/model/UserInfo;", "Lcom/heytap/health/account/AccountUserInfo;", UTraceSQLiteHelperKt.COL_INFO, "a", "", y15.PARAMS_DATA_TYPE, "b", "account_impl_release"}, k = 2, mv = {1, 8, 0})
public final class qok {
    @NotNull
    public static final AccountUserInfo a(@NotNull UserInfo userInfo, @Nullable AccountUserInfo accountUserInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "<this>");
        if (accountUserInfo == null) {
            accountUserInfo = new AccountUserInfo();
        }
        accountUserInfo.ssoid = userInfo.getSsoid();
        accountUserInfo.userName = userInfo.getUserName();
        accountUserInfo.accountName = userInfo.getAccountName();
        accountUserInfo.userNameNeedModify = userInfo.isUserNameNeedModify();
        accountUserInfo.country = userInfo.getCountry();
        accountUserInfo.status = userInfo.getStatus();
        accountUserInfo.avatarUrl = userInfo.getAvatar();
        accountUserInfo.sex = userInfo.getSex();
        accountUserInfo.birthday = userInfo.getBirthday();
        accountUserInfo.height = userInfo.getHeight();
        accountUserInfo.weight = userInfo.getWeight();
        accountUserInfo.bloodPressureType = userInfo.getBloodPressureType();
        return accountUserInfo;
    }

    @NotNull
    public static final UserInfo b(@NotNull AccountUserInfo accountUserInfo, int i) {
        Intrinsics.checkNotNullParameter(accountUserInfo, "<this>");
        UserInfo userInfo = new UserInfo();
        userInfo.setSsoid(accountUserInfo.ssoid);
        userInfo.setUserName(accountUserInfo.userName);
        userInfo.setAccountName(accountUserInfo.accountName);
        userInfo.setUserNameNeedModify(accountUserInfo.userNameNeedModify);
        userInfo.setCountry(accountUserInfo.country);
        userInfo.setStatus(accountUserInfo.status);
        userInfo.setAvatar(accountUserInfo.avatarUrl);
        userInfo.setSex(accountUserInfo.sex);
        userInfo.setBirthday(accountUserInfo.birthday);
        userInfo.setHeight(accountUserInfo.height);
        userInfo.setWeight(accountUserInfo.weight);
        userInfo.setInsertDataType(i);
        userInfo.setBloodPressureType(accountUserInfo.bloodPressureType);
        return userInfo;
    }

    public static /* synthetic */ UserInfo c(AccountUserInfo accountUserInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return b(accountUserInfo, i);
    }
}
