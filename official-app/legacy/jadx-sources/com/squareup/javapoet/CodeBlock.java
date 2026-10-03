package com.squareup.javapoet;

import com.squareup.javapoet.CodeBlock;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.StreamSupport;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;

/* JADX INFO: loaded from: classes10.dex */
public final class CodeBlock {
    final List<Object> args;
    final List<String> formatParts;
    private static final Pattern NAMED_ARGUMENT = Pattern.compile("\\$(?<argumentName>[\\w_]+):(?<typeChar>[\\w]).*");
    private static final Pattern LOWERCASE = Pattern.compile("[a-z]+[\\w_]*");

    public static final class Builder {
        final List<Object> args;
        final List<String> formatParts;

        private void addArgument(String str, char c2, Object obj) {
            if (c2 == 'L') {
                this.args.add(argToLiteral(obj));
                return;
            }
            if (c2 == 'N') {
                this.args.add(argToName(obj));
            } else if (c2 == 'S') {
                this.args.add(argToString(obj));
            } else {
                if (c2 != 'T') {
                    throw new IllegalArgumentException(String.format("invalid format string: '%s'", str));
                }
                this.args.add(argToType(obj));
            }
        }

        private Object argToLiteral(Object obj) {
            return obj;
        }

        private String argToName(Object obj) {
            if (obj instanceof CharSequence) {
                return obj.toString();
            }
            if (obj instanceof ParameterSpec) {
                return ((ParameterSpec) obj).name;
            }
            if (obj instanceof FieldSpec) {
                return ((FieldSpec) obj).name;
            }
            if (obj instanceof MethodSpec) {
                return ((MethodSpec) obj).name;
            }
            if (obj instanceof TypeSpec) {
                return ((TypeSpec) obj).name;
            }
            throw new IllegalArgumentException("expected name but was " + obj);
        }

        private String argToString(Object obj) {
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        }

        private TypeName argToType(Object obj) {
            if (obj instanceof TypeName) {
                return (TypeName) obj;
            }
            if (obj instanceof TypeMirror) {
                return TypeName.get((TypeMirror) obj);
            }
            if (obj instanceof Element) {
                return TypeName.get(((Element) obj).asType());
            }
            if (obj instanceof Type) {
                return TypeName.get((Type) obj);
            }
            throw new IllegalArgumentException("expected type but was " + obj);
        }

        private boolean isNoArgPlaceholder(char c2) {
            return c2 == '$' || c2 == '>' || c2 == '<' || c2 == '[' || c2 == ']' || c2 == 'W' || c2 == 'Z';
        }

