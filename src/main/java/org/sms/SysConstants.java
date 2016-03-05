package org.sms;

/**
 * 
 * class_descriptions:
 * @author Sunny
 * @since 1.8.0
 */

public interface SysConstants {
  
  public static final String LOGIN_USER = "user";
  public static final String ENABLE = "0";
  public static final String CHARSET = "UTF-8";
  public static final String TICKETID = "ticket";
  public static final String AUTHREQUEST = "authRequest";
  public static final String LOCALDOMAIN = "http://soaer.com";
  public static final String SIGNATURE_METHOD = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
  public static final String CANON_ALGORITHM = "http://www.w3.org/2001/10/xml-exc-c14n#";
  public static final String IDPSSPXMLFILE = "/opensaml/IDPSSODescriptor.xml";
  public static final String SPSSPXMLFILE = "/opensaml/SPSSODescriptor.xml";
  public static final String IDPSERVERADDRESS = "http://login.soaer.com:8888";
  public static final String ARTIFACT_KEY = "artifact";
  public static final String ARTIFACT_RESOLVE_KEY = "artifactResolve";
  public static final String TOKEN_KEY = "token";
  public static final String REDIRECT_URL_KEY = "redirectUrl";
  public static final String IDPRECEIVESPARTIFACT_URL = "http://soaer.com:8888/SAML2/receiveSPArtifact";
  public static final String SPRECEIVESPARTIFACT_URL = "http://soaer.com:8888/SAML2/receiveIDPArtifact";
  public static final String CAS_FILTER = "http://soaer.com:8888/casFilter";
  public static final String LOCALDOMAIN_SAML2_SERVICE = "http://soaer.com:8888/SAML2";
  public static final String SP_ARTIFACT_RESOLUTION_SERVICE = "http://soaer.com:8888/SAML2/SPArtifactResolution";
  public static final String IDP_ARTIFACT_RESOLUTION_SERVICE = "http://soaer.com:8888/SAML2/IDPArtifactResolution";
  
  
  public enum LockType {
    
    LOCKED("0"), UNLOCKED("1");
    
    private String lockType;
    
    private LockType(String lockType) {
      this.lockType = lockType;
    }
    
    public String getLockType() {
      return this.lockType;
    }
  }
}