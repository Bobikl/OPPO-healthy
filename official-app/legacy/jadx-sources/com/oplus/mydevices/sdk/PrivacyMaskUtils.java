package com.oplus.mydevices.sdk;

import com.oplus.mydevices.sdk.utils.LogUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/mydevices/sdk/PrivacyMaskUtils;", "", "()V", "MAC_REGEX", "Lkotlin/text/Regex;", "TAG", "", "maskMacAddress", "content", "maskName", "name", "maskPrivacyMessage", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class PrivacyMaskUtils {
    public static final PrivacyMaskUtils INSTANCE = new PrivacyMaskUtils();
    private static final Regex MAC_REGEX = new Regex("([A-Fa-f0-9]{2})((:[A-Fa-f0-9]{2}){3})((:[A-Fa-f0-9]{2}){2})");
    private static final String TAG = "PrivacyMaskUtils";

    private PrivacyMaskUtils() {
    }

    @JvmStatic
    @Nullable
    public static final String maskPrivacyMessage(@Nullable String content) {
        if (content == null || content.length() == 0) {
            return content;
        }
        try {
            return new Regex("(.{3})(.{4})(.*)").replace(content, "$1****$3");
        } catch (Exception unused) {
            return content;
        }
    }

    @Nullable
    public final String maskMacAddress(@Nullable String content) {
        if (content == null || content.length() == 0) {
            return content;
        }
        try {
            return MAC_REGEX.replace(content, "$1:**:**:**$4");
        } catch (Exception unused) {
            LogUtils.INSTANCE.e(TAG, "Convert mac address failed.");
            return content;
        }
    }

    @Nullable
    public final String maskName(@Nullable String name) {
        if (name == null || StringsKt__StringsJVMKt.isBlank(name)) {
            return name;
        }
        try {
            int length = name.length();
            if (1 <= length && 2 >= length) {
                return "**";
            }
            if (3 <= length && 4 >= length) {
                return new Regex("(?<=.).*(?=.)").replace(name, "*");
            }
            if (5 <= length && 7 >= length) {
                return new Regex("(?<=.{2}).*(?=.{2})").replace(name, "*");
            }
            return new Regex("(?<=.{2}).*(?=.{4})").replace(name, "*");
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "name replace error", e2);
            return name;
        }
    }
}