        public Builder add(String str, Object... objArr) {
            int i;
            char cCharAt;
            boolean z;
            int i2;
            int[] iArr = new int[objArr.length];
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            boolean z3 = false;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                if (str.charAt(i3) != '$') {
                    int iIndexOf = str.indexOf(36, i3 + 1);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    this.formatParts.add(str.substring(i3, iIndexOf));
                    i3 = iIndexOf;
                } else {
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        Util.checkArgument(i6 < str.length(), "dangling format characters in '%s'", str);
                        i = i6 + 1;
                        cCharAt = str.charAt(i6);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i6 = i;
                    }
                    int i7 = i - 1;
                    if (isNoArgPlaceholder(cCharAt)) {
                        Util.checkArgument(i5 == i7, "$$, $>, $<, $[, $], $W, and $Z may not have an index", new Object[0]);
                        this.formatParts.add("$" + cCharAt);
                        i3 = i;
                    } else {
                        if (i5 < i7) {
                            int i8 = Integer.parseInt(str.substring(i5, i7)) - 1;
                            if (objArr.length > 0) {
                                int length = i8 % objArr.length;
                                iArr[length] = iArr[length] + 1;
                            }
                            z = true;
                            i2 = i4;
                            i4 = i8;
                        } else {
                            z = z3;
                            i2 = i4 + 1;
                            z2 = true;
                        }
                        Util.checkArgument(i4 >= 0 && i4 < objArr.length, "index %d for '%s' not in range (received %s arguments)", Integer.valueOf(i4 + 1), str.substring(i5 - 1, i7 + 1), Integer.valueOf(objArr.length));
                        Util.checkArgument((z && z2) ? false : true, "cannot mix indexed and positional parameters", new Object[0]);
                        addArgument(str, cCharAt, objArr[i4]);
                        this.formatParts.add("$" + cCharAt);
                        i4 = i2;
                        i3 = i;
                        z3 = z;
                    }
                }
            }
            if (z2) {
                Util.checkArgument(i4 >= objArr.length, "unused arguments: expected %s, received %s", Integer.valueOf(i4), Integer.valueOf(objArr.length));
            }
            if (z3) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < objArr.length; i9++) {
                    if (iArr[i9] == 0) {
                        arrayList.add("$" + (i9 + 1));
                    }
                }
                Util.checkArgument(arrayList.isEmpty(), "unused argument%s: %s", arrayList.size() == 1 ? "" : "s", String.join(", ", arrayList));
            }
            return this;
        }

        public Builder addNamed(String str, Map<String, ?> map) {
            for (String str2 : map.keySet()) {
                Util.checkArgument(CodeBlock.LOWERCASE.matcher(str2).matches(), "argument '%s' must start with a lowercase character", str2);
            }
            int iRegionEnd = 0;
            while (iRegionEnd < str.length()) {
                int iIndexOf = str.indexOf("$", iRegionEnd);
                if (iIndexOf == -1) {
                    this.formatParts.add(str.substring(iRegionEnd));
                    break;
                }
                if (iRegionEnd != iIndexOf) {
                    this.formatParts.add(str.substring(iRegionEnd, iIndexOf));
                    iRegionEnd = iIndexOf;
                }
                int iIndexOf2 = str.indexOf(58, iRegionEnd);
                Matcher matcher = iIndexOf2 != -1 ? CodeBlock.NAMED_ARGUMENT.matcher(str.substring(iRegionEnd, Math.min(iIndexOf2 + 2, str.length()))) : null;
                if (matcher == null || !matcher.lookingAt()) {
                    Util.checkArgument(iRegionEnd < str.length() - 1, "dangling $ at end", new Object[0]);
                    int i = iRegionEnd + 1;
                    Util.checkArgument(isNoArgPlaceholder(str.charAt(i)), "unknown format $%s at %s in '%s'", Character.valueOf(str.charAt(i)), Integer.valueOf(i), str);
                    int i2 = iRegionEnd + 2;
                    this.formatParts.add(str.substring(iRegionEnd, i2));
                    iRegionEnd = i2;
                } else {
                    String strGroup = matcher.group("argumentName");
                    Util.checkArgument(map.containsKey(strGroup), "Missing named argument for $%s", strGroup);
                    char cCharAt = matcher.group("typeChar").charAt(0);
                    addArgument(str, cCharAt, map.get(strGroup));
                    this.formatParts.add("$" + cCharAt);
                    iRegionEnd += matcher.regionEnd();
                }
            }
            return this;
        }

        public Builder addStatement(String str, Object... objArr) {
            add("$[", new Object[0]);
            add(str, objArr);
            add(";\n$]", new Object[0]);
            return this;
        }

        public Builder beginControlFlow(String str, Object... objArr) {
            add(str + " {\n", objArr);
            indent();
            return this;
        }

        public CodeBlock build() {
            return new CodeBlock(this);
        }

        public Builder clear() {
            this.formatParts.clear();
            this.args.clear();
            return this;
        }

        public Builder endControlFlow() {
            unindent();
            add("}\n", new Object[0]);
            return this;
        }

        public Builder indent() {
            this.formatParts.add("$>");
            return this;
        }

        public boolean isEmpty() {
            return this.formatParts.isEmpty();
        }

        public Builder nextControlFlow(String str, Object... objArr) {
            unindent();
            add("} " + str + " {\n", objArr);
            indent();
            return this;
        }

        public Builder unindent() {
            this.formatParts.add("$<");
            return this;
        }

        private Builder() {
            this.formatParts = new ArrayList();
            this.args = new ArrayList();
        }

        public Builder endControlFlow(String str, Object... objArr) {
            unindent();
            add("} " + str + ";\n", objArr);
            return this;
        }

        public Builder addStatement(CodeBlock codeBlock) {
            return addStatement("$L", codeBlock);
        }

        public Builder add(CodeBlock codeBlock) {
            this.formatParts.addAll(codeBlock.formatParts);
            this.args.addAll(codeBlock.args);
            return this;
        }
    }

    public static final class CodeBlockJoiner {
        private final Builder builder;
        private final String delimiter;
        private boolean first = true;

        public CodeBlockJoiner(String str, Builder builder) {
            this.delimiter = str;
            this.builder = builder;
        }

        public CodeBlockJoiner add(CodeBlock codeBlock) {
            if (!this.first) {
                this.builder.add(this.delimiter, new Object[0]);
            }
            this.first = false;
            this.builder.add(codeBlock);
            return this;
        }

        public CodeBlock join() {
            return this.builder.build();
        }

        public CodeBlockJoiner merge(CodeBlockJoiner codeBlockJoiner) {
            CodeBlock codeBlockBuild = codeBlockJoiner.builder.build();
            if (!codeBlockBuild.isEmpty()) {
                add(codeBlockBuild);
            }
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeBlock join(Iterable<CodeBlock> iterable, String str) {
        return (CodeBlock) StreamSupport.stream(iterable.spliterator(), false).collect(joining(str));
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(final String str) {
        return Collector.of(new Supplier() { // from class: com.oplus.aiunit.vision.bk3
            @Override // java.util.function.Supplier
            public final Object get() {
                return CodeBlock.lambda$joining$0(str);
            }
        }, new a(), new b(), new Function() { // from class: com.squareup.javapoet.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CodeBlock.CodeBlockJoiner) obj).join();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlockJoiner lambda$joining$0(String str) {
        return new CodeBlockJoiner(str, builder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlockJoiner lambda$joining$1(String str, Builder builder) {
        return new CodeBlockJoiner(str, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CodeBlock lambda$joining$2(Builder builder, String str, CodeBlockJoiner codeBlockJoiner) {
        builder.add(of("$N", str));
        return codeBlockJoiner.join();
    }

    public static CodeBlock of(String str, Object... objArr) {
        return new Builder().add(str, objArr).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CodeBlock.class == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isEmpty() {
        return this.formatParts.isEmpty();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.formatParts.addAll(this.formatParts);
        builder.args.addAll(this.args);
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            new CodeWriter(sb).emit(this);
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    private CodeBlock(Builder builder) {
        this.formatParts = Util.immutableList(builder.formatParts);
        this.args = Util.immutableList(builder.args);
    }

    public static Collector<CodeBlock, ?, CodeBlock> joining(final String str, String str2, final String str3) {
        final Builder builderAdd = builder().add("$N", str2);
        return Collector.of(new Supplier() { // from class: com.oplus.aiunit.vision.ak3
            @Override // java.util.function.Supplier
            public final Object get() {
                return CodeBlock.lambda$joining$1(str, builderAdd);
            }
        }, new a(), new b(), new Function() { // from class: com.squareup.javapoet.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CodeBlock.lambda$joining$2(builderAdd, str3, (CodeBlock.CodeBlockJoiner) obj);
            }
        }, new Collector.Characteristics[0]);
    }
}
