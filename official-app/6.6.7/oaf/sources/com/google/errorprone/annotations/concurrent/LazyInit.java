package com.google.errorprone.annotations.concurrent;

import com.google.errorprone.annotations.IncompatibleModifiers;
import com.google.errorprone.annotations.Modifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@IncompatibleModifiers(modifier = {Modifier.FINAL})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyInit {
}
