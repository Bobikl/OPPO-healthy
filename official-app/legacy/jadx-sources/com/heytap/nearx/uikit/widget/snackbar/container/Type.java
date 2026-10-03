package com.heytap.nearx.uikit.widget.snackbar.container;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes18.dex */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Type {
    public static final int CUSTOM = 4;
    public static final int INTENT_FLOAT = 1;
    public static final int INTENT_NOTICE = 2;
    public static final int INTENT_NO_TITLE_NOTICE = 3;
    public static final int NORMAL = 0;
}
