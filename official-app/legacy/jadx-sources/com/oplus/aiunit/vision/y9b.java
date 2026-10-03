package com.oplus.aiunit.vision;

import android.net.Uri;
import androidx.annotation.RawRes;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/y9b;", "", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", "Lcom/oplus/aiunit/vision/y9b$e;", "Lcom/oplus/aiunit/vision/y9b$f;", "Lcom/oplus/aiunit/vision/y9b$c;", "Lcom/oplus/aiunit/vision/y9b$a;", "Lcom/oplus/aiunit/vision/y9b$d;", "Lcom/oplus/aiunit/vision/y9b$b;", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
public interface y9b {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$a;", "Lcom/oplus/aiunit/vision/y9b;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "assetName", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class a implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String assetName;

        public static boolean a(String str, Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(str, ((a) obj).getAssetName());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "Asset(assetName=" + str + ')';
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ String getAssetName() {
            return this.assetName;
        }

        public boolean equals(Object obj) {
            return a(this.assetName, obj);
        }

        public int hashCode() {
            return b(this.assetName);
        }

        public String toString() {
            return c(this.assetName);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$b;", "Lcom/oplus/aiunit/vision/y9b;", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "", "b", "(Landroid/net/Uri;)I", "", "other", "", "a", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", ParserTag.TAG_URI, "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class b implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Uri uri;

        public static boolean a(Uri uri, Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(uri, ((b) obj).getUri());
        }

        public static int b(Uri uri) {
            return uri.hashCode();
        }

        public static String c(Uri uri) {
            return "ContentProvider(uri=" + uri + ')';
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ Uri getUri() {
            return this.uri;
        }

        public boolean equals(Object obj) {
            return a(this.uri, obj);
        }

        public int hashCode() {
            return b(this.uri);
        }

        public String toString() {
            return c(this.uri);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$c;", "Lcom/oplus/aiunit/vision/y9b;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", LogSenderConst.FILENAME, "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class c implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String fileName;

        public static boolean a(String str, Object obj) {
            return (obj instanceof c) && Intrinsics.areEqual(str, ((c) obj).getFileName());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "File(fileName=" + str + ')';
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object obj) {
            return a(this.fileName, obj);
        }

        public int hashCode() {
            return b(this.fileName);
        }

        public String toString() {
            return c(this.fileName);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$d;", "Lcom/oplus/aiunit/vision/y9b;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "jsonString", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class d implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String jsonString;

        public static boolean a(String str, Object obj) {
            return (obj instanceof d) && Intrinsics.areEqual(str, ((d) obj).getJsonString());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "JsonString(jsonString=" + str + ')';
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ String getJsonString() {
            return this.jsonString;
        }

        public boolean equals(Object obj) {
            return a(this.jsonString, obj);
        }

        public int hashCode() {
            return b(this.jsonString);
        }

        public String toString() {
            return c(this.jsonString);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$e;", "Lcom/oplus/aiunit/vision/y9b;", "", MapSchema.FIELD_NAME_ENTRY, "(I)Ljava/lang/String;", "", "d", "(I)I", "", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getResId", "()I", "resId", "b", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class e implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int resId;

        public /* synthetic */ e(@RawRes int i) {
            this.resId = i;
        }

        public static final /* synthetic */ e a(int i) {
            return new e(i);
        }

        public static int b(@RawRes int i) {
            return i;
        }

        public static boolean c(int i, Object obj) {
            return (obj instanceof e) && i == ((e) obj).getResId();
        }

        public static int d(int i) {
            return Integer.hashCode(i);
        }

        public static String e(int i) {
            return "RawRes(resId=" + i + ')';
        }

        public boolean equals(Object obj) {
            return c(this.resId, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return d(this.resId);
        }

        public String toString() {
            return e(this.resId);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/y9b$f;", "Lcom/oplus/aiunit/vision/y9b;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)I", "", "other", "", "a", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
    @JvmInline
    public static final class f implements y9b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String url;

        public static boolean a(String str, Object obj) {
            return (obj instanceof f) && Intrinsics.areEqual(str, ((f) obj).getUrl());
        }

        public static int b(String str) {
            return str.hashCode();
        }

        public static String c(String str) {
            return "Url(url=" + str + ')';
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ String getUrl() {
            return this.url;
        }

        public boolean equals(Object obj) {
            return a(this.url, obj);
        }

        public int hashCode() {
            return b(this.url);
        }

        public String toString() {
            return c(this.url);
        }
    }
}
