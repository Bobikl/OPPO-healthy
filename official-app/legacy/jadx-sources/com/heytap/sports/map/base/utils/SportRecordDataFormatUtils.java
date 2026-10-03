package com.heytap.sports.map.base.utils;

import android.util.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.TrackMetaData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.map.model.TrackPoint;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f58;
import com.oplus.aiunit.vision.op5;
import com.oplus.aiunit.vision.sc8;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsKt;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0004J\u0014\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016J\u0014\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u0012\u001a\u0004\u0018\u00010&H\u0002¨\u0006*"}, d2 = {"Lcom/heytap/sports/map/base/utils/SportRecordDataFormatUtils;", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "", "isFilter", "", "Lcom/heytap/sports/map/model/TrackPoint;", MapSchema.FIELD_NAME_ENTRY, "c", "", "deviceType", "Lcom/heytap/databaseengine/model/TrackMetaData;", "metaData", "", "", "b", "data", "type", "dilution", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "d", "", "trackPoints", "i", "stepRates", MapSchema.FIELD_NAME_KEY, "pointString", LogFieldKey.LEVEL_KEY, "version", "origin", b2n.f, "", "dataLength", "dateInterval", "a", "Lcom/amap/api/maps/model/LatLng;", "lat", "Lcom/amap/api/maps/CoordinateConverter$CoordType;", "j", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportRecordDataFormatUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDataFormatUtils.kt\ncom/heytap/sports/map/base/utils/SportRecordDataFormatUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,282:1\n731#2,9:283\n731#2,9:294\n731#2,9:305\n731#2,9:316\n37#3,2:292\n37#3,2:303\n37#3,2:314\n37#3,2:325\n*S KotlinDebug\n*F\n+ 1 SportRecordDataFormatUtils.kt\ncom/heytap/sports/map/base/utils/SportRecordDataFormatUtils\n*L\n60#1:283,9\n63#1:294,9\n120#1:305,9\n229#1:316,9\n60#1:292,2\n63#1:303,2\n120#1:314,2\n229#1:325,2\n*E\n"})
public final class SportRecordDataFormatUtils {
    public static final int $stable = 0;

    @NotNull
    public static final SportRecordDataFormatUtils INSTANCE = new SportRecordDataFormatUtils();

    @JvmStatic
    @NotNull
    public static final List<TrackPoint> e(@NotNull OneTimeSport oneTimeSport, boolean isFilter) {
        Intrinsics.checkNotNullParameter(oneTimeSport, "oneTimeSport");
        return oneTimeSport.getVersion() > 1 ? INSTANCE.g(oneTimeSport.getVersion(), oneTimeSport.getData(), oneTimeSport.getDeviceType(), false, isFilter) : INSTANCE.l(oneTimeSport.getData());
    }

    public static /* synthetic */ List f(OneTimeSport oneTimeSport, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return e(oneTimeSport, z);
    }

    public static /* synthetic */ List h(SportRecordDataFormatUtils sportRecordDataFormatUtils, int i, String str, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        return sportRecordDataFormatUtils.g(i, str, str2, z, z2);
    }

    public final int a(long dataLength, int dateInterval, boolean isFilter) {
        int i;
        if (isFilter && (i = (int) ((dataLength - 1) / ((long) dateInterval))) >= 5000) {
            return 1 + (i / 5000);
        }
        return 1;
    }

