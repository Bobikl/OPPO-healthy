package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.AccountInfo;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.databaseengineservice.db.table.DBAccountInfo;
import com.heytap.databaseengineservice.db.table.DBTrackTemp;
import com.heytap.databaseengineservice.db.table.DBUserGoalInfo;
import com.heytap.databaseengineservice.db.table.DBUserInfo;
import com.heytap.databaseengineservice.db.table.DBUserPreference;
import com.heytap.databaseengineservice.db.table.space.DBSpaceInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ'\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\fH\u0007¢\u0006\u0004\b \u0010\u001bJ\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\fJ\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/ts4;", "", "Lcom/heytap/databaseengine/model/UserInfo;", ebe.KEY_USER_INFO, "Lcom/heytap/databaseengineservice/db/table/DBUserInfo;", "c", "dbData", "i", "Lcom/heytap/databaseengine/model/AccountInfo;", "accountInfo", "Lcom/heytap/databaseengineservice/db/table/DBAccountInfo;", "a", "", "Lcom/heytap/databaseengine/model/UserGoalInfo;", "list", "", "Lcom/heytap/databaseengineservice/db/table/DBUserGoalInfo;", MapSchema.FIELD_NAME_ENTRY, "dbUserGoalInfo", b2n.g, "Lcom/heytap/databaseengine/model/UserPreference;", "userPreference", "Lcom/heytap/databaseengineservice/db/table/DBUserPreference;", "d", "dbUserPreference", "j", LogFieldKey.LEVEL_KEY, "(Ljava/util/List;)Ljava/util/List;", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "Lcom/heytap/databaseengineservice/db/table/DBTrackTemp;", "b", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/databaseengine/model/SpaceInfo;", "Lcom/heytap/databaseengineservice/db/table/space/DBSpaceInfo;", "f", "", b2n.f, "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class ts4 {

    @NotNull
    public static final ts4 INSTANCE = new ts4();

    @Nullable
    public final DBAccountInfo a(@Nullable AccountInfo accountInfo) {
        if (accountInfo == null) {
            return null;
        }
        DBAccountInfo dBAccountInfo = new DBAccountInfo();
        dBAccountInfo.setSsoid(accountInfo.getSsoid());
        dBAccountInfo.setToken(accountInfo.getToken());
        dBAccountInfo.setLogin(accountInfo.getLogin());
        return dBAccountInfo;
    }

    @Nullable
    public final DBTrackTemp b(@Nullable OneTimeSport oneTimeSport) {
        if (oneTimeSport == null) {
            return null;
        }
        DBTrackTemp dBTrackTemp = new DBTrackTemp();
        dBTrackTemp.setSsoid(oneTimeSport.getSsoid());
        dBTrackTemp.setClientDataId(oneTimeSport.getClientDataId());
        dBTrackTemp.setDeviceUniqueId(oneTimeSport.getDeviceUniqueId());
        dBTrackTemp.setDeviceType(oneTimeSport.getDeviceType());
        dBTrackTemp.setStartTimestamp(oneTimeSport.getStartTimestamp());
        dBTrackTemp.setEndTimestamp(oneTimeSport.getEndTimestamp());
        dBTrackTemp.setSportMode(oneTimeSport.getSportMode());
        dBTrackTemp.setData(oneTimeSport.getData());
        dBTrackTemp.setVersion(oneTimeSport.getVersion());
        dBTrackTemp.setMetaData(oneTimeSport.getMetaData());
        dBTrackTemp.setSyncStatus(oneTimeSport.getSyncStatus());
        dBTrackTemp.setTimezone(oneTimeSport.getTimezone());
        dBTrackTemp.setDisplay(oneTimeSport.getDisplay());
        return dBTrackTemp;
    }

    @Nullable
    public final DBUserInfo c(@Nullable UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        DBUserInfo dBUserInfo = new DBUserInfo();
        dBUserInfo.setSsoid(userInfo.getSsoid());
        dBUserInfo.setUserId(userInfo.getUserId());
        dBUserInfo.setUserName(userInfo.getUserName());
        dBUserInfo.setAccountName(userInfo.getAccountName());
        dBUserInfo.setUserNameNeedModify(userInfo.isUserNameNeedModify());
        dBUserInfo.setCountry(userInfo.getCountry());
        dBUserInfo.setStatus(userInfo.getStatus());
        String birthday = userInfo.getBirthday();
        if (birthday == null) {
            birthday = "";
        }
        dBUserInfo.setBirthday(birthday);
        String sex = userInfo.getSex();
        dBUserInfo.setSex(sex != null ? sex : "");
        dBUserInfo.setUploadAvatar(userInfo.isUploadAvatar());
        dBUserInfo.setAvatar(userInfo.getAvatar());
        dBUserInfo.setHeight(userInfo.getHeight());
        dBUserInfo.setWeight(userInfo.getWeight());
        dBUserInfo.setCreateTime(userInfo.getCreateTime());
        dBUserInfo.setModifiedTime(userInfo.getModifiedTime());
        dBUserInfo.setGuideStatus(userInfo.getGuideStatus());
        dBUserInfo.setAge(userInfo.getAge());
        dBUserInfo.setBloodPressureType(userInfo.getBloodPressureType());
        return dBUserInfo;
    }

    @Nullable
    public final DBUserPreference d(@Nullable UserPreference userPreference) {
        if (userPreference == null) {
            return null;
        }
        DBUserPreference dBUserPreference = new DBUserPreference();
        dBUserPreference.setSsoid(userPreference.getSsoid());
        dBUserPreference.setKey(userPreference.getKey());
        dBUserPreference.setValue(userPreference.getValue());
        dBUserPreference.setModule(userPreference.getModule());
        dBUserPreference.setSyncStatus(userPreference.getSyncStatus());
        dBUserPreference.setModifiedTime(userPreference.getModifiedTime());
        return dBUserPreference;
    }

    @Nullable
    public final List<DBUserGoalInfo> e(@Nullable List<? extends UserGoalInfo> list) {
        List<? extends UserGoalInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UserGoalInfo userGoalInfo : list) {
            DBUserGoalInfo dBUserGoalInfo = new DBUserGoalInfo();
            dBUserGoalInfo.setSsoid(userGoalInfo.getSsoid());
            dBUserGoalInfo.setType(userGoalInfo.getType());
            dBUserGoalInfo.setValue(userGoalInfo.getValue());
            dBUserGoalInfo.setDeadLine(userGoalInfo.getDeadLine());
            dBUserGoalInfo.setSyncStatus(userGoalInfo.getSyncStatus());
            dBUserGoalInfo.setModifiedTime(userGoalInfo.getModifiedTime());
            arrayList.add(dBUserGoalInfo);
        }
        return arrayList;
    }

    @Nullable
    public final List<DBSpaceInfo> f(@Nullable List<? extends SpaceInfo> list) {
        List<? extends SpaceInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SpaceInfo spaceInfo : list) {
            DBSpaceInfo dBSpaceInfo = new DBSpaceInfo();
            dBSpaceInfo.setStrategyCode(spaceInfo.getStrategyCode());
            dBSpaceInfo.setContainerType(spaceInfo.getContainerType());
            dBSpaceInfo.setContainerCode(spaceInfo.getContainerCode());
            dBSpaceInfo.setPageCode(spaceInfo.getPageCode());
            dBSpaceInfo.setCardCode(spaceInfo.getCardCode());
            dBSpaceInfo.setContainerTitle(spaceInfo.getContainerTitle());
            dBSpaceInfo.setMoreTitle(spaceInfo.getMoreTitle());
            dBSpaceInfo.setMoreJumplUrl(spaceInfo.getMoreJumpUrl());
            dBSpaceInfo.setDisplayStatTime(spaceInfo.getDisplayStatTime());
            dBSpaceInfo.setDisplayEndTime(spaceInfo.getDisplayEndTime());
            dBSpaceInfo.setPriority(spaceInfo.getPriority());
            dBSpaceInfo.setMaterielList(sc8.g(spaceInfo.getMaterielList()));
            arrayList.add(dBSpaceInfo);
        }
        return arrayList;
    }

    public final String g(DBUserGoalInfo dbUserGoalInfo) {
        boolean z = true;
        switch (dbUserGoalInfo.getType()) {
            case 0:
                String value = dbUserGoalInfo.getValue();
                if (value != null && value.length() != 0) {
                    z = false;
                }
                if (z || !tvi.v(dbUserGoalInfo.getValue())) {
                    return "8000";
                }
                break;
            case 1:
                String value2 = dbUserGoalInfo.getValue();
                if (value2 != null && value2.length() != 0) {
                    z = false;
                }
                if (z || !tvi.v(dbUserGoalInfo.getValue())) {
                    return "60000";
                }
                break;
            case 2:
            case 4:
                String value3 = dbUserGoalInfo.getValue();
                if (value3 != null && value3.length() != 0) {
                    z = false;
                }
                if (z) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT_RUN;
                }
                String value4 = dbUserGoalInfo.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "dbUserGoalInfo.value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value4, (CharSequence) "%", false, 2, (Object) null)) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT_RUN;
                }
                break;
            case 3:
                String value5 = dbUserGoalInfo.getValue();
                if (value5 != null && value5.length() != 0) {
                    z = false;
                }
                if (z) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT;
                }
                String value6 = dbUserGoalInfo.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "dbUserGoalInfo.value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value6, (CharSequence) "%", false, 2, (Object) null)) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT;
                }
                break;
            case 5:
                String value7 = dbUserGoalInfo.getValue();
                if (value7 != null && value7.length() != 0) {
                    z = false;
                }
                if (z || !tvi.v(dbUserGoalInfo.getValue())) {
                    return UserGoalInfo.CONSUMPTION_GOAL_DEFAULT;
                }
                break;
            case 9:
                String value8 = dbUserGoalInfo.getValue();
                if (value8 != null && value8.length() != 0) {
                    z = false;
                }
                if (z || !tvi.v(dbUserGoalInfo.getValue())) {
                    return UserGoalInfo.WORKOUT_GOAL_DEFAULT;
                }
                break;
            case 10:
                String value9 = dbUserGoalInfo.getValue();
                if (value9 != null && value9.length() != 0) {
                    z = false;
                }
                if (z || !tvi.v(dbUserGoalInfo.getValue())) {
                    return "12";
                }
                break;
            case 11:
                String value10 = dbUserGoalInfo.getValue();
                if (value10 != null && value10.length() != 0) {
                    z = false;
                }
                if (z) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT_RIDE;
                }
                String value11 = dbUserGoalInfo.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "dbUserGoalInfo.value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value11, (CharSequence) "%", false, 2, (Object) null)) {
                    return UserGoalInfo.TRACK_SPORT_GOAL_DEFAULT_RIDE;
                }
                break;
        }
        return dbUserGoalInfo.getValue();
    }

    @Nullable
    public final UserGoalInfo h(@Nullable DBUserGoalInfo dbUserGoalInfo) {
        if (dbUserGoalInfo == null) {
            return null;
        }
        UserGoalInfo userGoalInfo = new UserGoalInfo();
        userGoalInfo.setSsoid(dbUserGoalInfo.getSsoid());
        userGoalInfo.setType(dbUserGoalInfo.getType());
        userGoalInfo.setValue(g(dbUserGoalInfo));
        userGoalInfo.setDeadLine(dbUserGoalInfo.getDeadLine());
        userGoalInfo.setSyncStatus(dbUserGoalInfo.getSyncStatus());
        userGoalInfo.setModifiedTime(dbUserGoalInfo.getModifiedTime());
        return userGoalInfo;
    }

    @Nullable
    public final UserInfo i(@Nullable DBUserInfo dbData) {
        if (dbData == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setSsoid(dbData.getSsoid());
        userInfo.setUserId(dbData.getUserId());
        userInfo.setUserName(dbData.getUserName());
        userInfo.setAccountName(dbData.getAccountName());
        userInfo.setUserNameNeedModify(dbData.isUserNameNeedModify());
        userInfo.setCountry(dbData.getCountry());
        userInfo.setStatus(dbData.getStatus());
        userInfo.setBirthday(dbData.getBirthday());
        userInfo.setSex(dbData.getSex());
        userInfo.setUploadAvatar(dbData.isUploadAvatar());
        userInfo.setAvatar(dbData.getAvatar());
        userInfo.setHeight(dbData.getHeight());
        userInfo.setWeight(dbData.getWeight());
        userInfo.setCreateTime(dbData.getCreateTime());
        userInfo.setModifiedTime(dbData.getModifiedTime());
        userInfo.setGuideStatus(dbData.getGuideStatus());
        userInfo.setAge(dbData.getAge());
        userInfo.setBloodPressureType(dbData.getBloodPressureType());
        return userInfo;
    }

    @Nullable
    public final UserPreference j(@Nullable DBUserPreference dbUserPreference) {
        if (dbUserPreference == null) {
            return null;
        }
        UserPreference userPreference = new UserPreference();
        userPreference.setSsoid(dbUserPreference.getSsoid());
        userPreference.setKey(dbUserPreference.getKey());
        userPreference.setValue(dbUserPreference.getValue());
        userPreference.setModule(dbUserPreference.getModule());
        userPreference.setSyncStatus(dbUserPreference.getSyncStatus());
        userPreference.setModifiedTime(dbUserPreference.getModifiedTime());
        return userPreference;
    }

    @JvmName(name = "parseOneTimeSportDataFromDBTrack")
    @Nullable
    public final List<OneTimeSport> k(@Nullable List<? extends DBTrackTemp> list) {
        List<? extends DBTrackTemp> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DBTrackTemp dBTrackTemp : list) {
            OneTimeSport oneTimeSport = new OneTimeSport();
            oneTimeSport.setSsoid(dBTrackTemp.getSsoid());
            oneTimeSport.setClientDataId(dBTrackTemp.getClientDataId());
            oneTimeSport.setDeviceUniqueId(dBTrackTemp.getDeviceUniqueId());
            oneTimeSport.setDeviceType(dBTrackTemp.getDeviceType());
            oneTimeSport.setStartTimestamp(dBTrackTemp.getStartTimestamp());
            oneTimeSport.setEndTimestamp(dBTrackTemp.getEndTimestamp());
            oneTimeSport.setSportMode(dBTrackTemp.getSportMode());
            oneTimeSport.setData(dBTrackTemp.getData());
            oneTimeSport.setVersion(dBTrackTemp.getVersion());
            oneTimeSport.setMetaData(dBTrackTemp.getMetaData());
            oneTimeSport.setSyncStatus(dBTrackTemp.getSyncStatus());
            oneTimeSport.setTimezone(dBTrackTemp.getTimezone());
            oneTimeSport.setDisplay(dBTrackTemp.getDisplay());
            arrayList.add(oneTimeSport);
        }
        return arrayList;
    }

    @JvmName(name = "parseUserPreferenceDataFromDB")
    @Nullable
    public final List<UserPreference> l(@Nullable List<? extends DBUserPreference> list) {
        List<? extends DBUserPreference> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DBUserPreference dBUserPreference : list) {
            UserPreference userPreference = new UserPreference();
            userPreference.setSsoid(dBUserPreference.getSsoid());
            userPreference.setKey(dBUserPreference.getKey());
            userPreference.setValue(dBUserPreference.getValue());
            userPreference.setModule(dBUserPreference.getModule());
            userPreference.setSyncStatus(dBUserPreference.getSyncStatus());
            userPreference.setModifiedTime(dBUserPreference.getModifiedTime());
            arrayList.add(userPreference);
        }
        return arrayList;
    }
}
