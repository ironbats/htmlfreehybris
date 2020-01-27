package br.com.html.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Component {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("typeCode")
    private String typeCode;
    @JsonProperty("modifiedTime")
    private String modifiedTime;
    @JsonProperty("name")
    private String name;
    @JsonProperty("container")
    private String container;
    @JsonProperty("content")
    private String content;



}
