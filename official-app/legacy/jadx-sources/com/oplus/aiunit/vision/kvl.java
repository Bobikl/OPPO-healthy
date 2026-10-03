package com.oplus.aiunit.vision;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public interface kvl {

    public static abstract class a implements kvl {
        public final Object b;
        public final boolean a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f13433c = null;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // com.oplus.aiunit.vision.kvl
        public void b(List<Object> list) {
            if (this.a) {
                list.add(this.b);
                return;
            }
            Object[] objArr = this.f13433c;
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }
    }

    public static class b extends a {
        public final yye d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f13434e;

        public b(yye yyeVar, String str, Object obj) {
            super(c(yyeVar, obj));
            this.d = yyeVar;
            this.f13434e = str;
        }

        public static Object c(yye yyeVar, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new DaoException("Illegal value: found array, but simple object required");
            }
            Class<?> cls = yyeVar.b;
            if (cls == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                throw new DaoException("Illegal date value: expected java.util.Date or Long for value " + obj);
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue != 0 && iIntValue != 1) {
                        throw new DaoException("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                    }
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if ("TRUE".equalsIgnoreCase(str)) {
                        return 1;
                    }
                    if ("FALSE".equalsIgnoreCase(str)) {
                        return 0;
                    }
                    throw new DaoException("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                }
            }
            return obj;
        }

        @Override // com.oplus.aiunit.vision.kvl
        public void a(StringBuilder sb, String str) {
            bli.h(sb, str, this.d).append(this.f13434e);
        }
    }

    void a(StringBuilder sb, String str);

    void b(List<Object> list);
}
