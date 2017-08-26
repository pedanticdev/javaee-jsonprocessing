package com.pedantic.run;

import com.pedantic.entity.Child;
import com.pedantic.entity.Father;
import com.pedantic.entity.Mother;

import javax.json.Json;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.json.bind.config.PropertyOrderStrategy;
import java.math.BigDecimal;
import java.util.Locale;

/**
 * Created by pedantic on 8/13/2017.
 */
public class TestFile {
    public static void main(String[] args) {
        Father father = new Father();
        father.setName("John Jakes");
        father.setOccupation("Author");
        father.setSalary(new BigDecimal(200000));

        Mother mother = new Mother();
        mother.setName("Abigail Weinstein");
        mother.setOccupation("Software Engineer");
        mother.setSalary(new BigDecimal(200000));
        mother.setMarriedTo(father);


        JsonbConfig config = new JsonbConfig().withAdapters(new Adapter()).withFormatting(true);

        Jsonb jsonb = JsonbBuilder.create(config);

        String childJson = jsonb.toJson(mother);
        System.out.println(childJson);
    }


}
