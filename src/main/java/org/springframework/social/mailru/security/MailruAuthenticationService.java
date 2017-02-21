package org.springframework.social.mailru.security;

import org.springframework.social.mailru.api.Mailru;
import org.springframework.social.mailru.connect.MailruConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

/**
 * Add by egarmin
 */
public class MailruAuthenticationService extends OAuth2AuthenticationService<Mailru> {

    public MailruAuthenticationService(String clientId, String clientSecret, String privateKey) {
        super(new MailruConnectionFactory(clientId, clientSecret, privateKey));
    }

}
