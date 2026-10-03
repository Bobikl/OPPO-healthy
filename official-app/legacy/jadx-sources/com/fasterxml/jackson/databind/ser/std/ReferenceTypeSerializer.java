package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.h94;
import com.oplus.aiunit.vision.rka;
import com.oplus.aiunit.vision.vc1;
import com.oplus.aiunit.vision.wdk;
import com.oplus.aiunit.vision.yg0;
import com.oplus.aiunit.vision.yla;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements h94 {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient com.fasterxml.jackson.databind.ser.impl.a _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final yla<Object> _valueSerializer;
    protected final wdk _valueTypeSerializer;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, wdk wdkVar, yla<Object> ylaVar) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = wdkVar;
        this._valueSerializer = ylaVar;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = com.fasterxml.jackson.databind.ser.impl.a.c();
    }

    private final yla<Object> _findCachedSerializer(eug eugVar, Class<?> cls) throws JsonMappingException {
        yla<Object> ylaVarK = this._dynamicSerializers.k(cls);
        if (ylaVarK != null) {
            return ylaVarK;
        }
        yla<Object> ylaVarFindPrimaryPropertySerializer = this._referredType.hasGenericTypes() ? eugVar.findPrimaryPropertySerializer(eugVar.constructSpecializedType(this._referredType, cls), this._property) : eugVar.findPrimaryPropertySerializer(cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            ylaVarFindPrimaryPropertySerializer = ylaVarFindPrimaryPropertySerializer.unwrappingSerializer(nameTransformer);
        }
        yla<Object> ylaVar = ylaVarFindPrimaryPropertySerializer;
        this._dynamicSerializers = this._dynamicSerializers.j(cls, ylaVar);
        return ylaVar;
    }

    private final yla<Object> _findSerializer(eug eugVar, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return eugVar.findPrimaryPropertySerializer(javaType, beanProperty);
    }

    public abstract Object _getReferenced(T t);

    public abstract Object _getReferencedIfPresent(T t);

    public abstract boolean _isValuePresent(T t);

    public boolean _useStatic(eug eugVar, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = eugVar.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return eugVar.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void acceptJsonFormatVisitor(rka rkaVar, JavaType javaType) throws JsonMappingException {
        yla<Object> ylaVar_findSerializer = this._valueSerializer;
        if (ylaVar_findSerializer == null) {
            ylaVar_findSerializer = _findSerializer(rkaVar.getProvider(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                ylaVar_findSerializer = ylaVar_findSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        ylaVar_findSerializer.acceptJsonFormatVisitor(rkaVar, this._referredType);
    }

    @Override // com.oplus.aiunit.vision.h94
    public yla<?> createContextual(eug eugVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object objB;
        wdk wdkVarA = this._valueTypeSerializer;
        if (wdkVarA != null) {
            wdkVarA = wdkVarA.a(beanProperty);
        }
        yla<?> ylaVarFindAnnotatedContentSerializer = findAnnotatedContentSerializer(eugVar, beanProperty);
        if (ylaVarFindAnnotatedContentSerializer == null) {
            ylaVarFindAnnotatedContentSerializer = this._valueSerializer;
            if (ylaVarFindAnnotatedContentSerializer != null) {
                ylaVarFindAnnotatedContentSerializer = eugVar.handlePrimaryContextualization(ylaVarFindAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(eugVar, beanProperty, this._referredType)) {
                ylaVarFindAnnotatedContentSerializer = _findSerializer(eugVar, this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == wdkVarA && this._valueSerializer == ylaVarFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, wdkVarA, ylaVarFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(eugVar.getConfig(), handledType())) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializerWithResolved;
        }
        int i = a.a[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i != 1) {
            objB = null;
            if (i != 2) {
                if (i == 3) {
                    objB = MARKER_FOR_EMPTY;
                } else if (i == 4) {
                    objB = eugVar.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                    if (objB != null) {
                        zIncludeFilterSuppressNulls = eugVar.includeFilterSuppressNulls(objB);
                    }
                } else if (i != 5) {
                    zIncludeFilterSuppressNulls = false;
                }
            } else if (this._referredType.isReferenceType()) {
                objB = MARKER_FOR_EMPTY;
            }
        } else {
            objB = vc1.b(this._referredType);
            if (objB != null && objB.getClass().isArray()) {
                objB = yg0.b(objB);
            }
        }
        return (this._suppressableValue == objB && this._suppressNulls == zIncludeFilterSuppressNulls) ? referenceTypeSerializerWithResolved : referenceTypeSerializerWithResolved.withContentInclusion(objB, zIncludeFilterSuppressNulls);
    }

    public JavaType getReferredType() {
        return this._referredType;
    }

    @Override // com.oplus.aiunit.vision.yla
    public boolean isEmpty(eug eugVar, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        yla<Object> ylaVar_findCachedSerializer = this._valueSerializer;
        if (ylaVar_findCachedSerializer == null) {
            try {
                ylaVar_findCachedSerializer = _findCachedSerializer(eugVar, obj_getReferenced.getClass());
            } catch (JsonMappingException e2) {
                throw new RuntimeJsonMappingException(e2);
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? ylaVar_findCachedSerializer.isEmpty(eugVar, obj_getReferenced) : obj.equals(obj_getReferenced);
    }

    @Override // com.oplus.aiunit.vision.yla
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void serialize(T t, JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                eugVar.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        yla<Object> ylaVar_findCachedSerializer = this._valueSerializer;
        if (ylaVar_findCachedSerializer == null) {
            ylaVar_findCachedSerializer = _findCachedSerializer(eugVar, obj_getReferencedIfPresent.getClass());
        }
        wdk wdkVar = this._valueTypeSerializer;
        if (wdkVar != null) {
            ylaVar_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, eugVar, wdkVar);
        } else {
            ylaVar_findCachedSerializer.serialize(obj_getReferencedIfPresent, jsonGenerator, eugVar);
        }
    }

    @Override // com.oplus.aiunit.vision.yla
    public void serializeWithType(T t, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                eugVar.defaultSerializeNull(jsonGenerator);
            }
        } else {
            yla<Object> ylaVar_findCachedSerializer = this._valueSerializer;
            if (ylaVar_findCachedSerializer == null) {
                ylaVar_findCachedSerializer = _findCachedSerializer(eugVar, obj_getReferencedIfPresent.getClass());
            }
            ylaVar_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, eugVar, wdkVar);
        }
    }

    @Override // com.oplus.aiunit.vision.yla
    public yla<T> unwrappingSerializer(NameTransformer nameTransformer) {
        yla<?> ylaVarUnwrappingSerializer = this._valueSerializer;
        if (ylaVarUnwrappingSerializer != null && (ylaVarUnwrappingSerializer = ylaVarUnwrappingSerializer.unwrappingSerializer(nameTransformer)) == this._valueSerializer) {
            return this;
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return (this._valueSerializer == ylaVarUnwrappingSerializer && this._unwrapper == nameTransformer) ? this : withResolved(this._property, this._valueTypeSerializer, ylaVarUnwrappingSerializer, nameTransformer);
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, wdk wdkVar, yla<?> ylaVar, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, wdk wdkVar, yla<?> ylaVar, NameTransformer nameTransformer, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = com.fasterxml.jackson.databind.ser.impl.a.c();
        this._property = beanProperty;
        this._valueTypeSerializer = wdkVar;
        this._valueSerializer = ylaVar;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
