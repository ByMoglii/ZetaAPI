package ch.by_moglii.zetaapi.api;

import ch.by_moglii.zetaapi.api.provider.ZetaProvider;

import java.util.UUID;

public class ZetaAPI {

    private static ZetaProvider provider;

    public static void setProvider(ZetaProvider p) {
        provider = p;
    }

    public static int getMaxViolations(String check, String type) {
        return provider.getMaxViolations(check, type);
    }

    public static int getViolations(UUID uuid, String check, String type) {
        return provider.getViolations(uuid, check, type);
    }

    public static int getTotalViolations(UUID uuid) {
        return provider.getTotalViolations(uuid);
    }

    public static boolean isCheckEnabled(String check, String type) {
        return provider.isCheckEnabled(check, type);
    }

    public static boolean isSetBackEnabled(String check, String type) {
        return provider.isSetBackEnabled(check, type);
    }

    public static String getPunishment(String check, String type) {
        return provider.getPunishment(check, type);
    }

    public static String getLanguage() {
        return provider.getLanguage();
    }

}