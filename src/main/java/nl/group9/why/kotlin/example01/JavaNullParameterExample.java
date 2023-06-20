package nl.group9.why.kotlin.example01;

import org.jetbrains.annotations.NotNull;

public final class JavaNullParameterExample {
    public static void main(String[] args) {
        System.out.println(exampleMethod("Java"));
        System.out.println(exampleMethod(null));
    }

    public static String exampleMethod(@NotNull String param) {
        return "Size of string is: " + param.length();
    }
}