    @NotNull
    public final Map<Integer, Integer> b(@Nullable String deviceType, @NotNull TrackMetaData metaData) {
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        StringBuilder sb = new StringBuilder();
        sb.append("getKmPaceData version = ");
        sb.append(deviceType);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getKmPaceData metaData = ");
        sb2.append(metaData);
        if (deviceType == null || Intrinsics.areEqual(deviceType, op5.PHONE)) {
            Map<Integer, Integer> paceMap = metaData.getPaceMap();
            Intrinsics.checkNotNullExpressionValue(paceMap, "metaData.paceMap");
            return paceMap;
        }
        RunExtra runExtra = (RunExtra) sc8.a(metaData.getRunExtra(), RunExtra.class);
        if (runExtra == null || runExtra.getKmPace() == null) {
            return new ArrayMap();
        }
        ArrayMap arrayMap = new ArrayMap();
        List<Integer> kmPace = runExtra.getKmPace();
        Intrinsics.checkNotNull(kmPace);
        int size = kmPace.size();
        int iIntValue = 0;
        for (int i = 0; i < size; i++) {
            Integer numValueOf = Integer.valueOf(i);
            List<Integer> kmPace2 = runExtra.getKmPace();
            Intrinsics.checkNotNull(kmPace2);
            arrayMap.put(numValueOf, kmPace2.get(i));
            List<Integer> kmPace3 = runExtra.getKmPace();
            Intrinsics.checkNotNull(kmPace3);
            iIntValue += kmPace3.get(i).intValue();
        }
        if (metaData.getTotalDistance() % 1000 > 10) {
            arrayMap.put(Integer.valueOf(arrayMap.size()), Integer.valueOf(arrayMap.isEmpty() ^ true ? (int) (((metaData.getTotalTime() / ((long) 1000)) - ((long) iIntValue)) / ((((double) metaData.getTotalDistance()) / 1000.0d) % ((double) 1))) : metaData.getAvgPace()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("getKmPaceData metaData = ");
        sb3.append(arrayMap);
        return arrayMap;
    }

    @NotNull
    public final List<TrackPoint> c(@NotNull OneTimeSport oneTimeSport) {
        Intrinsics.checkNotNullParameter(oneTimeSport, "oneTimeSport");
        return oneTimeSport.getVersion() > 1 ? h(this, oneTimeSport.getVersion(), oneTimeSport.getData(), oneTimeSport.getDeviceType(), true, false, 16, null) : l(oneTimeSport.getData());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    @NotNull
    public final List<TimeStampedData> d(@Nullable String data, @Nullable String type, boolean dilution) {
        Map map;
        String str;
        List listEmptyList;
        if (data != null && (map = (Map) sc8.b(data, new TypeToken<Map<String, String>>() { // from class: com.heytap.sports.map.base.utils.SportRecordDataFormatUtils$getSportData4ChartWithoutDilution$dataMap$1
        }.getType())) != null && (str = (String) map.get(type)) != null) {
            ArrayList arrayList = new ArrayList();
            int i = Integer.parseInt(StringsKt___StringsKt.take(str, 1));
            List<String> listSplit = new Regex(",").split(str, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    break;
                }
                if (!(listIterator.previous().length() == 0)) {
                    listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
            for (int i2 = i + 1; i2 < strArr.length - 1; i2 += i) {
                long j2 = Long.parseLong(strArr[i2]);
                float f = Float.parseFloat(strArr[i2 + 1]);
                if (!arrayList.isEmpty()) {
                    arrayList.add(new TimeStampedData(j2, f));
                } else if (!(f == 0.0f) || !dilution) {
                    arrayList.add(new TimeStampedData(j2, f));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final List<TrackPoint> g(int version, String data, String type, boolean origin, boolean isFilter) {
        List listEmptyList;
        LatLng latLngJ;
        float f;
        a7b.f("SportRecordDataFormatUtils", "getTrackPointsFromMapData begin");
        ArrayList arrayList = new ArrayList();
        if (data == null) {
            a7b.f("SportRecordDataFormatUtils", "getTrackPointsFromMapData, data is null");
            return arrayList;
        }
        try {
            Map map = (Map) new Gson().fromJson(data, new TypeToken<Map<String, String>>() { // from class: com.heytap.sports.map.base.utils.SportRecordDataFormatUtils$getTrackPointsFromMapData$1
            }.getType());
            if (map == null) {
                a7b.f("SportRecordDataFormatUtils", "getTrackPointsFromMapData, dataMap is null ");
                return arrayList;
            }
            String str = (String) map.get(f58.GPS);
            if (str != null) {
                int i = 1;
                if (!(str.length() == 0)) {
                    int i2 = Integer.parseInt(StringsKt___StringsKt.take(str, 1));
                    if (i2 <= 0) {
                        a7b.f("SportRecordDataFormatUtils", "getTrackPointsFromMapData, interval error ");
                        return arrayList;
                    }
                    int i3 = i2 + 1;
                    if (str.length() > i3) {
                        List<String> listSplit = new Regex(",").split(str, 0);
                        if (!listSplit.isEmpty()) {
                            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                                    break;
                                }
                                if (!(listIterator.previous().length() == 0)) {
                                    listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        } else {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                            break;
                        }
                        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                        int iA = a(strArr.length, i2, isFilter);
                        boolean z = false;
                        boolean zIsAMapDataAvailable = false;
                        while (i3 < (strArr.length - i2) + i) {
                            long j2 = Long.parseLong(strArr[i3]);
                            if (j2 == 0) {
                                i3 += i2 * iA;
                            } else {
                                boolean zAreEqual = Intrinsics.areEqual(strArr[i3 + 3], "1");
                                float f2 = Float.parseFloat(strArr[i3 + 4]);
                                int i4 = iA;
                                int i5 = i2;
                                LatLng latLng = new LatLng(Double.parseDouble(strArr[i3 + 1]), Double.parseDouble(strArr[i3 + 2]));
                                if (type == null || Intrinsics.areEqual(type, op5.PHONE)) {
                                    if (version > 2) {
                                        latLngJ = j(latLng, CoordinateConverter.CoordType.BAIDU);
                                        f = f2;
                                    }
                                    arrayList.add(new TrackPoint(latLngJ, j2, f, 0.0f, zAreEqual));
                                    i3 += i5 * i4;
                                    iA = i4;
                                    i2 = i5;
                                    i = 1;
                                } else {
                                    if (!z) {
                                        LatLng latLngJ2 = j(latLng, CoordinateConverter.CoordType.GPS);
                                        zIsAMapDataAvailable = CoordinateConverter.isAMapDataAvailable(latLngJ2.latitude, latLngJ2.longitude);
                                        z = true;
                                    }
                                    if (zIsAMapDataAvailable && !origin) {
                                        latLng = j(latLng, CoordinateConverter.CoordType.GPS);
                                    }
                                    if (!(f2 == 0.0f)) {
                                        f = 1000 / f2;
                                    }
                                    latLngJ = latLng;
                                    arrayList.add(new TrackPoint(latLngJ, j2, f, 0.0f, zAreEqual));
                                    i3 += i5 * i4;
                                    iA = i4;
                                    i2 = i5;
                                    i = 1;
                                }
                                f = f2;
                                latLngJ = latLng;
                                arrayList.add(new TrackPoint(latLngJ, j2, f, 0.0f, zAreEqual));
                                i3 += i5 * i4;
                                iA = i4;
                                i2 = i5;
                                i = 1;
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (JsonSyntaxException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getTrackPointsFromMapData Gson fromJson exception ,data:");
            sb.append(data);
            a7b.b("SportRecordDataFormatUtils", "getTrackPointsFromMapData Gson fromJson exception ,message:" + e2.getMessage());
            return arrayList;
        }
    }

    @NotNull
    public final String i(@NotNull List<TrackPoint> trackPoints) {
        Intrinsics.checkNotNullParameter(trackPoints, "trackPoints");
        StringBuilder sb = new StringBuilder("5,time,Lat,Long,state,speed");
        for (TrackPoint trackPoint : trackPoints) {
            sb.append(",");
            sb.append(trackPoint.getTimeStamp());
            sb.append(",");
            sb.append(trackPoint.getLatitude());
            sb.append(",");
            sb.append(trackPoint.getLongitude());
            sb.append(",");
            sb.append(trackPoint.isPause() ? 1 : 0);
            sb.append(",");
            sb.append(trackPoint.getSpeed());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "gps.toString()");
        return string;
    }

    public final LatLng j(LatLng lat, CoordinateConverter.CoordType type) {
        CoordinateConverter coordinateConverter = new CoordinateConverter(b78.a());
        coordinateConverter.from(type);
        coordinateConverter.coord(lat);
        LatLng latLngConvert = coordinateConverter.convert();
        Intrinsics.checkNotNullExpressionValue(latLngConvert, "coordinateConverter.convert()");
        return latLngConvert;
    }

    @NotNull
    public final String k(@NotNull List<TimeStampedData> stepRates) {
        Intrinsics.checkNotNullParameter(stepRates, "stepRates");
        StringBuilder sb = new StringBuilder("2,time,frequency");
        for (TimeStampedData timeStampedData : stepRates) {
            sb.append(",");
            sb.append(timeStampedData.getTimestamp());
            sb.append(",");
            sb.append(timeStampedData.getY());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "frequency.toString()");
        return string;
    }

    public final List<TrackPoint> l(String pointString) {
        List listEmptyList;
        List listEmptyList2;
        if (pointString == null) {
            return new ArrayList();
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) pointString, (CharSequence) "isPause", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) pointString, (CharSequence) SpeechConstant.FALSE_STR, false, 2, (Object) null)) {
            return new ArrayList();
        }
        List<String> listSplit = new Regex(":").split(pointString, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            break;
        }
        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            if (!(listIterator.previous().length() == 0)) {
                listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                break;
            }
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            List<String> listSplit2 = new Regex(",").split(str, 0);
            if (listSplit2.isEmpty()) {
                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    break;
                }
                if (!(listIterator2.previous().length() == 0)) {
                    listEmptyList2 = CollectionsKt___CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr2 = (String[]) listEmptyList2.toArray(new String[0]);
            arrayList.add(new TrackPoint(new LatLng(Double.parseDouble(strArr2[0]), Double.parseDouble(strArr2[1])), 0L, Float.parseFloat(strArr2[2]), 0.0f, Integer.parseInt(strArr2[3]) == 1));
        }
        return arrayList;
    }
}
