package com.steve.insdownloader.entities.extend;

import com.steve.insdownloader.entities.basic.Low_resolution;
import com.steve.insdownloader.entities.basic.Standard_resolution;
import com.steve.insdownloader.entities.basic.Thumbnail;

/**
 * Created by steve on 17-7-11.
 * iamges 里面包含三种类型尺寸的thumnail
 */
public class Images {

    private Thumbnail thumbnail;
    private Low_resolution low_resolution;
    private Standard_resolution standard_resolution;

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Low_resolution getLow_resolution() {
        return low_resolution;
    }

    public void setLow_resolution(Low_resolution low_resolution) {
        this.low_resolution = low_resolution;
    }

    public Standard_resolution getStandard_resolution() {
        return standard_resolution;
    }

    public void setStandard_resolution(Standard_resolution standard_resolution) {
        this.standard_resolution = standard_resolution;
    }
}
