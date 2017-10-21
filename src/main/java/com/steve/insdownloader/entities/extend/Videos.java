package com.steve.insdownloader.entities.extend;


import com.steve.insdownloader.entities.basic.Low_bandwidth;
import com.steve.insdownloader.entities.basic.Low_resolution;
import com.steve.insdownloader.entities.basic.Standard_resolution;

/**
 * Created by steve on 17-7-12.
 */

public class Videos {

    private Low_resolution low_resolution;
    private Low_bandwidth low_bandwidth;
    private Standard_resolution standard_resolution;

    public Low_resolution getLow_resolution() {
        return low_resolution;
    }

    public void setLow_resolution(Low_resolution low_resolution) {
        this.low_resolution = low_resolution;
    }

    public Low_bandwidth getLow_bandwidth() {
        return low_bandwidth;
    }

    public void setLow_bandwidth(Low_bandwidth low_bandwidth) {
        this.low_bandwidth = low_bandwidth;
    }

    public Standard_resolution getStandard_resolution() {
        return standard_resolution;
    }

    public void setStandard_resolution(Standard_resolution standard_resolution) {
        this.standard_resolution = standard_resolution;
    }
}
