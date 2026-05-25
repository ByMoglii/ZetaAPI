package ch.by_moglii.zetaapi.api.provider;

import java.util.UUID;

public interface ZetaProvider {

    int getMaxViolations(String check, String type);

    int getViolations(UUID uuid, String check, String type);

    int getTotalViolations(UUID uuid);

    boolean isCheckEnabled(String check, String type);

    boolean isSetBackEnabled(String check, String type);

    String getPunishment(String check, String type);

    String getLanguage();
}