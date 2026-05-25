package ch.by_moglii.zetaapi.api;

import ch.by_moglii.zetaapi.api.provider.ZetaProvider;

import java.util.UUID;

public class ZetaAPI {

    private static ZetaProvider provider;

    public static void setProvider(ZetaProvider p) {
        provider = p;
    }

    public static boolean isReady() {
        return provider != null;
    }

    private static ZetaProvider getProvider() {
        if (provider == null) {
            throw new IllegalStateException("ZetaAPI is not initialized (provider = null)");
        }
        return provider;
    }

    public static int getMaxViolations(String check, String type) {
        return getProvider().getMaxViolations(check, type);
    }

    public static int getViolations(UUID uuid, String check, String type) {
        return getProvider().getViolations(uuid, check, type);
    }

    public static int getTotalViolations(UUID uuid) {
        return getProvider().getTotalViolations(uuid);
    }

    public static boolean isCheckEnabled(String check, String type) {
        return getProvider().isCheckEnabled(check, type);
    }

    public static boolean isSetBackEnabled(String check, String type) {
        return getProvider().isSetBackEnabled(check, type);
    }

    public static String getPunishment(String check, String type) {
        return getProvider().getPunishment(check, type);
    }

    public static String getLanguage() {
        return getProvider().getLanguage();
    }
}