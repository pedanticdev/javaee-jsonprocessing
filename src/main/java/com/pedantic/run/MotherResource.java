package com.pedantic.run;

import com.pedantic.entity.Father;
import com.pedantic.entity.Mother;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigDecimal;

/**
 * Created by pedantic on 8/26/2017.
 */
@Path("mothers")
public class MotherResource {

    @GET
    public Mother getMother() {
        Father father = new Father();
        father.setName("John Jakes");
        father.setOccupation("Author");
        father.setSalary(new BigDecimal(200000));

        Mother mother = new Mother();
        mother.setName("Abigail Weinstein");
        mother.setOccupation("Software Engineer");
        mother.setSalary(new BigDecimal(200000));
        mother.setMarriedTo(father);

        return mother;
    }
}
