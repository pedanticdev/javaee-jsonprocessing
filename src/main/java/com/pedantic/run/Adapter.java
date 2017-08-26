package com.pedantic.run;

import com.pedantic.entity.Mother;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.adapter.JsonbAdapter;

/**
 * Created by pedantic on 8/23/2017.
 */
public class Adapter implements JsonbAdapter<Mother, JsonObject> {
    @Override
    public JsonObject adaptToJson(Mother mother) throws Exception {
        return Json.createObjectBuilder()
                .add("name", mother.getName())
                .add("occupation", mother.getOccupation())
                .build();
    }

    @Override
    public Mother adaptFromJson(JsonObject jsonObject) throws Exception {
        Mother mother = new Mother();
        mother.setName(jsonObject.getString("name"));
        mother.setOccupation(jsonObject.getString("occupation"));

        return mother;
    }
}
