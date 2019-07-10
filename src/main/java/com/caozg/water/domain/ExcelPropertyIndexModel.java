package com.caozg.water.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @ClassName ExcelPropertyIndexModel
 * @Description TODO
 * @Author caozg
 * @Date 2019/7/10 16:46
 * @Version 1.0
 */
public class ExcelPropertyIndexModel extends BaseRowModel {

    @ExcelProperty(value = "河名" ,index = 0)
    private String waterName;

    @ExcelProperty(value = "站名" ,index = 1)
    private String stationName;

    @ExcelProperty(value = "水位" ,index = 2)
    private String waterLevel;

    @ExcelProperty(value = "水势" ,index = 3)
    private String waterPotential;

    @ExcelProperty(value = "比昨日+涨-落" ,index = 4)
    private String fluctuation;

    @ExcelProperty(value = "流量" ,index = 5)
    private String flow;

    @ExcelProperty(value = "设防水位" ,index = 6)
    private String settingWaterproofLevel;

    @ExcelProperty(value = "警戒水位" ,index = 7)
    private String warningWaterLevel;


    @ExcelProperty(value = "最高水位" ,index = 8)
    private String maximumWaterLevel;


    public String getWaterName() {
        return waterName;
    }

    public void setWaterName(String waterName) {
        this.waterName = waterName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getWaterPotential() {
        return waterPotential;
    }

    public void setWaterPotential(String waterPotential) {
        this.waterPotential = waterPotential;
    }

    public String getFluctuation() {
        return fluctuation;
    }

    public void setFluctuation(String fluctuation) {
        this.fluctuation = fluctuation;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getSettingWaterproofLevel() {
        return settingWaterproofLevel;
    }

    public void setSettingWaterproofLevel(String settingWaterproofLevel) {
        this.settingWaterproofLevel = settingWaterproofLevel;
    }

    public String getWarningWaterLevel() {
        return warningWaterLevel;
    }

    public void setWarningWaterLevel(String warningWaterLevel) {
        this.warningWaterLevel = warningWaterLevel;
    }

    public String getMaximumWaterLevel() {
        return maximumWaterLevel;
    }

    public void setMaximumWaterLevel(String maximumWaterLevel) {
        this.maximumWaterLevel = maximumWaterLevel;
    }
}
