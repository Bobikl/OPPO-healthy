package com.oplus.pantanal.seedling.convertor;

import com.oplus.pantanal.seedling.bean.CancelPanelActionConfigEnum;
import com.oplus.pantanal.seedling.bean.PanelActionEnum;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.intelligent.IntelligentManager;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\b\u0018\u00010\u0006\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0006H\u0082\bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016JC\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0006\"\u0004\b\u0000\u0010\b\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\n\u0018\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\b\u0018\u00010\u0006H\u0082\bJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/JsonToSeedlingCardOptionsConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "Lorg/json/JSONObject;", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "()V", "enumToStringMap", "", "", "T", "K", "V", "enumMap", "from", "data", "stringToEnumMap", "stringMap", "to", "upkJsToOptions", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonToSeedlingCardOptionsConvertor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonToSeedlingCardOptionsConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToSeedlingCardOptionsConvertor\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n315#1,5:337\n320#1,14:343\n334#1:358\n315#1,5:359\n320#1,14:365\n334#1:380\n315#1,5:381\n320#1,14:387\n334#1:402\n298#1,5:403\n303#1,8:409\n311#1:418\n298#1,5:419\n303#1,8:425\n311#1:434\n298#1,5:435\n303#1,8:441\n311#1:450\n215#2:342\n216#2:357\n215#2:364\n216#2:379\n215#2:386\n216#2:401\n215#2:408\n216#2:417\n215#2:424\n216#2:433\n215#2:440\n216#2:449\n215#2,2:453\n215#2,2:455\n1855#3,2:451\n*S KotlinDebug\n*F\n+ 1 JsonToSeedlingCardOptionsConvertor.kt\ncom/oplus/pantanal/seedling/convertor/JsonToSeedlingCardOptionsConvertor\n*L\n69#1:337,5\n69#1:343,14\n69#1:358\n74#1:359,5\n74#1:365,14\n74#1:380\n83#1:381,5\n83#1:387,14\n83#1:402\n117#1:403,5\n117#1:409,8\n117#1:418\n120#1:419,5\n120#1:425,8\n120#1:434\n126#1:435,5\n126#1:441,8\n126#1:450\n69#1:342\n69#1:357\n74#1:364\n74#1:379\n83#1:386\n83#1:401\n117#1:408\n117#1:417\n120#1:424\n120#1:433\n126#1:440\n126#1:449\n302#1:453,2\n319#1:455,2\n137#1:451,2\n*E\n"})
public final class JsonToSeedlingCardOptionsConvertor implements IConvertor<JSONObject, SeedlingCardOptions> {

    @NotNull
    public static final String KEY_CANCEL_PANEL_ACTION_CONFIG = "cancelPanelActionConfig";

    @NotNull
    public static final String KEY_CONTROL_ACTION = "controlAction";

    @NotNull
    public static final String KEY_DATA_SOURCE_PKG_NAME = "dataSourcePkgName";

    @NotNull
    public static final String KEY_EXTENSIBLE_ACTION = "extensibleAction";

    @NotNull
    public static final String KEY_EXTENSIBLE_ACTION_IN_UPK = "extensibleActionMap";

    @NotNull
    public static final String KEY_FOCUS_TIMESTAMP = "focus_timestamp";

    @NotNull
    public static final String KEY_FOCUS_TIMESTAMP_IN_UPK = "focusTimestamp";

    @NotNull
    public static final String KEY_GRADE = "importance";

    @NotNull
    public static final String KEY_GRADE_IN_UPK = "grade";

    @NotNull
    public static final String KEY_IS_MILESTONE = "isMilestone";

    @NotNull
    public static final String KEY_LOCK_SCREEN_SHOW_HOST_MAP = "lockScreenShowHostMap";

    @NotNull
    public static final String KEY_NOTIFICATION_ID_LIST = "notificationIdList";

    @NotNull
    public static final String KEY_PAGE_ID = "pageId";

    @NotNull
    public static final String KEY_PANEL_ACTION_CONFIG_MAP = "panelActionConfigMap";

    @NotNull
    public static final String KEY_REMIND_TYPE_IN_UPK = "remindType";

    @NotNull
    public static final String KEY_REQUEST_HIDE_STATUS_BAR = "requestHideStatusBar";

    @NotNull
    public static final String KEY_REQUEST_SHOW_PANEL = "requestShowPanel";

