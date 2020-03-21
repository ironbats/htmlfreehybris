package br.com.html.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class RegionData implements Serializable {

    /** Default serialVersionUID value. */

    private static final long serialVersionUID = 1L;

    /** <i>Generated property</i> for <code>RegionData.isocode</code> property defined at extension <code>commercefacades</code>. */

    private String isocode = "CO-BO";

    /** <i>Generated property</i> for <code>RegionData.isocodeShort</code> property defined at extension <code>commercefacades</code>. */

    private String isocodeShort="BO";

    /** <i>Generated property</i> for <code>RegionData.countryIso</code> property defined at extension <code>commercefacades</code>. */

    private String countryIso="CO";

    /** <i>Generated property</i> for <code>RegionData.name</code> property defined at extension <code>commercefacades</code>. */

    private String name="Bogota";

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public void setIsocodeShort(String isocodeShort) {
        this.isocodeShort = isocodeShort;
    }

    public String getName() {
        return name;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public String getIsocode() {
        return isocode;
    }

    public String getIsocodeShort() {
        return isocodeShort;
    }

}
