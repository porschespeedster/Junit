package com.main.calculator;

/**
 * Created by cts1 on 26/5/17.
 */
public class SoftwareVersion {

    private float majorVersion;
    private float minorVersion;

    public float getMajorVersion() {
        return majorVersion;
    }

    public float getMinorVersion() {
        return minorVersion;
    }

    public void setMajorMinorVersion(String softwareVersion){

        int lastIndexOfDelimeter = softwareVersion.lastIndexOf(".");

        majorVersion = Float.valueOf(softwareVersion.substring(lastIndexOfDelimeter));

    }
}
