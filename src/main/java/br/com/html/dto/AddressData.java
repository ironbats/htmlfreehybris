package br.com.html.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class AddressData implements Serializable {

    /** Default serialVersionUID value. */

    private static final long serialVersionUID = 1L;

    private String id;

    /** <i>Generated property</i> for <code>AddressWsDTO.title</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String title ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.titleCode</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String titleCode ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.firstName</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String firstName ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.lastName</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String lastName ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.companyName</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String companyName ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.line1</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String line1 ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.line2</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String line2 ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.town</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String town ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.region</code> property defined at extension <code>commercewebservicescommons</code>. */

    private RegionData region= new RegionData();

    /** <i>Generated property</i> for <code>AddressWsDTO.postalCode</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String postalCode ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.phone</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String phone ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.email</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String email ="felipe@keyrus.com.br";

    /** <i>Generated property</i> for <code>AddressWsDTO.country</code> property defined at extension <code>commercewebservicescommons</code>. */

    private CountryData country = new CountryData();

    /** <i>Generated property</i> for <code>AddressWsDTO.shippingAddress</code> property defined at extension <code>commercewebservicescommons</code>. */

    private Boolean shippingAddress=true;

    /** <i>Generated property</i> for <code>AddressWsDTO.defaultAddress</code> property defined at extension <code>commercewebservicescommons</code>. */

    private Boolean defaultAddress=true;

    /** <i>Generated property</i> for <code>AddressWsDTO.visibleInAddressBook</code> property defined at extension <code>commercewebservicescommons</code>. */

    private Boolean visibleInAddressBook=true;

    /** <i>Generated property</i> for <code>AddressWsDTO.formattedAddress</code> property defined at extension <code>commercewebservicescommons</code>. */

    private String formattedAddress ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.zipcode</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String zipcode;

    /** <i>Generated property</i> for <code>AddressWsDTO.state</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String state ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.city</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String city ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.neighbourhood</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String neighbourhood ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.streetType</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String streetType ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.addressNumber</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String addressNumber ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.addressComplement</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String addressComplement ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.addressName</code> property defined at extension <code>makrocommercewebservices</code>. */

    private String addressName ="teste";

    /** <i>Generated property</i> for <code>AddressWsDTO.addressType</code> property defined at extension <code>makrocommercewebservices</code>. */


    /** <i>Generated property</i> for <code>AddressWsDTO.latitude</code> property defined at extension <code>makrocommercewebservices</code>. */

    private Double latitude;

    /** <i>Generated property</i> for <code>AddressWsDTO.longitude</code> property defined at extension <code>makrocommercewebservices</code>. */

    private Double longitude;

}
