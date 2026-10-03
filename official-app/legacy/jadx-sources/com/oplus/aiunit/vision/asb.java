package com.oplus.aiunit.vision;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0015j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/asb;", "", "Lcom/oplus/aiunit/vision/eq9;", Const.Scheme.SCHEME_FILE, "Landroid/media/MediaExtractor;", "c", "Landroid/media/MediaFormat;", "videoFormat", "", "a", "extractor", "", "f", MapSchema.FIELD_NAME_ENTRY, "", "mimeType", "b", "", "d", "Z", "isTypeMapInit", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "supportTypeMap", "MIME_HEVC", "Ljava/lang/String;", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class asb {

    @NotNull
    public static final String MIME_HEVC = "video/hevc";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isTypeMapInit;
    public static final asb INSTANCE = new asb();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final HashMap<String, Boolean> supportTypeMap = new HashMap<>();

    public final boolean a(@NotNull MediaFormat videoFormat) {
        Intrinsics.checkParameterIsNotNull(videoFormat, "videoFormat");
        String string = videoFormat.getString("mime");
        if (string == null) {
            string = "";
        }
        return StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "hevc", false, 2, (Object) null);
    }

    public final synchronized boolean b(@NotNull String mimeType) {
        HashMap<String, Boolean> map;
        String lowerCase;
        Intrinsics.checkParameterIsNotNull(mimeType, "mimeType");
        if (!isTypeMapInit) {
            isTypeMapInit = true;
            d();
        }
        map = supportTypeMap;
        lowerCase = mimeType.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        return map.containsKey(lowerCase);
    }

    @NotNull
    public final MediaExtractor c(@NotNull eq9 file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        MediaExtractor mediaExtractor = new MediaExtractor();
        file.c(mediaExtractor);
        return mediaExtractor;
    }

    public final void d() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i);
                Intrinsics.checkExpressionValueIsNotNull(codecInfo, "codecInfo");
                if (!codecInfo.isEncoder()) {
                    String[] types = codecInfo.getSupportedTypes();
                    Intrinsics.checkExpressionValueIsNotNull(types, "types");
                    for (String str : types) {
                        HashMap<String, Boolean> map = supportTypeMap;
                        Intrinsics.checkExpressionValueIsNotNull(str, "types[j]");
                        if (str == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = str.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                        map.put(lowerCase, Boolean.TRUE);
                    }
                }
            }
            q0.INSTANCE.d("AnimPlayer.MediaUtil", "supportType=" + supportTypeMap.keySet());
        } catch (Throwable th) {
            q0.INSTANCE.b("AnimPlayer.MediaUtil", "getSupportType " + th);
        }
    }

    public final int e(@NotNull MediaExtractor extractor) {
        Intrinsics.checkParameterIsNotNull(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (StringsKt__StringsJVMKt.startsWith$default(string, "audio/", false, 2, null)) {
                q0.INSTANCE.d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }

    public final int f(@NotNull MediaExtractor extractor) {
        Intrinsics.checkParameterIsNotNull(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (StringsKt__StringsJVMKt.startsWith$default(string, "video/", false, 2, null)) {
                q0.INSTANCE.d("AnimPlayer.MediaUtil", "Extractor selected track " + i + " (" + string + "): " + trackFormat);
                return i;
            }
        }
        return -1;
    }
}
