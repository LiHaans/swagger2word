package org.word.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SwaggerDto {

    private String baseUrl;

    private String modelName;

    private String url;

    private Map<String, Object> data;
}