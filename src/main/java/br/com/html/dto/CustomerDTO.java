package br.com.html.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO implements Serializable {

    /**
     * Default serialVersionUID value.
     */

    private static final long serialVersionUID = 1L;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.email</code> property defined at extension <code>makrocommercewebservices</code>.
     */
    private String email;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.docId</code> property defined at extension <code>makrocommercewebservices</code>.
     */
    private String docId;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.socialName</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String socialName;

    /** <i>Generated property</i> for <code>CustomerDTO.addressList</code> property defined at extension <code>makrocommercewebservices</code>. */


    /**
     * <i>Generated property</i> for <code>CustomerDTO.state</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String state;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.custStore</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String custStore;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.preferredStore</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String preferredStore;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.stateRegistration</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private Integer stateRegistration;


    /**
     * <i>Generated property</i> for <code>CustomerDTO.storeMbs</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private Integer storeMbs;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.contactType</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String contactType;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.companyId</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String companyId;

    /** <i>Generated property</i> for <code>CustomerDTO.docType</code> property defined at extension <code>makrocommercewebservices</code>. */

    private AddressData address = new AddressData();



    /**
     * <i>Generated property</i> for <code>CustomerDTO.password</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String password;

    private DocType docType = DocType.NIT;

    public CustomerDTO() {

    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public DocType getDocType() {
        return docType;
    }

    /**
     * <i>Generated property</i> for <code>CustomerDTO.checkPwd</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String checkPwd;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.gender</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String gender;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.birthDate</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String birthDate;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.otherBusiness</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String otherBusiness;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.commOptIn</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private boolean commOptIn;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.companyName</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String companyName;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.emailInvoice</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String emailInvoice;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.inscricaoEstadual</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String inscricaoEstadual;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.privacyPolice</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private Boolean privacyPolice;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.phone</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String phone;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.cellphone</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String cellphone;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.firstName</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String firstName;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.lastName</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String lastName;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.cnpj</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String cnpj;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.cpf</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String cpf;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.consentGiven</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private boolean consentGiven = true;

    /**
     * <i>Generated property</i> for <code>CustomerDTO.razaoSocial</code> property defined at extension <code>makrocommercewebservices</code>.
     */

    private String razaoSocial;

    private String custType;


    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustType() {
        return custType;
    }

    /**
     * <i>Generated property</i> for <code>CustomerDTO.addresses</code> property defined at extension <code>makrocommercewebservices</code>.
     */


    public void setEmail(final String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }


    public void setDocId(final String docId) {
        this.docId = docId;
    }


    public String getDocId() {
        return docId;
    }


    public void setSocialName(final String socialName) {
        this.socialName = socialName;
    }


    public String getSocialName() {
        return socialName;
    }


    public void setState(final String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }


    public void setCustStore(final String custStore) {
        this.custStore = custStore;
    }


    public String getCustStore() {
        return custStore;
    }


    public void setPreferredStore(final String preferredStore) {
        this.preferredStore = preferredStore;
    }


    public String getPreferredStore() {
        return preferredStore;
    }


    public void setStateRegistration(final Integer stateRegistration) {
        this.stateRegistration = stateRegistration;
    }


    public Integer getStateRegistration() {
        return stateRegistration;
    }


    public void setStoreMbs(final Integer storeMbs) {
        this.storeMbs = storeMbs;
    }


    public Integer getStoreMbs() {
        return storeMbs;
    }


    public void setContactType(final String contactType) {
        this.contactType = contactType;
    }


    public String getContactType() {
        return contactType;
    }


    public void setCompanyId(final String companyId) {
        this.companyId = companyId;
    }


    public String getCompanyId() {
        return companyId;
    }


    public void setPassword(final String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }


    public void setCheckPwd(final String checkPwd) {
        this.checkPwd = checkPwd;
    }


    public String getCheckPwd() {
        return checkPwd;
    }


    public void setGender(final String gender) {
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }


    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setOtherBusiness(final String otherBusiness) {
        this.otherBusiness = otherBusiness;
    }


    public String getOtherBusiness() {
        return otherBusiness;
    }


    public void setCommOptIn(final boolean commOptIn) {
        this.commOptIn = commOptIn;
    }


    public boolean isCommOptIn() {
        return commOptIn;
    }


    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }


    public void setEmailInvoice(final String emailInvoice) {
        this.emailInvoice = emailInvoice;
    }


    public String getEmailInvoice() {
        return emailInvoice;
    }


    public void setInscricaoEstadual(final String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }


    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }


    public void setPrivacyPolice(final Boolean privacyPolice) {
        this.privacyPolice = privacyPolice;
    }


    public Boolean getPrivacyPolice() {
        return privacyPolice;
    }


    public void setPhone(final String phone) {
        this.phone = phone;
    }


    public String getPhone() {
        return phone;
    }


    public void setCellphone(final String cellphone) {
        this.cellphone = cellphone;
    }


    public String getCellphone() {
        return cellphone;
    }


    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }


    public void setConsentGiven(final Boolean consentGiven) {
        this.consentGiven = consentGiven;
    }


    public Boolean getConsentGiven() {
        return consentGiven;
    }


    public void setRazaoSocial(final String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }


}
