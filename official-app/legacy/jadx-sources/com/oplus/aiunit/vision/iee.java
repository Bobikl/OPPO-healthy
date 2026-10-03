package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Build;
import com.heytap.health.base.R$string;
import com.oplus.weatherservicesdk.data.Weather;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/iee;", "", "Companion", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class iee {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String a = Weather.SEPARATOR;

    @SuppressLint({"InlinedApi", "ObsoleteSdkInt"})
    @NotNull
    public static final Map<String, List<Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi", "ObsoleteSdkInt"})
    @NotNull
    public static final Map<String, Integer> f12497c;

    @SuppressLint({"InlinedApi"})
    @NotNull
    public static final Map<String, Integer> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, Integer> f12498e;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.iee$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010$\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/iee$a;", "", "", "featureId", "", "perm", "d", b2n.f, "i", "", "permList", "j", "f", MapSchema.FIELD_NAME_ENTRY, "c", "stringId", b2n.g, "stringIdList", "a", "CONCAT_END", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "featureTitleMap", "Ljava/util/Map;", "permFeatureMap", "permWithFeatureStringMap", "titleMap", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPermWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermWord.kt\ncom/heytap/health/base/permission/wxbpermission/PermWord$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n1855#2,2:445\n766#2:447\n857#2,2:448\n1855#2:450\n1855#2,2:451\n1856#2:453\n766#2:454\n857#2,2:455\n1855#2,2:458\n1#3:457\n*S KotlinDebug\n*F\n+ 1 PermWord.kt\ncom/heytap/health/base/permission/wxbpermission/PermWord$Companion\n*L\n60#1:445,2\n63#1:447\n63#1:448,2\n69#1:450\n70#1:451,2\n69#1:453\n74#1:454\n74#1:455,2\n119#1:458,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(List<Integer> stringIdList) {
            List<Integer> list = stringIdList;
            if (list == null || list.isEmpty()) {
                return "";
            }
            Set set = CollectionsKt___CollectionsKt.toSet(stringIdList);
            if (set.size() == 1) {
                return h(stringIdList.get(0).intValue());
            }
            Iterator it = set.iterator();
            String str = "-";
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Companion companion = iee.INSTANCE;
                str = ((Object) str) + companion.h(iIntValue) + companion.b() + "-";
            }
            return StringsKt___StringsKt.last(str) == '-' ? StringsKt___StringsKt.dropLast(str, 1) : str;
        }

        @NotNull
        public final String b() {
            return iee.a;
        }

        @JvmStatic
        @NotNull
        public final String c(int featureId) {
            Integer num = (Integer) iee.f12498e.get(Integer.valueOf(featureId));
            if (num != null) {
                String strH = iee.INSTANCE.h(num.intValue());
                if (strH != null) {
                    return strH;
                }
            }
            return "";
        }

        @JvmStatic
        @NotNull
        public final String d(int featureId, @NotNull String perm) {
            Intrinsics.checkNotNullParameter(perm, "perm");
            Integer num = (Integer) iee.f12497c.get(perm + featureId);
            return num == null ? "" : h(num.intValue());
        }

        @NotNull
        public final String e(@NotNull String perm) {
            Intrinsics.checkNotNullParameter(perm, "perm");
            return f(CollectionsKt__CollectionsJVMKt.listOf(perm));
        }

        @NotNull
        public final String f(@NotNull List<String> permList) {
            Intrinsics.checkNotNullParameter(permList, "permList");
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = permList.iterator();
            while (it.hasNext()) {
                List list = (List) iee.b.get(it.next());
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) iee.f12498e.get(Integer.valueOf(((Number) it2.next()).intValue()));
                if (num != null) {
                    arrayList2.add(Integer.valueOf(num.intValue()));
                }
            }
            String strA = a(arrayList2);
            return Intrinsics.areEqual(strA, "") ? j(permList) : strA;
        }

        @JvmStatic
        @NotNull
        public final String g(@NotNull String perm) {
            Intrinsics.checkNotNullParameter(perm, "perm");
            Integer num = (Integer) iee.d.get(perm);
            return num == null ? "" : h(num.intValue());
        }

        public final String h(int stringId) {
            String string = b78.a().getString(stringId);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getString(stringId)");
            return string;
        }

        @JvmStatic
        @NotNull
        public final String i(@NotNull String perm) {
            Intrinsics.checkNotNullParameter(perm, "perm");
            ArrayList arrayList = new ArrayList();
            List list = (List) iee.b.get(perm);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    Integer num = (Integer) iee.f12497c.get(perm + iIntValue);
                    arrayList.add(Integer.valueOf(num != null ? num.intValue() : -1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).intValue() != -1) {
                    arrayList2.add(obj);
                }
            }
            return a(arrayList2);
        }

        @JvmStatic
        @NotNull
        public final String j(@NotNull List<String> permList) {
            Intrinsics.checkNotNullParameter(permList, "permList");
            ArrayList arrayList = new ArrayList();
            for (String str : permList) {
                List list = (List) iee.b.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        Integer num = (Integer) iee.f12497c.get(str + iIntValue);
                        arrayList.add(Integer.valueOf(num != null ? num.intValue() : -1));
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).intValue() != -1) {
                    arrayList2.add(obj);
                }
            }
            return a(arrayList2);
        }
    }

    static {
        Pair[] pairArr = new Pair[27];
        pairArr[0] = TuplesKt.to("android.permission.NEARBY_WIFI_DEVICES", CollectionsKt__CollectionsJVMKt.listOf(23));
        pairArr[1] = TuplesKt.to("android.permission.CAMERA", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 4, 6, 8, 10, 20, 21, 22}));
        pairArr[2] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 5, 8, 13, 15, 18}));
        pairArr[3] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 8, 13, 15, 23, 18}));
        pairArr[4] = TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 13}));
        pairArr[5] = TuplesKt.to("android.permission.READ_CONTACTS", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[6] = TuplesKt.to("android.permission.READ_CALL_LOG", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[7] = TuplesKt.to("android.permission.CALL_PHONE", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[8] = TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[9] = TuplesKt.to("android.permission.SEND_SMS", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[10] = TuplesKt.to("android.permission.READ_PHONE_STATE", CollectionsKt__CollectionsJVMKt.listOf(9));
        pairArr[11] = TuplesKt.to("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{16, 17}));
        pairArr[12] = TuplesKt.to("android.permission.PACKAGE_USAGE_STATS", CollectionsKt__CollectionsJVMKt.listOf(3));
        pairArr[13] = TuplesKt.to("android.permission.READ_CALENDAR", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 20}));
        pairArr[14] = TuplesKt.to("android.permission.WRITE_CALENDAR", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 20}));
        pairArr[15] = TuplesKt.to("android.permission.RECORD_AUDIO", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{3, 21}));
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(6, 14, 19, 20, 22);
        int i = Build.VERSION.SDK_INT;
        if (i == 29 && ilj.E()) {
            listMutableListOf.add(1);
            listMutableListOf.add(21);
        }
        Unit unit = Unit.INSTANCE;
        pairArr[16] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE", listMutableListOf);
        pairArr[17] = TuplesKt.to("android.permission.READ_MEDIA_IMAGES", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{6, 19, 20, 22}));
        pairArr[18] = TuplesKt.to("android.permission.READ_MEDIA_VIDEO", CollectionsKt__CollectionsJVMKt.listOf(6));
        pairArr[19] = TuplesKt.to("android.permission.READ_MEDIA_AUDIO", CollectionsKt__CollectionsJVMKt.listOf(14));
        pairArr[20] = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{6, 19, 20, 22}));
        ArrayList arrayList = new ArrayList();
        if (i == 29 && ilj.E()) {
            arrayList.add(1);
            arrayList.add(20);
            arrayList.add(21);
        }
        pairArr[21] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE", arrayList);
        pairArr[22] = TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", CollectionsKt__CollectionsJVMKt.listOf(5));
        pairArr[23] = TuplesKt.to("android.permission.BLUETOOTH_SCAN", CollectionsKt__CollectionsJVMKt.listOf(8));
        pairArr[24] = TuplesKt.to("android.permission.BLUETOOTH_CONNECT", CollectionsKt__CollectionsJVMKt.listOf(8));
        pairArr[25] = TuplesKt.to("android.permission.SYSTEM_ALERT_WINDOW", CollectionsKt__CollectionsJVMKt.listOf(5));
        pairArr[26] = TuplesKt.to("android.permission.MANAGE_EXTERNAL_STORAGE", CollectionsKt__CollectionsJVMKt.listOf(20));
        b = MapsKt__MapsKt.mapOf(pairArr);
        Pair[] pairArr2 = new Pair[65];
        pairArr2[0] = TuplesKt.to("android.permission.CAMERA1", Integer.valueOf(R$string.lib_base_permission_camera_share));
        pairArr2[1] = TuplesKt.to("android.permission.CAMERA4", Integer.valueOf(R$string.lib_base_permission_camera_add_family));
        pairArr2[2] = TuplesKt.to("android.permission.CAMERA6", Integer.valueOf(R$string.lib_base_permission_camera_upload_photo_v1));
        pairArr2[3] = TuplesKt.to("android.permission.CAMERA8", Integer.valueOf(R$string.lib_base_permission_camera_pair));
        pairArr2[4] = TuplesKt.to("android.permission.CAMERA10", Integer.valueOf(R$string.lib_base_permission_camera_e_sim_content));
        pairArr2[5] = TuplesKt.to("android.permission.CAMERA20", Integer.valueOf(R$string.lib_base_permission_health_archives_camera));
        pairArr2[6] = TuplesKt.to("android.permission.CAMERA21", Integer.valueOf(R$string.lib_base_permission_health_ai_agent_camera));
        pairArr2[7] = TuplesKt.to("android.permission.CAMERA22", Integer.valueOf(R$string.lib_base_permission_doctor_camera));
        pairArr2[8] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION2", Integer.valueOf(R$string.lib_base_permission_location_pk_v1));
        int i2 = R$string.lib_base_permission_location_track_v1;
        pairArr2[9] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION5", Integer.valueOf(i2));
        int i3 = R$string.lib_base_permission_location_help_device_new_v4;
        pairArr2[10] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION13", Integer.valueOf(i3));
        int i4 = R$string.lib_base_permission_query_device_content_v1;
        int i5 = i4;
        pairArr2[11] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION15", Integer.valueOf(i4));
        int i6 = R$string.lib_base_permission_entrance_door_content_v1;
        pairArr2[12] = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION18", Integer.valueOf(i6));
        pairArr2[13] = TuplesKt.to("android.permission.NEARBY_WIFI_DEVICES23", Integer.valueOf(R$string.lib_base_permission_p2p_nearby_wifi_device_desc));
        pairArr2[14] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION23", Integer.valueOf(R$string.lib_base_permission_p2p_access_location_desc));
        pairArr2[15] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION5", Integer.valueOf(i >= 31 ? R$string.lib_base_permission_location_track_v1_sdk31 : i2));
        pairArr2[16] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION13", Integer.valueOf(i3));
        if (i > 31) {
            i5 = R$string.lib_base_permission_query_device_content_v1_sdk31;
        }
        pairArr2[17] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION15", Integer.valueOf(i5));
        pairArr2[18] = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION18", Integer.valueOf(i >= 31 ? R$string.lib_base_permission_entrance_door_content_v1_sdk31 : i6));
        pairArr2[19] = TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION5", Integer.valueOf(i2));
        pairArr2[20] = TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION13", Integer.valueOf(i3));
        pairArr2[21] = TuplesKt.to("android.permission.READ_CONTACTS9", Integer.valueOf(R$string.lib_base_permission_read_contacts_list));
        pairArr2[22] = TuplesKt.to("android.permission.READ_CALL_LOG9", Integer.valueOf(R$string.lib_base_permission_check_contacts_list));
        pairArr2[23] = TuplesKt.to("android.permission.CALL_PHONE9", Integer.valueOf(R$string.lib_base_permission_phone_dial));
        pairArr2[24] = TuplesKt.to("android.permission.ANSWER_PHONE_CALLS9", Integer.valueOf(R$string.lib_base_permission_phone_answer));
        pairArr2[25] = TuplesKt.to("android.permission.SEND_SMS9", Integer.valueOf(R$string.lib_base_permission_sms_content));
        pairArr2[26] = TuplesKt.to("android.permission.READ_PHONE_STATE9", Integer.valueOf(R$string.lib_base_permission_read_phone_state_device_call));
        int i7 = R$string.lib_base_permission_phone_content_1;
        pairArr2[27] = TuplesKt.to("android.permission.READ_PHONE_STATE5", Integer.valueOf(i7));
        pairArr2[28] = TuplesKt.to("android.permission.READ_PHONE_STATE2", Integer.valueOf(i7));
        pairArr2[29] = TuplesKt.to("android.permission.READ_PHONE_STATE8", Integer.valueOf(i7));
        pairArr2[30] = TuplesKt.to("android.permission.READ_PHONE_STATE13", Integer.valueOf(i7));
        int i8 = R$string.lib_base_permission_calendar_sync_device;
        pairArr2[31] = TuplesKt.to("android.permission.READ_CALENDAR11", Integer.valueOf(i8));
        int i9 = R$string.lib_base_permission_health_archives_calendar;
        pairArr2[32] = TuplesKt.to("android.permission.READ_CALENDAR20", Integer.valueOf(i9));
        pairArr2[33] = TuplesKt.to("android.permission.WRITE_CALENDAR11", Integer.valueOf(i8));
        pairArr2[34] = TuplesKt.to("android.permission.WRITE_CALENDAR20", Integer.valueOf(i9));
        pairArr2[35] = TuplesKt.to("android.permission.RECORD_AUDIO3", Integer.valueOf(R$string.lib_base_permission_record_audio_snore));
        pairArr2[36] = TuplesKt.to("android.permission.RECORD_AUDIO21", Integer.valueOf(R$string.lib_base_permission_health_ai_agent_record_audio));
        int i10 = R$string.lib_base_permission_storage_camera_ai;
        pairArr2[37] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE6", Integer.valueOf(i10));
        int i11 = R$string.lib_base_permission_storage_log;
        pairArr2[38] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE14", Integer.valueOf(i11));
        int i12 = R$string.lib_base_permission_community_image;
        int i13 = i10;
        pairArr2[39] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE19", Integer.valueOf(i12));
        int i14 = R$string.lib_base_permission_health_archives_file;
        pairArr2[40] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE20", Integer.valueOf(i14));
        int i15 = R$string.lib_base_permission_doctor_image;
        pairArr2[41] = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE22", Integer.valueOf(i15));
        pairArr2[42] = TuplesKt.to("android.permission.READ_MEDIA_IMAGES19", Integer.valueOf(i12));
        pairArr2[43] = TuplesKt.to("android.permission.READ_MEDIA_IMAGES6", Integer.valueOf(i >= 34 ? R$string.lib_base_permission_storage_camera_ai_v14 : i13));
        int i16 = R$string.lib_base_permission_health_archives_image;
        pairArr2[44] = TuplesKt.to("android.permission.READ_MEDIA_IMAGES20", Integer.valueOf(i16));
        pairArr2[45] = TuplesKt.to("android.permission.READ_MEDIA_IMAGES22", Integer.valueOf(i15));
        pairArr2[46] = TuplesKt.to("android.permission.READ_MEDIA_VIDEO6", Integer.valueOf(i >= 34 ? R$string.lib_base_permission_storage_camera_ai_v14 : i13));
        pairArr2[47] = TuplesKt.to("android.permission.READ_MEDIA_AUDIO14", Integer.valueOf(i11));
        pairArr2[48] = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED19", Integer.valueOf(i12));
        if (i >= 34) {
            i13 = R$string.lib_base_permission_storage_camera_ai_v14;
        }
        pairArr2[49] = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED6", Integer.valueOf(i13));
        pairArr2[50] = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED20", Integer.valueOf(i16));
        pairArr2[51] = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED22", Integer.valueOf(i15));
        pairArr2[52] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE1", Integer.valueOf(R$string.lib_base_permission_camera_share_save));
        pairArr2[53] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE19", Integer.valueOf(i12));
        pairArr2[54] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE20", Integer.valueOf(i14));
        pairArr2[55] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE21", Integer.valueOf(i14));
        pairArr2[56] = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE22", Integer.valueOf(i15));
        pairArr2[57] = TuplesKt.to("android.permission.ACTIVITY_RECOGNITION5", Integer.valueOf(R$string.lib_base_sports_permission_notice_m1_v1));
        int i17 = R$string.lib_base_sports_permission_nearby_equipment_tip;
        pairArr2[58] = TuplesKt.to("android.permission.BLUETOOTH_CONNECT8", Integer.valueOf(i17));
        pairArr2[59] = TuplesKt.to("android.permission.BLUETOOTH_SCAN8", Integer.valueOf(i17));
        pairArr2[60] = TuplesKt.to("android.permission.BLUETOOTH8", Integer.valueOf(i17));
        pairArr2[61] = TuplesKt.to("android.permission.BLUETOOTH_ADMIN8", Integer.valueOf(i17));
        pairArr2[62] = TuplesKt.to("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE16", Integer.valueOf(R$string.lib_base_permission_bind_notification_listener_content_music));
        pairArr2[63] = TuplesKt.to("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE17", Integer.valueOf(R$string.lib_base_permission_bind_notification_listener_content_notification));
        pairArr2[64] = TuplesKt.to("android.permission.PACKAGE_USAGE_STATS3", Integer.valueOf(R$string.lib_base_permission_read_stats_sleep_service));
        Map<String, Integer> mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr2);
        if (zu1.a()) {
            int i18 = R$string.lib_base_permission_location_bluetooth_pair_new_v2;
            mapMutableMapOf.put("android.permission.ACCESS_COARSE_LOCATION8", Integer.valueOf(i18));
            mapMutableMapOf.put("android.permission.ACCESS_FINE_LOCATION8", Integer.valueOf(i18));
        }
        f12497c = mapMutableMapOf;
        Pair pair = TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", Integer.valueOf(R$string.lib_base_sports_permission_notice_t1));
        int i19 = R$string.lib_base_permission_location_title;
        Pair pair2 = TuplesKt.to("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(i19));
        Pair pair3 = TuplesKt.to("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(i19));
        Pair pair4 = TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", Integer.valueOf(i19));
        int i20 = R$string.lib_base_permission_storage_title;
        Pair pair5 = TuplesKt.to("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(i20));
        Pair pair6 = TuplesKt.to("android.permission.READ_MEDIA_AUDIO", Integer.valueOf(R$string.lib_base_permission_read_media_audio_title));
        int i21 = R$string.lib_base_permission_read_media_images_and_video_title;
        Pair pair7 = TuplesKt.to("android.permission.READ_MEDIA_IMAGES", Integer.valueOf(i21));
        Pair pair8 = TuplesKt.to("android.permission.READ_MEDIA_VIDEO", Integer.valueOf(i21));
        Pair pair9 = TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", Integer.valueOf(i21));
        Pair pair10 = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(i20));
        Pair pair11 = TuplesKt.to("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(i20));
        Pair pair12 = TuplesKt.to("android.permission.READ_CALENDAR", Integer.valueOf(R$string.lib_base_permission_calendar_title_read));
        Pair pair13 = TuplesKt.to("android.permission.WRITE_CALENDAR", Integer.valueOf(R$string.lib_base_permission_calendar_title_write));
        Pair pair14 = TuplesKt.to("android.permission.SEND_SMS", Integer.valueOf(R$string.lib_base_permission_sms_title));
        Pair pair15 = TuplesKt.to("android.permission.CAMERA", Integer.valueOf(R$string.lib_base_permission_camera_title_v1));
        Pair pair16 = TuplesKt.to("android.permission.READ_CONTACTS", Integer.valueOf(R$string.lib_base_permission_read_contacts_title));
        Pair pair17 = TuplesKt.to("android.permission.RECORD_AUDIO", Integer.valueOf(R$string.lib_base_permission_record_audio_title));
        Pair pair18 = TuplesKt.to("android.permission.READ_PHONE_STATE", Integer.valueOf(R$string.lib_base_permission_phone_title));
        Pair pair19 = TuplesKt.to("android.permission.CALL_PHONE", Integer.valueOf(R$string.lib_base_permission_phone_title_1));
        Pair pair20 = TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", Integer.valueOf(R$string.lib_base_permission_phone_title_2));
        Pair pair21 = TuplesKt.to("android.permission.READ_CALL_LOG", Integer.valueOf(R$string.lib_base_permission_call_record_title));
        Pair pair22 = TuplesKt.to("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", Integer.valueOf(R$string.lib_base_permission_bind_notification_listener));
        Pair pair23 = TuplesKt.to("android.permission.PACKAGE_USAGE_STATS", Integer.valueOf(R$string.lib_base_permission_package_usage_stat));
        int i22 = R$string.lib_base_sports_permission_nearby_equipment;
        d = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, TuplesKt.to("android.permission.BLUETOOTH_SCAN", Integer.valueOf(i22)), TuplesKt.to("android.permission.BLUETOOTH_CONNECT", Integer.valueOf(i22)), TuplesKt.to("android.permission.SYSTEM_ALERT_WINDOW", Integer.valueOf(R$string.lib_base_sports_permission_notice_t4)), TuplesKt.to("android.permission.MANAGE_EXTERNAL_STORAGE", Integer.valueOf(R$string.lib_base_permission_health_archives_all_file_title)), TuplesKt.to("android.permission.NEARBY_WIFI_DEVICES", Integer.valueOf(R$string.lib_base_permission_nearby_wifi_device_title)));
        f12498e = MapsKt__MapsKt.mapOf(TuplesKt.to(1, Integer.valueOf(R$string.lib_base_permission_share_picture)), TuplesKt.to(2, Integer.valueOf(R$string.lib_base_permission_step_rank)), TuplesKt.to(3, Integer.valueOf(R$string.lib_base_permission_sleep_service)), TuplesKt.to(4, Integer.valueOf(R$string.lib_base_permission_family)), TuplesKt.to(5, Integer.valueOf(R$string.lib_base_permission_sport_track)), TuplesKt.to(6, Integer.valueOf(R$string.lib_base_permission_watchface_manager)), TuplesKt.to(8, Integer.valueOf(R$string.lib_base_permission_device_pair)), TuplesKt.to(9, Integer.valueOf(R$string.lib_base_permission_device_call)), TuplesKt.to(11, Integer.valueOf(R$string.lib_base_permission_device_calendar)), TuplesKt.to(13, Integer.valueOf(R$string.lib_base_permission_location_helper)), TuplesKt.to(14, Integer.valueOf(R$string.lib_base_permission_music_manager)), TuplesKt.to(15, Integer.valueOf(R$string.lib_base_permission_query_device)), TuplesKt.to(18, Integer.valueOf(R$string.lib_base_permission_device_wallet)), TuplesKt.to(10, Integer.valueOf(R$string.lib_base_permission_e_sim_manager)), TuplesKt.to(19, Integer.valueOf(R$string.lib_base_permission_community_title)), TuplesKt.to(20, Integer.valueOf(R$string.lib_base_permission_health_archives_title)), TuplesKt.to(21, Integer.valueOf(R$string.lib_base_permission_health_ai_agent_title)), TuplesKt.to(23, Integer.valueOf(R$string.lib_base_permission_wifi_p2p_title1)), TuplesKt.to(22, Integer.valueOf(R$string.lib_base_permission_doctor_title)));
    }

    @JvmStatic
    @NotNull
    public static final String f(int i) {
        return INSTANCE.c(i);
    }

    @JvmStatic
    @NotNull
    public static final String g(int i, @NotNull String str) {
        return INSTANCE.d(i, str);
    }

    @JvmStatic
    @NotNull
    public static final String h(@NotNull String str) {
        return INSTANCE.g(str);
    }

    @JvmStatic
    @NotNull
    public static final String i(@NotNull String str) {
        return INSTANCE.i(str);
    }
}
