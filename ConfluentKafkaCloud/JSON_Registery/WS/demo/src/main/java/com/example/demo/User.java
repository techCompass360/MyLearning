
package com.example.demo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SampleRecord
 * <p>
 * Sample schema to help you get started.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "myField1",
    "myField2",
    "myField3"
})
@Generated("jsonschema2pojo")
public class User {

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    @JsonPropertyDescription("The integer type is used for integral numbers.")
    private Integer myField1;
    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    @JsonPropertyDescription("The number type is used for any numeric type, either integers or floating point numbers.")
    private Double myField2;
    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    @JsonPropertyDescription("The string type is used for strings of text.")
    private String myField3;

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    public Integer getMyField1() {
        return myField1;
    }

    /**
     * The integer type is used for integral numbers.
     * 
     */
    @JsonProperty("myField1")
    public void setMyField1(Integer myField1) {
        this.myField1 = myField1;
    }

    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    public Double getMyField2() {
        return myField2;
    }

    /**
     * The number type is used for any numeric type, either integers or floating point numbers.
     * 
     */
    @JsonProperty("myField2")
    public void setMyField2(Double myField2) {
        this.myField2 = myField2;
    }

    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    public String getMyField3() {
        return myField3;
    }

    /**
     * The string type is used for strings of text.
     * 
     */
    @JsonProperty("myField3")
    public void setMyField3(String myField3) {
        this.myField3 = myField3;
    }

}
