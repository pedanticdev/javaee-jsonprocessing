package com.pedantic.run;

import com.pedantic.entity.Mother;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.ext.Provider;

/**
 * Created by pedantic on 8/26/2017.
 */
@Provider
public class CustomMarshaller implements MessageBodyWriter<Mother> {

    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return Mother.class.isAssignableFrom(aClass);
    }

    @Override
    public long getSize(Mother mother, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Mother mother, Class<?> aClass, Type type, Annotation[] annotations,
                        MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap,
                        OutputStream outputStream) throws IOException, WebApplicationException {

        JsonbConfig config = new JsonbConfig().withAdapters(new Adapter()).withFormatting(true);
        Jsonb jsonb = JsonbBuilder.create(config);

        jsonb.toJson(mother, outputStream);


    }
}
