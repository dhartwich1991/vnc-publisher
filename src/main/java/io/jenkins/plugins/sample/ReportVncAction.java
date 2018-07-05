package io.jenkins.plugins.sample;

import hudson.model.Action;

import javax.annotation.CheckForNull;

public class ReportVncAction implements Action {

    private final String test = "Olla";
    private String vncPort;

    @CheckForNull
    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return "Test Display Name";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "vnc-publish";
    }

    public String getTest() {
        return test;
    }

    public String getVncPort() {
        return System.getenv("VNC_PORT");
    }


}
