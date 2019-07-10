package com.caozg.water;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.caozg.water.domain.ExcelPropertyIndexModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WaterApplicationTests {

    @Test
    public void contextLoads() throws FileNotFoundException {

        OutputStream out = new FileOutputStream("D:/test.xlsx");
        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
            Sheet sheet1 = new Sheet(1, 0, ExcelPropertyIndexModel.class);
            List<ExcelPropertyIndexModel> list=new ArrayList<ExcelPropertyIndexModel>();
            ExcelPropertyIndexModel e=new ExcelPropertyIndexModel();
            e.setWaterName("长江");
            e.setStationName("寸滩");
            e.setWaterLevel("167.66");
            e.setWaterPotential("5");
            e.setFluctuation("0.78");
            e.setFlow("17100");
            e.setSettingWaterproofLevel("--");
            e.setWarningWaterLevel("--");
            e.setMaximumWaterLevel("--");

            list.add(e);
            writer.write(list, sheet1);
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