    @NotNull
    public static final String KEY_SHOULD_FOCUS = "should_focus";

    @NotNull
    public static final String KEY_SHOULD_FOCUS_IN_UPK = "shouldFocus";

    @NotNull
    public static final String KEY_SHOW_HOST_MAP = "showHostMap";

    @NotNull
    public static final String TAG = "JsonToSeedlingCardOptionsConvertor";

    private final /* synthetic */ <T, K, V> Map<String, T> enumToStringMap(Map<K, ? extends V> enumMap) {
        String strValueOf;
        if (enumMap == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<K, ? extends V> entry : enumMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if ((key instanceof PanelActionEnum) && (value instanceof CancelPanelActionConfigEnum)) {
                CancelPanelActionConfigEnum cancelPanelActionConfigEnum = (CancelPanelActionConfigEnum) value;
                cancelPanelActionConfigEnum.getAction();
                Intrinsics.reifiedOperationMarker(3, "T");
                strValueOf = String.valueOf(((PanelActionEnum) key).getAction());
                value = (V) Integer.valueOf(cancelPanelActionConfigEnum.getAction());
            } else if (key instanceof SeedlingHostEnum) {
                Intrinsics.reifiedOperationMarker(3, "T");
                if (value instanceof Object) {
                    strValueOf = String.valueOf(((SeedlingHostEnum) key).getHostId());
                }
            }
            map.put(strValueOf, value);
        }
        return map;
    }

