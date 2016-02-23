package com.aadira.library.Main;

import com.aadira.library.Enums.SigningMethod;

/**
 * Created by kumardivyarajat on 23/02/16.
 */
public class WCBuilder {

    private boolean isHttps;
    private String baseUrl;
    private String wc_key;
    private String wc_secret;
    private SigningMethod signing_method;
    private boolean loggingEnabled;


    public boolean isHttps() {
        return isHttps;
    }

    public void setIsHttps(boolean isHttps) {
        this.isHttps = isHttps;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getWc_key() {
        return wc_key;
    }

    public void setWc_key(String wc_key) {
        this.wc_key = wc_key;
    }

    public String getWc_secret() {
        return wc_secret;
    }

    public void setWc_secret(String wc_secret) {
        this.wc_secret = wc_secret;
    }

    public boolean isLoggingEnabled() {
        return loggingEnabled;
    }

    public void setLoggingEnabled(boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }

    public SigningMethod getSigning_method() {
        return signing_method;
    }

    public void setSigning_method(SigningMethod signing_method) {
        this.signing_method = signing_method;
    }
}
