package com.oplusos.vfxmodelviewer.utils;

import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a\u000e\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0086\b\u001a\u001e\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000e\u001a\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000e\u001a(\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a\u0015\u0010'\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010-\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010/\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"abs", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "v", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "Lcom/oplusos/vfxmodelviewer/utils/Float4;", "all", "", "Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "Lcom/oplusos/vfxmodelviewer/utils/Bool3;", "Lcom/oplusos/vfxmodelviewer/utils/Bool4;", Languages.ANY, "clamp", "min", "max", "", "cross", "a", "b", "distance", "dot", "equal", "greaterThan", "greaterThanEqual", "length", "length2", "lessThan", "lessThanEqual", "mix", "x", "normalize", "notEqual", "reflect", "i", "n", "refract", "eta", "transform", "block", "Lkotlin/Function1;", "div", "eq", "gt", "gte", "lt", "lte", "minus", "neq", "plus", "times", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class VectorKt {
    @NotNull
    public static final Float2 abs(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(Math.abs(v.getX()), Math.abs(v.getY()));
    }

    public static final boolean all(@NotNull Bool2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY();
    }

    public static final boolean any(@NotNull Bool2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY();
    }

    @NotNull
    public static final Float2 clamp(@NotNull Float2 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y >= f) {
            f = y > f2 ? f2 : y;
        }
        return new Float2(x, f);
    }

    @NotNull
    public static final Float3 cross(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3((a.getY() * b.getZ()) - (a.getZ() * b.getY()), (a.getZ() * b.getX()) - (a.getX() * b.getZ()), (a.getX() * b.getY()) - (a.getY() * b.getX()));
    }

    public static final float distance(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float2 float2 = new Float2(a.getX() - b.getX(), a.getY() - b.getY());
        return (float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()));
    }

    @NotNull
    public static final Float2 div(float f, @NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(f / v.getX(), f / v.getY());
    }

    public static final float dot(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY());
    }

    @NotNull
    public static final Bool2 eq(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() == f, float2.getY() == f);
    }

    @NotNull
    public static final Bool2 equal(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() == f, a.getY() == f);
    }

    @NotNull
    public static final Bool2 greaterThan(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() > f, a.getY() > f);
    }

    @NotNull
    public static final Bool2 greaterThanEqual(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() >= f, a.getY() >= f);
    }

    @NotNull
    public static final Bool2 gt(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() > f, float2.getY() > f);
    }

    @NotNull
    public static final Bool2 gte(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() >= f, float2.getY() >= f);
    }

    public static final float length(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()));
    }

    public static final float length2(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY());
    }

    @NotNull
    public static final Bool2 lessThan(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() < f, a.getY() < f);
    }

    @NotNull
    public static final Bool2 lessThanEqual(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(a.getX() <= f, a.getY() <= f);
    }

    @NotNull
    public static final Bool2 lt(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() < f, float2.getY() < f);
    }

    @NotNull
    public static final Bool2 lte(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() <= f, float2.getY() <= f);
    }

    public static final float max(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), v.getY());
    }

    public static final float min(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), v.getY());
    }

    @NotNull
    public static final Float2 minus(float f, @NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(f - v.getX(), f - v.getY());
    }

    @NotNull
    public static final Float2 mix(@NotNull Float2 a, @NotNull Float2 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float2((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f));
    }

    @NotNull
    public static final Bool2 neq(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(!(float2.getX() == f), !(float2.getY() == f));
    }

    @NotNull
    public static final Float2 normalize(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY())));
        return new Float2(v.getX() * fSqrt, v.getY() * fSqrt);
    }

    @NotNull
    public static final Bool2 notEqual(@NotNull Float2 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool2(!(a.getX() == f), !(a.getY() == f));
    }

    @NotNull
    public static final Float2 plus(float f, @NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(v.getX() + f, f + v.getY());
    }

    @NotNull
    public static final Float2 reflect(@NotNull Float2 i, @NotNull Float2 n2) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n2, "n");
        float x = ((n2.getX() * i.getX()) + (n2.getY() * i.getY())) * 2.0f;
        Float2 float2 = new Float2(n2.getX() * x, x * n2.getY());
        return new Float2(i.getX() - float2.getX(), i.getY() - float2.getY());
    }

    @NotNull
    public static final Float2 refract(@NotNull Float2 i, @NotNull Float2 n2, float f) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n2, "n");
        float x = (n2.getX() * i.getX()) + (n2.getY() * i.getY());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < 0.0f) {
            return new Float2(0.0f);
        }
        Float2 float2 = new Float2(i.getX() * f, i.getY() * f);
        float fSqrt = (f * x) + ((float) Math.sqrt(f2));
        Float2 float3 = new Float2(n2.getX() * fSqrt, fSqrt * n2.getY());
        return new Float2(float2.getX() - float3.getX(), float2.getY() - float3.getY());
    }

    @NotNull
    public static final Float2 times(float f, @NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(v.getX() * f, f * v.getY());
    }

    @NotNull
    public static final Float2 transform(@NotNull Float2 v, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float2 float2Copy$default = Float2.copy$default(v, 0.0f, 0.0f, 3, null);
        float2Copy$default.setX(block.invoke(Float.valueOf(float2Copy$default.getX())).floatValue());
        float2Copy$default.setY(block.invoke(Float.valueOf(float2Copy$default.getY())).floatValue());
        return float2Copy$default;
    }

    @NotNull
    public static final Float3 x(@NotNull Float3 float3, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3((float3.getY() * v.getZ()) - (float3.getZ() * v.getY()), (float3.getZ() * v.getX()) - (float3.getX() * v.getZ()), (float3.getX() * v.getY()) - (float3.getY() * v.getX()));
    }

    @NotNull
    public static final Float3 abs(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(Math.abs(v.getX()), Math.abs(v.getY()), Math.abs(v.getZ()));
    }

    public static final boolean all(@NotNull Bool3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY() && v.getZ();
    }

    public static final boolean any(@NotNull Bool3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY() || v.getZ();
    }

    @NotNull
    public static final Float3 div(float f, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(f / v.getX(), f / v.getY(), f / v.getZ());
    }

    public static final float dot(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ());
    }

    @NotNull
    public static final Bool2 eq(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() == b.getX(), float2.getY() == b.getY());
    }

    @NotNull
    public static final Bool2 equal(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() == b.getX(), a.getY() == b.getY());
    }

    @NotNull
    public static final Bool2 greaterThan(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() > b.getY(), a.getY() > b.getY());
    }

    @NotNull
    public static final Bool2 greaterThanEqual(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() >= b.getX(), a.getY() >= b.getY());
    }

    @NotNull
    public static final Bool2 gt(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() > b.getX(), float2.getY() > b.getY());
    }

    @NotNull
    public static final Bool2 gte(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() >= b.getX(), float2.getY() >= b.getY());
    }

    public static final float length(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()));
    }

    public static final float length2(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ());
    }

    @NotNull
    public static final Bool2 lessThan(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() < b.getX(), a.getY() < b.getY());
    }

    @NotNull
    public static final Bool2 lessThanEqual(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(a.getX() <= b.getX(), a.getY() <= b.getY());
    }

    @NotNull
    public static final Bool2 lt(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() < b.getX(), float2.getY() < b.getY());
    }

    @NotNull
    public static final Bool2 lte(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(float2.getX() <= b.getX(), float2.getY() <= b.getY());
    }

    @NotNull
    public static final Float2 max(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float2(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()));
    }

    @NotNull
    public static final Float2 min(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float2(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()));
    }

    @NotNull
    public static final Float3 minus(float f, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(f - v.getX(), f - v.getY(), f - v.getZ());
    }

    @NotNull
    public static final Bool2 neq(@NotNull Float2 float2, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(!(float2.getX() == b.getX()), !(float2.getY() == b.getY()));
    }

    @NotNull
    public static final Bool2 notEqual(@NotNull Float2 a, @NotNull Float2 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool2(!(a.getX() == b.getX()), !(a.getY() == b.getY()));
    }

    @NotNull
    public static final Float3 plus(float f, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(v.getX() + f, v.getY() + f, f + v.getZ());
    }

    @NotNull
    public static final Float3 times(float f, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(v.getX() * f, v.getY() * f, f * v.getZ());
    }

    @NotNull
    public static final Float4 abs(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(Math.abs(v.getX()), Math.abs(v.getY()), Math.abs(v.getZ()), Math.abs(v.getW()));
    }

    public static final boolean all(@NotNull Bool4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() && v.getY() && v.getZ() && v.getW();
    }

    public static final boolean any(@NotNull Bool4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return v.getX() || v.getY() || v.getZ() || v.getW();
    }

    public static final float distance(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float3 float3 = new Float3(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
        return (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
    }

    @NotNull
    public static final Float4 div(float f, @NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(f / v.getX(), f / v.getY(), f / v.getZ(), f / v.getW());
    }

    public static final float dot(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ()) + (a.getW() * b.getW());
    }

    @NotNull
    public static final Bool3 eq(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() == f, float3.getY() == f, float3.getZ() == f);
    }

    @NotNull
    public static final Bool3 equal(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() == f, a.getY() == f, a.getZ() == f);
    }

    @NotNull
    public static final Bool3 greaterThan(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() > f, a.getY() > f, a.getZ() > f);
    }

    @NotNull
    public static final Bool3 greaterThanEqual(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() >= f, a.getY() >= f, a.getZ() >= f);
    }

    @NotNull
    public static final Bool3 gt(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() > f, float3.getY() > f, float3.getZ() > f);
    }

    @NotNull
    public static final Bool3 gte(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() >= f, float3.getY() >= f, float3.getZ() >= f);
    }

    public static final float length(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()) + (v.getW() * v.getW()));
    }

    public static final float length2(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()) + (v.getW() * v.getW());
    }

    @NotNull
    public static final Bool3 lessThan(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() < f, a.getY() < f, a.getZ() < f);
    }

    @NotNull
    public static final Bool3 lessThanEqual(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(a.getX() <= f, a.getY() <= f, a.getZ() <= f);
    }

    @NotNull
    public static final Bool3 lt(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() < f, float3.getY() < f, float3.getZ() < f);
    }

    @NotNull
    public static final Bool3 lte(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() <= f, float3.getY() <= f, float3.getZ() <= f);
    }

    public static final float max(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), Math.max(v.getY(), v.getZ()));
    }

    public static final float min(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), Math.min(v.getY(), v.getZ()));
    }

    @NotNull
    public static final Float4 minus(float f, @NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(f - v.getX(), f - v.getY(), f - v.getZ(), f - v.getW());
    }

    @NotNull
    public static final Bool3 neq(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(!(float3.getX() == f), !(float3.getY() == f), !(float3.getZ() == f));
    }

    @NotNull
    public static final Float3 normalize(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt(((v.getX() * v.getX()) + (v.getY() * v.getY())) + (v.getZ() * v.getZ())));
        return new Float3(v.getX() * fSqrt, v.getY() * fSqrt, v.getZ() * fSqrt);
    }

    @NotNull
    public static final Bool3 notEqual(@NotNull Float3 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool3(!(a.getX() == f), !(a.getY() == f), !(a.getZ() == f));
    }

    @NotNull
    public static final Float4 plus(float f, @NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(v.getX() + f, v.getY() + f, v.getZ() + f, f + v.getW());
    }

    @NotNull
    public static final Float4 times(float f, @NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(v.getX() * f, v.getY() * f, v.getZ() * f, f * v.getW());
    }

    @NotNull
    public static final Bool3 eq(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() == b.getX(), float3.getY() == b.getY(), float3.getZ() == b.getZ());
    }

    @NotNull
    public static final Bool3 equal(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() == b.getX(), a.getY() == b.getY(), a.getZ() == b.getZ());
    }

    @NotNull
    public static final Bool3 greaterThan(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() > b.getY(), a.getY() > b.getY(), a.getZ() > b.getZ());
    }

    @NotNull
    public static final Bool3 greaterThanEqual(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() >= b.getX(), a.getY() >= b.getY(), a.getZ() >= b.getZ());
    }

    @NotNull
    public static final Bool3 gt(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() > b.getX(), float3.getY() > b.getY(), float3.getZ() > b.getZ());
    }

    @NotNull
    public static final Bool3 gte(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() >= b.getX(), float3.getY() >= b.getY(), float3.getZ() >= b.getZ());
    }

    @NotNull
    public static final Bool3 lessThan(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() < b.getX(), a.getY() < b.getY(), a.getZ() < b.getZ());
    }

    @NotNull
    public static final Bool3 lessThanEqual(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(a.getX() <= b.getX(), a.getY() <= b.getY(), a.getZ() <= b.getZ());
    }

    @NotNull
    public static final Bool3 lt(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() < b.getX(), float3.getY() < b.getY(), float3.getZ() < b.getZ());
    }

    @NotNull
    public static final Bool3 lte(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(float3.getX() <= b.getX(), float3.getY() <= b.getY(), float3.getZ() <= b.getZ());
    }

    @NotNull
    public static final Float3 max(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()), Math.max(a.getZ(), b.getZ()));
    }

    @NotNull
    public static final Float3 min(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float3(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()), Math.min(a.getZ(), b.getZ()));
    }

    @NotNull
    public static final Bool3 neq(@NotNull Float3 float3, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(!(float3.getX() == b.getX()), !(float3.getY() == b.getY()), !(float3.getZ() == b.getZ()));
    }

    @NotNull
    public static final Bool3 notEqual(@NotNull Float3 a, @NotNull Float3 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool3(!(a.getX() == b.getX()), !(a.getY() == b.getY()), !(a.getZ() == b.getZ()));
    }

    @NotNull
    public static final Float3 reflect(@NotNull Float3 i, @NotNull Float3 n2) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n2, "n");
        float x = ((n2.getX() * i.getX()) + (n2.getY() * i.getY()) + (n2.getZ() * i.getZ())) * 2.0f;
        Float3 float3 = new Float3(n2.getX() * x, n2.getY() * x, x * n2.getZ());
        return new Float3(i.getX() - float3.getX(), i.getY() - float3.getY(), i.getZ() - float3.getZ());
    }

    @NotNull
    public static final Float3 transform(@NotNull Float3 v, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float3 float3Copy$default = Float3.copy$default(v, 0.0f, 0.0f, 0.0f, 7, null);
        float3Copy$default.setX(block.invoke(Float.valueOf(float3Copy$default.getX())).floatValue());
        float3Copy$default.setY(block.invoke(Float.valueOf(float3Copy$default.getY())).floatValue());
        float3Copy$default.setZ(block.invoke(Float.valueOf(float3Copy$default.getZ())).floatValue());
        return float3Copy$default;
    }

    @NotNull
    public static final Float2 clamp(@NotNull Float2 v, @NotNull Float2 min, @NotNull Float2 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        return new Float2(x, y);
    }

    public static final float distance(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Float4 float4 = new Float4(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ(), a.getW() - b.getW());
        return (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()) + (float4.getW() * float4.getW()));
    }

    @NotNull
    public static final Bool4 eq(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() == f, float4.getY() == f, float4.getZ() == f, float4.getW() == f);
    }

    @NotNull
    public static final Bool4 equal(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() == f, a.getY() == f, a.getZ() == f, a.getW() == f);
    }

    @NotNull
    public static final Bool4 greaterThan(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() > f, a.getY() > f, a.getZ() > f, a.getW() > f);
    }

    @NotNull
    public static final Bool4 greaterThanEqual(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() >= f, a.getY() >= f, a.getZ() >= f, a.getW() >= f);
    }

    @NotNull
    public static final Bool4 gt(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() > f, float4.getY() > f, float4.getZ() > f, float4.getW() > f);
    }

    @NotNull
    public static final Bool4 gte(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() >= f, float4.getY() >= f, float4.getZ() >= f, float4.getW() >= f);
    }

    @NotNull
    public static final Bool4 lessThan(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() < f, a.getY() < f, a.getZ() < f, a.getW() < f);
    }

    @NotNull
    public static final Bool4 lessThanEqual(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(a.getX() <= f, a.getY() <= f, a.getZ() <= f, a.getW() <= f);
    }

    @NotNull
    public static final Bool4 lt(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() < f, float4.getY() < f, float4.getZ() < f, float4.getW() < f);
    }

    @NotNull
    public static final Bool4 lte(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() <= f, float4.getY() <= f, float4.getZ() <= f, float4.getW() <= f);
    }

    public static final float max(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.max(v.getX(), Math.max(v.getY(), Math.max(v.getZ(), v.getW())));
    }

    public static final float min(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Math.min(v.getX(), Math.min(v.getY(), Math.min(v.getZ(), v.getW())));
    }

    @NotNull
    public static final Float2 mix(@NotNull Float2 a, @NotNull Float2 b, @NotNull Float2 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        return new Float2((x2 * (1.0f - x4)) + (x3 * x4), (y * (1.0f - y3)) + (y2 * y3));
    }

    @NotNull
    public static final Bool4 neq(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(!(float4.getX() == f), !(float4.getY() == f), !(float4.getZ() == f), !(float4.getW() == f));
    }

    @NotNull
    public static final Float4 normalize(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((((v.getX() * v.getX()) + (v.getY() * v.getY())) + (v.getZ() * v.getZ())) + (v.getW() * v.getW())));
        return new Float4(v.getX() * fSqrt, v.getY() * fSqrt, v.getZ() * fSqrt, v.getW() * fSqrt);
    }

    @NotNull
    public static final Bool4 notEqual(@NotNull Float4 a, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        return new Bool4(!(a.getX() == f), !(a.getY() == f), !(a.getZ() == f), !(a.getW() == f));
    }

    @NotNull
    public static final Bool4 eq(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() == b.getX(), float4.getY() == b.getY(), float4.getZ() == b.getZ(), float4.getW() == b.getW());
    }

    @NotNull
    public static final Bool4 equal(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() == b.getX(), a.getY() == b.getY(), a.getZ() == b.getZ(), a.getW() == b.getW());
    }

    @NotNull
    public static final Bool4 greaterThan(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() > b.getY(), a.getY() > b.getY(), a.getZ() > b.getZ(), a.getW() > b.getW());
    }

    @NotNull
    public static final Bool4 greaterThanEqual(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() >= b.getX(), a.getY() >= b.getY(), a.getZ() >= b.getZ(), a.getW() >= b.getW());
    }

    @NotNull
    public static final Bool4 gt(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() > b.getX(), float4.getY() > b.getY(), float4.getZ() > b.getZ(), float4.getW() > b.getW());
    }

    @NotNull
    public static final Bool4 gte(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() >= b.getX(), float4.getY() >= b.getY(), float4.getZ() >= b.getZ(), float4.getW() >= b.getW());
    }

    @NotNull
    public static final Bool4 lessThan(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() < b.getX(), a.getY() < b.getY(), a.getZ() < b.getZ(), a.getW() < b.getW());
    }

    @NotNull
    public static final Bool4 lessThanEqual(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(a.getX() <= b.getX(), a.getY() <= b.getY(), a.getZ() <= b.getZ(), a.getW() <= b.getW());
    }

    @NotNull
    public static final Bool4 lte(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() <= b.getX(), float4.getY() <= b.getY(), float4.getZ() <= b.getZ(), float4.getW() <= b.getW());
    }

    @NotNull
    public static final Float4 max(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float4(Math.max(a.getX(), b.getX()), Math.max(a.getY(), b.getY()), Math.max(a.getZ(), b.getZ()), Math.max(a.getW(), b.getW()));
    }

    @NotNull
    public static final Float4 min(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Float4(Math.min(a.getX(), b.getX()), Math.min(a.getY(), b.getY()), Math.min(a.getZ(), b.getZ()), Math.min(a.getW(), b.getW()));
    }

    @NotNull
    public static final Bool4 neq(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(!(float4.getX() == b.getX()), !(float4.getY() == b.getY()), !(float4.getZ() == b.getZ()), !(float4.getW() == b.getW()));
    }

    @NotNull
    public static final Bool4 notEqual(@NotNull Float4 a, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(!(a.getX() == b.getX()), !(a.getY() == b.getY()), !(a.getZ() == b.getZ()), !(a.getW() == b.getW()));
    }

    @NotNull
    public static final Float3 refract(@NotNull Float3 i, @NotNull Float3 n2, float f) {
        Intrinsics.checkNotNullParameter(i, "i");
        Intrinsics.checkNotNullParameter(n2, "n");
        float x = (n2.getX() * i.getX()) + (n2.getY() * i.getY()) + (n2.getZ() * i.getZ());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < 0.0f) {
            return new Float3(0.0f);
        }
        Float3 float3 = new Float3(i.getX() * f, i.getY() * f, i.getZ() * f);
        float fSqrt = (f * x) + ((float) Math.sqrt(f2));
        Float3 float4 = new Float3(n2.getX() * fSqrt, n2.getY() * fSqrt, fSqrt * n2.getZ());
        return new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ());
    }

    @NotNull
    public static final Bool4 lt(@NotNull Float4 float4, @NotNull Float4 b) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(b, "b");
        return new Bool4(float4.getX() < b.getX(), float4.getY() < b.getY(), float4.getZ() < b.getZ(), float4.getW() < b.getW());
    }

    @NotNull
    public static final Float4 transform(@NotNull Float4 v, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        Float4 float4Copy$default = Float4.copy$default(v, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        float4Copy$default.setX(block.invoke(Float.valueOf(float4Copy$default.getX())).floatValue());
        float4Copy$default.setY(block.invoke(Float.valueOf(float4Copy$default.getY())).floatValue());
        float4Copy$default.setZ(block.invoke(Float.valueOf(float4Copy$default.getZ())).floatValue());
        float4Copy$default.setW(block.invoke(Float.valueOf(float4Copy$default.getW())).floatValue());
        return float4Copy$default;
    }

    @NotNull
    public static final Float3 clamp(@NotNull Float3 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = v.getZ();
        if (z >= f) {
            f = z > f2 ? f2 : z;
        }
        return new Float3(x, y, f);
    }

    @NotNull
    public static final Float3 mix(@NotNull Float3 a, @NotNull Float3 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float3((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f), (a.getZ() * f2) + (b.getZ() * f));
    }

    @NotNull
    public static final Float3 clamp(@NotNull Float3 v, @NotNull Float3 min, @NotNull Float3 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = v.getZ();
        float z2 = min.getZ();
        float z3 = max.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        return new Float3(x, y, z);
    }

    @NotNull
    public static final Float3 mix(@NotNull Float3 a, @NotNull Float3 b, @NotNull Float3 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float f = (x2 * (1.0f - x4)) + (x3 * x4);
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        float z = a.getZ();
        float z2 = b.getZ();
        float z3 = x.getZ();
        return new Float3(f, (y * (1.0f - y3)) + (y2 * y3), (z * (1.0f - z3)) + (z2 * z3));
    }

    @NotNull
    public static final Float4 clamp(@NotNull Float4 v, float f, float f2) {
        Intrinsics.checkNotNullParameter(v, "v");
        float x = v.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = v.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = v.getZ();
        if (z < f) {
            z = f;
        } else if (z > f2) {
            z = f2;
        }
        float w = v.getW();
        if (w >= f) {
            f = w > f2 ? f2 : w;
        }
        return new Float4(x, y, z, f);
    }

    @NotNull
    public static final Float4 mix(@NotNull Float4 a, @NotNull Float4 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        return new Float4((a.getX() * f2) + (b.getX() * f), (a.getY() * f2) + (b.getY() * f), (a.getZ() * f2) + (b.getZ() * f), (a.getW() * f2) + (b.getW() * f));
    }

    @NotNull
    public static final Float4 clamp(@NotNull Float4 v, @NotNull Float4 min, @NotNull Float4 max) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float x = v.getX();
        float x2 = min.getX();
        float x3 = max.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = v.getY();
        float y2 = min.getY();
        float y3 = max.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = v.getZ();
        float z2 = min.getZ();
        float z3 = max.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        float w = v.getW();
        float z4 = min.getZ();
        float w2 = max.getW();
        if (w < z4) {
            w = z4;
        } else if (w > w2) {
            w = w2;
        }
        return new Float4(x, y, z, w);
    }

    @NotNull
    public static final Float4 mix(@NotNull Float4 a, @NotNull Float4 b, @NotNull Float4 x) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(x, "x");
        float x2 = a.getX();
        float x3 = b.getX();
        float x4 = x.getX();
        float f = (x2 * (1.0f - x4)) + (x3 * x4);
        float y = a.getY();
        float y2 = b.getY();
        float y3 = x.getY();
        float f2 = (y * (1.0f - y3)) + (y2 * y3);
        float z = a.getZ();
        float z2 = b.getZ();
        float z3 = x.getZ();
        float w = a.getW();
        float w2 = b.getW();
        float w3 = x.getW();
        return new Float4(f, f2, (z * (1.0f - z3)) + (z2 * z3), (w * (1.0f - w3)) + (w2 * w3));
    }
}
