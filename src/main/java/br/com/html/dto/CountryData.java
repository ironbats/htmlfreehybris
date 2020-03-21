package br.com.html.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class CountryData implements Serializable {

    /** Default serialVersionUID value. */

    private static final long serialVersionUID = 1L;

    /** <i>Generated property</i> for <code>CountryData.isocode</code> property defined at extension <code>commercefacades</code>. */

    private String isocode = "CO";

    /** <i>Generated property</i> for <code>CountryData.name</code> property defined at extension <code>commercefacades</code>. */

    private String name="COLOMBIA";

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsocode() {
        return isocode;
    }

    public String getName() {
        return name;
    }
}
