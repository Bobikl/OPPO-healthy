package com.oplus.vfxsdk.common;

import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.fqi;
import com.oplus.aiunit.vision.ld7;
import com.oplus.aiunit.vision.rde;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.wearable.linkservice.sdk.Node;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ0\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0002J2\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002JF\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0016j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u00182\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002JQ\u0010!\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\u0016j\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u0001`\u00182\b\u0010$\u001a\u0004\u0018\u00010\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0002¢\u0006\u0002\u0010'JF\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0016j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u00182\b\b\u0002\u0010*\u001a\u00020 H\u0002JG\u0010+\u001a\b\u0012\u0004\u0012\u00020&0\"2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0016j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0018H\u0002¢\u0006\u0002\u0010-J%\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\"2\b\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u00100\u001a\u00020\u000fH\u0002¢\u0006\u0002\u00101R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u00062"}, d2 = {"Lcom/oplus/vfxsdk/common/COEParse;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/oplus/vfxsdk/common/COEData;", "contentBytes", "", "isZip", "", "parseAnimKey", "animKeys", "Lorg/json/JSONObject;", Node.I_KEY, "animValues", "Ljava/util/ArrayList;", "Lcom/oplus/vfxsdk/common/AnimKey;", "Lkotlin/collections/ArrayList;", "parseAnimator", "Ljava/util/HashMap;", "Lcom/oplus/vfxsdk/common/AnimatorValue;", "Lkotlin/collections/HashMap;", "animators", "Lorg/json/JSONArray;", "parseLayer", "Lcom/oplus/vfxsdk/common/Layer;", "layerJSONObject", "urlMap", "defaultLayerOrder", "", "parseParams", "", "Lcom/oplus/vfxsdk/common/PassParams;", "params", "rendPassArray", "Lcom/oplus/vfxsdk/common/RendPass;", "(Lorg/json/JSONObject;[Lcom/oplus/vfxsdk/common/RendPass;)Ljava/util/HashMap;", "parseRender", "renderJSONObject", "defaultOrder", "parseRenders", "rendersJSONArray", "(Lorg/json/JSONArray;ZLjava/util/HashMap;)[Lcom/oplus/vfxsdk/common/RendPass;", "parseUniformValue", "type", "paramJSON", "(Ljava/lang/String;Lorg/json/JSONObject;)[Ljava/lang/Object;", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCOEParse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COEParse.kt\ncom/oplus/vfxsdk/common/COEParse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,501:1\n1#2:502\n1549#3:503\n1620#3,3:504\n1549#3:511\n1620#3,3:512\n37#4,2:507\n37#4,2:515\n37#4,2:518\n37#4,2:520\n37#4,2:523\n37#4,2:525\n37#4,2:527\n37#4,2:529\n37#4,2:531\n37#4,2:533\n32#5:509\n32#5:510\n33#5:517\n33#5:522\n*S KotlinDebug\n*F\n+ 1 COEParse.kt\ncom/oplus/vfxsdk/common/COEParse\n*L\n224#1:503\n224#1:504,3\n411#1:511\n411#1:512,3\n225#1:507,2\n411#1:515,2\n435#1:518,2\n437#1:520,2\n471#1:523,2\n478#1:525,2\n481#1:527,2\n485#1:529,2\n490#1:531,2\n495#1:533,2\n397#1:509\n403#1:510\n403#1:517\n397#1:522\n*E\n"})
public final class COEParse {

    @NotNull
    private final String TAG = "COEParse";

    private final boolean parseAnimKey(JSONObject animKeys, String key, ArrayList<AnimKey> animValues) throws JSONException {
        Float[] fArr;
        if (animKeys.optJSONArray(key) == null) {
            return false;
        }
        int length = animKeys.getJSONArray(key).length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = animKeys.getJSONArray(key).getJSONObject(i);
            float fOptDouble = (float) jSONObject.optDouble(ClickApiEntity.TIME);
            float fOptDouble2 = (float) jSONObject.optDouble("value");
            String strOptString = jSONObject.optString("type");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("bezier");
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                IntIterator it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf((float) jSONArrayOptJSONArray.getDouble(it.nextInt())));
                }
                fArr = (Float[]) arrayList.toArray(new Float[0]);
            } else {
                fArr = new Float[]{Float.valueOf(0.3f), Float.valueOf(vr3.UNSET), Float.valueOf(0.1f), Float.valueOf(1.0f)};
            }
            Intrinsics.checkNotNull(strOptString);
            animValues.add(new AnimKey(fOptDouble, fOptDouble2, strOptString, fArr));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x010d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x015a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x01aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x01f4, please report this as an issue */
    private final HashMap<String, AnimatorValue> parseAnimator(JSONArray animators) throws JSONException {
        int i;
        int i2;
        HashMap<String, AnimatorValue> map;
        int i3;
        ArrayList<AnimKey> arrayList;
        ArrayList<AnimKey> arrayList2;
        ArrayList<AnimKey> arrayList3;
        ArrayList<AnimKey> arrayList4;
        JSONArray jSONArray = animators;
        HashMap<String, AnimatorValue> map2 = jSONArray != null ? new HashMap<>() : null;
        if (jSONArray != null) {
            int length = animators.length();
            int i4 = 0;
            while (i4 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject == null) {
                    i = length;
                    i2 = i4;
                    map = map2;
                } else {
                    String strOptString = jSONObjectOptJSONObject.optString(ParserTag.TAG_ID);
                    String str = "name";
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("duration");
                    ArrayList arrayList5 = new ArrayList();
                    String str2 = "animLines";
                    if (jSONObjectOptJSONObject.optJSONArray("animLines") == null) {
                        i = length;
                        i2 = i4;
                        map = map2;
                    } else {
                        int length2 = jSONObjectOptJSONObject.getJSONArray("animLines").length();
                        int i5 = 0;
                        while (i5 < length2) {
                            JSONObject jSONObject = jSONObjectOptJSONObject.getJSONArray(str2).getJSONObject(i5);
                            String strOptString3 = jSONObject.optString("nodeId");
                            String strOptString4 = jSONObject.optString(Node.I_KEY);
                            String strOptString5 = jSONObject.optString(str);
                            Intrinsics.checkNotNull(strOptString5);
                            int i6 = length;
                            JSONObject jSONObject2 = jSONObjectOptJSONObject;
                            List listSplit$default = StringsKt.split$default(strOptString5, new char[]{'.'}, false, 0, 6, (Object) null);
                            String str3 = str;
                            String str4 = listSplit$default.size() > 1 ? (String) listSplit$default.get(1) : (String) listSplit$default.get(0);
                            String strOptString6 = jSONObject.optString("type");
                            String str5 = str2;
                            int i7 = length2;
                            float fOptDouble2 = (float) jSONObject.optDouble("lastTime");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("animKeys");
                            if (jSONObjectOptJSONObject2 == null || strOptString6 == null) {
                                i3 = i4;
                            } else {
                                i3 = i4;
                                switch (strOptString6.hashCode()) {
                                    case 104431:
                                        map2 = map2;
                                        strOptString2 = strOptString2;
                                        fOptDouble = fOptDouble;
                                        if (strOptString6.equals("int")) {
                                            ArrayList<AnimKey> arrayList6 = new ArrayList<>();
                                            parseAnimKey(jSONObjectOptJSONObject2, "value", arrayList6);
                                            Intrinsics.checkNotNull(strOptString3);
                                            Intrinsics.checkNotNull(strOptString4);
                                            Intrinsics.checkNotNull(strOptString6);
                                            arrayList5.add(new AnimLine(strOptString3, strOptString4, str4, strOptString6, fOptDouble2, (AnimKey[]) arrayList6.toArray(new AnimKey[0])));
                                        }
                                        break;
                                    case 2662206:
                                        if (strOptString6.equals("Vec2")) {
                                            arrayList = new ArrayList<>();
                                            map2 = map2;
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "x", arrayList)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**x", strOptString6, fOptDouble2, (AnimKey[]) arrayList.toArray(new AnimKey[0])));
                                            }
                                            arrayList2 = new ArrayList<>();
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "y", arrayList2)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**y", strOptString6, fOptDouble2, (AnimKey[]) arrayList2.toArray(new AnimKey[0])));
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec3") || Intrinsics.areEqual(strOptString6, "Vec4")) {
                                                arrayList3 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "z", arrayList3)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**z", strOptString6, fOptDouble2, (AnimKey[]) arrayList3.toArray(new AnimKey[0])));
                                                }
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec4")) {
                                                arrayList4 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "w", arrayList4)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**w", strOptString6, fOptDouble2, (AnimKey[]) arrayList4.toArray(new AnimKey[0])));
                                                }
                                            }
                                        }
                                        break;
                                    case 2662207:
                                        if (strOptString6.equals("Vec3")) {
                                            arrayList = new ArrayList<>();
                                            map2 = map2;
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "x", arrayList)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**x", strOptString6, fOptDouble2, (AnimKey[]) arrayList.toArray(new AnimKey[0])));
                                            }
                                            arrayList2 = new ArrayList<>();
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "y", arrayList2)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**y", strOptString6, fOptDouble2, (AnimKey[]) arrayList2.toArray(new AnimKey[0])));
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec3")) {
                                                arrayList3 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "z", arrayList3)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**z", strOptString6, fOptDouble2, (AnimKey[]) arrayList3.toArray(new AnimKey[0])));
                                                }
                                            } else {
                                                arrayList3 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "z", arrayList3)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**z", strOptString6, fOptDouble2, (AnimKey[]) arrayList3.toArray(new AnimKey[0])));
                                                }
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec4")) {
                                                arrayList4 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "w", arrayList4)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**w", strOptString6, fOptDouble2, (AnimKey[]) arrayList4.toArray(new AnimKey[0])));
                                                }
                                            }
                                        }
                                        break;
                                    case 2662208:
                                        if (strOptString6.equals("Vec4")) {
                                            arrayList = new ArrayList<>();
                                            map2 = map2;
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "x", arrayList)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**x", strOptString6, fOptDouble2, (AnimKey[]) arrayList.toArray(new AnimKey[0])));
                                            }
                                            arrayList2 = new ArrayList<>();
                                            if (parseAnimKey(jSONObjectOptJSONObject2, "y", arrayList2)) {
                                                Intrinsics.checkNotNull(strOptString3);
                                                Intrinsics.checkNotNull(strOptString4);
                                                Intrinsics.checkNotNull(strOptString6);
                                                arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**y", strOptString6, fOptDouble2, (AnimKey[]) arrayList2.toArray(new AnimKey[0])));
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec3")) {
                                                arrayList3 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "z", arrayList3)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**z", strOptString6, fOptDouble2, (AnimKey[]) arrayList3.toArray(new AnimKey[0])));
                                                }
                                            } else {
                                                arrayList3 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "z", arrayList3)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**z", strOptString6, fOptDouble2, (AnimKey[]) arrayList3.toArray(new AnimKey[0])));
                                                }
                                            }
                                            if (Intrinsics.areEqual(strOptString6, "Vec4")) {
                                                arrayList4 = new ArrayList<>();
                                                if (parseAnimKey(jSONObjectOptJSONObject2, "w", arrayList4)) {
                                                    Intrinsics.checkNotNull(strOptString3);
                                                    Intrinsics.checkNotNull(strOptString4);
                                                    Intrinsics.checkNotNull(strOptString6);
                                                    arrayList5.add(new AnimLine(strOptString3, strOptString4, str4 + "**_**w", strOptString6, fOptDouble2, (AnimKey[]) arrayList4.toArray(new AnimKey[0])));
                                                }
                                            }
                                        }
                                        break;
                                    case 78727453:
                                        if (!strOptString6.equals("Range")) {
                                        }
                                        map2 = map2;
                                        strOptString2 = strOptString2;
                                        fOptDouble = fOptDouble;
                                        ArrayList<AnimKey> arrayList7 = new ArrayList<>();
                                        parseAnimKey(jSONObjectOptJSONObject2, "value", arrayList7);
                                        Intrinsics.checkNotNull(strOptString3);
                                        Intrinsics.checkNotNull(strOptString4);
                                        Intrinsics.checkNotNull(strOptString6);
                                        arrayList5.add(new AnimLine(strOptString3, strOptString4, str4, strOptString6, fOptDouble2, (AnimKey[]) arrayList7.toArray(new AnimKey[0])));
                                        break;
                                    case 97526364:
                                        if (!strOptString6.equals("float")) {
                                        }
                                        map2 = map2;
                                        strOptString2 = strOptString2;
                                        fOptDouble = fOptDouble;
                                        ArrayList<AnimKey> arrayList8 = new ArrayList<>();
                                        parseAnimKey(jSONObjectOptJSONObject2, "value", arrayList8);
                                        Intrinsics.checkNotNull(strOptString3);
                                        Intrinsics.checkNotNull(strOptString4);
                                        Intrinsics.checkNotNull(strOptString6);
                                        arrayList5.add(new AnimLine(strOptString3, strOptString4, str4, strOptString6, fOptDouble2, (AnimKey[]) arrayList8.toArray(new AnimKey[0])));
                                        break;
                                    default:
                                        break;
                                }
                                i5++;
                                length = i6;
                                jSONObjectOptJSONObject = jSONObject2;
                                str = str3;
                                str2 = str5;
                                length2 = i7;
                                i4 = i3;
                                map2 = map2;
                                fOptDouble = fOptDouble;
                                strOptString2 = strOptString2;
                            }
                            strOptString2 = strOptString2;
                            fOptDouble = fOptDouble;
                            i5++;
                            length = i6;
                            jSONObjectOptJSONObject = jSONObject2;
                            str = str3;
                            str2 = str5;
                            length2 = i7;
                            i4 = i3;
                            map2 = map2;
                            fOptDouble = fOptDouble;
                            strOptString2 = strOptString2;
                        }
                        HashMap<String, AnimatorValue> map3 = map2;
                        i = length;
                        i2 = i4;
                        String str6 = strOptString2;
                        Intrinsics.checkNotNull(strOptString);
                        Intrinsics.checkNotNull(str6);
                        AnimatorValue animatorValue = new AnimatorValue(strOptString, str6, fOptDouble, (AnimLine[]) arrayList5.toArray(new AnimLine[0]));
                        map = map3;
                        if (map3 != null) {
                            map.put(str6, animatorValue);
                        }
                    }
                }
                i4 = i2 + 1;
                jSONArray = animators;
                map2 = map;
                length = i;
            }
        }
        return map2;
    }

    private final Layer parseLayer(JSONObject layerJSONObject, boolean isZip, HashMap<String, Object> urlMap, int defaultLayerOrder) throws JSONException {
        HashMap<String, PassParams[]> params;
        boolean zOptBoolean = layerJSONObject.optBoolean("enableBlend");
        boolean zOptBoolean2 = layerJSONObject.optBoolean("enable");
        int iOptInt = layerJSONObject.optInt("blendSfactor");
        int iOptInt2 = layerJSONObject.optInt("blendDfactor");
        int iOptInt3 = layerJSONObject.optInt(rde.PAY_SDK_ORDER, defaultLayerOrder);
        JSONArray jSONArrayOptJSONArray = layerJSONObject.optJSONArray("render");
        RendPass[] renders = jSONArrayOptJSONArray != null ? parseRenders(jSONArrayOptJSONArray, isZip, urlMap) : null;
        JSONObject jSONObjectOptJSONObject = layerJSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject != null) {
            Intrinsics.checkNotNull(renders);
            params = parseParams(jSONObjectOptJSONObject, renders);
        } else {
            params = null;
        }
        JSONArray jSONArrayOptJSONArray2 = layerJSONObject.optJSONArray("animators");
        HashMap<String, AnimatorValue> animator = jSONArrayOptJSONArray2 != null ? parseAnimator(jSONArrayOptJSONArray2) : null;
        Intrinsics.checkNotNull(renders);
        return new Layer(renders, params, animator, zOptBoolean, zOptBoolean2, iOptInt, iOptInt2, iOptInt3);
    }

    public static /* synthetic */ Layer parseLayer$default(COEParse cOEParse, JSONObject jSONObject, boolean z, HashMap map, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return cOEParse.parseLayer(jSONObject, z, map, i);
    }

    private final HashMap<String, PassParams[]> parseParams(JSONObject params, RendPass[] rendPassArray) throws JSONException {
        Iterator<String> itKeys;
        Iterator<String> it;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObject;
        Iterator<String> it2;
        Float[] fArr;
        JSONObject jSONObject2 = params;
        HashMap map = jSONObject2 != null ? new HashMap() : null;
        if (jSONObject2 != null && (itKeys = params.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray2 = jSONObject2.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    Iterator<String> itKeys2 = jSONObject3.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        try {
                            Uniform uniform = rendPassArray[i2].getUniforms().get(next2);
                            String type = uniform != null ? uniform.getType() : null;
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(next2);
                            int iOptInt = jSONObject4.optInt(ClickApiEntity.DELAY);
                            long jOptLong = jSONObject4.optLong("duration");
                            JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray("bezier");
                            if (jSONArrayOptJSONArray != null) {
                                it = itKeys;
                                try {
                                    jSONArray = jSONArray2;
                                    try {
                                        IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
                                        i = length;
                                        try {
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                                            IntIterator it3 = intRangeUntil.iterator();
                                            while (it3.hasNext()) {
                                                jSONObject = jSONObject3;
                                                it2 = itKeys2;
                                                try {
                                                    arrayList3.add(Float.valueOf((float) jSONArrayOptJSONArray.getDouble(it3.nextInt())));
                                                    jSONObject3 = jSONObject;
                                                    itKeys2 = it2;
                                                } catch (JSONException e) {
                                                    e = e;
                                                    e.printStackTrace();
                                                    Log.e(dvk.TAG, this.TAG + "=>Error parsing JSON for uniform " + next2, e);
                                                    itKeys = it;
                                                    jSONArray2 = jSONArray;
                                                    length = i;
                                                    jSONObject3 = jSONObject;
                                                    itKeys2 = it2;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    e.printStackTrace();
                                                    Log.e(dvk.TAG, this.TAG + "=>Error processing uniform " + next2, e);
                                                    itKeys = it;
                                                    jSONArray2 = jSONArray;
                                                    length = i;
                                                    jSONObject3 = jSONObject;
                                                    itKeys2 = it2;
                                                }
                                            }
                                            jSONObject = jSONObject3;
                                            it2 = itKeys2;
                                            fArr = (Float[]) arrayList3.toArray(new Float[0]);
                                        } catch (JSONException e3) {
                                            e = e3;
                                            jSONObject = jSONObject3;
                                            it2 = itKeys2;
                                            e.printStackTrace();
                                            Log.e(dvk.TAG, this.TAG + "=>Error parsing JSON for uniform " + next2, e);
                                            itKeys = it;
                                            jSONArray2 = jSONArray;
                                            length = i;
                                            jSONObject3 = jSONObject;
                                            itKeys2 = it2;
                                        } catch (Exception e4) {
                                            e = e4;
                                            jSONObject = jSONObject3;
                                            it2 = itKeys2;
                                            e.printStackTrace();
                                            Log.e(dvk.TAG, this.TAG + "=>Error processing uniform " + next2, e);
                                            itKeys = it;
                                            jSONArray2 = jSONArray;
                                            length = i;
                                            jSONObject3 = jSONObject;
                                            itKeys2 = it2;
                                        }
                                    } catch (JSONException e5) {
                                        e = e5;
                                        i = length;
                                        jSONObject = jSONObject3;
                                        it2 = itKeys2;
                                        e.printStackTrace();
                                        Log.e(dvk.TAG, this.TAG + "=>Error parsing JSON for uniform " + next2, e);
                                        itKeys = it;
                                        jSONArray2 = jSONArray;
                                        length = i;
                                        jSONObject3 = jSONObject;
                                        itKeys2 = it2;
                                    } catch (Exception e6) {
                                        e = e6;
                                        i = length;
                                        jSONObject = jSONObject3;
                                        it2 = itKeys2;
                                        e.printStackTrace();
                                        Log.e(dvk.TAG, this.TAG + "=>Error processing uniform " + next2, e);
                                        itKeys = it;
                                        jSONArray2 = jSONArray;
                                        length = i;
                                        jSONObject3 = jSONObject;
                                        itKeys2 = it2;
                                    }
                                } catch (JSONException e7) {
                                    e = e7;
                                    jSONArray = jSONArray2;
                                    i = length;
                                    jSONObject = jSONObject3;
                                    it2 = itKeys2;
                                    e.printStackTrace();
                                    Log.e(dvk.TAG, this.TAG + "=>Error parsing JSON for uniform " + next2, e);
                                    itKeys = it;
                                    jSONArray2 = jSONArray;
                                    length = i;
                                    jSONObject3 = jSONObject;
                                    itKeys2 = it2;
                                } catch (Exception e8) {
                                    e = e8;
                                    jSONArray = jSONArray2;
                                    i = length;
                                    jSONObject = jSONObject3;
                                    it2 = itKeys2;
                                    e.printStackTrace();
                                    Log.e(dvk.TAG, this.TAG + "=>Error processing uniform " + next2, e);
                                    itKeys = it;
                                    jSONArray2 = jSONArray;
                                    length = i;
                                    jSONObject3 = jSONObject;
                                    itKeys2 = it2;
                                }
                            } else {
                                it = itKeys;
                                jSONArray = jSONArray2;
                                i = length;
                                jSONObject = jSONObject3;
                                it2 = itKeys2;
                                fArr = new Float[]{Float.valueOf(0.3f), Float.valueOf(vr3.UNSET), Float.valueOf(0.1f), Float.valueOf(1.0f)};
                            }
                            Float[] fArr2 = fArr;
                            Intrinsics.checkNotNull(jSONObject4);
                            Object[] uniformValue = parseUniformValue(type, jSONObject4);
                            if ((!(uniformValue.length == 0)) && type != null) {
                                Intrinsics.checkNotNull(next2);
                                arrayList2.add(new UniformValue(next2, type, uniformValue, iOptInt, jOptLong, fArr2));
                            }
                        } catch (JSONException e9) {
                            e = e9;
                            it = itKeys;
                        } catch (Exception e10) {
                            e = e10;
                            it = itKeys;
                        }
                        itKeys = it;
                        jSONArray2 = jSONArray;
                        length = i;
                        jSONObject3 = jSONObject;
                        itKeys2 = it2;
                    }
                    arrayList.add(new PassParams((UniformValue[]) arrayList2.toArray(new UniformValue[0])));
                }
                Iterator<String> it4 = itKeys;
                if (map != null) {
                    Intrinsics.checkNotNull(next);
                    map.put(next, arrayList.toArray(new PassParams[0]));
                }
                jSONObject2 = params;
                itKeys = it4;
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x018c  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x023b  */
    /* JADX WARN: Code duplicated, block: B:61:0x023f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0242  */
    /* JADX WARN: Code duplicated, block: B:72:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0243 A[SYNTHETIC] */
    private final RendPass parseRender(JSONObject renderJSONObject, boolean isZip, HashMap<String, Object> urlMap, int defaultOrder) throws JSONException {
        String str;
        String str2;
        int i;
        StatusAnim[] statusAnimArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Object obj;
        Object objValueOf;
        Object objOptString;
        Object obj2;
        boolean z;
        String strOptString = renderJSONObject.optString("vs");
        String strOptString2 = renderJSONObject.optString("fs");
        int iOptInt = renderJSONObject.optInt(rde.PAY_SDK_ORDER, defaultOrder);
        JSONArray jSONArrayOptJSONArray = renderJSONObject.optJSONArray("uniforms");
        JSONArray jSONArrayOptJSONArray2 = renderJSONObject.optJSONArray("status");
        HashMap map = new HashMap();
        String str3 = "type";
        String str4 = "uniformName";
        if (jSONArrayOptJSONArray2 != null) {
            int length = jSONArrayOptJSONArray2.length();
            statusAnimArr = new StatusAnim[length];
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i2);
                String strOptString3 = jSONObject.optString("name");
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("anims");
                int length2 = jSONArrayOptJSONArray3.length();
                Anim[] animArr = new Anim[length2];
                JSONArray jSONArray = jSONArrayOptJSONArray2;
                int i3 = 0;
                while (i3 < length2) {
                    int i4 = length;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i3);
                    String strOptString4 = jSONObject2.optString("uniformName");
                    String strOptString5 = jSONObject2.optString("type");
                    JSONArray jSONArray2 = jSONArrayOptJSONArray3;
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("beizer");
                    Object objOpt = jSONObject2.opt("value");
                    int i5 = length2;
                    long jOptLong = jSONObject2.optLong("duration");
                    int length3 = jSONArrayOptJSONArray4.length();
                    Float[] fArr = new Float[length3];
                    int i6 = iOptInt;
                    int i7 = 0;
                    while (i7 < length3) {
                        fArr[i7] = Float.valueOf((float) jSONArrayOptJSONArray4.getDouble(i7));
                        i7++;
                        strOptString = strOptString;
                        strOptString2 = strOptString2;
                    }
                    Intrinsics.checkNotNull(strOptString4);
                    Intrinsics.checkNotNull(strOptString5);
                    Intrinsics.checkNotNull(objOpt);
                    animArr[i3] = new Anim(strOptString4, strOptString5, fArr, objOpt, jOptLong);
                    i3++;
                    length = i4;
                    jSONArrayOptJSONArray3 = jSONArray2;
                    length2 = i5;
                    iOptInt = i6;
                    strOptString = strOptString;
                }
                Intrinsics.checkNotNull(strOptString3);
                statusAnimArr[i2] = new StatusAnim(strOptString3, animArr);
                i2++;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            str = strOptString;
            str2 = strOptString2;
            i = iOptInt;
        } else {
            str = strOptString;
            str2 = strOptString2;
            i = iOptInt;
            statusAnimArr = null;
        }
        if (jSONArrayOptJSONArray != null) {
            int length4 = jSONArrayOptJSONArray.length();
            int i8 = 0;
            while (i8 < length4) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i8);
                String strOptString6 = jSONObject3.optString(str4);
                String strOptString7 = jSONObject3.optString(str3);
                int iOptInt2 = jSONObject3.optInt("width");
                int iOptInt3 = jSONObject3.optInt("height");
                float fOptDouble = (float) jSONObject3.optDouble("x");
                int i9 = length4;
                JSONArray jSONArray3 = jSONArrayOptJSONArray;
                float fOptDouble2 = (float) jSONObject3.optDouble("y");
                String str5 = str3;
                int i10 = i8;
                float fOptDouble3 = (float) jSONObject3.optDouble("z");
                HashMap map2 = map;
                String str6 = str4;
                float fOptDouble4 = (float) jSONObject3.optDouble("w");
                int iOptInt4 = jSONObject3.optInt("format", 0);
                boolean zOptBoolean = jSONObject3.optBoolean("flip", true);
                int iOptInt5 = jSONObject3.optInt("wrapMode");
                String strOptString8 = jSONObject3.optString("mediaType");
                if (strOptString7 != null) {
                    int iHashCode = strOptString7.hashCode();
                    f = fOptDouble3;
                    if (iHashCode != 104431) {
                        f2 = fOptDouble4;
                        if (iHashCode != 65290051) {
                            if (iHashCode == 246836475 && strOptString7.equals("Texture")) {
                                if (isZip) {
                                    String strOptString9 = jSONObject3.optString("value");
                                    if (strOptString9 != null) {
                                        Intrinsics.checkNotNull(strOptString9);
                                        obj2 = null;
                                        z = StringsKt.startsWith$default(strOptString9, "url://id/", false, 2, (Object) null);
                                        if (z) {
                                            Intrinsics.checkNotNull(strOptString9);
                                            String strSubstring = strOptString9.substring(9);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                                            objOptString = urlMap.get(strSubstring);
                                        } else {
                                            obj = obj2;
                                        }
                                        f6 = fOptDouble;
                                        f5 = fOptDouble2;
                                        f4 = f;
                                        f3 = f2;
                                        if (Intrinsics.areEqual(strOptString7, "FBO")) {
                                            if (iOptInt2 == 0) {
                                                iOptInt2 = 100;
                                            }
                                            if (iOptInt3 == 0) {
                                                iOptInt3 = 100;
                                            }
                                        }
                                        Intrinsics.checkNotNull(strOptString6);
                                        Intrinsics.checkNotNull(strOptString7);
                                        Integer numValueOf = Integer.valueOf(iOptInt5);
                                        Intrinsics.checkNotNull(strOptString8);
                                        map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf, strOptString8));
                                        i8 = i10 + 1;
                                        jSONArrayOptJSONArray = jSONArray3;
                                        map = map2;
                                        length4 = i9;
                                        str3 = str5;
                                        str4 = str6;
                                    } else {
                                        obj2 = null;
                                    }
                                    if (z) {
                                        Intrinsics.checkNotNull(strOptString9);
                                        String strSubstring2 = strOptString9.substring(9);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                        objOptString = urlMap.get(strSubstring2);
                                    } else {
                                        obj = obj2;
                                    }
                                    f6 = fOptDouble;
                                    f5 = fOptDouble2;
                                    f4 = f;
                                    f3 = f2;
                                    if (Intrinsics.areEqual(strOptString7, "FBO")) {
                                        if (iOptInt2 == 0) {
                                            iOptInt2 = 100;
                                        }
                                        if (iOptInt3 == 0) {
                                            iOptInt3 = 100;
                                        }
                                    }
                                    Intrinsics.checkNotNull(strOptString6);
                                    Intrinsics.checkNotNull(strOptString7);
                                    Integer numValueOf2 = Integer.valueOf(iOptInt5);
                                    Intrinsics.checkNotNull(strOptString8);
                                    map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf2, strOptString8));
                                    i8 = i10 + 1;
                                    jSONArrayOptJSONArray = jSONArray3;
                                    map = map2;
                                    length4 = i9;
                                    str3 = str5;
                                    str4 = str6;
                                } else {
                                    objOptString = jSONObject3.optString("value");
                                }
                                obj = objOptString;
                                f6 = fOptDouble;
                                f5 = fOptDouble2;
                                f4 = f;
                                f3 = f2;
                                if (Intrinsics.areEqual(strOptString7, "FBO")) {
                                    if (iOptInt2 == 0) {
                                        iOptInt2 = 100;
                                    }
                                    if (iOptInt3 == 0) {
                                        iOptInt3 = 100;
                                    }
                                }
                                Intrinsics.checkNotNull(strOptString6);
                                Intrinsics.checkNotNull(strOptString7);
                                Integer numValueOf3 = Integer.valueOf(iOptInt5);
                                Intrinsics.checkNotNull(strOptString8);
                                map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf3, strOptString8));
                                i8 = i10 + 1;
                                jSONArrayOptJSONArray = jSONArray3;
                                map = map2;
                                length4 = i9;
                                str3 = str5;
                                str4 = str6;
                            }
                        } else if (strOptString7.equals("Color")) {
                            float fOptDouble5 = (float) jSONObject3.optDouble("x");
                            float fOptDouble6 = (float) jSONObject3.optDouble("y");
                            float fOptDouble7 = (float) jSONObject3.optDouble("z");
                            float fOptDouble8 = (float) jSONObject3.optDouble("w");
                            f4 = fOptDouble7;
                            f3 = fOptDouble8;
                            obj = new Float[]{Float.valueOf(fOptDouble5), Float.valueOf(fOptDouble6), Float.valueOf(fOptDouble7), Float.valueOf(fOptDouble8)};
                            f6 = fOptDouble5;
                            f5 = fOptDouble6;
                            if (Intrinsics.areEqual(strOptString7, "FBO")) {
                                if (iOptInt2 == 0) {
                                    iOptInt2 = 100;
                                }
                                if (iOptInt3 == 0) {
                                    iOptInt3 = 100;
                                }
                            }
                            Intrinsics.checkNotNull(strOptString6);
                            Intrinsics.checkNotNull(strOptString7);
                            Integer numValueOf4 = Integer.valueOf(iOptInt5);
                            Intrinsics.checkNotNull(strOptString8);
                            map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf4, strOptString8));
                            i8 = i10 + 1;
                            jSONArrayOptJSONArray = jSONArray3;
                            map = map2;
                            length4 = i9;
                            str3 = str5;
                            str4 = str6;
                        }
                        obj = objValueOf;
                        f6 = fOptDouble;
                        f5 = fOptDouble2;
                        f4 = f;
                        f3 = f2;
                        if (Intrinsics.areEqual(strOptString7, "FBO")) {
                            if (iOptInt2 == 0) {
                                iOptInt2 = 100;
                            }
                            if (iOptInt3 == 0) {
                                iOptInt3 = 100;
                            }
                        }
                        Intrinsics.checkNotNull(strOptString6);
                        Intrinsics.checkNotNull(strOptString7);
                        Integer numValueOf5 = Integer.valueOf(iOptInt5);
                        Intrinsics.checkNotNull(strOptString8);
                        map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf5, strOptString8));
                        i8 = i10 + 1;
                        jSONArrayOptJSONArray = jSONArray3;
                        map = map2;
                        length4 = i9;
                        str3 = str5;
                        str4 = str6;
                    } else {
                        f2 = fOptDouble4;
                        if (strOptString7.equals("int")) {
                            objValueOf = Integer.valueOf(jSONObject3.optInt("value", 0));
                        }
                        obj = objValueOf;
                        f6 = fOptDouble;
                        f5 = fOptDouble2;
                        f4 = f;
                        f3 = f2;
                        if (Intrinsics.areEqual(strOptString7, "FBO")) {
                            if (iOptInt2 == 0) {
                                iOptInt2 = 100;
                            }
                            if (iOptInt3 == 0) {
                                iOptInt3 = 100;
                            }
                        }
                        Intrinsics.checkNotNull(strOptString6);
                        Intrinsics.checkNotNull(strOptString7);
                        Integer numValueOf6 = Integer.valueOf(iOptInt5);
                        Intrinsics.checkNotNull(strOptString8);
                        map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf6, strOptString8));
                        i8 = i10 + 1;
                        jSONArrayOptJSONArray = jSONArray3;
                        map = map2;
                        length4 = i9;
                        str3 = str5;
                        str4 = str6;
                    }
                } else {
                    f = fOptDouble3;
                    f2 = fOptDouble4;
                }
                objValueOf = Float.valueOf((float) jSONObject3.optDouble("value"));
                obj = objValueOf;
                f6 = fOptDouble;
                f5 = fOptDouble2;
                f4 = f;
                f3 = f2;
                if (Intrinsics.areEqual(strOptString7, "FBO")) {
                    if (iOptInt2 == 0) {
                        iOptInt2 = 100;
                    }
                    if (iOptInt3 == 0) {
                        iOptInt3 = 100;
                    }
                }
                Intrinsics.checkNotNull(strOptString6);
                Intrinsics.checkNotNull(strOptString7);
                Integer numValueOf7 = Integer.valueOf(iOptInt5);
                Intrinsics.checkNotNull(strOptString8);
                map2.put(strOptString6, new Uniform(strOptString6, strOptString7, obj, f6, f5, f4, f3, iOptInt2, iOptInt3, iOptInt4, zOptBoolean, numValueOf7, strOptString8));
                i8 = i10 + 1;
                jSONArrayOptJSONArray = jSONArray3;
                map = map2;
                length4 = i9;
                str3 = str5;
                str4 = str6;
            }
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        return new RendPass(str, str2, i, map, statusAnimArr);
    }

    public static /* synthetic */ RendPass parseRender$default(COEParse cOEParse, JSONObject jSONObject, boolean z, HashMap map, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return cOEParse.parseRender(jSONObject, z, map, i);
    }

    private final RendPass[] parseRenders(JSONArray rendersJSONArray, boolean isZip, HashMap<String, Object> urlMap) throws JSONException {
        int length = rendersJSONArray.length();
        RendPass[] rendPassArr = new RendPass[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            JSONObject jSONObject = rendersJSONArray.getJSONObject(i);
            Intrinsics.checkNotNull(jSONObject);
            rendPassArr[i] = parseRender(jSONObject, isZip, urlMap, i2);
            i++;
            i2++;
        }
        return rendPassArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r7.equals("Range") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r7.equals("float") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] parseUniformValue(java.lang.String r7, org.json.JSONObject r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.vfxsdk.common.COEParse.parseUniformValue(java.lang.String, org.json.JSONObject):java.lang.Object[]");
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final COEData parse(@NotNull byte[] contentBytes, boolean isZip) throws JSONException {
        Layer layer;
        Intrinsics.checkNotNullParameter(contentBytes, "contentBytes");
        Trace.beginSection("parseProtocl");
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> map = new HashMap<>();
        String str = "";
        if (isZip) {
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(contentBytes));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break;
                    }
                    if (!nextEntry.isDirectory()) {
                        String name = nextEntry.getName();
                        if (Intrinsics.areEqual("data", name)) {
                            StringBuilder sb = new StringBuilder();
                            byte[] bArr = new byte[20480];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
                                sb.append(new String(bArr, 0, i, charset));
                            }
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String strSubstring = string.substring(2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            byte[] bArrDecode = Base64.decode(strSubstring, 0);
                            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                            str = StringsKt.decodeToString(bArrDecode);
                        } else if (((int) nextEntry.getSize()) != 0) {
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) nextEntry.getSize());
                            Channels.newChannel(zipInputStream).read(byteBufferAllocateDirect);
                            Intrinsics.checkNotNull(name);
                            Intrinsics.checkNotNull(byteBufferAllocateDirect);
                            map.put(name, byteBufferAllocateDirect);
                        }
                    }
                    zipInputStream.closeEntry();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(zipInputStream, th);
                        throw th2;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream, (Throwable) null);
        }
        if (!isZip) {
            str = new String(contentBytes, Charsets.UTF_8);
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("name");
        int iOptInt = jSONObject.optInt("v");
        int iOptInt2 = jSONObject.optInt("mV");
        long jOptLong = jSONObject.optLong("cT");
        long jOptLong2 = jSONObject.optLong("coeV");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("render");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("animators");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("layers");
        int length = jSONArrayOptJSONArray != null ? 1 : 0;
        if (jSONArrayOptJSONArray3 != null) {
            length += jSONArrayOptJSONArray3.length();
        }
        Layer[] layerArr = new Layer[length];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            if (i3 != 0 || jSONArrayOptJSONArray == null) {
                Intrinsics.checkNotNull(jSONArrayOptJSONArray3);
                JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i3);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                layer = parseLayer(jSONObject2, isZip, map, i2);
                i2++;
            } else {
                RendPass[] renders = parseRenders(jSONArrayOptJSONArray, isZip, map);
                layer = new Layer(renders, parseParams(jSONObjectOptJSONObject, renders), parseAnimator(jSONArrayOptJSONArray2), false, true, 770, 771, 0);
            }
            layerArr[i3] = layer;
            i3++;
            length = length;
            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
        }
        map.clear();
        Log.d(dvk.TAG, this.TAG + "=>parse time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        fqi.Companion companion = fqi.INSTANCE;
        Intrinsics.checkNotNull(strOptString);
        ld7 ld7VarA = companion.a(strOptString);
        if (ld7VarA != null) {
            ld7VarA.a(strOptString);
            ld7VarA.b(contentBytes.length);
            ld7VarA.c((int) (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        Trace.endSection();
        return new COEData(strOptString, iOptInt, iOptInt2, jOptLong, jOptLong2, layerArr);
    }
}
