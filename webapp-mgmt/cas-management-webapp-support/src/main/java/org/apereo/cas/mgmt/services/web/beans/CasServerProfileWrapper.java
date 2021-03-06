package org.apereo.cas.mgmt.services.web.beans;

import lombok.Getter;
import org.apereo.cas.discovery.CasServerProfile;

/**
 * Class used unerap profile form cas discovery response.
 *
 * @author Travis Schmidt
 * @since 5.3.0
 */
@Getter
public class CasServerProfileWrapper {
    private CasServerProfile profile;
}
