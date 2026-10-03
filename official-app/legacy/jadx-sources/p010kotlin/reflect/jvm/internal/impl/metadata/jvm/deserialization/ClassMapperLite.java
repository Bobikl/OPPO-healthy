package p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.rnb;
import com.oplus.aiunit.vision.upj;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.internal.ProgressionUtilKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f20694kotlin = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62, null);

    @NotNull
    private static final Map<String, String> map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", c8l.KEY_B, "Short", "S", "Int", "I", "Float", UserInfo.SEX_FEMALE, "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listListOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f20694kotlin;
                sb.append(str);
                sb.append(mla.SEPARATOR);
                sb.append((String) listListOf.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listListOf.get(i2));
                linkedHashMap.put(str + mla.SEPARATOR + ((String) listListOf.get(i)) + "Array", '[' + ((String) listListOf.get(i2)));
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f20694kotlin + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", upj.CHARTODEL_MAPPING_EL, "ListIterator"})) {
            map$lambda$0$add(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            map$lambda$0$add(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f20694kotlin;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            map$lambda$0$add(linkedHashMap, "Function" + i3, sb2.toString());
            map$lambda$0$add(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str5 + ".Companion", f20694kotlin + "/jvm/internal/" + str5 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f20694kotlin + mla.SEPARATOR + str, rnb.MATRIX_TYPE_RANDOM_LT + str2 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = map.get(classId);
        if (str != null) {
            return str;
        }
        return rnb.MATRIX_TYPE_RANDOM_LT + StringsKt__StringsJVMKt.replace$default(classId, '.', Typography.dollar, false, 4, (Object) null) + ';';
    }
}