    private final /* synthetic */ <T, K, V> Map<K, V> stringToEnumMap(Map<String, ? extends T> stringMap) {
        Enum enumCreate;
        if (stringMap == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, ? extends T> entry : stringMap.entrySet()) {
            T value = entry.getValue();
            if (value instanceof Integer) {
                enumCreate = PanelActionEnum.INSTANCE.create(Integer.parseInt(entry.getKey()));
                value = (T) CancelPanelActionConfigEnum.INSTANCE.create(((Number) value).intValue());
                Intrinsics.reifiedOperationMarker(3, "K");
                if (enumCreate instanceof Object) {
                    Intrinsics.reifiedOperationMarker(3, "V");
                    if (value instanceof Object) {
                        map.put(enumCreate, value);
                    }
                }
            } else if (value instanceof Boolean) {
                enumCreate = SeedlingHostEnum.INSTANCE.create(Integer.parseInt(entry.getKey()));
                Intrinsics.reifiedOperationMarker(3, "K");
                if (enumCreate instanceof Object) {
                    Intrinsics.reifiedOperationMarker(3, "V");
                    if (value instanceof Object) {
                        map.put(enumCreate, value);
                    }
                }
            }
        }
        return map;
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public SeedlingCardOptions to(@NotNull JSONObject data) {
        Enum enumCreate;
        Enum enumCreate2;
        Enum enumCreate3;
        Intrinsics.checkNotNullParameter(data, "data");
        SeedlingCardOptions seedlingCardOptions = new SeedlingCardOptions(null, null, false, null, false, null, null, null, null, null, null, null, 0, false, null, null, 65535, null);
        seedlingCardOptions.setPageId(data.optString(KEY_PAGE_ID));
        seedlingCardOptions.setMilestone(data.optBoolean(KEY_IS_MILESTONE));
        seedlingCardOptions.setRequestShowPanel(Boolean.valueOf(data.optBoolean(KEY_REQUEST_SHOW_PANEL)));
        seedlingCardOptions.setRequestHideStatusBar(data.optBoolean(KEY_REQUEST_HIDE_STATUS_BAR));
        seedlingCardOptions.setGrade(Integer.valueOf(data.optInt(KEY_GRADE)));
        seedlingCardOptions.setDataSourcePkgName(data.optString(KEY_DATA_SOURCE_PKG_NAME));
        Object objOpt = data.opt(KEY_NOTIFICATION_ID_LIST);
        seedlingCardOptions.setNotificationIdList(objOpt instanceof List ? (List) objOpt : null);
        Object objOpt2 = data.opt(KEY_SHOW_HOST_MAP);
        Map map = objOpt2 instanceof Map ? (Map) objOpt2 : null;
        if (map != null) {
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    enumCreate3 = PanelActionEnum.INSTANCE.create(Integer.parseInt((String) entry.getKey()));
                    value = CancelPanelActionConfigEnum.INSTANCE.create(((Number) value).intValue());
                    if ((enumCreate3 instanceof SeedlingHostEnum) && (value instanceof Boolean)) {
                        map2.put(enumCreate3, value);
                    }
                } else {
                    boolean z = value instanceof Boolean;
                    if (z) {
                        enumCreate3 = SeedlingHostEnum.INSTANCE.create(Integer.parseInt((String) entry.getKey()));
                        if ((enumCreate3 instanceof SeedlingHostEnum) && z) {
                            map2.put(enumCreate3, value);
                        }
                    }
                }
            }
            seedlingCardOptions.setShowHostMap(map2);
        }
        Object objOpt3 = data.opt(KEY_LOCK_SCREEN_SHOW_HOST_MAP);
        Map map3 = objOpt3 instanceof Map ? (Map) objOpt3 : null;
        if (map3 != null) {
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                Object value2 = entry2.getValue();
                if (value2 instanceof Integer) {
                    enumCreate2 = PanelActionEnum.INSTANCE.create(Integer.parseInt((String) entry2.getKey()));
                    value2 = CancelPanelActionConfigEnum.INSTANCE.create(((Number) value2).intValue());
                    if ((enumCreate2 instanceof SeedlingHostEnum) && (value2 instanceof Boolean)) {
                        map4.put(enumCreate2, value2);
                    }
                } else {
                    boolean z2 = value2 instanceof Boolean;
                    if (z2) {
                        enumCreate2 = SeedlingHostEnum.INSTANCE.create(Integer.parseInt((String) entry2.getKey()));
                        if ((enumCreate2 instanceof SeedlingHostEnum) && z2) {
                            map4.put(enumCreate2, value2);
                        }
                    }
                }
            }
            seedlingCardOptions.setLockScreenShowHostMap(map4);
        }
        Object objOpt4 = data.opt(KEY_CANCEL_PANEL_ACTION_CONFIG);
        String str = objOpt4 instanceof String ? (String) objOpt4 : null;
        if (str != null) {
            seedlingCardOptions.setCancelPanelActionConfig(CancelPanelActionConfigEnum.INSTANCE.create(Integer.parseInt(str)));
        }
        Object objOpt5 = data.opt(KEY_PANEL_ACTION_CONFIG_MAP);
        Map map5 = objOpt5 instanceof Map ? (Map) objOpt5 : null;
        if (map5 != null) {
            HashMap map6 = new HashMap();
            for (Map.Entry entry3 : map5.entrySet()) {
                Object value3 = entry3.getValue();
                if (value3 instanceof Integer) {
                    enumCreate = PanelActionEnum.INSTANCE.create(Integer.parseInt((String) entry3.getKey()));
                    value3 = CancelPanelActionConfigEnum.INSTANCE.create(((Number) value3).intValue());
                    if ((enumCreate instanceof PanelActionEnum) && (value3 instanceof CancelPanelActionConfigEnum)) {
                        map6.put(enumCreate, value3);
                    }
                } else if (value3 instanceof Boolean) {
                    enumCreate = SeedlingHostEnum.INSTANCE.create(Integer.parseInt((String) entry3.getKey()));
                    if ((enumCreate instanceof PanelActionEnum) && (value3 instanceof CancelPanelActionConfigEnum)) {
                        map6.put(enumCreate, value3);
                    }
                }
            }
            seedlingCardOptions.setPanelActionConfigMap(map6);
        }
        if (data.has(KEY_CONTROL_ACTION)) {
            seedlingCardOptions.setControlAction(Integer.valueOf(data.optInt(KEY_CONTROL_ACTION)));
        }
        seedlingCardOptions.setRemindType(data.optInt(IntelligentManager.KEY_REMIND_TYPE, 0));
        seedlingCardOptions.setShouldFocus(data.optBoolean(KEY_SHOULD_FOCUS, false));
        seedlingCardOptions.setFocusTimestamp(Long.valueOf(data.optLong(KEY_FOCUS_TIMESTAMP, System.currentTimeMillis())));
        Object objOpt6 = data.opt(KEY_EXTENSIBLE_ACTION);
        seedlingCardOptions.setExtensibleActionMap(objOpt6 instanceof Map ? (Map) objOpt6 : null);
        return seedlingCardOptions;
    }

    @NotNull
    public final SeedlingCardOptions upkJsToOptions(@NotNull JSONObject data) {
        SeedlingCardOptions seedlingCardOptions;
        Intrinsics.checkNotNullParameter(data, "data");
        SeedlingCardOptions seedlingCardOptions2 = new SeedlingCardOptions(null, null, false, null, false, null, null, null, null, null, null, null, 0, false, null, null, 65535, null);
        if (data.has(KEY_PAGE_ID)) {
            seedlingCardOptions = seedlingCardOptions2;
            seedlingCardOptions.setPageId(data.optString(KEY_PAGE_ID));
        } else {
            seedlingCardOptions = seedlingCardOptions2;
        }
        if (data.has(KEY_DATA_SOURCE_PKG_NAME)) {
            seedlingCardOptions.setDataSourcePkgName(data.optString(KEY_DATA_SOURCE_PKG_NAME));
        }
        if (data.has(KEY_IS_MILESTONE)) {
            seedlingCardOptions.setMilestone(data.optBoolean(KEY_IS_MILESTONE));
        }
        if (data.has(KEY_REQUEST_SHOW_PANEL)) {
            seedlingCardOptions.setRequestShowPanel(Boolean.valueOf(data.optBoolean(KEY_REQUEST_SHOW_PANEL)));
        }
        if (data.has(KEY_REQUEST_HIDE_STATUS_BAR)) {
            seedlingCardOptions.setRequestHideStatusBar(data.optBoolean(KEY_REQUEST_HIDE_STATUS_BAR));
        }
        if (data.has(KEY_GRADE_IN_UPK)) {
            seedlingCardOptions.setGrade(Integer.valueOf(data.optInt(KEY_GRADE_IN_UPK)));
        }
        if (data.has(KEY_NOTIFICATION_ID_LIST)) {
            try {
                Object objOpt = data.opt(KEY_NOTIFICATION_ID_LIST);
                Intrinsics.checkNotNull(objOpt, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) objOpt;
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    arrayList.add((Integer) obj);
                }
                seedlingCardOptions.setNotificationIdList(arrayList);
            } catch (Exception e) {
                Logger.INSTANCE.e(TAG, "upkJsToOptions KEY_NOTIFICATION_ID_LIST " + e.getMessage());
            }
        }
        if (data.has(KEY_SHOW_HOST_MAP)) {
            try {
                Object objOpt2 = data.opt(KEY_SHOW_HOST_MAP);
                Intrinsics.checkNotNull(objOpt2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) objOpt2;
                Iterator<String> itKeys = jSONObject.keys();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt3 = jSONObject.opt(next);
                    Intrinsics.checkNotNull(objOpt3, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) objOpt3).booleanValue();
                    Intrinsics.checkNotNull(next);
                    linkedHashMap.put(SeedlingHostEnum.INSTANCE.create(Integer.parseInt(next)), Boolean.valueOf(zBooleanValue));
                }
                seedlingCardOptions.setShowHostMap(linkedHashMap);
            } catch (Exception e2) {
                Logger.INSTANCE.e(TAG, "upkJsToOptions KEY_SHOW_HOST_MAP " + e2.getMessage());
            }
        }
        if (data.has(KEY_LOCK_SCREEN_SHOW_HOST_MAP)) {
            try {
                Object objOpt4 = data.opt(KEY_LOCK_SCREEN_SHOW_HOST_MAP);
                Intrinsics.checkNotNull(objOpt4, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) objOpt4;
                Iterator<String> itKeys2 = jSONObject2.keys();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    Object objOpt5 = jSONObject2.opt(next2);
                    Intrinsics.checkNotNull(objOpt5, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) objOpt5).booleanValue();
                    Intrinsics.checkNotNull(next2);
                    linkedHashMap2.put(SeedlingHostEnum.INSTANCE.create(Integer.parseInt(next2)), Boolean.valueOf(zBooleanValue2));
                }
                seedlingCardOptions.setLockScreenShowHostMap(linkedHashMap2);
            } catch (Exception e3) {
                Logger.INSTANCE.e(TAG, "upkJsToOptions KEY_LOCK_SCREEN_SHOW_HOST_MAP " + e3.getMessage());
            }
        }
        if (data.has(KEY_PANEL_ACTION_CONFIG_MAP)) {
            try {
                Object objOpt6 = data.opt(KEY_PANEL_ACTION_CONFIG_MAP);
                Intrinsics.checkNotNull(objOpt6, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject3 = (JSONObject) objOpt6;
                Iterator<String> itKeys3 = jSONObject3.keys();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    Object objOpt7 = jSONObject3.opt(next3);
                    Intrinsics.checkNotNull(objOpt7, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) objOpt7).intValue();
                    Intrinsics.checkNotNull(next3);
                    linkedHashMap3.put(PanelActionEnum.INSTANCE.create(Integer.parseInt(next3)), CancelPanelActionConfigEnum.INSTANCE.create(iIntValue));
                }
                seedlingCardOptions.setPanelActionConfigMap(linkedHashMap3);
            } catch (Exception e4) {
                Logger.INSTANCE.e(TAG, "upkJsToOptions KEY_PANEL_ACTION_CONFIG_MAP " + e4.getMessage());
            }
        }
        if (data.has(KEY_CONTROL_ACTION)) {
            seedlingCardOptions.setControlAction(Integer.valueOf(data.optInt(KEY_CONTROL_ACTION)));
        }
        if (data.has(KEY_REMIND_TYPE_IN_UPK)) {
            seedlingCardOptions.setRemindType(data.optInt(KEY_REMIND_TYPE_IN_UPK, 0));
        }
        if (data.has(KEY_SHOULD_FOCUS_IN_UPK)) {
            seedlingCardOptions.setShouldFocus(data.optBoolean(KEY_SHOULD_FOCUS_IN_UPK, false));
        }
        if (data.has(KEY_FOCUS_TIMESTAMP_IN_UPK)) {
            seedlingCardOptions.setFocusTimestamp(Long.valueOf(data.optLong(KEY_FOCUS_TIMESTAMP_IN_UPK, System.currentTimeMillis())));
        }
        if (data.has(KEY_EXTENSIBLE_ACTION_IN_UPK)) {
            try {
                Object objOpt8 = data.opt(KEY_EXTENSIBLE_ACTION_IN_UPK);
                Intrinsics.checkNotNull(objOpt8, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject4 = (JSONObject) objOpt8;
                Iterator<String> itKeys4 = jSONObject4.keys();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                while (itKeys4.hasNext()) {
                    String next4 = itKeys4.next();
                    Object objOpt9 = jSONObject4.opt(next4);
                    Intrinsics.checkNotNull(next4);
                    Intrinsics.checkNotNull(objOpt9, "null cannot be cast to non-null type kotlin.Any");
                    linkedHashMap4.put(next4, objOpt9);
                }
                seedlingCardOptions.setExtensibleActionMap(linkedHashMap4);
            } catch (Exception e5) {
                Logger.INSTANCE.e(TAG, "upkJsToOptions KEY_EXTENSIBLE_ACTION_IN_UPK " + e5.getMessage());
            }
        }
        return seedlingCardOptions;
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public JSONObject from(@NotNull SeedlingCardOptions data) throws JSONException {
        HashMap map;
        HashMap map2;
        String strValueOf;
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        String pageId = data.getPageId();
        if (pageId != null) {
            jSONObject.put(KEY_PAGE_ID, pageId);
        }
        jSONObject.put(KEY_IS_MILESTONE, data.isMilestone());
        Boolean requestShowPanel = data.getRequestShowPanel();
        if (requestShowPanel != null) {
            jSONObject.put(KEY_REQUEST_SHOW_PANEL, requestShowPanel.booleanValue());
        }
        jSONObject.put(KEY_REQUEST_HIDE_STATUS_BAR, data.getRequestHideStatusBar());
        Integer grade = data.getGrade();
        if (grade != null) {
            jSONObject.put(KEY_GRADE, grade.intValue());
        }
        String dataSourcePkgName = data.getDataSourcePkgName();
        if (dataSourcePkgName != null) {
            jSONObject.put(KEY_DATA_SOURCE_PKG_NAME, dataSourcePkgName);
        }
        List<Integer> notificationIdList = data.getNotificationIdList();
        if (notificationIdList != null) {
            jSONObject.put(KEY_NOTIFICATION_ID_LIST, notificationIdList);
        }
        Map<SeedlingHostEnum, Boolean> showHostMap = data.getShowHostMap();
        HashMap map3 = null;
        if (showHostMap == null) {
            map = null;
        } else {
            map = new HashMap();
            for (Map.Entry<SeedlingHostEnum, Boolean> entry : showHostMap.entrySet()) {
                Enum key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof PanelActionEnum) && (value instanceof CancelPanelActionConfigEnum)) {
                    CancelPanelActionConfigEnum cancelPanelActionConfigEnum = (CancelPanelActionConfigEnum) value;
                    if (Integer.valueOf(cancelPanelActionConfigEnum.getAction()) instanceof Boolean) {
                        map.put(String.valueOf(((PanelActionEnum) key).getAction()), Integer.valueOf(cancelPanelActionConfigEnum.getAction()));
                    }
                }
                if ((key instanceof SeedlingHostEnum) && (value instanceof Boolean)) {
                    map.put(String.valueOf(((SeedlingHostEnum) key).getHostId()), value);
                }
            }
        }
        if (map != null) {
            jSONObject.put(KEY_SHOW_HOST_MAP, new JSONObject(map));
        }
        Map<SeedlingHostEnum, Boolean> lockScreenShowHostMap = data.getLockScreenShowHostMap();
        if (lockScreenShowHostMap == null) {
            map2 = null;
        } else {
            map2 = new HashMap();
            for (Map.Entry<SeedlingHostEnum, Boolean> entry2 : lockScreenShowHostMap.entrySet()) {
                Enum key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if ((key2 instanceof PanelActionEnum) && (value2 instanceof CancelPanelActionConfigEnum)) {
                    CancelPanelActionConfigEnum cancelPanelActionConfigEnum2 = (CancelPanelActionConfigEnum) value2;
                    if (Integer.valueOf(cancelPanelActionConfigEnum2.getAction()) instanceof Boolean) {
                        map2.put(String.valueOf(((PanelActionEnum) key2).getAction()), Integer.valueOf(cancelPanelActionConfigEnum2.getAction()));
                    }
                }
                if ((key2 instanceof SeedlingHostEnum) && (value2 instanceof Boolean)) {
                    map2.put(String.valueOf(((SeedlingHostEnum) key2).getHostId()), value2);
                }
            }
        }
        if (map2 != null) {
            jSONObject.put(KEY_LOCK_SCREEN_SHOW_HOST_MAP, new JSONObject(map2));
        }
        CancelPanelActionConfigEnum cancelPanelActionConfig = data.getCancelPanelActionConfig();
        if (cancelPanelActionConfig != null) {
            jSONObject.put(KEY_CANCEL_PANEL_ACTION_CONFIG, cancelPanelActionConfig.getAction());
        }
        Map<PanelActionEnum, CancelPanelActionConfigEnum> panelActionConfigMap = data.getPanelActionConfigMap();
        if (panelActionConfigMap != null) {
            map3 = new HashMap();
            for (Map.Entry<PanelActionEnum, CancelPanelActionConfigEnum> entry3 : panelActionConfigMap.entrySet()) {
                Enum key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if ((key3 instanceof PanelActionEnum) && (value3 instanceof CancelPanelActionConfigEnum)) {
                    CancelPanelActionConfigEnum cancelPanelActionConfigEnum3 = (CancelPanelActionConfigEnum) value3;
                    cancelPanelActionConfigEnum3.getAction();
                    strValueOf = String.valueOf(((PanelActionEnum) key3).getAction());
                    value3 = Integer.valueOf(cancelPanelActionConfigEnum3.getAction());
                } else if ((key3 instanceof SeedlingHostEnum) && (value3 instanceof Integer)) {
                    strValueOf = String.valueOf(((SeedlingHostEnum) key3).getHostId());
                }
                map3.put(strValueOf, value3);
            }
        }
        if (map3 != null) {
            jSONObject.put(KEY_PANEL_ACTION_CONFIG_MAP, new JSONObject(map3));
        }
        Integer controlAction = data.getControlAction();
        if (controlAction != null) {
            jSONObject.put(KEY_CONTROL_ACTION, controlAction.intValue());
        }
        jSONObject.put(IntelligentManager.KEY_REMIND_TYPE, data.getRemindType());
        jSONObject.put(KEY_SHOULD_FOCUS, data.getShouldFocus());
        Long focusTimestamp = data.getFocusTimestamp();
        jSONObject.put(KEY_FOCUS_TIMESTAMP, focusTimestamp != null ? focusTimestamp.longValue() : System.currentTimeMillis());
        Map<String, Object> extensibleActionMap = data.getExtensibleActionMap();
        if (extensibleActionMap != null) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<T> it = extensibleActionMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it.next();
                jSONObject2.put((String) entry4.getKey(), entry4.getValue());
            }
            jSONObject.put(KEY_EXTENSIBLE_ACTION, jSONObject2);
        }
        return jSONObject;
    }
}
