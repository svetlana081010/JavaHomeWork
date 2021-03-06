package com.pb.malkova.hw11;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {
    private static final long serialVersionUID = 1L;

    protected LocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }


    @Override
    public LocalDateTime deserialize(JsonParser jp, DeserializationContext context) throws IOException {
        return LocalDateTime.parse(jp.readValueAs(String.class));
    }
}
