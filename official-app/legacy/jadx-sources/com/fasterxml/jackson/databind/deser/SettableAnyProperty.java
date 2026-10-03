package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.oplus.aiunit.vision.lka;
import com.oplus.aiunit.vision.mdk;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.yna;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final yna _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    final boolean _setterIsField;
    protected final JavaType _type;
    protected lka<Object> _valueDeserializer;
    protected final mdk _valueTypeDeserializer;

    public static class a extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0213a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SettableAnyProperty f2251c;
        public final Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2252e;

        public a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.f2251c = settableAnyProperty;
            this.d = obj;
            this.f2252e = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0213a
        public void c(Object obj, Object obj2) throws IOException {
            if (d(obj)) {
                this.f2251c.set(this.d, this.f2252e, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, yna ynaVar, lka<Object> lkaVar, mdk mdkVar) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = lkaVar;
        this._valueTypeDeserializer = mdkVar;
        this._keyDeserializer = ynaVar;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    private String getClassName() {
        return this._setter.getDeclaringClass().getName();
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            nc3.i0(exc);
            nc3.j0(exc);
            Throwable thF = nc3.F(exc);
            throw new JsonMappingException((Closeable) null, nc3.o(thF), thF);
        }
        String strH = nc3.h(obj2);
        StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
        sb.append(obj);
        sb.append("' of class " + getClassName() + " (expected type: ");
        sb.append(this._type);
        sb.append("; actual type: ");
        sb.append(strH);
        sb.append(")");
        String strO = nc3.o(exc);
        if (strO != null) {
            sb.append(", problem: ");
            sb.append(strO);
        } else {
            sb.append(" (no error message provided)");
        }
        throw new JsonMappingException((Closeable) null, sb.toString(), exc);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.c0(JsonToken.VALUE_NULL)) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        mdk mdkVar = this._valueTypeDeserializer;
        return mdkVar != null ? this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, mdkVar) : this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            yna ynaVar = this._keyDeserializer;
            set(obj, ynaVar == null ? str : ynaVar.deserializeKey(str, deserializationContext), deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e2) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e2);
            }
            e2.getRoid().a(new a(this, e2, this._type.getRawClass(), obj, str));
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this._setterIsField) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                }
            } else {
                ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
            }
        } catch (Exception e2) {
            _throwAsIOE(e2, obj2, obj3);
        }
    }

    public String toString() {
        return "[any property on class " + getClassName() + "]";
    }

    public SettableAnyProperty withValueDeserializer(lka<Object> lkaVar) {
        return new SettableAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, lkaVar, this._valueTypeDeserializer);
    }

    @Deprecated
    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, lka<Object> lkaVar, mdk mdkVar) {
        this(beanProperty, annotatedMember, javaType, null, lkaVar, mdkVar);
    }
}
